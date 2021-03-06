package com.hossamghanem.bookshoping.service.impl;

import com.hossamghanem.bookshoping.domain.*;
import com.hossamghanem.bookshoping.repository.BillingAddressRepository;
import com.hossamghanem.bookshoping.repository.OrderRepository;
import com.hossamghanem.bookshoping.repository.PaymentRepository;
import com.hossamghanem.bookshoping.repository.ShippingAddressRepository;
import com.hossamghanem.bookshoping.service.CartItemService;
import com.hossamghanem.bookshoping.service.OrderService;
import com.hossamghanem.bookshoping.utility.MailConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ShippingAddressRepository shippingAddressRepository;
    @Autowired
    private BillingAddressRepository billingAddressRepository;
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private CartItemService cartItemService;
    @Autowired
    private MailConstructor mailConstructor;

    @Override
    public synchronized Order createOrder(ShoppingCart shoppingCart,
                                          ShippingAddress shippingAddress,
                                          BillingAddress billingAddress,
                                          Payment payment,
                                          String ShippingMethod,
                                          User user) {

        Order order = new Order();
        order.setBillingAddress(billingAddress);
        System.out.println("shippingAddress" + shippingAddress.toString());
        order.setShippingAddress(shippingAddress);
        order.setShippingMethod(ShippingMethod);
        order.setUser(user);
        order.setPayment(payment);
        order.setOrderStatus("created");
        Set<CartItem> cartItems = cartItemService.findByShoppingCart(shoppingCart);
        for (CartItem cartItem : cartItems) {
            Book book = cartItem.getBook();
            book.setInStockNumber(book.getInStockNumber() - cartItem.getQty());
            cartItem.setOrder(order);
        }
        payment.setOrder(order);
        billingAddress.setOrder(order);
        shippingAddress.setOrder(order);
        order.setCartItemList(cartItems);
        order.setOrderDate(Calendar.getInstance().getTime());
        order.setOrderTotal(shoppingCart.getGrandTotal());
        orderRepository.save(order);
        return order;

    }

    @Override
    public Order findOne(Long id) {
        return orderRepository.findById(id).get();
    }

}
