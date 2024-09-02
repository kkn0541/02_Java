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
				for (int i = num2; i < num1; i++) { // ex) 8 부터 4까지
					System.out.print(i);
				}
			} else {
				for (int i = num1; i < num2; i++) { // ex) 4부터 8까지
					System.out.print(i);
				}
			}

		}

	}

	public void practice5() {
		System.out.println("숫자");
		int num1 = sc.nextInt();
		System.out.println("======================" + num1 + "단=====");

		for (int i = 1; i <= 9; i++) {

			System.out.printf("%d x %d = %d \n", num1, i, num1 * i);
		}
	}

	public void practice6() {
		System.out.println("숫자입력");
		int num1 = sc.nextInt();
		if (num1 < 2 || num1 > 9) {
			System.out.println("숫자 제대로 입력하세요");
		} else {

			for (int i = num1; i <= 9; i++) {
				System.out.println("========" + i + "=======");

				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d x %d = %d \n", i, j, i * j);
				}
			}
		}

	}

	public void practice7() {
		// 행 (row) 입력한 num1 만큼
		// 열 (col) 현재행(row)만 반복
		// 이중for문
		System.out.println("숫자");
		int input = sc.nextInt();

		for (int row = 1; row <= input; row++) { // 행
			for (int col = 1; col <= row; col++) { // 열
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice8() {
		// 행은 입력한 input만큼 반복
		System.out.println("숫자");
		int input = sc.nextInt();

		for (int row = input; row <= 1; row--) {
			// 내가 입력한 input값을 row에 대입하여 반복할때마다 1씩감소
			// 4 3 2 1

			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {
		// 공백부분이input보다 1작은 수에서 시작하여
		// 1씩감소하는 것처럼 보임
		// * 부분 - 현재행(row)만큼 찍힌것으로 보임

		System.out.println("숫자");
		int input = sc.nextInt();

		for (int row = 1; row <= input; row++) {
			// 공백 부분 입력할 for문 따로
			for (int i = input - 1; i >= row; i--) {
				System.out.println(" ");
			}
			// 현재 row만큼 반복하여 * 출력해줄 for문
			for (int col = 1; col <= row; col++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}

	public void practice10() {
		// 위쪽삼각형 행은 input만큼 반복 열은 현재행 만큼 반복
		// 아래삼각형 행은 input보다 1작은수에서부터 1씩 감소하며 반복
		// 열은 현재행 만큼 반복

		// 두개 합치기

		// 위쪽삼각형
		int input = sc.nextInt();
		for (int row = 1; row < input; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		// 아랫쪽삼각형
		for (int row = input - 1; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice11() {
		int input = sc.nextInt();
		// 왼쪽에서부터 공백 포함
		// input(4) +row -1 ==4 -> 한 행에 열이
		// input(4) +row(2)-1 == 5-> 한행에 열 (col)이 5번
		// input

		for (int row = 1; row <= input; row++) {

			for (int col = 1; col < input + row - 1; col++) {
				// [1-1턴] 1<=(4+1-1) 4

				if (input - row >= col) { // 공백조건
//[1-1]턴 (4-1)3>=1 (true)" " 출력		
//[1-2]턴     3>=2 (true( " " 출력
				} else { // * 조거
					System.out.println("*");
				}
			}
			System.out.println();
		}

	}

	public void practice12() {

		// input == row(행)
		// 1행과 input행은 "*" 출력
		// 1열과 input열은 "*" 출력
System.out.println("정수 입력");
		int input = sc.nextInt();

		for (int row = 1; row <= input; row++) {

			for (int col = 1; col < input; col++) {

				// 첫번째 / 마지막 행, 첫번째 열, 마지막 열 * 출력
				if (row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");
				} else {// 나머지는 공백 출력
					System.out.print(" ");
				}

			}
		}
		System.out.println();

	}

	public void practice13() {
		System.out.println("입력");
		int num1 = sc.nextInt();
		int count = 0;
		String result = ""; // 배수 담기
		for (int i = 1; i <= num1; i++) {

			if (i % 2 == 0 || i % 3 == 0) {

				result += i + " ";

			}
			if (i % 2 == 0 && i % 3 == 0) {
				count++;

			}
		}
		System.out.println(result + "\n count : " + count);
	}

}
