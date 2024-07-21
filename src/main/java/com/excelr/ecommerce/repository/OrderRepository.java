package com.excelr.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.ecommerce.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
