package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;

public class Run {

	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		/*
		 * 3개의 생성자를 사용하여 3명의 사원 정보를
배열로 생성한 후 출력 해보고 값이 없는
필드에 각각 값을 입력해 넣어 출력
직원 각각의 보너스가 적용된 연봉을 계산하여
출력하고 총 직원 연봉의 평균을 구하여 출력
		 * 
		 * 
		 * */
		
		 Scanner sc = new Scanner(System.in);
		Employee emp[]= new Employee[3];
		
	int index=0;
			
	for (int i = 0; i < emp.length; i++) {
		if (emp[i] == null) {
			index = i;
			
			System.out.println("====정보입력-=======");
			
			
			
			System.out.print("사번:");
			int empNo = sc.nextInt();
			
			System.out.print("사원명:");
			String empName = sc.next();
			
			System.out.print("소속부서:");
			String dept = sc.next();
			
			System.out.print("직급");
			String job = sc.next();
			
			System.out.print("나이:");
			int age = sc.nextInt();
			
			System.out.print("성별:");
			char gender = sc.next().charAt(0);
			
			System.out.print("급여:");
			int salary = sc.nextInt();
			
			System.out.println("보너스 포인트");
			double bonusPoint = sc.nextDouble();
			
			System.out.println("전화번호");
			String phone=sc.nextLine();
			
			System.out.println("주소");
			String address= sc.next();
			
			emp[index]=new Employee(empNo, empName,dept,job,age,gender,salary,bonusPoint,phone,address );
			
		}
	//	System.out.println(emp[i].(type[]) collection.toArray(new type[collection.size()])toString());
	}
	
	
	
	
	
		
		
		
		
	}

}
