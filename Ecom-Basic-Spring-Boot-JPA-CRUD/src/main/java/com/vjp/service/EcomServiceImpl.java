package com.vjp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.vjp.entity.Ecommerce;
import com.vjp.repository.EcomRepository;

/**
 * 
 * @author VIJAY P S
 * This is the service class for CRUD operations
 *
 */
@Transactional
@Service("ecomService")
public class EcomServiceImpl implements EcomService{
	@Autowired
	private EcomRepository ecomRepository;
	// Get All Products
	@Override
	public List<Ecommerce> getAllProducts() {
	    return ecomRepository.findAll();
	}
	
	// Create a new Product
	@Override
	public Ecommerce createProduct(Ecommerce note) {
	    return ecomRepository.save(note);
	}
	
	// Get a Single Product
	@Override
	public Ecommerce getProductById(Long noteId) {
	    return ecomRepository.findById(noteId);
	}
	
	// Update a Product
	@Override
	public Ecommerce updateProduct(Long noteId,Ecommerce noteDetails) {
	    Ecommerce note = ecomRepository.findById(noteId);

	    note.setProductName(noteDetails.getProductName());
	    note.setInStock(noteDetails.getInStock());
	    note.setQuantity(noteDetails.getQuantity());
	    note.setCostPrice(noteDetails.getCostPrice());
	    note.setSellingPrice(noteDetails.getSellingPrice());
	    note.setRating(noteDetails.getRating());

	    Ecommerce updatedNote = ecomRepository.save(note);
	    return updatedNote;
	}
	
	// Delete a Product
	@Override
	public ResponseEntity<?> deleteProduct(Long noteId) {
	    Ecommerce note = ecomRepository.findById(noteId);

	    ecomRepository.delete(note);

	    return ResponseEntity.ok().build();
	}
}
