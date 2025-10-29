package com.secure.SecureNotes.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
public class Notes {
	
	
	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getContent() {
		return Content;
	}


	public void setContent(String content) {
		Content = content;
	}


	public String getOwnerUsername() {
		return ownerUsername;
	}


	public void setOwnerUsername(String ownerUsername) {
		this.ownerUsername = ownerUsername;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Lob
	private String Content;
	
	
	private String ownerUsername;

}
