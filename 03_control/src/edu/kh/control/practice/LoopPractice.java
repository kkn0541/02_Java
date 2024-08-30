package edu.kh.control.practice;

import java.util.Iterator;
import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.println("1이상숫자 입력해주세요");
		int input = sc.nextInt();

		if (input < 1) {
			System.out.println("1이상 숫자 입력해주세요");
		} else {

			for (int i = 1; i <= input; i++) {
				System.out.print(i);

			}
		}

	}

	public void practice2() {

		System.out.println("1이상숫자 입력해주세요");
		int input = sc.nextInt();

		if (input < 1) {
			System.out.println("1이상 숫자 입력해주세요");
		} else {

			for (int i = input; i > 0; i--) {
				System.out.print(i);

			}
		}
	}

	// 다듬기
	public void practice3() {
		System.out.println("정수하나입력");
		int input = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= input; i++) {
			sum += i;
			System.out.print(i + "+");

		}
		System.out.println(sum);
	}

	public void practice4() {
		System.out.println("첫번쨰숫자");
		int num1 = sc.nextInt();
		System.out.println("두번쨰숫자");
		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자를 입력하시오");
		} else {

			if (num1 > num2) {
				for (int i = num2; i < num1; i++) {
					System.out.print(i);
				}
			} else {
				for (int i = num1; i < num2; i++) {
					System.out.print(i);
				}
			}

		}

	}

	public void practice5() {
		System.out.println("숫자");
		int num1 = sc.nextInt();
		for (int i = num1; i <= num1; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(num1 + "*" + j + "=" + num1 * j);
			}
		}

	}

	public void practice6() {
		System.out.println("숫자");
		int num1 = sc.nextInt();
		for (int i = num1; num1 <= 9; num1++) {
			System.out.println("========" + num1 + "단+" + "========");
			for (int j = 1; j < 10; j++) {

				System.out.println(num1 + "*" + j + "=" + num1 * j);
			}
		}

	}
	public void practice7() {
		System.out.println("숫자");
		int num1 = sc.nextInt();
		
		for (int i = 0; i <= num1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice8() {
		System.out.println("숫자");
		int num1 = sc.nextInt();
		
		for (int i = 0; i <= num1; i++) {
			for (int j = num1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void practice9() {
		System.out.println("숫자");
		int num1 = sc.nextInt();
		
		for (int i = num1; i <= num1; i--) {
			System.out.print(" ");
			System.out.print("*");
			for (int j = num1; j >= i; j--) {
			}
			System.out.println();
		}
	}

}
