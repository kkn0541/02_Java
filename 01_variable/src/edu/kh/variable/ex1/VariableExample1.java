package edu.kh.variable.ex1;


public class VariableExample1 {
	//생성된 .java파일과 class오른쪽에 작성된 이름은 같아야한다. 
	public static void main(String[] args) {
		System.out.println(2*3.141592653589793 *5);
		System.out.println(3.141592653589793 *5*5);
		System.out.println(3.141592653589793 *5);
		System.out.println(3.141592653589793 *5*5*20);
		System.out.println(4*3.141592653589793 *5*5);
		
		/*변수(variable)
		 * -메모리(ram)에 값을 기록하는 공간 
		 * ->공간에 기록되는 값 (DATA)이 변할수 있어서 변수라고 한다. 
		 * -변수는 여러종류가 존재 (저장되는 값의 형태, 크기가 다름)
		 * 
		 * 변수 사용의 장점 
		 * 1.가독성 증가 
		 * 2.재사용성 증가 (한번 만든 변수를 계속 사용)
		 * 3.코드 길이 감소 
		 * 4.유지보수성 증가(코드 수정이 간단해짐 )
		 * 
		 * */
		System.out.println("----------------------------------------");
		//변수 사용 
		double pi=3.141592653589793;
		int r=5; // 반지름(radius)
		int h=20; // 높이(height)
		
		System.out.println(2*pi); //원의 둘레
		System.out.println(2*pi*r); // 원의 넓이
		System.out.println(pi*r*r*h); //원기둥의 부피 
		System.out.println(4*pi*r*r); //구의 겉넓이 
		
		
		
	}
}
