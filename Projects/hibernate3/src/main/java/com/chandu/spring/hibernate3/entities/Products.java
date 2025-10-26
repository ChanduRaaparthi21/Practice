package com.chandu.spring.hibernate3.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Products {
	
	
	private String productid;
	private String name;
	private String category;
	
	@Id
	private int quantity;
	
	
	public Products()
	{
		
	}


	public Products(String productid, String name, String category, int quantity) {
		super();
		this.productid = productid;
		this.name = name;
		this.category = category;
		this.quantity = quantity;
	}


	public String getProductid() {
		return productid;
	}


	public void setProductid(String productid) {
		this.productid = productid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
