package com.hossamghanem.bookshoping.service;

import com.hossamghanem.bookshoping.domain.UserPayment;

public interface UserPaymentService {
    UserPayment findById(Long id);

    void removeById(Long id);
}
