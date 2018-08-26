package com.vjp.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * @author VIJAY P S
 * This is the entity class which maps exactly with the schema table
 */
@Entity
@Table(name = "ecomstore")
@EntityListeners(AuditingEntityListener.class)
public class Ecommerce implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary Key with Auto Increment

    @NotNull // Validates for empty string
    @Column(nullable = false)
    private String productName; // Name of the product

    @NotNull // Validates for null value
    @Column(nullable = false)
    private Character inStock; // Is in-stock check

    @Column
    private Integer quantity; // Quantity of product
    
    @NotNull
    @Column(nullable = false)
    private Double costPrice; // Cost Price of product
    
    @NotNull
    @Column(nullable = false)
    private Double sellingPrice; // Selling Price of product
    
    @NotNull
    @Column(nullable = false)
    private Double rating; // Rating of product
    
    
    // Getters and Setters go here

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Character getInStock() {
		return inStock;
	}

	public void setInStock(Character inStock) {
		this.inStock = inStock;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}

	public Double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}
}
