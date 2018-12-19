package com.hossamghanem.bookshoping.repository;

import org.springframework.data.repository.CrudRepository;

import com.hossamghanem.bookshoping.domain.Order;
import com.hossamghanem.bookshoping.domain.User;

import java.util.Set;

public interface OrderRepository extends CrudRepository<Order, Long> {
    Set<Order> findByUser(User user);
}
