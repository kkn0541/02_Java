package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayExample1 { //예제 작성용 클래스 
	/*
	 * 배열(array)
	 * -같은 자료형의 변수를 하나의 묶음으로 다루는 것 
	 * -묶여진 변수들은 하나의 배열명으로 불러지고 
	 *  구분은 index를 이용 (index는 0부터 시작하는 정수)
	 * 
	 * */

	public void ex1() {
		//변수 vs 배열 
		
		//변수 선언 
		int num; 
		// stack 영역에 int 자료형을 저장할수 있는 공간 4byte를 할당하고 
		// 그 공간에 num이라는 이름을 부여. 
		//변수대입
		num=10;
		//생성된 num이라는 변수공간에 10이라는 값을 대입 
		
		//변수 사용
		System.out.println("num에 저장된 값 "+ num);
		//num이 작성된 자리에 num에 저장된 값을 읽어와서 출력 
		
		//-------------------------------------------------
		// 배열 선언 
		int[] arr;
		//stack영역에 int[] 자료형 공간을 4byte 할당하고
		//그 공간에 arr이라는 이름을 부여
		//** 해당변수는 참조형으로 주소값만을 저장할수 잇다
		
		//배열 할당 
		arr=new int[3];
		//new : "new 연산자" 라고 하며 
		//      heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		// int[3]: int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열 
		
		//new int[3] : heap영역에 int 3칸짜리 int[]을 생성(할당)
		//arr= new int[3];
		//int[] int[] -> 같은 자료형 == 연산 가능 
		
		System.out.println("arr: "+arr); //[I@68fb2c38 주솟값 
		
		//일반 자료형(primitive type)은 다 stack 영역에 있음 (int double boolean 등등) 
		// 참조자료형(reference type) 배열 , 객체 string 은 heap영역에 있음
		
		//heap영역에 할당된 공간은 절대 비어있을 수 없다 
		//최초할당시 jvm 기본값이 자동 저장된다. 
		//boolean은 false , 나머지 0 , (string참조형) ,객체 null 
		
		arr[0]=10;
		arr[1]=50;
		arr[2]=1000;
				
		
		//heap 영역에 생성된 공간은 절대 비어있을 수 없다 
		// jvm 기본값이 들어가져 있다. 
		//boolean : false
		//나머지 :0 
		// 참조형 : null 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	
		//[10,50,1000] 실제로 arr배열이 가진 모든 요소의 값을 알고 싶다면..
		System.out.println(Arrays.toString(arr));
		
	
	}
	
	
}
