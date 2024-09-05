package edu.kh.oop.practice.model.vo;

public class Book {

	private String title;
	private int price;
	private double discountRate;
	private String author;

	
	//기본생성자 {}  ctrl space enter
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	//매개변수 생성자 
	//alt shift s -> generate constructor useing Fields -> generate
	
	public Book(String title, int price, double discountRate, String author) {
		
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	// 어노테이션 : 컴파일러용 주석 
	//overriding : 재정의(메서드)
	@Override
	public String toString() {
		return title+" /" +price+ "/ " + discountRate +"/ "+author;
	}



	
	
	
	
	
	
}
