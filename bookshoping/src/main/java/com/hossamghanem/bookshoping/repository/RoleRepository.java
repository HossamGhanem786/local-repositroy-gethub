package com.hossamghanem.bookshoping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hossamghanem.bookshoping.domain.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
