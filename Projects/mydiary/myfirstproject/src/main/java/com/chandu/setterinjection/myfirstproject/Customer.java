package com.chandu.setterinjection.myfirstproject;


import java.util.Properties;


public class Customer {
	
	private String name;
	private String contact;
	private  Properties  addresses;
	
	public Customer() {}
	
	public Customer(String name,String contact,Properties addresses)
	{
		 this.name=name;
		 this.contact=contact;
		 this.addresses=addresses;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", addresses=" + addresses + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Properties getAddresses() {
		return addresses;
	}

	public void setAddresses(Properties addresses) {
		this.addresses = addresses;
	}
	
	
	
	
	

}
