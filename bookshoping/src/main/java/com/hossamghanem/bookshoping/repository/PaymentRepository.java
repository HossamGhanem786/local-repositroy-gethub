package com.hossamghanem.bookshoping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hossamghanem.bookshoping.domain.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
