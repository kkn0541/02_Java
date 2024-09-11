package com.hw1.model.dto;

public class Textbook extends Book {
private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public Textbook() {
	// TODO Auto-generated constructor stub
}

public Textbook(String title, String author, String subject) {
	super(title, author);
	this.subject = subject;
}
@Override
public void displayInfo() {
	System.out.printf("%s / %s / %s \n", super.getTitle(),super.getAuthor(),subject);
}

}
