package com.hossamghanem.bookshoping.service.impl;

import com.hossamghanem.bookshoping.domain.UserPayment;
import com.hossamghanem.bookshoping.repository.UserPaymentRepository;
import com.hossamghanem.bookshoping.service.UserPaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPaymentServiceImpl implements UserPaymentService {
    @Autowired
    private UserPaymentRepository userPaymentRepository;

    @Override
    public UserPayment findById(Long id) {
        return userPaymentRepository.findById(id).get();
    }

    @Override
    public void removeById(Long id) {
        userPaymentRepository.deleteById(id);
    }
}
