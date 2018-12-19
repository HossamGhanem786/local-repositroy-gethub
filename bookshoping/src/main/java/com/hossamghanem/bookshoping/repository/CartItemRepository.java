package com.hossamghanem.bookshoping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hossamghanem.bookshoping.domain.CartItem;
import com.hossamghanem.bookshoping.domain.ShoppingCart;

import java.util.Set;

@Repository
public interface CartItemRepository extends CrudRepository<CartItem, Long> {
    Set<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
    //Set<CartItem> findByorder(Order order);
}
