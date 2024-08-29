package edu.kh.variable.ex2;

public class PrintExample {
	
	public static void main(String[] args) {
		
//	System.out.print();  단순 출력용 매서드(출력 후 줄바꿈 x)		
//	System.out.println(); 한줄 출력용 메서드(출력 후 줄바꿈 수행 )	
//  줄바꿈 여부 차이점은 있지만 괄호안의 내용이 그대로 출력된다는 것은 똑같음 

		
	System.out.println("테스트1");	
	System.out.println("테스트2");
	
	System.out.print("테스트3");
	System.out.println(); // 내용 없는 println() : 단순 줄바꿈 
	System.out.print("테스트4");
	
	
	//system.out.prinf(): 출력될 문자열 형식을 패턴으로 지정하는 출력구문 
	
	System.out.println(); // 줄바꿈
	
	int iNum1=10;
	int iNum2=5;
	
	// 10 + 5=15
	System.out.println(iNum1+"+"+iNum2+"="+(iNum1+ iNum2)); // 어려움 
	
	//System.out.printf("패턴",패턴에 들어갈값);

	/*prinf 사용하는 패턴 
	 * 
	 * 
	 * 
	 * %d : 정수형, %o : 8진수, %x : 16진수
	%c : 문자,
	%s : 문자열
	%f : 실수(소수점 아래 6자리), %e : 지수형태표현, %g : 대입 값 그대로
	%A : 16진수 실수
	%b : 논리형
	 * 
	 * 
	 * 
	 * 
	 * */

	
	//10 + 5=15       정수 +정수 =정수 
	System.out.printf("%d+%d=%d\n",iNum1,iNum2,iNum1+iNum2);
	//                             자리에 맞게 넣어줌 
	// \n --> 줄바꿈
	
	//10 +10 * 5 /2 =35
	
	
	
	System.out.printf("%d +%d * %d /2= %d\n", iNum1, iNum1,iNum2,iNum1+iNum1*iNum2/2);
	
	//패턴 연습 
	int iNum3 =3;
	System.out.printf("%d\n",iNum3); // 3
	System.out.printf("%5d\n",iNum3);// 5번째 칸에 3이 출력 , 오른쪽 출력 ( 5칸 공간 확보 후 오른쪽 정렬 )  
	System.out.printf("%-5d\n",iNum3);// 5번째 칸에 3이 출력 , 왼쪽 출력 ( 5칸 공간 확보 후 왼쪽 정렬 )  
	
	//소수점 자리 제어( 반올림 처리 )	
	System.out.printf("%f\n",10/4.0);//2.500000
	//소수점 둘째자리까지만 나타내고 싶다 
	System.out.printf("%.2f\n",10/4.0);// 소수점 둘쨰자리 까지만 나타내고 싶다 
	System.out.printf("%.0f\n",10/4.0); // 소수점 아래를 표현하지 않겠다. (반올림처리해서 출력됨)
	
	//문자 , 문자열 , boolean
	boolean isTrue = false; 
	char ch='가';
	String str= "안녕하세요~"; //참조형
	
	//false / 가 / 안녕하세요 ~!
	System.out.printf("%b/%c/%s\n",isTrue,ch,str);
	
	//escapse (탈출) 문자 : 일반 문자가 아닌 특수문자 표현 
	
	// \
	System.out.println("\\");
	
	// \o/
	System.out.println("\\o/");
	//tab 한공간씩 표현 x , 한번에 공간차지 
	System.out.println("a\tb\tc\td");
	
	// 유티코드 이스케이프
	System.out.println("\u0041"); //A
	//유니코드(16진수)
	//65를 16진수로 표현 
	//65 나누기 16하면 몫4 나머지 1
	
	
	
		
	}

}
