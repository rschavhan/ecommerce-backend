package com.excelr.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.ecommerce.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
