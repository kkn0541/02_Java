package com.hw1.run;

import com.hw1.model.dto.Book;
import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//book객체배열 3칸 생성 후 각 인덱스마다 
		
		Book book[] = new Book[3];
		
		
		
		//novel tesxtbook poerty 생성하여 대입  (다형성 중 업캐스팅)
		book[0]=new Novel("해리포터","jk 롤링","판타지");
		//부모타입 참조변수 book 에 자식객체가 들어옴( 업캐스팅)
		book[1]=new Textbook("자바 프로그래밍","james gosling","컴퓨터과학");
		//부모타입 참조변수 = 자식객체(업캐스팅)
		book[2]=new Poetry("우리들의 사랑시","김소월",30);
		
		
		
		//모든 도서 정보 출력 
		//향상된 for문 
		for(Book books: book) {
			books.displayInfo();
			System.out.println();// 개행 
		}
		
//		for (int i = 0; i < book.length; i++) {
//	      	book[i].displayInfo();
//		
//		}
//		
		
	}

}
