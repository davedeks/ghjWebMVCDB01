package com.mssq301.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mssq301.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}