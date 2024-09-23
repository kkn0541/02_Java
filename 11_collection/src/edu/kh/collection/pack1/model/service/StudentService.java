package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
/**
 * 
 */
public class StudentService {

	// java.util.List 인터페이스 : list에 반드시 필요한 필수 기능을 모아둔 인터페이스
	// * 인터페이스 객체 생성 불가 x , 부모 참조변수 역할만 가능 \

	// java.util. arrayList : 배열 형태 List (가장 대표적인 list자식 클래스)

	// new ArrayList() : 기본생성자 -> 기본 크기가 10 짜리 리스트 생성
	// ->하지만 리스트는 크기가 늘엇다 줄엇다 하기 떄문에 큰 의미 없음

	// ArrayList (용량) : 용량만큼의 리스트 생성
	// ->너무 큰 값을 작성하면 메모리를 많이 소모함 .

	//
	// 리스트를 상속받아 만든 arrayList
	// 다형성 중 업캐스팅 적용
	// 부모타입 (List) 참조변수 (testList) = 자식객체(ArrayList)주소 대입

	private Scanner sc = new Scanner(System.in);

//	private List<Object> testList = new ArrayList<Object>();
//				타입	

	// 학생 정보를 저장할 List 생성
	private List<Student> studentList = new ArrayList<Student>(); // 검색 조회 효율적
	// 기본 10칸짜리
	// private List<Student> studentList = new ArrayList<Student>();//추가 , 수정 ,삭제에
	// 효율적

	// 재네릭(generics) <Object >
	// -> 컬렉션에 저장되는 객체타입을 한가지로 제한 :<E> == ELEMENT
	// 다양한 타입을 처리할수 있도록 만들어짐

	// 리스트에 5개 데이터 미리 넣어놓기
	public StudentService() {

		studentList.add(new Student("홍길동", 25, "서울시 중구", 'M', 90));
		studentList.add(new Student("고영희", 23, "경기도 안산", 'F', 100));
		studentList.add(new Student("강아지", 30, "서울시 강남구", 'M', 80));
		studentList.add(new Student("오미나", 27, "충북 청주", 'F', 90));
		studentList.add(new Student("박주희", 24, "서울시 서대문", 'F', 70));
	}

