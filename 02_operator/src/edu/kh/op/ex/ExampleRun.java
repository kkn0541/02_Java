package edu.kh.op.ex;

public class ExampleRun { // 코드 실행용 클래스

	// 메인메서드가 필수로 작성되어있어야함 ㅁ
	public static void main(String[] args) {

		// OpEample 생성
		// opexample 이 자료형으로
		// ->opexample 이라는 클래스(설계도)를 이용해서
		// 2. 그 객체 이름이 ex 다. 1.객체를 생성하는데
		OpExample opEx = new OpExample();
		// 상자를 만들고 타입이 똑같아야함
		// explerun , opexample이 같은 패키지안에 있어서 에러안남
		// 같은 패키지 안에 있는 클래스를 import 하지 않아도 불러다 쓸수있다.
		// opEx.ex1(); // opEx가 가지고 있는 ex1() 메서드 실행
		// opEx.ex2(); //ex2() 호출
		// opEx.ex3();
		opEx.ex4();
	}

}
