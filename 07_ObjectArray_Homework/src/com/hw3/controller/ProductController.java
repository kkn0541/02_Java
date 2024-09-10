package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	private Product[] pro = null;
	public static int count = 0;
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		int menuNum = 0;

		do {
			System.out.println("====제품 관리 메뉴=====");
			System.out.println(" 제품 정보추가");
			System.out.println("제품 전체 조회");
			System.out.println("프로그램 종료");

			System.out.println("입력");
			menuNum = sc.nextInt();
			sc.nextLine();

			switch (menuNum) {
			case 1:
				/* 제품정보추가 */
				break;
			case 2:
				/* 제품 전체조회 */
				break;
			case 0:
				// 프로그램 종료
				break;
			default:
				System.out.println("잘못입력");

			}

		} while (menuNum != 0);// 0되면 반복종료 false가 되니까

	}
	
	public int emptyIndex() {
		// pro 배열을 0 인덱스부터 끝까지 접근해서
		// 참조하는 값이 null인 경우 인덱스를 반환
		for (int i = 0; i < pro.length; i++) {
			if (pro[i] == null) {
				return i;
				// 현재 메서드를 종료하고 호출한 곳으로 i값을 가지고 돌아감
			}
		}
		// for문을 수행했지만 return이 되지 않은 경우 해당위치 코드 수행된다.
		// -> for문에서 return이 되지 않았다 == 배열에 빈칸이 없다.
		return -1;

	}
	
	
	
	
	
	public void productInput() {
		
		System.out.println("제품정보추가");
		int index = emptyIndex();
		
		if(index==-1) {
			System.out.println("추가 불가능");
		}
		System.out.print("");
		int pld = sc.nextInt();

		System.out.print("책이름:");
		String pName = sc.next();

		System.out.print("가격:");
		int price = sc.nextInt();

		System.out.print("세금:");
		double tax = sc.nextDouble();
	}
	
	public void productPrin() {
		
	}
}
