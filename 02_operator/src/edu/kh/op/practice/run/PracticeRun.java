package edu.kh.op.practice.run;

import edu.kh.op.practice.OperatorPractice;
import edu.kh.op.practice.OperatorPractice3;

public class PracticeRun {
	public static void main(String[] args) {
			
	
	//기능 실행용 클래스 
	//System.out.printf("%.2f+%.2f=%.2f\n",input1,input2,input1+input2);
	//메인메서드 필수 

		//패키지명이 달라서 에러남 import 받아야함
		OperatorPractice op= new OperatorPractice();

	//	op.practice1();
	//	op.practice2();
	//	op.practice3();
	
		OperatorPractice3 op1= new OperatorPractice3();
	//	op1.practice1();
	op1.practice2();
	//	op1.practice3();
	}
}
