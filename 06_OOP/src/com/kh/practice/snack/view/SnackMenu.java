package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

//view 사용자에게 보여줄 응답화면 관련된 코드가 모인 패키지 

public class SnackMenu {

	// 필드
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();

	// 반환이 void이면 실행만 되고 끝남
	// 반환값 없음
	public void menu() {

		System.out.println("스낵류를 입력하세요");

		System.out.print("종류");
		String kind = sc.next();

		System.out.print("이름");
		String name = sc.next();

		System.out.print("맛");
		String flavor = sc.next();

		System.out.println("개수");
		int numOf = sc.nextInt();

		System.out.println("가격");
		int price = sc.nextInt();

		System.out.print(scr.saveData(kind, name, flavor, numOf, price));
		
		String result=sc.next(); // y or n 
		if(result.equals("y")) {
			//저장된 데이터 출력 
			System.out.println(scr.confirmData());
			
		}

	}

}
