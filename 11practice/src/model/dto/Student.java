package model.dto;

public class Student implements Comparable<Student>{

	private String name;
	private int age;
	private String region;
	private char gender;
	private int score;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	
	public String getName() {
		return name;
	}






	public void setName(String name) {
		this.name = name;
	}






	public int getAge() {
		return age;
	}






	public void setAge(int age) {
		this.age = age;
	}






	public String getRegion() {
		return region;
	}






	public void setRegion(String region) {
		this.region = region;
	}






	public char getGender() {
		return gender;
	}






	public void setGender(char gender) {
		this.gender = gender;
	}






	public int getScore() {
		return score;
	}






	public void setScore(int score) {
		this.score = score;
	}






	public Student(String name, int age, String region, char gender, int score) {
		super();
		this.name = name;
		this.age = age;
		this.region = region;
		this.gender = gender;
		this.score = score;
	}






	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", region=" + region + ", gender=" + gender + ", score="
				+ score + "]";
	}



	@Override
	public int compareTo(Student other) {
		// TODO Auto-generated method stub
		return this.age - other.age;
	}
	
	
	
	
}
