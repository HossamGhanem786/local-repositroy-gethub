package com.hossamghanem.bookshoping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hossamghanem.bookshoping.domain.UserShipping;

@Repository
public interface UserShippingRepository extends CrudRepository<UserShipping, Long> {
}
