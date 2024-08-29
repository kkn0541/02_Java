package edu.kh.variable.ex2;

import java.util.Scanner;
//import : 다른패키지에 존재하는 클래스를 얻어오는 구문
//패키지가 다르면 import를 해야 가져올수 있음 
//impot java.util.scanner : java.util 패키지에서 scanner class(설계도) 수입


public class ScannerExample {
	public static void main(String[] args) {

		//Scanner : 프로그램 실행 중 키보드 입력을 받을 수
		// 			있게 하는 역할 
		//Scanner 생성 
		// -> 프로그램안에 스캐너라는 기계를 만드는 것 
		Scanner sc= new Scanner(System.in);
		// 전달인자로 system.in 필수!!
		// 오류 원인(import 없을때 )-> 만들고 싶은데 설계도 (class)가 없어서 못만들고 있음 
		// -> import 구문 작성시 오류 해결 
		
		//옆에바로입력하게 println말고 print
		System.out.print("정수 1 입력:");
		
		
		int input1 =sc.nextInt(); // = 뒤쪽 -> 정수를 입력받는 것 
								  //=  앞쪽 입력받은 정수 input1에 대입
		//nextInt() : 다음 입력된 정수를 읽어옴 
		//문자열 넣으면 에러남 
		
		System.out.print("정수 2입력 : ");
		int input2=sc.nextInt();
		
		System.out.printf("%d+%d=%d\n",input1,input2,input1+input2);
		
		
		
		
		
		
	}
}
