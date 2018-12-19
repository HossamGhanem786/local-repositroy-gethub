package com.hossamghanem.bookshoping.service.impl;

import com.hossamghanem.bookshoping.domain.UserShipping;
import com.hossamghanem.bookshoping.repository.UserShippingRepository;
import com.hossamghanem.bookshoping.service.UserShippingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserShippingServiceImpl implements UserShippingService {
    @Autowired
    private UserShippingRepository userShippingRepository;

    @Override
    public UserShipping findById(Long id) {
        return userShippingRepository.findById(id).get();
    }

    @Override
    public void removeById(Long id) {
        userShippingRepository.deleteById(id);

    }
}
