package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone {
private boolean hasPhysicalKeyboard;// 물리적 키보드 유무 




public boolean isHasPhysicalKeyboard() {
	return hasPhysicalKeyboard;
}


public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
	this.hasPhysicalKeyboard = hasPhysicalKeyboard;
}




public BasicPhone() {
	// TODO Auto-generated constructor stub
}

public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
	super(brand, model, year, price); // 부모님꺼니깐 super
	this.hasPhysicalKeyboard = hasPhysicalKeyboard; //본인꺼는 this로
}




public void  checkKeyboard(){

	
	if(hasPhysicalKeyboard==true) {
		System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
	}else {// 물리적 키보드가 존재하지 않는다면
		System.out.println("이 휴대폰은 물리적 키보드가 없습니다.");
		
	}
	
	
}


}
