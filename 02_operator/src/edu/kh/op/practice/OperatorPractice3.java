package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {
	public void practice1() {
		
		// 가격, 회원여부
		
		Scanner sc= new Scanner(System.in);
		System.out.println("가격을 입력하세요");
		int input1= sc.nextInt();
		System.out.println(input1-(input1*0.1));
		System.out.println("멤버쉽 있으세요 ");
		boolean input2= sc.nextBoolean();
		

	
		double result = input2==true? input1-(input1*0.1)  : input1-(input1*0.05);
		
		System.out.println(result);
		
		
		
		
		
	}
	public void practice2() {
		Scanner sc= new Scanner(System.in);
		System.out.println("가격을 입력하세요");
//		int amount=sc.nextInt();
//		
//		int fiftyThousand =amount /50000;
//		
//		// 50000원으로 나눈 나머지값 누적 
//		amount %= 50000;
//		
//		
//		int tenThousand =amount /10000;
//		amount %= 10000;
//		
//		int fiveThousand =amount /5000;
//		amount %= 5000;
//		
//		int oneThousand =amount /1000;
//		amount %= 1000;
//		
//		
//		System.out.println("5만원"+fiftyThousand);
//		System.out.println("만원"+tenThousand);
//		System.out.println("오천원"+fiveThousand);
//		System.out.println("천원"+oneThousand);
//		
		
		int input3= sc.nextInt();
		
		int result1=input3/50000;
		int result2=input3%50000; // 잔액
		System.out.println("5만원권:"+result1);
		
		int result3=result2/10000;
		int result4=result2%10000; //잔액
		System.out.println("만원권:"+result3);
		
		int result5=result4/5000;
		int result6=result4%5000;
		System.out.println("오천원권:"+result5);
		
		int result7=result6/1000;
		int result8=result6%1000;
		System.out.println("천원권:"+result7);
		
		
	}
	public void practice3() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("첫번째수");
		int input9= sc.nextInt();
		
		
		System.out.println("두번째수");
		int input10= sc.nextInt();
		
		String result=input9%input10==0? "배수입니다":"배수가 아닙니다";
		
		System.out.println(result);
		
		
	}
}
