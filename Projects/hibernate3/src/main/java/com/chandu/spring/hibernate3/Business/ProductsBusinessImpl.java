package com.chandu.spring.hibernate3.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chandu.spring.hibernate3.Dao.ProductsDao;
import com.chandu.spring.hibernate3.entities.Products;

@Component
public class ProductsBusinessImpl implements ProductsBusiness {
	
	@Autowired
	private ProductsDao productsDao;

	public void save(Products products) {
		// TODO Auto-generated method stub
		productsDao.save(products);
		
	}

	public void update(Products products) {
		// TODO Auto-generated method stub
		productsDao.update(products);
		
	}

	public void delete(Products products) {
		// TODO Auto-generated method stub
		productsDao.delete(products);
		
	}

	public Products findById(int id) {
		// TODO Auto-generated method stub
		return productsDao.findById(id);
	}

	public List<Products> findAll() {
		// TODO Auto-generated method stub
		return productsDao.findAll();
	}

}
