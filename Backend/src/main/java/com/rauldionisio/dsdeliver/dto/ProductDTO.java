package com.rauldionisio.dsdeliver.dto;

import java.io.Serializable;

import com.rauldionisio.dsdeliver.entites.Product;

public class ProductDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private Double Price;
	private String description;
	private String imageUri;
	
	public ProductDTO() {}

	public ProductDTO(Long id, String name, Double price, String description, String imageUri) {
		this.id = id;
		this.name = name;
		Price = price;
		this.description = description;
		this.imageUri = imageUri;
	}
	
	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		Price = entity.getPrice();
		description = entity.getDescripton();
	    imageUri = entity.getImageUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
	

}
