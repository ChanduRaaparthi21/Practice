package com.chandu.spring.hibernate3.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.chandu.spring.hibernate3.entities.Products;


@Component
public class ProductsDaoImpl implements ProductsDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional(readOnly = false)
	public void save(Products products) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(products);
		
	}

	@Transactional(readOnly = false)
	public void update(Products products) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(products);
		
	}

	@Transactional(readOnly = false)
	public void delete(Products products) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(products);
		
	}

	public Products findById(int id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Products.class, id);
	}

	public List<Products> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Products.class);
	}

}
