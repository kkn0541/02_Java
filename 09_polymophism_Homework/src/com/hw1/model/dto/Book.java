package com.hw1.model.dto;

//추상메서드있으니까 추상클래스
public abstract class Book  {
private String title; //제목
private String author;//저자



public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}



public Book() {
	// TODO Auto-generated constructor stub
}

public Book(String title, String author) {
	super();
	this.title = title;
	this.author = author;
}

//추상메서드 
//오버라이딩 강제화 
public abstract void displayInfo();
 
}
