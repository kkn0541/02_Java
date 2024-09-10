package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

//비즈니스로직 처리하는 클래스
public class InheritanceService {
	// 상속확인 예제
	public void ex1() {
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
	
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
	
		System.out.println("=================================");
		
		//person을 상속받은 student가 
		//정말로 person이 필드 , 메서드를 사용할수 있는가?
		
		//student 객체생성 
		Student std = new Student();
		
		//student 만의 고유한 필드
		std.setGrade(3);
		std.setClassRoom(5);
		
		//person 클래스로부터 상속받은 필드 , 메서드
		std.setName("고길동");
		std.setAge(19);
		std.setNationality("대한민국");
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		
		System.out.println("----------------------------------------");
		Employee emp = new Employee();
		//employee만의 고유 메서드 
		emp.setCompany("khkh");
		//pserson 클래스로부터 상속받은 메서드 
		emp.setName("길동");
		emp.setAge(20);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getCompany());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		
		p.breacth();
		p.move();
		
		std.breacth();
		std.move();
		
		emp.breacth();
		emp.move();
		
		//상속의 특징 
		//코드 킬이 감소 및 중복제거 효과
		//
		
		
	}
	//super() 생성자 이용방법 
	public void ex2() {
		
		//student 객체 생성 
		Student std= new Student("김철수",17,"한국",1,3);
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		//employee 객체 생성 
		Employee emp = new Employee("김노동", 30, "한국", "kh");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());
		
		
		
		
	}
}
