package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("당신의 나이는?");
		int input1= sc.nextInt();
		String resutl1=input1>=20? "저는 성인입니다" : "저는 미성년입니다";
	
		
		//string이 아니라  boolean 으로 받기 
		System.out.print("청소년입니까");
		boolean result2=input1>=13 && input1<=19? true :false;
	
		System.out.println("노인이거나 어린이 입니까");
		boolean result3= input1>=65 ||input1<=12 ? true : false;
		
		
		
		
		System.out.println(resutl1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		
		
		
		
		
		//int result2 = a < b ? a++ : (b == 0 ? a-- : b++);
	}

}
