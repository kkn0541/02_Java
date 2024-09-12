package edu.kh.execption.model.service;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {

	// 예외 (exception ) : 소스코드의수정으로 해결 가능한 오류

	// 예외 두종류로 구분됨

	// 1) unchecked exception : 선택적으로 예외 처리 (ex. Runtime eXEPTION..)
	// 2) chekced EXCEPTION 필수적으로 예외 처리 (ex.ioexeption,나머지 ... )

	private Scanner sc = new Scanner(System.in);

	public void ex1() {

		System.out.println("두 정수를 입력받아 나누기한 몫을 출력");

		System.out.println("정수 1 입력");
		int input1 = sc.nextInt();

		System.out.println("정수 2 입력");
		int input2 = sc.nextInt();

		try {
			// 예외가 발생할 것 같은 코드
			System.out.println("결과 : " + input1 / input2);
			// java.lang.ArithmeticException: / by zero
			// 산술적 예외( 0으로 나눌수 없다.)
		} catch (ArithmeticException e) {
			// try에서 던져진 예외를 catch 문의 매개변수 e로 잡음.
			System.out.println("infinity"); // 처리 코드

		}

		if (input2 != 0) {
			System.out.println("결과" + input1 / input2);

		} else {
			System.out.println("inifinity");
		}
		// 발생하는 예외중 일부예외 try catch사용 안해도
		// if -else예외 상황방지가능
		// 일부 예외 == 대부분 uncheck execption

	}

	public void ex2() {
		// 여러가지 예외에 대한 처리 방법
		System.out.println("두 정수를 입력받아 나누기한 몫을 출력");

		try {
			System.out.println("정수 1 입력"); // inputmissmatchException
			int input1 = sc.nextInt(); // int형이 아닌 다른형 넣었을때

			System.out.println("정수 2 입력");// inputmissmatchException
			int input2 = sc.nextInt(); // int형이 아닌 다른형 넣었을때

			System.out.println("결과" + input1 / input2); //// java.lang.ArithmeticException:
			// input2에 0이 들어왔을떄
			String str = null;

			System.out.println(str.charAt(0));// java.lang.NullPointerException:

			// InputMismatchException ArithmeticException 둘다 runtimeEXEPTION의 후손
			// RUNTIME EXCEPTION 은 EXCEPTION후손

			// EXCEPTION
			// ㄴ RUNTIMEeXCEPTION
			// ㄴ INPUTmISMATCHEXCEPTION , ARITHEMETIEC EXECPTION
			// 맨위에 EXCEPTION 을 하면 밑에껀 처리 못함

		} catch (InputMismatchException e) {
			System.out.println("타입에 맞는 값만 입력하세요 ");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");

		} catch (Exception e) {
			// exception 클래스 : 모든 예외의 최상위 부모
			// 다형성 - 업캐스팅 : 부모타입 참조변수로 자식객체 참조

			// ** 상위 타입의 예외 클래스를 catch문에 작성하면
			// 다형성 업캐스팅에 의해 모두 잡아서 처리 가능
			System.out.println("뭔지 모르겠지만 예외가 발생해서 처리함 ");
			e.printStackTrace();
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용을 출력
			// 예외 발생 지점 추적 메서드

		}

		//

	}

	public void ex3() {
		
		//try-catch- finally 
		// finally : try 구문에서 예외가 발생 하던말던 무조건 마지막에 수행 
		try {
			System.out.println("정수 1 입력"); // inputmissmatchException
			int input1 = sc.nextInt(); // int형이 아닌 다른형 넣었을때

			System.out.println("정수 2 입력");// inputmissmatchException
			int input2 = sc.nextInt(); // int형이 아닌 다른형 넣었을때

			System.out.println("결과" + input1 / input2); //// java.lang.ArithmeticException:
			// input2에 0이 들어왔을떄

		
		} catch (ArithmeticException e) {
			System.out.println("예외 처리 됨");
			
			// catch문 매개변수 활용 
			// 매개변수 e : 예외관련된 정보 + 예외 관련 기능 
			
			System.out.println(e.getClass()); //어떤 예외 클래스인가?
			//getclass object에서준거 
			// e라는 것은  java.lang.ArithmeticException 이다 
			
			System.out.println(e.getMessage());//예외 발생시 출력된 내용 
		//	/ by zero
			
			System.out.println(e); // e.tostring()
			//java.lang.ArithmeticException: / by zero
	
			e.printStackTrace();
			
		}catch(InputMismatchException e) {
			System.out.println("숫자만 넣어라");
		
		}finally {
			System.out.println("무조건 수행됨 ");
			sc.close(); //스캐너 통로 닫기 : 메모리 누수 방지 
			
			
		}
	}
	public void ex4()  {
		//throw / throws 
		try {
			methodA(); //Exception 발생할 가능성이 있는 코드를 안에 기술
		} catch (IOException e) {
		 //exception : 모든 예외의 최상위부모 
			// == 예외 종류 모두 상관없이 모두 처리 
			System.out.println("methodC에서부터 발생한 예외를 ex4 에서 잡아 처리함");
		}
		
	}
	public void methodA() throws IOException{
	//// methodb를 호출한 methoda 에게 던짐
		methodB();
		
	}
	
	public void methodB() throws IOException {
	//// methodc를 호출한 methodb 에게 던짐
		methodC();
	}
	public void methodC() throws IOException {
					    //throws : 호출한 메서드에게 예외를 던짐 
						// -> 호출한 메서드에게 예외를 처리하라고 위임하는 행위 
						// methodc를 호출한 methodb 에게 던짐
		//throw : 예외 강제발생 구문  
		throw new IOException();
	}

public void ex5() throws UserException {
	//사용자 정의 예외 
	throw new UserException("사용자 정의 예외 발생");
	//checked Exception 
}


}
