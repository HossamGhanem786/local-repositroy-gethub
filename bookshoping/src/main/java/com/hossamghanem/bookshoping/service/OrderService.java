package com.hossamghanem.bookshoping.service;

import com.hossamghanem.bookshoping.domain.*;

public interface OrderService {
    Order createOrder(ShoppingCart shoppingCart,
                      ShippingAddress shippingAddress,
                      BillingAddress billingAddress,
                      Payment payment,
                      String ShippingMethod,
                      User user);

    Order findOne(Long id);

}
