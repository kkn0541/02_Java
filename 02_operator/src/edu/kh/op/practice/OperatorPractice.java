package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice { // 기능 제공용 클래스 
//메서드..
 public void practice1() {
	 //인원수 사탕개수 입력 받기 
	 
	 Scanner sc= new Scanner(System.in);
	 System.out.print("인원수입력");
	 int input1= sc.nextInt();
	 System.out.print("사탕개수 입력");
	 int input2= sc.nextInt();
	 
	 System.out.println("1인당 사탕개수 "+input2/input1);
	 System.out.println("남은 사탕개수"+ input2 % input1);
	 
 }
 public void practice2() {
	 Scanner sc= new Scanner(System.in);
	 System.out.print("이름");
	 String input3=sc.next();
	 System.out.print("학년");
	 int input4=sc.nextInt();
	 System.out.print("반");
	 int input5=sc.nextInt();
	 System.out.print("번호");
	 int input6=sc.nextInt();
	 //성별 
	 System.out.print("성별");
	 String input7=sc.next();
	 String result=input7=="남학생"?  "남학생": "여학생";
	
	 System.out.print("성적");
	 double input8=sc.nextDouble();
	 
	 //문자 s 정수 d
	 System.out.printf("%s %d %d %d %s %s %.2f" 
			 ,input3,input4,input5,input5,input6,input7,input8);
 }
 
 public void practice3() {
	 
	 Scanner sc= new Scanner(System.in);
	 System.out.print("국어");
	 int input9= sc.nextInt();
	 System.out.print("영어");
	 int input10= sc.nextInt();
	 System.out.print("수학");
	 int input11=sc.nextInt();
	 
	 System.out.println("합계 :" + (double)(input9 + input10 +input11));
	 System.out.println("평균 :" + (double)((input9 + input10 +input11)/3));
	 
	 
	 
	 
	 
 }
}
