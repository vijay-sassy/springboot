package com.vjp.base.apicontroller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vjp.entity.Ecommerce;
import com.vjp.service.EcomService;;

/**
 * 
 * @author VIJAY P S
 * This is the controller class which controls the HTTP requests to the Ecom API
 */
@RestController
@RequestMapping("/ecomapi")
public class EcomController {
	@Autowired
	EcomService ecomService; // EcomService class object init
	
	// CREATE Operation
	@PostMapping("/products")
	public Ecommerce create(@Valid @RequestBody Ecommerce note) {
	  return ecomService.createProduct(note);	
	}
	
	// READ operation for one record
	@GetMapping("/products/{id}")
	public Ecommerce read(@PathVariable(value = "id") Long noteId) {
	  return ecomService.getProductById(noteId);	
	}
	
	// READ operation for all records
	@GetMapping("/products")
	public List<Ecommerce> readAll() {
		return ecomService.getAllProducts();
	}
	
	// UPDATE operation
	@PutMapping("/products/{id}")
	public Ecommerce update(@PathVariable(value = "id") Long noteId,
            @Valid @RequestBody Ecommerce noteDetails) {
	  return ecomService.updateProduct(noteId, noteDetails);
	}
	
	// DELETE operation
	@DeleteMapping("/products/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long noteId) {
      return ecomService.deleteProduct(noteId);
	}
}
