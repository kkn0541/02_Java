package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun { //실행용 클래스

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService service = new MemberService(); //기본생성자 매개변수 없음 
		// Memberservice의 기본생성자가 작성되어 잇지 않지만
		//컴파일러가 코드를 번역할때 
		// 클래스내부에 생성자가 하나도 없다면 
		// 자동으로 기본생성자를 추가해주기 때문에 
		//문제 없이 사용 가능
		//**주의사항 ** 
		//만약에 생성자가 하나라도 있으면 자동생성 안해준다. 
		//
		service.displayMenu();
		
	}

}
