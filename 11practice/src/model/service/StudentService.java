package model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import model.dto.Student;

public class StudentService {

	private Scanner sc = new Scanner(System.in);

	// 리스트라는 타입의 변수명이 studentList인 자식객체
	private List<Student> studentList = new ArrayList<Student>();

	public StudentService() {
		// 생성자는 return 값이 없다
		studentList.add(new Student("홍길동", 25, "서울시 중구", 'M', 90));
		studentList.add(new Student("고영희", 23, "경기도 안산", 'f', 100));
		studentList.add(new Student("강아지", 30, "서울시 강남구", 'M', 80));
		studentList.add(new Student("오미나", 27, "충북 청주", 'f', 90));
		studentList.add(new Student("박주희", 24, "서울시 서대문", 'f', 70));
	}

	public void displayMenu() {

		int menuNum = 0;

		do {
			System.out.println("\n============학생관리 프로그램===========\n");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("7. 나이순으로 정렬"); // Comparable 사용
			System.out.println("8. 이름순으로 정렬"); // Comparator 사용
			System.out.println("0. 프로그램 종료");

			System.out.println("메뉴번호 선택 ");

			try {
				menuNum = sc.nextInt();
				System.out.println();
				switch (menuNum) {
				case 1:
					addStudent();
					break;
				case 2:
					selectAll();
					break;
				case 3:
					System.out.println(updateStudent());
					break;
				case 4:
					System.out.println(removeStudent());
					break;
				case 5:
					searchName1();
					break;
				case 6:
					searchName2();
					break;
				case 7:
					sortByAge(); break;
				case 8:
					sortByName(); break;
				case 0:
					System.out.println("프로그램 종료");
					break;

				default:
					System.out.println("메뉴에 작성된 비밀번호만 입력하세요");
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("\n error 입력형식이 유효하지 않음 ");

				sc.nextLine();

				menuNum = -1;
			}

		} while (menuNum != 0);

	}

	public String addStudent() throws InputMismatchException {
		System.out.println("=============학생정보 추가 ==========");

		System.out.println("이름 : ");
		String name = sc.next();

		System.out.println("나이 : ");
		int age = sc.nextInt();

		// 입력버퍼에 남은 개행문자 제거
		sc.nextLine();

		System.out.println("사는 곳  : ");
		String region = sc.nextLine();

		System.out.println("성별 m / f");
		char gender = sc.next().charAt(0); // 'm' or 'f'

		System.out.println("점수 :");
		int score = sc.nextInt();

		// student 새 객체 생성 후 studentList에 추가

		if (studentList.add(new Student(name, age, region, gender, score))) {

			return "";
		} else {
			return "실패";
		}

	}

	public void selectAll() throws InputMismatchException {
		System.out.println("=======전체 학생 조회=====");

		if (studentList.isEmpty()) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		int index = 0;
		for (Student std : studentList) {
			System.out.println(index++ + " // " + std);

		}
	}

	public String updateStudent() throws InputMismatchException {
		System.out.println("---------------학생정보수정--------------");
		System.out.println("인덱스 번호 입력 : ");
		int index = sc.nextInt();
		if (studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다.";

			// 2) 입력된 숫자가 0보다 작은지 검사
		} else if (index < 0) {
			return "음수는 입력할수 없습니다.";

			// 3) studentList 범위 내 인덱스 번호인지 검사
		} else if (index >= studentList.size()) {
			return "범위를 넘어선 값을 입력하수 없습니다";

			// 4) 만약 문자열 입력한 경우 -> 예외처리 throws

		} else {

			System.out.println("이름 : ");
			String name = sc.next();

			System.out.println("나이 : ");
			int age = sc.nextInt();

			// 입력버퍼에 남은 개행문자 제거
			sc.nextLine();

			System.out.println("사는 곳  : ");
			String region = sc.nextLine();

			System.out.println("성별 m / f");
			char gender = sc.next().charAt(0); // 'm' or 'f'

			System.out.println("점수 :");
			int score = sc.nextInt();

			// student 새 객체 생성 후 studentList에 추가

			Student temp = studentList.set(index, new Student(name, age, region, gender, score));

			return temp.getName() + "의 정보가 변경되었습니다.";
		}

	}

	public String removeStudent() throws InputMismatchException {
		System.out.println("학생정보제거");
		System.out.println("인덱스번호 입력");

		int index = sc.nextInt();

		if (studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다.";

			// 2) 입력된 숫자가 0보다 작은지 검사
		} else if (index < 0) {
			return "음수는 입력할수 없습니다.";

			// 3) studentList 범위 내 인덱스 번호인지 검사
		} else if (index >= studentList.size()) {
			return "범위를 넘어선 값을 입력하수 없습니다";

			// 4) 만약 문자열 입력한 경우 -> 예외처리 throws

		} else {

			System.out.println("정말 삭제하겠습니까 (y/n)");
			char ch = sc.next().toUpperCase().charAt(0);
			if (ch == 'Y') {
				Student temp = studentList.remove(index);
				return temp.getName() + "의 정보가 제거되었습니다.";
			} else {
				return "취소";
			}

		}
	}

	public void searchName1() {
		System.out.println("======학생검색(이름완전일치)-------");

		System.out.println("검색할 이름 입력");
		String input = sc.next();

		boolean flag = true;

		for (Student std : studentList) {

			if (input.equals(std.getName())) {
				System.out.println(std);
				// std.tostring 이랑 같음

				flag = false;
			}
		}

		if (flag) {
			System.out.println("검색결과가 없습니다. ");
		}

	}

	public void searchName2() {
		System.out.println("======학생검색(이름완전일치)-------");

		System.out.println("검색할 이름 입력");
		String input = sc.next();

		boolean flag = true;

		for (Student std : studentList) {

			if (std.getName().contains(input)) {
				System.out.println(std);
				// std.tostring 이랑 같음

				flag = false;
			}
		}

		if (flag) {
			System.out.println("검색결과가 없습니다. ");
		}

	}

	public void sortByAge() {
		Collections.sort(studentList);
		for (Student std : studentList)
			System.out.println(std);
	}
  public void sortByName() {
	 Comparator<Student>namecomComparator=Comparator.comparing(Student::getName);
  
	 Collections.sort(studentList,namecomComparator);
  
	 for(Student std:studentList) {
		 System.out.println(std);
	 }
  
  boolean String.equals(Object anObject)
  
  }
}