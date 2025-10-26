package com.chandu.fleet.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="HR_INFO")
public class Hr {

	
	@Id
	@Column(name="SNO")
	private int  SNo;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="TITLE")
	private String title;	
	
	@Column(name="COMPANY")
	private String company;

	public int getId() {
		return SNo;
	}

	public void setId(int id) {
		this.SNo = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Hr(int id, String name, String email, String title, String company) {
		super();
		this.SNo = id;
		this.name = name;
		this.email = email;
		this.title = title;
		this.company = company;
	}

	public Hr() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
	
}
