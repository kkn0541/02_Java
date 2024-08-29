package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		
		//문자열 입력(string)
		//문자열을 3번 입력받아 한줄로 출력하기 
		
		//ex)
		//입력1: 안녕?
		//입력2: 반가워 
		//입력3: 점심뭐먹지 
		// 1 2 3 한줄로 출력 
		
		Scanner sc= new Scanner(System.in);
		
		//sc.next() : 다음 입력된 한 단어를 읽어옴  (띄어쓰기 인정하지 않음)
		//공백(스페이스 , 탭 등)을 만나면 입력을 중단 후 반환
		
		
		//sc.nextLine(): 다음 입력된 한 줄을 읽어옴 
		//공백과 함께 입력된 모든 내용을 반환 
		
		
		
		System.out.print("입력1:");
		String input1 = sc.nextLine();
		System.out.print("입력2:");
		String input2 = sc.nextLine();
		System.out.print("입력3:");
		String input3 = sc.nextLine();
		
		System.out.printf("%s %s %s\n",input1 , input2 , input3);
		
		
		
	}
}
