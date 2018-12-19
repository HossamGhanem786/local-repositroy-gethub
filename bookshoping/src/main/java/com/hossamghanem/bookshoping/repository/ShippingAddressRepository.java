package com.hossamghanem.bookshoping.repository;

import org.springframework.data.repository.CrudRepository;

import com.hossamghanem.bookshoping.domain.ShippingAddress;

public interface ShippingAddressRepository extends CrudRepository<ShippingAddress, Long> {
}
