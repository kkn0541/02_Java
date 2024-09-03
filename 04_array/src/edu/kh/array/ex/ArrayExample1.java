package edu.kh.array.ex;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayExample1 { // 예제 작성용 클래스
	/*
	 * 배열(array) -같은 자료형의 변수를 하나의 묶음으로 다루는 것 -묶여진 변수들은 하나의 배열명으로 불러지고 구분은 index를 이용
	 * (index는 0부터 시작하는 정수)
	 * 
	 */

	public void ex1() {
		// 변수 vs 배열

		// 변수 선언
		int num;
		// stack 영역에 int 자료형을 저장할수 있는 공간 4byte를 할당하고
		// 그 공간에 num이라는 이름을 부여.
		// 변수대입
		num = 10;
		// 생성된 num이라는 변수공간에 10이라는 값을 대입

		// 변수 사용
		System.out.println("num에 저장된 값 " + num);
		// num이 작성된 자리에 num에 저장된 값을 읽어와서 출력

		// -------------------------------------------------
		// 배열 선언
		int[] arr;
		// stack영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr이라는 이름을 부여
		// ** 해당변수는 참조형으로 주소값만을 저장할수 잇다

		// 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고 하며
		// heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		// int[3]: int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열

		// new int[3] : heap영역에 int 3칸짜리 int[]을 생성(할당)
		// arr= new int[3];
		// int[] int[] -> 같은 자료형 == 연산 가능

		System.out.println("arr: " + arr); // [I@68fb2c38 주솟값

		// 일반 자료형(primitive type)은 다 stack 영역에 있음 (int double boolean 등등)
		// 참조자료형(reference type) 배열 , 객체 string 은 heap영역에 있음

		// heap영역에 할당된 공간은 절대 비어있을 수 없다
		// 최초할당시 jvm 기본값이 자동 저장된다.
		// boolean은 false , 나머지 0 , (string참조형) ,객체 null

		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;

		// heap 영역에 생성된 공간은 절대 비어있을 수 없다
		// jvm 기본값이 들어가져 있다.
		// boolean : false
		// 나머지 :0
		// 참조형 : null
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// [10,50,1000] 실제로 arr배열이 가진 모든 요소의 값을 알고 싶다면..
		System.out.println(Arrays.toString(arr));

	}

	public void ex2() {
		// 배열 선언 및 할당
		int[] arr = new int[4];

		// arr[0~3] 전부 jvm에 의해 0으로 초기화 되어있는 상태 비어있지않음

		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 500;
		arr[3] = 1000;
		// arr[4] = 5000;
		// 에러내용 : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		// Index 4
		// out of bounds for length 4
		// 배열의 인덱스 범위 벗어남 : 길이가 4칸짜리 배열인데 ,
		// 없는 인덱스 번호인 4에 접근하려해서 발생

		// 배열의 길이 (몇 칸인가) : 배열명.length
		System.out.println("배열의 길이 : " + arr.length);

		// 배열과 for문
		for (int i = 0; i < arr.length; i++) {
			// i-> 0 1 2 3
			System.out.printf("arr[%d]에 저장된 값 : %d \n", i, arr[i]);
		}

	}

	public void ex3() {
		// 5명의 키(cm)를 입력받고 평균구하기
		// 1번 키 입력 : 170.5
		// 2번키 입력 165.7
		// 5번 키 입력 199.1

		// 평균 : 177.02
		Scanner sc = new Scanner(System.in);
		double[] height = new double[5];
		// double[] 자료형 참조변수 height를 stack영역에 생성하고
		// height에 heap 영역에 새로 생성된 double 5칸짜리 배열의 주소를 대입

		for (int i = 0; i < height.length; i++) {
			System.out.println((i + 1) + "번 키 입력 : ");
			height[i] = sc.nextDouble();
		}
		System.out.println();

		double sum = 0; // 합계 저장용 변수

		for (int i = 0; i < height.length; i++) {
			sum += height[i]; // 배열의 각 index에 저장된값을 sum에 누적

		}
		System.out.printf("\n 평균 : %.2f cm", sum / height.length);
	}

	public void ex4() {
		// 입력 받은 인워 수 만큼의 점수를 받아 배열에 저장
		// 입력이 완료되면 점수 함계 , 평균 ,최고점 , 최저점 출력

		// ex)
		// 입력받을 인워수 4
		// 1번 점수 입력 100
		// 2번 점수 입력 80
		// 3번점수 입력 50
		// 4번점수 입력 60

		// 합계 290
		// 평균 72.5
		// 최고점 100
		// 최저점 50
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 받을 인원수 :");
		int input = sc.nextInt();

		// 배열 선언 및 할당
		// 할당 할 배열의 크기는 입력받은 인원수 크기만큼 (input)
		int[] score = new int[input];

		// 합계 저장용 변수
		int sum = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번 점수 입력"); // 1 2 3 4
			score[i] = sc.nextInt();
			// score[0] =100;
			// score[1] = 50;
			// score[2]=30;
			sum += score[i];
		}
		// ====================
		int max = score[0];
		int min = score[0];

		for (int i = 0; i < score.length; i++) {

			// 최고점 비교
			if (score[i] > max) {
				max = score[i];
			}
			// 최저점 비교
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("합계 : " + sum);
		System.out.printf("평균  : %.2f \n", (double) sum / score.length);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
	}

	public void ex5() {
		char[] arr = new char[5];
		// [a b c d e ]
		for (int i = 0; i < arr.length; i++) {
			// 0 1 2 3 4

			arr[i] = (char) ('A' + i); //A= 65   a+ 0 a+1 a+2 a+3 a+4
			// char형태로 강제형변환
		}
		// **Arrays 클래스 **
		// -> java에서 제공하는 배열과 관련된 기능을 모아둔 클래스
		// arrays.tostring (배열명): 모든 요소 값을 출력

		System.out.println(Arrays.toString(arr));
		int[] arr2 = new int[4];
		System.out.println(Arrays.toString(arr2));// [0,0,0,0]
		// int 형 배열 4칸자리 생성 후 인덱스에 값을 대입하지 않았으므로
		// jvm에 의해 int형 기본값인 0으로 초기화 되어있음

		boolean[] arr3 = new boolean[2];
		System.out.println(Arrays.toString(arr3));// [false, false]

		String[] arr4 = new String[3];
		System.out.println(Arrays.toString(arr4)); // [null, null, null

		// 배열 선언과 동시에 초기화하기

		char[] arr5 = { 'A', 'B', 'C', 'D', 'E' };
		// {} (중괄호)는 배열의 리터럴 표기법
		System.out.println(Arrays.toString(arr5)); // [A, B, C, D, E]

	}

	public void ex6() {
		// 점심 메뉴 뽑기 프로그램

		// 메뉴배열
		String[] arr = { "김밥", "서브웨이", "햄버거", "백반", "짜장" };

		System.out.println("오늘 점심 메뉴 :" + arr[(int) Math.random() * 6]);
		// 0 1 2 3 4 5

		// 0.0 <x <1.0
		// 0.0< x*6 <6.0
		// 0<=(int) x*6 <6
		// 0 1 2 3 4 5

	}

	public void ex7() {
		// 배열을 이용한 검색
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력

		// ex)
		// 정수 입력 :200
		// 1번째 인덱스에 존재
		// 정수입력:5
		// 존재하지 않음
		int[] arr = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 :");
		int input = sc.nextInt();

		// 신호를 나타내기 위한 변수
		// flag == false : 일치하는 값이 존재하지 않음
		// flag == ture : 일치하는 값이 존재

		boolean flag = false; // 검사전에는 없다고 가정

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == input) {
				System.out.println(i + "번째 인덱스에 존재 ");
				flag = true; // 일치하는 값이 있으므로 true로 변경
			}
		}
		// flag 상태를 검사
		// false 인 flag를 ! 로 true바꿔서
		// flag가 false라면 if조건식이 false 이므로 수행되지 않음
		// -> !(not 연산자 : 부정 논리 연산자) 붙여줌으로써 treu로 변경하여
		// {} 안에 있는 코드를 수행하게함 .
		if (!flag) {
			System.out.println("존재하지 않음");
		}
	}

	public void ex8() {
		// 입력 받은 값과 일치하는 값이 있으면 인덱스 번호 출력
		// 없으면 존재하지 않음 출력

		String[] arr = { "사과", "딸기", "바나나", "키위", "멜론", "복숭아" };
		/*
		 * 과일입력: 아보카도 5번인덱스에 존재
		 * 
		 * 과일 입력 : 수박
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("과일입력 :");
		String input = sc.next();

		boolean flag = false; // 검사전에는 없다고 가정

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(input)) { //string 비교시 equals
				System.out.println(i + "번째 인덱스에 존재 ");
				flag = true; // 일치하는 값이 있으므로 true로 변경
			}
		}
		if (!flag) {
			System.out.println("존재하지 않음");
		}

	}
	public void ex9() {
		// 1. 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		// 2. 문자 하나를 입력받아 일치하는 문자가 char 배열에 몇개 존재하지는 확인
		// 3. 단, 일치하는 문자 없을경우 "존재하지 않습니다" 출력
		/*
		 * ex)
		* 문자열 입력 : hello
		[h, e, l, l, o]
		검색할 문자 입력 : l
		2개 있음
		*
		 *
		 * */
				
		// [사용해야하는 기술, 기능]
		// 1) 배열 검색
		// 2) String.length()  : 문자열의 길이
		//   ex) "Hello".length() -> 5
				
		// 3) String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴.
		//   ex) "Hello".charAt(1)  ->  'e'
//		        01234	
				
		// 4 ) count (숫자세기)

		Scanner sc= new Scanner(System.in);
		System.out.println("글자입력");
		String input = sc.nextLine();
		
		//1. 문자열을 입력받아 한글자씩 잘라내어 char 배열에 순서대로 저장 
		char[] arr=new char[input.length()]; //글자의 길이 수 
		for (int i = 0; i < arr.length; i++) {
			arr[i]=input.charAt(i);
			//arr[0] = 'h' 
			//arr[1]= 'e'
			//arr[2]='l'
			
			
		}
		System.out.println(Arrays.toString(arr));
		
		//2 문자 하나를 입력받아 일치하는 문자가 char배열에 몇개 존재하는지 확인 
		System.out.println("검색할 문자 입력");
		char ch= sc.next().charAt(0);
		//sc.next() -> string 형 
		//string.charAt(0) -> string 의 0번째 인덱스 문자 하나를 추출해서
		// 						char 형태로 변환 
		// h e l l o 중 하나만 입력할것이니 0번째 하나만 검색 
		// "h" -> 'h'
		
		int count=0; // 같은 글자 개수를 세기 위한 변수 
		
		for (int i = 0; i < arr.length; i++) {
			
			//char도 == equsle 아님
			if(arr[i] == ch) {
				count++;
				//arr[i] 값과 검색할 문자 ch 가 같은 경우
				//카운트를 늘려라 ! 
			}
		}
		
	//결과출력
		if(count>0) {
			System.out.println(count+"개 있음");
		}else {
			// 3. 단 일치하는 문자 없을 경우 존재하지 않음 출력 
			System.out.println("존재하지 않음 ");
		}
	
	}
}