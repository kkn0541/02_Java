package com.hw2.model.dto;

public class Employee extends Person {
private String position;



public String getPosition() {
	return position;
}



public void setPosition(String position) {
	this.position = position;
}



public Employee(String id, String name, String position) {
	super(id, name);
	this.position = position;
}



@Override
public String getinfo() {
	
	                 //    패턴   ,값 printF랑 똑같음
	//protected w직접접근가능
 	return String.format("Id : %s, 이름 : %s , 직책 :%s",id,name,position);
 	//id와 name을 person에서 protected로 만들었기 깨문에 
 	// 후손클래스에서 직접 접근 가능 
}




}
