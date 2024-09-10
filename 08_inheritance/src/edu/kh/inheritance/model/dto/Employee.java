package edu.kh.inheritance.model.dto;

/*
 *  object
 *       ㄴ person
 *              ㄴ Employee
 */

public class Employee extends Person {
    //필드
	private String company;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	//자동완성
	//alt shift s -> o 
	// select super construction to invoke 에서 
	// 매개변수있는 부모 생성자 선택 
	
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}




	// 메서드
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	

}
