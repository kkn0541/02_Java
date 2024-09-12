package com.hw1.model.dto;

public class Poetry extends Book {
 private int numbefOfPoems; // 시수
 
 
 
 public int getNumbefOfPoems() {
	return numbefOfPoems;
}

public void setNumbefOfPoems(int numbefOfPoems) {
	this.numbefOfPoems = numbefOfPoems;
}

public Poetry() {
	// TODO Auto-generated constructor stub
}

public Poetry(String title, String author, int numbefOfPoems) {
	super(title, author);
	this.numbefOfPoems = numbefOfPoems;
}
 


//book 의 추상메서드 오버라이딩
@Override
 public void displayInfo() {
	 
//	System.out.printf("%s / %s / %s \n", super.getTitle(),super.getAuthor(),numbefOfPoems);
	System.out.printf("[시집] 제목 :  %s / 저자 :  %s / 시수 :  %d \n",getTitle(),getAuthor(),numbefOfPoems);
 }
 
 
}
