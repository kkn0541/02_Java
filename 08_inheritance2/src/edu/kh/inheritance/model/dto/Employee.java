package edu.kh.inheritance.model.dto;

//final 클래스 ->
//제공되는 클래스 그대로 사용해야하는 경우 
//부모가 될수없음 
/*
 *  object
 *       ㄴ person
 *              ㄴ Employee
 */

public  /*final*/ class Employee extends Person {
	// 필드
	private String company;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	// 자동완성
	// alt shift s -> o
	// select super construction to invoke 에서
	// 매개변수있는 부모 생성자 선택

	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality);
		this.company = company;
	}

	// 메서드
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	// Person으로부터 상속받은 메서드 중
// move() 메서드를 emplyee에 맞게 재정의(==오버라이딩)

	// @override 어노테이션 : 해당 메서드가 오버라이딩 되었음을
	// 컴파일러에게 알려주는 역할 ->컴파일러에게 문법체크등 하도록 알린다.

	// 어노테이션 (Annotation): 컴파일러 인식용 주석
	@Override
	public void move() {
		System.out.println("오버라이딩된 move()");
		System.out.println("효율적으로 빨리 일하고 퇴근한다. ");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "/" + company; // person의 tostring() +company
	}
	/*
	 * final 메서드 -> 오버라이딩 불가 
	 * 
	 * -메서드의 기능이 변하면 안되는 경우 
	 * 
	 */
	public final void onlyEmployee() {
		System.out.println("final 메서드입니다.");
	}
}
