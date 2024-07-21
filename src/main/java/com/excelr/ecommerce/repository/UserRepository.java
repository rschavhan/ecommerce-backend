package com.excelr.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.ecommerce.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String Email);
}
