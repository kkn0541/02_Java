package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Book;

public class BookService {
	public void practice() {
		Book book = new Book();
		
		System.out.println(book.toString());
		
		
		Book book1= new Book("자바의 정석",30000,0.2,"남궁성");
		
		System.out.println(book1.toString());
		
		System.out.println();
		System.out.println("======================================");
		System.out.println("수정된 결과 확인");
	
	
		book.setTitle("c언어");
		book.setPrice(30000);
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		
		System.out.println(book.toString());
		System.out.println(book1.toString());

		System.out.println("도서명="+book.getTitle());
		System.out.printf("할인된 가격 %.0f 원\n" ,book.getPrice()-( book.getPrice()*book.getDiscountRate()));

		System.out.println("도서명 "+ book1.getTitle());
		System.out.printf("할인된 가격 %.0f 원 \n" ,book1.getPrice()-( book1.getPrice()*book1.getDiscountRate()));
	}
}

/*
 * 현실 객체 :세상에 있는 모든 사물 
객체 지향 언어 : 
자바 객체 : 
class : 속성 기능으로 구성된 
new 연산자 : heap 영역에 새로운 객체를 만듬 
추상화 : 공통된 속성만으로 구성 
캡슐화 : 데이터를 하나로 묶어 제어하는 것 접근제어 private 
캡슐화 원칙 :
메서드/기능의 '정의'란 : 
메서드의 '호출' 이란 :
return : 호출한 곳으로 값을 전달 

public String ex1() {
    return "Hi";

접근제한 없는 반환형이 문자형인 ex1이라는 이름의 메서드 
hi라는 값을 호출한 곳으로 전달 

}

위 메서드 상세히 해석 : 


 * 
 * */
 