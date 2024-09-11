package edu.kh.poly.ex2.model.dto;

public class Fish extends Animal {
	
	
	public Fish() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Fish(String type, String eatType) {
		super(type, eatType);
	}




	//alt shift s -> 0verrride / implements method  --> ok 
	@Override
	public void eat() {
	System.out.println("입을 뻐끔 거리며먹음");
		
	}

	@Override
	public void breath() {
		System.out.println("아가미 호흡을 한다. ");
		
	}

	@Override
	public void move() {
		System.out.println("꼬리를 헤엄치며 움직인다. ");
	
	}
	@Override
	public String toString() {
		return "Fish : " + super.toString();
		
	}
	
	
	
}
