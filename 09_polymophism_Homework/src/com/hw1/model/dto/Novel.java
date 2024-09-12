package com.hw1.model.dto;

//추상클래스 book 상속 
public class Novel extends Book { //소설 도서 클래스  에러이유 추상메서드 강제로 오버라이딩 
private String genre;

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public Novel() {
	// TODO Auto-generated constructor stub
}

public Novel(String title, String author, String genre) {
	super(title, author);
	this.genre = genre;
}

//book의 추상메서드 오버라이딩 
@Override
public void displayInfo() {
	
	//super 안붙혀도 값 가져옴 

	
	System.out.printf("[소설] 제목 : %s / %s / %s \n", super.getTitle(),super.getAuthor(),genre);
}



}
