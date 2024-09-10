package edu.kh.inheritance.model.dto;
/*
 * 
 * object
 *    ㄴ Person 
 *           ㄴ student
 * 
 * 
 * 
 * 
 * 
 * */

//  상속방법  자식            부모
public class Student extends Person {
	// student 클래스에 pserson 클래스 내용을 연장한다.
	// == student 클래스에 pserson 클래스의 필드 , 메서드를 추가하여 확장한다.

	// 속성(필드)
	/*
	 * private String name; private int age; private String nationality;
	 */

	private int grade;
	private int classRoom;

	public Student() {
		// TODO Auto-generated constructor stub

	}
 //스튜던트 고유 필드만 
	public Student(String name, int age, String nationality, int grade, int classRoom) {
	//왜 안될까
		// -> this 참조변수는 본인 자신만을 의미함 
		// -> 상속을 받았어도 name age nationality는 부모의 고유필드이기 때문에 
		// 자식인 student에서 this 참조변수를 이용해 직접 접근 불가 
		
		
		
		
		
	//person(부모) 상속받은 메서드 setter 
	/*setName(name);
	setAge(age);
	setNationality(nationality);
	*/
		
		
		
	
		//생성자는 상속 안되니까 super()사용할것 
	//부모의 setter을 이용할수는 있지만 비효율적 
	
		//super(); : //상속받은 부모 pserson의 기본생성자
		super(name,age,nationality); // 부모 person의 매개변수 생성자 의미  
		 
		this.grade = grade;
		this.classRoom = classRoom;
	}

	/*
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public int getAge() { return age; } public void
	 * setAge(int age) { this.age = age; } public String getNationality() { return
	 * nationality; } public void setNationality(String nationality) {
	 * this.nationality = nationality; }
	 * 
	 */

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	// 기능(메서드)

}
