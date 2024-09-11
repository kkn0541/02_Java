package edu.kh.poly.ex2.model.service;

public class KKNCalculator implements Calculator /*, 다른인터페이스명*/ {
//extends :확장하다 , implements : 구현한다 
	//(부모)클래스 - (자식) 클래스 : extends 사용 (추상클래스 포함)
	//(부)인터페이스 - 자 인터페이스 : extends 사용 
	// 부 인터페이스  - 자 클래스 implement 사용 
	//(부) 클래스  자 인터페이스 : 상속불가 
	
	
	//추상클래스 : 공통적인 동작과 (일반 메서드, 일반 필드 )를 공유하면서 
	//				일부 동작만 다르게 구현하고자 할때 
	//인터페이스 : 같은 메서들 강제구현하면서 다른동작만을 구현하고자 할때 
	
	
	
	
	@Override
	public int plus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+ num2;
	}

	@Override
	public int minus(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

	@Override
	public int multiple(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}

	
	
	
}
