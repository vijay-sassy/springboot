package com.vjp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vjp.entity.Ecommerce;

/**
 * @author VIJAY P S
 * This is the repository class that talks with the ecomdb database
 */
@Repository
public interface EcomRepository extends JpaRepository<Ecommerce, Long> {
	// Finds product based on Id
	public Ecommerce findById(Long id);
}
