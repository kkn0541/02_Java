package com.hw2.model.dto;

public class Monkey extends Animal {
	
	
	
	public Monkey() {
		// TODO Auto-generated constructor stub
	}

	public Monkey(String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println(getName()+"가 "+"우끼기"+" 하며 웁니다.");
	}

}
