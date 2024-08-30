package edu.kh.control.loop;

public class ForExample { // 기능제공용 클래스

	public void ex1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public void ex2() {
		// 영어 알파벳 A부터 Z가지 한줄로 출력
		// ABCDERFGH~Z
		for (int i = 'A'; i < 'Z'; i++) {
			System.out.print((char) i);// 강제 형변환
		}

		System.out.println("\n==================================");

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}

	}

}
