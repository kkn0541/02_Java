package com.hw1.model.dto;

public class Friend {

	private String name;
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Friend(String name) {
		super();
		this.name = name;
	}
	
	
	
	
	@Override
	public String toString() {
		return  name + "골목대장이다";
	}

	public void  pickLeader() {
		System.out.println(name+"골목대장이다");
	}
	
}
