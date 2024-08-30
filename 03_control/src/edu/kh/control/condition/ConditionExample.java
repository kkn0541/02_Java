package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 클래스

	// import --> ctrl shift o
	Scanner sc = new Scanner(System.in);

	public void ex1() {

		// if 문
		// 조건식이 true일때만 내부 코드 수행

		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력

		System.out.println("정수 입력 : ");
		// 시험 nextInt형 변수는 int로 들어가야함
		int input = sc.nextInt();

		if (input > 0) {
			System.out.println("양수입니다");
		}
		if (input <= 0) {
			System.out.println("양수가 아니다 ");

		}

	}

	public void ex2() {
		// if -else
		// 조건식 결과가 true면 if문
		// false면 else구문이 수행됨

		// 홀짝검사
		// 입력받은 정수값이
		// 홀수이면 " 홀수입니다 " 출력
		// 0이면 "0입니다"
		// 짝수이면 "짝수입니다.
		// else if 사용 x 중첩 if문 사용하기

		System.out.println("정수입력 : ");
		int input = sc.nextInt();
		if (input % 2 != 0) {
			System.out.println("홀수입니다.");
		} else {// 짝수 또는 0
				// 중첩 if문
			if (input == 0) {
				System.out.println("0입니다.");

			} else {
				System.out.println("짝수입니다. ");
			}

		}
	}

	public void ex3() {

		// if(조건식) -else if(조건식) -else

		// 양수 ,음수 , 0판별

		System.out.print("정수입력 ");
		int input = sc.nextInt();

		if (input > 0) {
			System.out.println("양수입니다.");
		} else if (input < 0) {// 바로 위에 있는 if문이 만족되지 않는 경우 수행
			System.out.println("음수입니다.");
		} else {
			System.out.println("0 입니다 ");
		}

	}

	public void ex4() {
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 1,2,12 겨울 (-15 이하라면 한파경보 -12이하 한파주의보)
		// 3~5 봄
		// 6~8 여름 (35도 이상 :"폭염경보"/33도이상 "폭염주의보")
		// 9~11 가을
		// 1~12 사이가 아닐땐 해당하는 계절 없다 출력

		System.out.print("달입력 ");
		int month = sc.nextInt();

		String season; // 아래 조건문 수행결과를 저장할 변수 선언

		if (month == 1 || month == 2 || month == 12) {
			season = "겨울";

			System.out.println("온도입력");
			int temperature = sc.nextInt();
			if (temperature <= -15) {
				// 겨울 한파경보
				season += " 한파경보";

				// season = season+"한파경보";
				// "겨울"+ "한파경보"
			} else if (temperature <= -12) {
				season += "한파주의보"; // 겨울 + 한파주의보
			}

		} else if (month >= 3 && month <= 5) {
			season = "봄";
		} else if (month >= 6 && month <= 8) {
			season = "여름";

			System.out.println("온도입력");
			int temperature = sc.nextInt();

			if (temperature >= 35) {
				season += "폭염경보";

			} else if (temperature >= 33) {
				season += "폭염주의보";
			}

		} else if (month >= 9 && month <= 11) {
			season = "가을";
		} else {
			season = "해당하는 계절 없음";
		}

		System.out.println(season);
	}

	public void ex5() {
		System.out.println("나이");
		int age = sc.nextInt();

		String result;
		if (age <= 13) {
			result = "어린이입니다.";
		} else if (age > 13 && age <= 19) {
			result = "청소년입니다.";
		} else {
			result = "성인입니다.";
		}
		System.out.println(result);
	}

	public void ex6() {
		System.out.println("점수");
		int point = sc.nextInt();
		String result = null;

		if (point < 0 || point > 100) {
			result = "잘못입력하셨슴";
		} else if (point >= 90) {
			result = "a";
		} else if (point >= 80 && point < 90) {
			result = "b";
		} else if (point >= 70 && point < 80) {
			result = "c";
		} else if (point >= 60 && point < 70) {
			result = "d";
		} else {
			result = "f";
		}

		System.out.println(result);
	}

	public void ex7() {
		System.out.println("나이");
		int age = sc.nextInt();
		System.out.println("키");

		String result = null;

		if (age < 0 || age > 100) {
			result = "잘못입력하셨슴";
		} else {
			System.out.println("키입력");
			double height = sc.nextDouble();

			if (age < 12) {
				result = "적정연령 아님";
			} else if (height < 140.0) {
				result = "적정키가 아닙니다.";
			} else {
				result = "탑승가능";
			}
		}
		System.out.println(result);

//		if (age < 0 || age > 100) {
//			result = "잘못입력하셨슴";
//		} else if (age >= 12 && height >= 140.0) {
//			result = "탑승가능";
//		} else if (age < 12) {
//			result = "적정 연력이 아닙니다.";
//		} else if (height < 140.0) {
//			result = "적정키가 아닙니다.";
//
//		}
//		System.out.println(result);
	}

	public void ex8() {
		String result = null;
		System.out.println("나이");
		int age = sc.nextInt();
		

		if (age < 12 || age < 0 || age > 100) {
			result = "나이를 잘못입력했습니다.";
			System.out.println(result);
			return;
		
		}else  { //0~100사이를 잘 입력한 경우 
			System.out.println("키");
			double height = sc.nextDouble();
			
			if(height <0 ||height>250) {
				result="키를 잘못입력";
				
			}else { // 0~250 잘 입력한 경우 
				
				if(age <12 && height >=140.0) { //나이 x 키 o){
					result="키는 적절하나 나이가 적절치 않음";
				
					
				}else if(age >=12 && height <140.0) {
					result="나이 o 키 x";
				}else if (age<12 && height< 140.0) {
					result ="나이 x 키 x";
				}else {
					result="탑승가능";
				}
					
			}
		}
	
		

		
		
		
		
		
		
		
		
//		
//		if (height < 140 || height < 0 || height > 250.0) {
//			result = "키 잘못입력했습니다.";
//			System.out.println(result);
//			return;
//		}
//
//		if (age >= 12) {
//
//			if (height >= 140.0) {
//				result = "탑승가능";
//			}else {
//				result="나이는 맞으나 키가 적절치않음";
//		} 
//
//		}
		System.out.println(result);
	}
}
