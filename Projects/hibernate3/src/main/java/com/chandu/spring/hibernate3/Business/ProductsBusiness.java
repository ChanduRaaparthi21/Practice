package com.chandu.spring.hibernate3.Business;

import java.util.List;

import com.chandu.spring.hibernate3.entities.Products;

public interface ProductsBusiness {
	
	
	public void save(Products products);
	public void update(Products products);
	public void delete(Products products);
	public Products findById(int id);
	public List<Products> findAll();
	
	

}
