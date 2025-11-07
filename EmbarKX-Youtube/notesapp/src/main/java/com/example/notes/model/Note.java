package com.example.notes.model;
import jakarta.persistence.*;
import java.time.Instant;

@Entity
public class Note {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
  private String title;
  @Column(columnDefinition="TEXT") private String content;
  private Instant createdAt;
  private Instant updatedAt;
  @ManyToOne(fetch = FetchType.LAZY) private User owner;
  // getters/setters, default ctor
  public Long getId() {
	return id;
  }
  public void setId(Long id) {
	this.id = id;
  }
  public String getTitle() {
	return title;
  }
  public Note() {
	super();
}
  public Note(Long id, String title, String content, Instant createdAt, Instant updatedAt, User owner) {
	super();
	this.id = id;
	this.title = title;
	this.content = content;
	this.createdAt = createdAt;
	this.updatedAt = updatedAt;
	this.owner = owner;
}
  public void setTitle(String title) {
	this.title = title;
  }
  public String getContent() {
	return content;
  }
  public void setContent(String content) {
	this.content = content;
  }
  public Instant getCreatedAt() {
	return createdAt;
  }
  public void setCreatedAt(Instant createdAt) {
	this.createdAt = createdAt;
  }
  public Instant getUpdatedAt() {
	return updatedAt;
  }
  public void setUpdatedAt(Instant updatedAt) {
	this.updatedAt = updatedAt;
  }
  public User getOwner() {
	return owner;
  }
  public void setOwner(User owner) {
	this.owner = owner;
  }
}
