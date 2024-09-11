package edu.kh.poly.ex2.model.service;

import edu.kh.poly.ex2.model.dto.Animal;
import edu.kh.poly.ex2.model.dto.Fish;
import edu.kh.poly.ex2.model.dto.Person;

public class AbstractService {

	public void ex1() {
		
		// animal 객체 만들어보기 
		// Animal a1= new Animal();	
		//Cannot instantiate the type Animal (객체화 할수 없음
		
		//-> anumal을 상속받아 미완성 부분을 구현한 
		// 클래스를 이용해 객체 생성 
		
		//추상클래스를 상속받은 자식 객체 생성 
		Person p1 = new Person();
		//자기꺼
		p1.setName("홍길동");

		//상속받은 기능
		p1.setType("척추 동물 중 인간");
		p1.setEatType("잡식");
		
	
		
		p1.eat();
		p1.breath();
		p1.move();
		
		Fish f1 = new Fish();
		f1.setType("척추동물 중 어류");
		f1.setEatType("잡식");
		
		f1.eat();
		f1.breath();
		f1.move();
	}
	
	public void ex2() {
		// 추상 클래스와 다형성+ 바인딩 
		
		//추상클래스는 객체로 만들수 없다
		// 하지만 "참조변수"로는 사용할수 있다. 
		
		//본인객체는 안됨
        //Animal a1 = new Animal(); 안됨
		Animal a1 = new Person(); //다형성 중 업캐스팅
		Animal a2 = new Fish(); // 다형성 중 업캐스팅 
		
		Animal[] arr = new Animal[2];
		//animal 참조변수 배열 선언 및 할당 
		
		arr[0] = new Person("사람", "잡식","김사람");
		
         //Animal 타입 참조변수  = person 자식(다형성 중 업캐스팅)
		
		arr[1]= new Fish("물고기","잡식");
		//animal 부모 = fish 자식(다형성 중 업캐스팅)
		
		
		//바인딩 확인 
		for (int i = 0; i < arr.length; i++) {
			arr[i].eat();
			// edu.kh.poly.ex2.model.dto.Animal.eat () 정적바인딩
			arr[i].breath();
			System.out.println(arr[i].toString()); 
			
		}
		//프로그램 실행 시 
		// 참조하고 있는 자식 객체의 오버라이딩 된 eat(),breat(),tostring()
		// 메서드 수행 
		// -> 동적 바인딩 : 부모타입 참조변수로 메서드를 호출했지만
		// 실행해보면 자식타입의 오버라이딩된 메소드가 수행된다. 
		
	}
	
}
