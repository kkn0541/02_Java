package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.println("숫자를 한개 입력하세요");
		int num = sc.nextInt();

		// 내 풀이
//		if (num % 2 == 0 && num < 0) {
//			System.out.println("짝수");
//		} else if (num % 2 == 1) {
//			System.out.println("홀수");
//		} else {
//			System.out.println("양수만 입력해주세요");
//		}

		if (num <= 0) {
			System.out.println("양수만 입력해주세요");
		} else if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

	}

	public void practice2() {

		System.out.print("국어 입력");
		int num1 = sc.nextInt();
		System.out.print("수학 입력");
		int num2 = sc.nextInt();
		System.out.print("영어 입력");
		int num3 = sc.nextInt();

		int result = num1 + num2 + num3;
		double avg = (num1 + num2 + num3) / 3.0;
		// 소수점까지 나오도록 3아니고 3.0 으로 나눔

		String aaa;

		if ((num1 >= 40 && num2 >= 40 && num3 >= 40) && avg >= 60) {
			aaa = "축 합격";
		} else {
			System.out.println("합계" + result);
			System.out.println("평균" + avg);
			aaa = "불합격";
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		System.out.println("합" + result);
		System.out.println("평균" + avg);
		System.out.println(aaa);
	}

	public void practice3() {

		System.out.print("1~12사이의 정수입력");
		int month = sc.nextInt();
		System.out.println(month);
		String result;

		switch (month) {
		case 1: case 3: case 5: case 7: case 8 : case 10: case 12:
		System.out.println("월은 31일까지 있습니다. ");
		break;
		case 4: case 6: case 9: case 11:
       	System.out.println(month +"월은 30일까지 있습니다.");
		break;
		default:
		System.out.println(month +"월은 잘못 입력된 달입니다.");
		break;
		}
	
		

	}

	public void practice4() {
		System.out.print("키");
		double height = sc.nextDouble();
		System.out.print("몸무게");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.println(bmi);
		String result;

		if (bmi < 18.5) {
			result = "저체중";
		} else if (bmi < 23) {
			result = "정상체중";
		} else if (bmi < 25) {
			result = "과체중";
		} else if (bmi < 30) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		System.out.println("BMI 지수" + result);
	}

	public void practice5() {
		System.out.print("중간고사");
		int exam1 = sc.nextInt();
		double exam11 = exam1 * 0.2;
		
	//	double exam1 *=0.2;

		System.out.print("기말고사");
		int exam2 = sc.nextInt();
		double exam22 = exam2 * 0.3;

		System.out.print("과제");
		int work1 = sc.nextInt();
		double work2 = work1 * 0.3;

		System.out.println("출석횟수");
		int sit1 = sc.nextInt();

		// 18번출석 0.2
		// 출석횟수 20*0.2

		System.out.println("============결과============");

		double result = exam11 + exam22 + work2 + sit1;

		if (sit1 <= 20 *( 1-0.3)) {
			System.out.println("출석 횟수 부족" + sit1 + "/20");

		} else if (result >= 70) {

		//	System.out.println("중간고사 점수(20)  :  " + exam11);
			System.out.printf("중간고사 점수(20):%.1f \n", exam11);
			System.out.printf("기말고사 점수(20):%.1f \n", exam22);
			System.out.printf("과제 점수(30) :%.1f \n  " , work2);
			System.out.printf("과제 점수(30) :%.1f \n  " ,(double) sit1);
			System.out.printf("과제 점수(30) :%.1f \n  " ,result);
			System.out.println("pass");

		} else if (result < 70) {
			System.out.println("중간고사 점수(20)  :  " + exam11);
			System.out.println("기말고사 점수(20)  :  " + exam22);
			System.out.println("과제 점수(20)  :  " + work2);
			System.out.println("출석 점수(20)  :  " + (double) sit1);
			System.out.println("총점" + result);
			System.out.println("fail [점수미달]");

		}
	}
}
