package com.chandu.quizService.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class QuizDto {

	String categoryName;
	Integer numOfQuestions;
	String title;


	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getNumOfQuestions() {
		return numOfQuestions;
	}
	public void setNumOfQuestions(Integer numOfQuestions) {
		this.numOfQuestions = numOfQuestions;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	public QuizDto(String categoryName, Integer numOfQuestions, String title) {
		this.categoryName = categoryName;
		this.numOfQuestions = numOfQuestions;
		this.title = title;
	}

	public QuizDto() {
	}

	@Override
	public String toString() {
		return "QuizDto{" +
				"categoryName='" + categoryName + '\'' +
				", numOfQuestions=" + numOfQuestions +
				", title='" + title + '\'' +
				'}';
	}
}
