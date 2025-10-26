package com.chandu.spring.mysecondproject;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {

	private String productid;
	private String productname;
	private Date orderdate;
	
	@Autowired
	private Customer customer;
	

	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
