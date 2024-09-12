package com.hw2.model.service;

import com.hw2.model.dto.Person;

public interface ManagementSystem {

	 //관리 시스템 인터페이스 
	//회사 , 수용소 에서 공통으로 사용가능 
	
	
	
public abstract void addPerson(Person person); //사람 추가용 메서드 
public abstract void removePerson(String id); // 사람삭제
public abstract void displayAllPersons(); // 모든 사람 조회 



}
