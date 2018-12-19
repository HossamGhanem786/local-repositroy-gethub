package com.hossamghanem.bookshoping.service;

import com.hossamghanem.bookshoping.domain.UserShipping;

public interface UserShippingService {
    UserShipping findById(Long id);

    void removeById(Long id);

}
