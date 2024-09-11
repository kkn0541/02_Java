package edu.kh.poly.ex1.model.service;

import edu.kh.poly.ex1.mode.dto.Car;
import edu.kh.poly.ex1.mode.dto.Spark;
import edu.kh.poly.ex1.mode.dto.Tesla;

public class PolySerivce {

	public void ex1() {
		// 다형성 확인 예제

		// car 객체 생성
		Car car = new Car();
		// 부모타입 참조변수 = 부모객체

		// test객체 생성
		Tesla tesla = new Tesla();
//자식 타입 참조변수 = 자식객체		

		// ---------------다형성-------------

		// 부모타입 참조변수 = 자식객체
		Car car2 = new Tesla(); // 오류 발생 안함
		// Tesla 객체를 참조하는 변수의 타입이 car(부모)이기 때문에
		// Testla 객체가 car (부모) 객체로 변화함 (중요)
		// ->업캐스팅

		Car car3 = new Spark();
		// spark객체를 참조하는 변수 car3 타입이 car(부모)
		// sprack 객체가 car(부모)객체로 변화함 (중요)
		// -> 업캐스팅

		// ***다형성(업캐스팅) 작성방법 *****

		// 1) 자식객체가 부모 객체로 변하였기 때문에
		// 자식만의 고유한 필드 , 메서드를 사용할수 없다.

		// 1-1 ) car (부모 = 부모)
		car.setEngine("v6 6기통 엔 진");
		car.setFuel("휘발유");
		car.setWheel(4);
		// Car메서드 모두 사용 가능

		// 1-2 tesla (자식 = 자식 )
		tesla.setEngine("전기모터");
		tesla.setFuel("전기");
		tesla.setWheel(4);
		tesla.setBatteryCapcity(1000000);
		// tesla 부모 , 본인 메서드 모두 사용 가능

		// 1-3 ) car2(부모 = 자식(tesla))
		// Car car2 = new Tesla(); 업캐스팅 car타입이됨
		car2.setEngine("전기모터");
		car2.setFuel("전기");
		car2.setWheel(4);
		// car2.setBattreyCapcity(1000000); tesla 본인의 필드 , 메서드 사용 못함
		// 부모타입 참조변수이기 떄문에 tesla의 고유필드 , 메서드 사용 불가능

		// car3 (부모 = 자식(spark))
		car3.setEngine("경차엔진");
		car3.setFuel("휘발유");
		car3.setWheel(4);
		// car3.setdiscountOffer(0.5);
		//// 부모타입 참조변수이기 떄문에 spark의 고유필드 , 메서드 사용 불가능

		// ----------------------------------------------
		// 2)다형성을 이용한 객체배열
		// 객체배열 : 같은 객체 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		// 다형성을 이용한 객체배열:
		// 부모타입 참조 자료형의 변수를 하나의 묶음으로 다루는 것

		Car[] arr = new Car[3]; // 부모타입 참조변수 배열 선언 및 할당
		// 각 배열 요소 Car 타입 참조변수

		arr[0] = car; // car객체의 주소가 들어감
		arr[1] = car2; // testla 주소
		arr[2] = car3; // sprak 주소

		for (int i = 0; i < arr.length; i++) {

			System.out.println(i + "번째 인덱스의 엔진" + arr[i].getEngine());
			// get으로도 부모님꺼만 가능
		}

		// 상속 + 다형성
		// 상속 특징 : car 상속 클래스는 모두 getEngine()을 가지고 있다.
		// 다형성(업캐스팅): 부모타입 참조변수 arr[i]로 자식개체를 참조할수 있다.

	}

	// 전달 받은 Car 또는 자식객체(tesla, spark)의 엔진 , 연료 , 바퀴개수를 출력메서드)
	public void printCar(Car temp) {
		// 부모타입 참조변수 = 자식타입 객체
		// Car temp =c --> car temp =
		// Car temp =t --> car temp = new tesla(전달인자)
		// Car temp =s --> car temp = new spark()
		// 업케스팅
		// 다형성의 업캐스팅 모양과 똑같다.
		// -> temp라는 매개변수에는 telsa , spark , car 의 주소가 넘어와도 된다.(업캐스팅)

		System.out.println("엔진  :" + temp.getEngine());
		System.out.println("연료  :" + temp.getFuel());
		System.out.println("바퀴갯수  :" + temp.getWheel() + "개");
		System.out.println(); // 줄바꿈용도

	}

	// 매개변수로 전달받은 정수값에 따라 car, tesla,spark 객체를 만들어
	// 반환하는 메서드
	public Car createCar(int num) {
	//반환형을 car로 
		
		Car result = null;
	
		
		switch (num) {
		case 1:
			result = new Car();
			break;
		case 2:
			result = new Tesla();
			break;
		case 3:
			result = new Spark();
			break;

		}

		return result;

	}