	// 메뉴 출력용 메서드
	/**
	 * alt shift j 메서드 설명용 주석
	 * 
	 * @author kkn@gmail.com
	 */
	public void displayMenu() {

		int menuNum = 0; // 메뉴 선택용 변수

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

			System.out.print("메뉴 번호 선택 : ");

			try {
				menuNum = sc.nextInt();
				//
				System.out.println();

				switch (menuNum) {
				case 1:
					System.out.println(addStudent());
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
					sortByAge();
					break;
				case 8:
					sortByName();
					break;
				case 0:
					System.out.println("프로그램 종료..");
					break;
				default:
					System.out.println("메뉴에 작성된 번호만 입력하세요!");
				}

			} catch (InputMismatchException e) {
				System.out.println("\n error : 입력 형식이 유효하지 않습니다. 다시 시도해 주세요 ");

				sc.nextLine(); // 입력버퍼에 남아있는 잘못된 코드 제거

				menuNum = -1; // 첫 반복 시 잘못 입력하는 경우
				// menuNum이 0을 가지고 있어 종료되는데
				// 이를 방지하기 위해 임의 값 -1 대입
			}

		} while (menuNum != 0); // false일 경우 do while문 종료 
								// true 일경우 do부분 실행문 실행 
	}

	/**
	 * 1. 학생 정보 추가 메서드
	 * 
	 * @return 삽입 성공시 "성공" 실패 시 "실패" 반환 문자열 반환
	 */
	public String addStudent() throws InputMismatchException {
		// 에러발생시 addstuden 호출한 쪽으로 던진다 -> case 1 으로
		// try catch문 안에 있으니 밑에 잇는 catch문에서 예외처리해줌
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

		// Student 새 객체 생성 후 studentList에 추가

		// 매개변수 생성자를 통해 객체 생헝하면서 값 저장
		if (studentList.add(new Student(name, age, region, gender, score))) {
			// 잘됫으면 true 안되면 false
			// boolean java.util.list.add(Student e)
			// (반환형) ->재네릭<student>라고 제한해놓아서
			// 재내릭떄문에 list에 추가할수 있는 객체타입이 student로 제한됨

			return "성공";

		} else {

			return "실패";
		}

	}

	/**
	 * 학생 전체 조회 메서드 List가 비어있는 경우 "학생 정보가 없습니다. 출력 -있는 경우 전체 학생 출력
	 * 
	 */
	public void selectAll() {

		System.out.println("==========학생 전체 조회============");

		// studeneList가 비어있는 경우 "학생정보가 없습니다." 출력

		// -list에 저장된 데이터의 개수를 얻어오는 방법 :int List.size

		// if(studentList.size()==0)
		if (studentList.isEmpty()) {
			// boolean java.util.List.isEmpty ()
			// 컬렉션이 비어있다면 true , 안비어있다면 false
			System.out.println("학생 정보가 없습니다.");
			return; // 현재 메서드를 종료하고 호출한 곳으로 돌아감
					// 단 반환값은 없다 (void)
		}

		// 일반 for문
		/*
		 * for (int i = 0; i < studentList.size(); i++) { //-> 배열명.length 대신 .size() 사용
		 * System.out.println(studentList.get(i)); // = get(i) == get(i).tostring }
		 * 
		 * 
		 * 
		 * }
		 * 
		 */

		// 향상된 for문 (for each문)
		// 컬렉션 , 배열의 모든 요소를 순차적으로 반복접근 할수 있는 for문
		// 0번인덱스부터 마지막 요소까지 1씩 증가며 접근

		// 작성법
		// for (컬렉션 또는 배열에서 꺼낸 한개의 요소를 저장할 변수 : 컬렉션명 또는 배열명 ) {}

		int index = 0;
		for (Student std : studentList) {
			System.out.print((index++) + "번 : ");
			System.out.println(std);
		}

		/*
		 * public void ex() { // List테스트용 예제
		 * 
		 * // // List.add(Object e) :리스트에 객체를 추가 // 매개변수 타입이 Object == 모든 객체 매개변수로 전달될수
		 * 있음
		 * 
		 * testList.add(new Student("홍길동", 25, "서울시 중구", 'M', 90)); testList.add("문자열");
		 * // string 도 객체 testList.add(sc); testList.add(new Object());
		 * 
		 * // 컬렉션 특징 : 여러타입의 데이터를 저장할수 있다.
		 * 
		 * // 반환형이 object // Object List.get(index) : 리스트에서 index번째 인덱스에 있는 객체를 반환 //
		 * 반환형이 object 라는 것은 모든 객체를 반환할수 있다. System.out.println(testList.get(0));
		 * System.out.println(testList.get(1)); System.out.println(testList.get(2));
		 * System.out.println(testList.get(3));
		 * 
		 * // testList에서 꺼내온 인덱스 요소가 student 혹은 상속관계인지 검사 // 만약 student 라면 이름을 꺼내오고 싶다.
		 * for (Object e : testList) {
		 * 
		 * if (e instanceof Student) { // 맞다면 접근하여 이름을 출력하기
		 * System.out.println("testList 인덱스 Studnet 타입 인덱스 요소의 이름 :" + ((Student)
		 * e).getName()); } }
		 * 
		 * }
		 */
	}

	/**
	 * 학생 정보 수정 메서드 -학생정보가 studentList에 있는지(인덱스 번호로) 검사 , 없다면 "입력된 학생 정보가 없습니다." 문자열
	 * 반환
	 * 
	 * 입력된 숫자가 0보다 작은지 검사 , 작다면 음수는 입력하수 없습니다. 문자열 반환 studentList 범위 내 인덱스번호인지 검사 ,
	 * 초과했다면 " 범위를 넘어선 값을 입력할수 없습니다. 문자열 출력 수정이 완료 되었다면 , 000의 정보가 변경되었습니다. 문자열 반환
	 * 
	 * @return
	 */
	public String updateStudent() throws InputMismatchException {

		System.out.println("---------------학생정보수정--------------");
		System.out.println("인덱스 번호 입력 : ");
		int index = sc.nextInt();
		// 학생정보가 studentList에 있는지(인덱스 번호로) 검사
		// 1) 학생정보가 studentList에 있는지 검사 : 한명도 없는지 검사.
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
			// 수정 코드 작성

			System.out.println(index + "번째에 저장된 학생정보");
			System.out.println(studentList.get(index));

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

			// 입력받은 index번째에 새로운 학생 정보를 세팅 -> 수정

			// index 번째에 있던 기존 학생정보가 반환되고 , 그개체를 temp에 저장
			Student temp = studentList.set(index, new Student(name, age, region, gender, score));

			// temp에는 바뀌기전 데이터가 반환됨
			return temp.getName() + "의 정보가 변경되었습니다. ";
			// 기존의 객체의 이름이 출력됨

		}

	}

	/**
	 * 학생정보 제거 메서드
	 * 
	 * @return
	 */
	public String removeStudent() throws InputMismatchException {
		// 호출한쪽으로 예외 던짐 거기서 처리하도록
		// Student List.remove(int index);
		// 리스트에서 index번째 요소를 제거
		// 이때 제거된 요소가 반환된다.
		// * List 중간에 비어있는 인덱스가 없게 하기 위해서
		// remove() 동작 시 뒤쪽 요소를 한칸씩 알아서 당겨온다.
		System.out.println("========학생 정보 제거===========");

		System.out.println("인덱스 번호 입력 : ");
		int index = sc.nextInt();

		// 1)
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
			// 학생 정보 제거
			System.out.println("정말 삭제 하시겠습니까(y/n) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			// 입력받은 문자 대문자로 변환 후 0번쨰 뽑아옴
			// "n"-> "N" => 'N'
			// String.toUpperCase () : 문자열을 대문자로 변경
			// string .toLowerCase() : 문자열을 소문자로 변경

			if (ch == 'Y') {
				Student temp = studentList.remove(index);
				// 삭제된 객체를 반환
				// 삭제 되면서 그 인덱스가 temp에 저장됨
				return temp.getName() + "의 정보가 제거되었습니다.";
			} else {
				return "취소";
			}

		}

	}

	/**
	 * 이름이 일치하는 학생을 찾아서 조회하는 메서드 (완전 일치) 검색할 이름 입력받아 studentList에서 꺼내온 Student 객체의
	 * name 값이 같은지 비교 일치하는 경우 stduent 객체 출력 -검색 결과가 없습니다. 출력
	 * 
	 */
	public void searchName1() {
		System.out.println("====학생검색(이름 완전 일치)=====");

		System.out.println("검색할 이름 입력 : ");
		String input = sc.next();

		boolean flag = true;

		for (Student std : studentList) {

			if (input.equals(std.getName())) { // 이름이 일치하는 경우
				System.out.println(std);
				// std.tostring 이랑 같음

				flag = false;
			}

		}

		if (flag) {
			System.out.println("검색 결과가 없습니다.");
		}
		// 향상된 for문

	}

	/**
	 * 이름에 특정 문자열이 포함되는 학생을 찾아서 조회하는 메서드 문자열 입력받아 studentList에서 꺼내온 Student 객체의
	 * name값에 포함되는 문자열인지 검사 포함되는 경우 student 객체 출력 -검색결과 없습니다. 출력
	 */
	/**
	 * 
	 */
	public void searchName2() {
		System.out.println("====학생검색(이름 부분포함)=====");

		System.out.println("이름에 포함되는 문자열 입력 : ");
		String input = sc.next();

		boolean flag = true;

		// list에서 순차적으로 돌면서 꺼내오고있음
		for (Student std : studentList) {

			// boolean String.contains(문자열) : string에 문자열이 포함되어있으면 true/ 없으면 false
			if (std.getName().contains(input)) { // 이름이 일치하는 경우
				// 순서중요
				System.out.println(std);
				// std.tostring 이랑 같음

				flag = false;
			}

		}

		if (flag) {
			System.out.println("검색 결과가 없습니다.");
		}
		// 향상된 for문

	}

	/**
	 * 나이에 따라 오름차순 정렬
	 */
	public void sortByAge() {
		// student에 comparable 인터페이스를 상속받아
		// 오버라이딩한 compareTo()에 정의한대로 정렬됨 (오름차순 , 내림차순)
		Collections.sort(studentList);

		// 정렬된 결과출력
		for (Student std : studentList) {
			System.out.println(std);
		}
	}

	
	/**
	 * 이름에 따라 정렬하는 comparator 객체 생성 
	 */
	private void sortByName() {
		
		//                                            static
		
		Comparator<Student> nameComparator=Comparator.comparing(Student::getName);//오름차순
		//Comparator<Student> nameComparator=Comparator.comparing(Student::getName).reversed(); //내림차순
			//맨뒤에 reversed 붙히면 내림차순 
		//comparing()는 기본적으로 오름차순 
		//내림차순 원하면 reversed(); 사용 
		
		//Comparator 인터페이스의 static 메서드인 comparing()을 사용하여 
		//comparing()을 사용하여 comparator 객체를 생성 
		//->comparing()는 주어진 키를 기반으로 객체를 비교함 
		//Student  :: getName ->메서드 레퍼런스(method Reference) 
		//student 클래스의 getName()을 가리키는 것.
		//이 메서드를 비교의 키로 사용하여 각 student 객체를 비교하고 정렬함 
		//-->comparator.comparing(Student :: getName)은 student 객체의 이름(name)을
		//기준으로 학생객체를 비교하는 comparator 객체를 생성 . 
		
		//이름에 따라 정렬 
		Collections.sort(studentList,nameComparator);
		
		for(Student std :studentList) {
			System.out.println(std);
		}
		
		
		
	}

}
