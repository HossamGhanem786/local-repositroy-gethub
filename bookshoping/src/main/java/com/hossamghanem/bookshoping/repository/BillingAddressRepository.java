package com.hossamghanem.bookshoping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hossamghanem.bookshoping.domain.BillingAddress;

@Repository
public interface BillingAddressRepository extends CrudRepository<BillingAddress, Long> {
}
