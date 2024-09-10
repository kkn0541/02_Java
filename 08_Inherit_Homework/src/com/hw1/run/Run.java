package com.hw1.run;

import java.util.EmptyStackException;
import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3명의 학생 정보를 기록할 수 있게 배열 할당 
		Student[] students = new Student[3];

		students[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학");
		students[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		students[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");

		// 학생정보 모두출력
//	for (int i = 0; i < students.length; i++) {
//		
//		System.out.println(students[i].information());
//	}

		// 향상된 for문
		/*
		 * 
		 * 자바에서 배열 , 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할수 있는 구조를 제공 일반적인 for문 보다 코드가 더 간결하고 가독석이
		 * 좋아서 반복작업을 더 쉽게 할수 있음
		 * 
		 * for(데이터타입 변수명 : 배열 또는 컬렉션 ){} //반복해서 실행할 코드
		 * 
		 */
		for (Student std : students) {
			System.out.println(std.information());
		}

		// 3명 학생정보 초기화

		Employee[] employee = new Employee[10];
		Scanner sc = new Scanner(System.in);

		int count = 0;

		while (true) {
			System.out.println("이름");
			String name = sc.next();
			System.out.println("나이");
			int age = sc.nextInt();
			System.out.println("키");
			double height = sc.nextDouble();
			System.out.println("키");
			double weight = sc.nextDouble();
			System.out.println("급여");
			int salary = sc.nextInt();
			System.out.println("부서");
			String dept = sc.next();

			employee[count] = new Employee(name, age, height, weight, salary, dept);
			count++;

			// 배열이 꽉찼으면 반복종료
			if (count == employee.length) {
				break;
			}
			// 추가 여부 묻기
			System.out.println("추가할꺼???  (y/n)");
			String str = sc.next().toUpperCase(); // 소문자 -> 대문자
			// toLowerCase() -> // 대문자 -> 소문자

			if (str.equals("N"))
				break;
			{

			}
			// 현재까지 기록된 사원들의 정보 출력
			for (Employee emp : employee) {
				//만약 emp가 null이면 반복멈춰라
				if(emp==null)break;//nullpointexeption 방지
				System.out.println(emp.information());
			}

		}

	}

}
