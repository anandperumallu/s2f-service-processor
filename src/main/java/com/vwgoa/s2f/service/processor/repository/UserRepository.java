package com.vwgoa.s2f.service.processor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vwgoa.s2f.service.processor.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
