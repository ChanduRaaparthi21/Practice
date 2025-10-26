//first pom.xml(1) create chethamu.... next ee class create chethamu(2)
//ee class ni POJO class antamu....ante simple java class


package com.chandu.spring.springhibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity     //ee class name and database lo unna table name same aithe idhi vadutham map avvadadaniki
@Table(name="employee")    // ee class name and database lo unna table name different ga unte ee anotation vadutham aa table name ni name=" " lopala rastham aala rasi mapping chestham 
public class Employee {
	
	@Id         //idhi Identifier field ani cheppadaniki istham
	private int id;
	
	@Column(name="ename")    //idhi class lo rase variable name and database lo unde field name different ga unte ee anatation rasthamu...
	private String ename;    //---> ename anedhi variable
	
	                         //class lo rase variable name and database lo unde field name same unte @column anedhi rayakkarla andhuke kindha variables ki rayaledhu bcz avi same unnai
	private String address;
	private String contact;
	private int exp;
	
	public Employee()
	{
		
	}

	public Employee(int id, String ename, String address, String contact, int exp) {
		super();
		this.id = id;
		this.ename = ename;
		this.address = address;
		this.contact = contact;
		this.exp = exp;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	

}
