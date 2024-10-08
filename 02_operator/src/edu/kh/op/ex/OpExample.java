package edu.kh.op.ex;

import java.util.Scanner;

public class OpExample { // 예제 코드 작성용 클래스

	// 메서드 ex1() method: 객체 지향 프로그래밍에서 opexample 객체와 관련된 함수
	// -> opexample이 가지고 있는 기능 중 ex1() 이라는 기능
	public void ex1() {
		// 증감(증가, 감소) 연산자 : ++, --

		int iNum1 = 10;
		int iNum2 = 10;

		iNum1++;
		iNum2++;

		System.out.println("iNum1:" + iNum1);// 11
		System.out.println("iNum1:" + iNum2);// 11

		// 전위 연산
		int temp1 = 5;
		System.out.println(++temp1 + 5); // 11

		// 후위 연산
		int temp2 = 3;
		System.out.println(temp2-- + 2); // 5
		// 후위 연산은 맨마지막에 -> 3 + 2 =5 출력 후 3-- 결과는 2

		int a = 3;
		int b = 5;
		int c = a++ + --b;
		// 4 4 8 틀림
		// 447
		// 3++ + --5
		// 3++ + 4
		// 7
		// 3++ -> 4
		System.out.printf("%d / %d /%d\n", a, b, c);

	}

	public void ex2() {
		// 비교 연산자 : > , < ,>= , <= ,== ,!=
		// -비교연산자의 결과는 항상 논리값 (true / false)

		int a = 10;
		int b = 20;

		System.out.println((a == b) == false); // true
		// false == false -> true

		int c = 4;
		int d = 5;

		System.out.println((++c != d) == (--c != d));
		// 5 3
		// false true
		// false

	}

	public void ex3() {
		// 논리 연산자 && (AND) , ||(OR)

		// && (AND) : 둘다 TRUE면 TRUE 나머지는 FALSE
		// 와 , 그리고 , ~면서 , ~부터 ~까지 ~사이

		int a = 101;
		// a는 100 이상이면서 짝수인가
		System.out.println((a >= 100) && (a % 2 == 0)); // false

		int b = 5;
		// b는 1부터 10까지 숫자범위에 포함되어 있는가
		System.out.println((b >= 1) && (b <= 10)); // true

		// || or연산자 :둘다 false면 false 나머지 true
		// 또는 ~거나

		int c = 10;
		// c는 10을 초과하거나 짝수인가
		System.out.println((c > 10) || (c % 2 == 0));// true
	}

	public void ex4() {
		// 삼항 연산자 : 조건식 ? true일때 수행될값 : false일때 수행될값 
		
		//*조건식 : 연산결과가 true 이거나 / false 인 식 
		
		int num=30; 
		
		// num이 30보다 크면(초과) "num은 30보다 큰수이다"
		// 아니면 num은 30이하의 수이다 
		
		String result = num>30 ? "30보다 큰수" : "30보다 작은수";
		
		System.out.println(result);

	System.out.println("-----------------------------------------");
	//입력받은 정수가 음수인지 양수인지 구분 
	//단 0은 양수로 처리 
	//정수입력 4
	//양수입니다
	//정수입력 -5
	//음수입니다.
	Scanner sc= new Scanner(System.in);
	System.out.println("입력");
	
	int input= sc.nextInt();
	
	
	String result1= input>=0 ? input +"는 양수" : input+"는 음수 ";

			System.out.println(result1);
			
			
	}

}
