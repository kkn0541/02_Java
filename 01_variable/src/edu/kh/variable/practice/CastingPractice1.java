package edu.kh.variable.practice;

public class CastingPractice1 {
	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		char ch1 = 'K';

		int iNum3 = 11;
		int iNum4 = 3;
//	
		System.out.println(iNum1 / iNum2); // 2
		System.out.println((int) dNum); // 2
//	System.out.println( (float)(iNum2*2)+(int)dNum ); // 10.0
		System.out.println(iNum1 * dNum);
		System.out.println((float) iNum1); // 10.0
//	System.out.println( (float)iNum1/ (float)iNum2 ); // 2.5
		System.out.println(iNum1 / (float) iNum2);
		// 형변환 먼저 한 후 연산진행
		System.out.println((float) dNum); // 2.5
		System.out.println((int) fNum); // 3
		System.out.println((int) (iNum1 / fNum)); // 3
		System.out.println(iNum1 / fNum);// 3.3333333
		// float : 소수점 아래 8번째 자리까지 연산 후 반올림

		System.out.println((double) (iNum1) / (double) (fNum)); // 3.3333333333333335
		System.out.println((iNum1) / (double) (fNum)); // 3.3333333333333335
		// double : 소수점 아래 16번째 자리까지 연산 후 반올림
		System.out.println("'" + ch + "'"); // 'A'
		System.out.println((int) ch); // 65
		System.out.println((int) ch + iNum1); // 75
		System.out.println(ch + iNum1); // 75
		// ch가65로 자동형변환
		System.out.println((int) ch1); // k ==75
		System.out.println("'" + (char) (ch + iNum1) + "'"); // 'K' a=65 10

		System.out.println(((double) iNum1 / (double) iNum2));

		System.out.println((double) (iNum3) / (double) (iNum4));
	}
}
