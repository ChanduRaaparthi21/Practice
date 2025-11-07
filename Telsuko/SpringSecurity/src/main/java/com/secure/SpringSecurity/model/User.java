package com.secure.SpringSecurity.model;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users") // avoid SQL reserved keyword "user"
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String password;

    private String role; // ROLE_USER or ROLE_ADMIN

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore // 👈 prevents infinite recursion
    private List<UserData> dataList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<UserData> getDataList() {
		return dataList;
	}

	public void setDataList(List<UserData> dataList) {
		this.dataList = dataList;
	}

    // getters and setters
}
