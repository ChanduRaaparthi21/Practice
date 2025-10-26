package com.chandu.setterinjection.myfirstproject;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {
	
	private String productid;
	private String productname;
	
	@Autowired
	private Customer customer;
	
	public Order() {}
	
	public Order(Customer customer)
	{
		this.customer=customer;
	}
	
	
	public Order(String productid,String productname,Customer customer)
	{
		this.productid=productid;
		this.productname=productname;	
		this.customer=customer;
		
		
	}

	@Override
	public String toString() {
		return "Order [productid=" + productid + ", productname=" + productname + ", customer=" + customer
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
	

}
