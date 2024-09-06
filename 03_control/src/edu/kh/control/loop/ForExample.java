package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample { // 기능제공용 클래스
	Scanner sc = new Scanner(System.in);

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

	public void ex3() {

		// 1부터 입력받은 수까지 1씩 증가하면 출력하기

		System.out.print("입력번호 ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			System.out.print(i);
		}

	}

	public void ex4() {
		// 정수 5개 입력받아 합계구하기
		// ex) 입력 1: 10
		// ex) 입력2 :20
		// ex) 입력3 :30
		// ex) 입력4 :40
		// ex) 입력5:50
		// 합계 150

		int sum = 0; // 합계 저장용 변수

		// 입력이 5번 5까지
		for (int i = 1; i <= 5; i++) {
			System.out.print("입력" + i + ":");
			int input = sc.nextInt();

			// sum에 입력받은 input값 누적
			sum += input;
		}
		System.out.println("합계" + sum);

	}

	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단, 입력받은 수의 배수는 양쪽에 () 표시

		// 괄호를 표시할 배수 :3
		// 12 (3)45(6) 7...20

		System.out.print("괄호를 표시할 배수");
		int num = sc.nextInt();

		for (int i = 1; i <= 20; i++) {

			// 3의 배수일떄
			if (i % num == 0) {
				System.out.print("( " + i + " )");
			} else {// 배수가 아닐때
				System.out.print(i + " ");
			}
		}

	}

	public void ex6() {
		// [구구단 출력]
		// 2~9사이 수를 하나 입력받아
		// 해당 단을 출력
		// 단, 입력받은 수가 2~9 사이 수가 아니면
		// 잘못입력하셨습니다.

		/*
		 * 단입력 :5 5x1 =5
		 * 
		 * 5X9=45
		 * 
		 * 단 입력 -5 잘못 입력하셨습니다.
		 * 
		 */

		System.out.print("단 입력  ");
		int dan = sc.nextInt();

		if (dan >= 2 && dan <= 9) { // 2~9 사이일때
			for (int i = 1; i <= 9; i++) { // 곱해질 수
				System.out.printf("%d x %d= %d \n", dan, i, dan * i);
				
			}

		} else { // 범위 밖일떄
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void ex7() {
		// 구구단 모두 출력하기
		// 옆으로 출력
		for (int dan = 2; dan <= 9; dan++) { // 2~9단 까지 차례대로 증가
			for (int num = 1; num <= 9; num++) { // 각단의 곱해질 수 1~9까지 차례대로 증가 
				
				System.out.printf("%d x %d=%2d  ", dan ,num , dan*num); //%2d -> 두칸 만들어주고 오른쪽 정렬

			}
			System.out.println(); // 안쪽 for문 끝났을때 줄바꿈 
		}
		System.out.println("=-========================================");
		// 구구단 모두 역순 출력
		for (int dan = 9; dan >= 2; dan--) { // 단 9 -> 2 
			for (int num = 1; num <= 9; num++) { // 각단의 곱해질 수 1~9까지 차례대로 증가 
				
				System.out.printf("%d x %d=%2d  ", dan ,num , dan*num); //%2d -> 두칸 만들어주고 오른쪽 정렬

			}
			System.out.println(); // 안쪽 for문 끝났을때 줄바꿈 
		}
		
		
		
		
	}
	public void ex8() {
		//숫자 세기 count 
		//1부터 20까지 1씩 증가하면서 
		//입력받은 수의 배수의 총 개수 출력 
		//입력받은 수의 배수의 합계 출력 
		
		// 배수입력 : 3
		// 3 6 9 12 15 18 : 6개 
		// 3의 배수 합계 : 63 
		
		int count=0; // n의 배수의 개수를 세기위한 변수 
		int sum=0;   // n의 배수의 합계를 구하기 위한 변수 
		String result=""; // 배수누적 
		
		System.out.print("배수입력");
		int input=sc.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			
			if(i % input ==0) { // 배수 일때
				result +=i+" "; // 배수 담기
				count++;      // 배수의 갯수 세기 
				sum +=i; // 배수의 합 쌓기 
			}
			
		}
		
		System.out.printf("%s : %d개 \n", result, count );
		System.out.printf("%d의 배수 합계: %d", input , sum);
		
	}

}
