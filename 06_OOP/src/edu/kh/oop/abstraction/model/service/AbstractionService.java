package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

//Service : 특정 기능(비즈니스 로직)을 제공하는 클래스 
public class AbstractionService {

	public void ex1() {
		// People이라는 클래스를 이용해서 국민객체 만들기

		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1
		// new People() : 새로운 People 객체를 Heap 영역에 생성

		// * 클래스 이름이 자료형처럼 사용된다
		// pelple 객체를 넣으려면 그 상자도 people이여야 한다.
		// ==그래서 클래스를 "사용자 정의 자료형" 이라고도 부른다

//		p1.name = "홍길동"; //직접 접근  the field People.name is not visible
//		p1.gender = '남';
//		p1.pNo = "123456-1234567";
//		p1.address = "서울시 중구 남대문로 그레이츠청계";
//		p1.phone = "010-1234-1234";
//		p1.age = 20;
//
//		p1.tax();
//		p1.vote();
//		
//		System.out.println("p1 name"+p1.name);
//		System.out.println("p1 gender"+p1.gender);
//		System.out.println("p1 Pno"+p1.pNo);
//		System.out.println("p1 address"+p1.address);
//		System.out.println("p1 phone"+p1.phone);
//		System.out.println("p1 age"+p1.age);
	p1.setName("홍길동");
	p1.setGender('남');
	p1.setpNo("123456-1234567");
	p1.setAddress("서울");
	p1.setPhone("010-1234-5678");
	p1.setAge(20);
	
	System.out.println(p1.getName());
	System.out.println(p1.getGender());
	System.out.println(p1.getpNo());
	System.out.println(p1.getAddress());
	System.out.println(p1.getPhone());
	System.out.println(p1.getAge());
	
	
	//본인객체
	People kn = new People();
	
	kn.setName("기남");
	kn.setGender('남');
	kn.setAddress("서울");
	kn.setpNo("12345-45678");
	kn.setPhone("010-1111-1111");
	kn.setAge(93);
	
	System.out.println(kn.getName());
	System.out.println(kn.getGender());
	System.out.println(kn.getpNo());
	System.out.println(kn.getAddress());
	System.out.println(kn.getPhone());
	System.out.println(kn.getAge());
	
	}
}
