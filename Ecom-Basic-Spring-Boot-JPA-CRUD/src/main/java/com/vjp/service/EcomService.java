package com.vjp.service;

import java.util.List;
import org.springframework.http.ResponseEntity;

import com.vjp.entity.Ecommerce;

// Have abstract methods for services
public interface EcomService {
	public List<Ecommerce> getAllProducts(); 
	public Ecommerce createProduct(Ecommerce note);
	public Ecommerce getProductById(Long noteId);
	public Ecommerce updateProduct(Long noteId,Ecommerce noteDetails);
	public ResponseEntity<?> deleteProduct(Long noteId);
}
