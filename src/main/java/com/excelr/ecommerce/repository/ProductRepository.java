package com.excelr.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
