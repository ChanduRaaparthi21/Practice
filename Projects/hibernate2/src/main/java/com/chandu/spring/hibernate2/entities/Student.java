package com.chandu.spring.hibernate2.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentmarks")
public class Student {
	
	@Id
	private int rollno;
	private String sname;
	private String smarks;
	
	public Student() {}

	public Student(int rollno, String sname, String smarks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.smarks = smarks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSmarks() {
		return smarks;
	}

	public void setSmarks(String smarks) {
		this.smarks = smarks;
	}
	
	

}
