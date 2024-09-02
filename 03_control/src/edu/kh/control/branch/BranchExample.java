package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	Scanner sc = new Scanner(System.in);

	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		// 단 , 5를 출력하면 반복문 종료

		for (int i = 1; i <= 10; i++) {

			System.out.print(i + " ");

			if (i == 5) {
				break;
			}
		}

	}

	public void ex2() {

		// 입력받은 모든 문자열을 누적
		// 단 , "exit@" 입력 시 문자열 누적을 종료하고 결과 출력

		String str = "";// 빈문자열

		// 범위가 없어서 while반복 사용
		while (true) {
			System.out.println("문자열 입력(exit@ 입력시 종료 :");
			String input = sc.nextLine();

			// next() : 다음 한단어 (띄어쓰기 포함 x )
			// nextLine() : 다음 한 줄 (띄어쓰기 포함 o)

			// 자바에서 문자열 (string ) 비교는 == 연산자 불가
			// 비교연산자(==)는 보통 기본자료형끼리의 연산에서만 사용가능함
			// string은 기본자료형이 아닌 참조형 !!!!!

			// 문자열 비교 == 안됨
			// 자바에서 문자열 비교는 == 연산자 사용 불가
			// 문자열1.equals(문자열2)
			// 문자열 1과 문자열 2가 같으면 true / 다르면 false 반환
			if (input.equals("exit@")) {
				break;
			}

			str += input + "\n";

		}
		System.out.println("============");
		System.out.println(str);
	}

	public void ex3() {
		// continue : 다음 반복으로 넘어감

		// 1~10까지 1씩증가하면 출력
		// 단, 3의 배수제외

		// 1 2 4 5 7 8 10

		for (int i = 1; i <= 10; i++) {

			if (i % 3 == 0) {
				continue;
			}
			// continue 사용시에는 순서 중요
			System.out.print(i + " ");
		}

	}

	public void ex4() {
		// 1~100 까지 1씩 증가하며 출력하는 반복문
		// 단., 5의 배수는 건너뛰고
		// 증가하는 값이 40이 되었을때 반복 멈춤

		for (int i = 1; i <= 100; i++) {
			// 순서 중요

			if (i == 40) {
				break;
			}
			if (i % 5 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	public void RSPGame() {
		// 가위바위보 게임을 할껀데
		// 몇 판할지 입력받음
		// 입력받은 판수 만큼 반복

		// 컴퓨터 : Math.random() : 0.0~1.0 난수 생성
		// 1~3사이 난수 생성
		// 1이면 가위 , 2이면 바위 , 3이면 보 지정
		// 컴퓨터와 플레이어 가위바위보 판별
		// 플레이어 승 / 졌습니다.
		// 매판마다 -현재 기록 2승 1무 0ㅠㅐ

		System.out.println("[가위바위보게임]");
		System.out.print("몇판????");
		int round = sc.nextInt();

		// 승패기록용 변수
		int win = 0;
		int draw = 0;
		int lose = 0;

		for (int i = 1; i <= round; i++) { // 입력받은 판수만큼 반복
			System.out.println("\n" + i + "번째 게임");
			System.out.println("가위 바위 보 중 하나를 입력");
			String input = sc.next();

			int random = (int) (Math.random() * 3 + 1); // 1 2 3
			// math.random():0.0 1.0 사이
			// 0.0 <= x <1.0
			// 0.0 <= x*3 < 3.0
			// 1.0 <= x*3+1 <4.0
			// int로 강제형변환 --> 1<=x<4 1이상 4미만 정수 -> 1 2 3

			String com = null;
			// null :아무것도 참조하고 있지 않음
			switch (random) {
			case 1:
				com = "가위";
				break;
			case 2:
				com = "바위";
				break;
			case 3:
				com = "보";
				break;

			}

			// 컴퓨터는 [바위]를 선택했습니다.
			System.out.printf("컴퓨터는 [%s]를 선택했습니다. \n", com);

			// 컴퓨터와 플레이어 가위바위보 판별하기

			if (input.equals(com)) {
				System.out.println("비겼습니다.");
				draw++;

			} else { // 지거나 , 이긴경우

				// 플레이어가 이긴경우
				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");
				boolean win3 = input.equals("보") && com.equals("바위");

				if (win1 || win2 || win3) {
					System.out.println("플레이어승");
					win++;
				} else {
					System.out.println("졌습니다");
					lose++;
				}

			}
			System.out.printf("현재기록 :%d승 %d무 %d패 \n", win, draw, lose );
		}

	}
}
