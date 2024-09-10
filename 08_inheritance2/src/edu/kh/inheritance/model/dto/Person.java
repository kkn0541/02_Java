package edu.kh.inheritance.model.dto;



//Dto(data transfer object) : 비즈니스 계층과 데이터 교환을 위해 사용하는 객체 
//                          (service ,db)
public class Person /*extends Objects*/{
	//object 클래스 
	// -모든 클래스의 최상위 부모 
	// - class 선언부에 상속 구문이 하나도 작성되어있지 않다면 
	// 컴파일러가 extends object 구문을 추가해준다. 
	
	
	// 속성(필드)
	private String name; //이름
	private int age; //나이
	private String nationality; //국적
	
	private int x;
	
//	{
//		//초기화 블록
//		// 객체가 생성될대 변수들을 초기화하기 위해 사용 
//		
//	x=5;	
//		
//	}
	
	
	
	public String getName() {
		return name;
	}
	
	//생성자
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	//매개변수 생성자
	public Person(String name, int age, String nationality) {
		super();//부모의 생성자 == object 클래스의 기본생성자 
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}
	
	
	
	// 기능(메서드)
	//getter/setter 
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public void breacth() {
		System.out.println("사람은 코나 입으로 숨을 쉰다.");
	}
	
	public void move() {
		System.out.println("사람은 움직일수있다. ");
	}
	

	@Override
	public String toString() {
		//object의 tostring()재정의 
		//재정의 안하면 주소만 나옴 
		return name+"/"+age+"/"+ nationality; //object가 가진 tostring
	}
	
	
	
	
	
	
}
