package com.starter.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.starter.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	@Query("select p from Product p where p.prodId=:pid")
	public Product getProduct(Integer pid);
	
	@Query("select p from Product p where p.prodId=:pid")
	public Optional<Product> getOptionalProduct(Integer pid);
}
