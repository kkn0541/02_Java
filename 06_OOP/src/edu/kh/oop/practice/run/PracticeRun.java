package edu.kh.oop.practice.run;

import edu.kh.oop.practice.model.service.BookService;
import edu.kh.oop.practice.model.service.HeroService;

public class PracticeRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bookservice = new BookService();
		//클래스 안에 생성자가 하나도 없으면 
		//컴파일러가 기본생성자는 자동으로 만들어줌 
		// -> 그래서 우리가 bookservice() 이렇게 사용가능한거다. 
		//-> 생성자가 하나라도 있으면 안만들어줌 , 기본생성자 개발자가 만ㄷ르어야함
	

  // 호출함수명	
	//	bookservice.practice();
	
HeroService heroservice= new HeroService();
heroservice.practice();
	
	
	}

}

