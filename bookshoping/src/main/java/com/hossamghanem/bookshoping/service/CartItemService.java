package com.hossamghanem.bookshoping.service;

import java.util.Set;

import com.hossamghanem.bookshoping.domain.Book;
import com.hossamghanem.bookshoping.domain.CartItem;
import com.hossamghanem.bookshoping.domain.ShoppingCart;
import com.hossamghanem.bookshoping.domain.User;

public interface CartItemService {
    CartItem addBookToCartItem(Book book, User user, int qty);

    Set<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    //Set<CartItem> findByorder(Order order);
    CartItem updateCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    CartItem findById(Long id);

    CartItem save(CartItem cartItem);
}
