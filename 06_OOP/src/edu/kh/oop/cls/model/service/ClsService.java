package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

//clsService 와 student 는 패키지가 다름 

//상속 -> 부모로 student 클래스를 상속받음
//student(부모) => clsServie(자식)

//객체 생성해서 만든 std를 통해 접근하는 것과 
// 상속해서 student에서 접근하는 것은 완전히 다름 
public class ClsService /* extends Student */ {

	public void ex1() {
		// 클래스 접근제한자 확인하기

		Student std = new Student();
		// public class인 student는 import 가능(어디서든 접근가능)

		// TestVO test= new TestVO();
		// TestVO cannot be resolved to a type
		// (default) class인 TestVO는 import 불가능(다른패키지라 불가);

		System.out.println(std.v1);
		// 전체에서 직접 접근 가능한 public인 v1만 에러발생 x

		// System.out.println(std.v2);
		// System.out.println(std.v3);
		// System.out.println(std.v4);

		// 상속 관계에서 직접 접근 가능범위 테스트
		// System.out.println(v1);// public - 프로그램 전체에서 접근가능
		// System.out.println(v2);
		// student 클래스를 상속 받았으므로 student의 protected변수인
		// v2는 직접 접근 가능
		// System.out.println(v3); //(default) 다른패키지 x
		// System.out.println(v4); // 해당클래슥 ㅏ아닌 다른클래스 x
	}

	public void ex2() {
		// static 필드 확인 예제
		// 학생 객체 2개 생성
		Student std1 = new Student(); // 기본생성자 호출
		Student std2 = new Student();// 기본생성자 호출

		// 학생 객체에 name 셋팅
		std1.setName("길동");
		std2.setName("영희");

		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		// schoolName에 노란줄 뜨는 이유 (경고)=> 제대로 작성을 안해서
		// *** static이 붙은 필드(변수)는 '클래스명.변수명' 으로 사용함
		System.out.println(Student.schoolName);
		// 맞는 규칙 '클래스명.변수명'

		Student.schoolName = "kh정보교육원";

		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		System.out.println(Student.schoolName);

		// std1.setSchoolName("고고고");
		// System.out.println(std1.getSchoolName());

		/*
		 * static
		 * 
		 * 공유 메모리 영역 (또는 정적 메모리 영역)이라고 함
		 * 
		 * ->프로그램 시작 시 static 이 붙은 코드들이 모두 static 영역에 생성 프로그램이 종료될떄까지 사라지지 않음 (정적) 그리고
		 * static 영역에 생성된 변수는 어디서든지 공유가능(공유메모리)
		 * 
		 * 
		 */
	}

	public void ex3() {
		// 생성자 확인 테스트
		// user 기본생성자를 이용해서 객체생성
		User u1 = new User();
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());

		User u2 = new User();
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());

		// 문제점 : u1이 참조하고 있는 참조하고 있는 user 객체와
		// u2가 참조하고 있는 user 객체의 필드값이 모두 동일함
		// 왜? 같은 기본 생성자로 user객체를 생성했기 때문에

		System.out.println("---------------------------------------");
		// 해결 방법 1 : setter 를 이용해서 새로운 값 대입
		u2.setUserId("asd1234");
		u2.setUserPw("qwer");
		u2.setUserName("영희");
		u2.setUserGender('여');

		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());

		// 해결방법2 : 매개변수 생성자를 이용해서
		// 객체가 생성될떄부터 다른값으로 필드를 초기화
		User u3 = new User("test3", "password33");
		// test3 , password33 가지고 매개변수로 이동

		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
	}

	public void ex4() {
		//매개변수 생성자 예제
		User u1 = new User();//기본생성자
		User u2= new User("user02","pass02");// 매개변수 2개 생성자
		User u3= new User("user03","pass03","김길동",30,'남'); 
		// 매개변수 5개 생성자 (전부 초기화)
		
		System.out.printf("u1: %s / %s /%s /%d /%c \n",
				u1.getUserId(),u1.getUserPw(),u1.getUserName(),u1.getUserAge(),
				u1.getUserGender());
		//기본생성자 - 처음에 해놓은값 그대로
		
		System.out.printf("u2: %s / %s /%s /%d /%c \n",
				u2.getUserId(),u2.getUserPw(),u2.getUserName(),u2.getUserAge(),
				u2.getUserGender());
		//id pw 만 대입 나머지는 데이터형의  기본값 
		System.out.printf("u3: %s / %s /%s /%d /%c \n",
				u3.getUserId(),u3.getUserPw(),u3.getUserName(),u3.getUserAge(),
				u3.getUserGender());
		
		
	}
}
