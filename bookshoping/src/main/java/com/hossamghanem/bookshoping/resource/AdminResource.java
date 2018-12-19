package com.hossamghanem.bookshoping.resource;

import com.hossamghanem.bookshoping.domain.User;
import com.hossamghanem.bookshoping.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminResource {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public Iterable<User> getAll() {
        return userService.findAll();
    }

}