	public void ex2() {
		// 다형성(업캐스팅)을 이용한 매개변수 사용법

		Tesla t = new Tesla("전기모터", "전기", 4, 100000);
		Spark s = new Spark("경차엔진", "휘발유", 4, 0.5);
		Car c = new Car("경유엔진", "경유", 12);

		printCar(t); // test
		printCar(s); // spark
		printCar(c); // car

		System.out.println("-------------------------------------------------");

		// 다형성을 이용한 반환형 사용법
		// Car[] arr = {new Car(), new Tesla(), new Spark()};

		Car[] arr = { createCar(1), createCar(2), createCar(3) };
				//Car,       Car(Tesla)로 업캐스팅된 , car(spark)로 업캐스팅된
		
		
		//객체가 어떤 타입 자료형인지 검사 
		//instanceof연산자 :객체의 자료형을 검사하는 연산자 
		// -> 참조하는 객체가 특정 자료형이거나 상속관계인지 확인 
		// arr[1] -> car 타입 testla 객체
		System.out.println(arr[1] instanceof Tesla); //true(자기 본인 맞음) 
		System.out.println(arr[1] instanceof Spark); //false (Spark와 테슬라 관계없음 
		System.out.println(arr[1] instanceof Car); //true(부모이기떄문에)  
		
		
	}
 public void ex3() {
	 // **************다형성 중 다운캐스팅 **************
	 //다운캐스팅이란?
	 //부모타입 참조변수가 자식 객체를 참조하는 기술 (업캐스팅)
	 // 업캐스팅이 적용된 상태에서만 진행할수있다. 
	 // 부모타임을 자식타입으로 "강제 형변환"해서 
	 // 자식개체의 본래 필드 , 메서드를 사용가능하게 한다. 
	 
	 Car c1 = new Tesla("전기모터","전기",4,50000);
	 
	// 1) 자식객체가 부모 객체로 변하였기 때문에
	// 자식만의 고유한 필드 , 메서드를 사용할수 없다.
	 //값세팅은 다됨 
	 
	 
	 
	 //업캐스팅 상태(Tesla 자식 -> Car부모 ) 
	 System.out.println(c1);
	 System.out.println((Tesla)c1);
	 System.out.println(((Tesla)c1).getBatteryCapcity());
	 //주의 ! 
	 //"." 연산자가 (Tesla) 형변환 연산자보다 우선순위 높음 
	 //그래서 형변환하는 부분을 ()로 묶어주고 나서 . 연산을 진행해야 
	 //Tesla 객체의 getBatterryCapcity()를 사용할수 있음.
	 
	 Tesla t1=(Tesla)c1;
	System.out.println(t1.getBatteryCapcity()); 
 }
 public void ex4() {
	 // 다운캐스팅 주의사항! 
	 Car c1 = new Tesla();
	 //tesla객체를 만들어 car타입(부모타입)참조변수 c1에 담음 
	 
	// Spark s1 = (Spark)c1; // c1 을 관계 없는 sprak로 다운캐스팅하려함 
	 						// java.lang.ClassCastException 클래스 형변환 에러 
	 //다운캐스팅 잘못해도 컴파일 에러 발생 안함 
	 //->실행 시 발생 (런타임 에러) 
	 //ClassCastException : 형변환 예외 
	 //런타임 에러 : 프로그램 실행 시 발생하는 에러(예외)
	 //컴파일 에러 : 실행 전 코드에 빨간줄 에러 
	 
	 //해결방법 instanceof와 같이 사용해야한다. 
	 
	 //예외처리방법
	 if(c1 instanceof Spark) { //c1이 spark이거나 상속관계인가?? 
		 //맞다면 
		 Spark s1 = (Spark)c1;
		 System.out.println("성공");
	 }else {
		 //아니라면 
		 System.out.println("실패.spark타입 아님");
	 }
 }
 public void ex5() {
	 //바인딩 (binding)
	 //실제 실행할 메서드 코드와 호출하는 코드를 연결시키는 것 
	 
	 Car c1=  new Car("경유엔진", "경유", 8 );
	 
	 System.out.println(c1.toString());
	 // edu.kh.poly.ex1.mode.dto.Car.tostring()
	 // car 객체에 있는 tostring()메소드를 호출 ==바인딩 
	 // 프로그램 '실행 전' 
	 // - 컴파일러는tostring()메서드가 car에 있는 걸로 인식해서 
	 // c1.tostring() 호출코드와 
	 //edu.kh.poly.ex1.mode.dto.Car.tostring() 메소드 코드를 연결 
	 // -> 정적 바인딩 
	 
	 // ** 다형성 적용 시 바인딩 ** 
	 Car c2 = new Spark("경차엔진","휘발유",4,0.5);
	 //업캐스팅 적용 -> 부모 부분만 참조가능 
 
	 System.out.println(c2.toString());
	 //edu.kh.poly.ex1.mode.dto.Car.tostring()
	 //참조변수 c2가 car타입이므로 
	 // tostring() 도 car의 tostring () 호출 - 정적바인딩 
	 // 하지만 실행해보면 자식(sprak)의 tostring () 이 호출되는 것을 확인 
	 // 경차엔진 / 휘발유 / 4 / 0.5
	 // -> 컴파일 시에는 부모(car)와 바인딩 == 정적 바인딩 
	 // -> "실행 시 " 에는 자식(spark)의 오버라이딩 된 메서드와 바인딩 
	 // == 동적 바인딩 
	 
 }
 
}
