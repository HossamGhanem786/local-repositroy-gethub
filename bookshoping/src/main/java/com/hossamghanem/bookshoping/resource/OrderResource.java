package com.hossamghanem.bookshoping.resource;

import com.hossamghanem.bookshoping.domain.Order;
import com.hossamghanem.bookshoping.domain.User;
import com.hossamghanem.bookshoping.service.OrderService;
import com.hossamghanem.bookshoping.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class OrderResource {
    @Autowired
    private OrderService orderService;
    @Autowired
    private UserService userService;

    @RequestMapping("/getOrderList")
    public Set<Order> getAllOrders(Principal principal) {
        User user = userService.findByUsername(principal.getName());
        return user.getOrderList();
    }
}
