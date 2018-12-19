package com.hossamghanem.bookshoping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hossamghanem.bookshoping.domain.UserBilling;

@Repository
public interface UserBillingRepository extends CrudRepository<UserBilling, Long> {
}
