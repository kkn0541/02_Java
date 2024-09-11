package com.hw1.model.dto;

public class Poetry extends Book {
 private int numbefOfPoems;
 
 public Poetry() {
	// TODO Auto-generated constructor stub
}

public Poetry(String title, String author, int numbefOfPoems) {
	super(title, author);
	this.numbefOfPoems = numbefOfPoems;
}
 

@Override
 public void displayInfo() {
	 
	System.out.printf("%s / %s / %s \n", super.getTitle(),super.getAuthor(),numbefOfPoems);
 }
 
 
}
