package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService { 
	
	// 속성(필드)
	private Scanner sc= new Scanner(System.in);
	
	private Member memberInfo=null; // 가입한 회원의 정보를 저장할 변수
	private Member loginMember=null; // 로그인한 회원의 정보를 저장할 변수 
	
	//메뉴화면 출력 
	public void displayMenu() {
		
		int menuNum = 0; //메뉴 선택용 변수 
		
		//무조건 한번은 수행 
		do {
			System.out.println("-==============회원정보관리 프로그램==========");
			System.out.println("1회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원정보 조회");
			System.out.println("4.회원정보 수정");
			System.out.println("0 프로그램 종료 ");
			
			System.out.println("메 뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); //입력 버퍼에 남은 개행문자 제거용 
			
			switch(menuNum) {
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login()); break;
			case 3 : /*조회*/ break;
			case 4 : /*수정*/ break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("잘못입력하셨음 메뉴에 있는 번호만 입력해주세요");
			}
			
		}while(menuNum !=0); //menuNum이 0이면 반복 종료 
		
		
		
		
	}
	//기능(생성자 , 메서드)
	//회원가입 기능 메서드
	public String signUp() {
		System.out.println("\n*******회원가입 ***********");
		
		//입력값 저장 
		System.out.print("아이디");
		String memberId =sc.next();
		
		System.out.print("비밀번호 : ");
		String memberPw=sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memberPw2=sc.next();
		
		System.out.print("이름 : ");
		String memberName = sc.next();
		
		System.out.print("나이 "  );
		int memberAge = sc.nextInt();
		
		//비밀번호 , 비밀번호 확인이 일치하면 회원가입 
		//일치하지 않으면 회원가입 실패 
		//참조형 비교 equals
		if(memberPw.equals(memberPw2)) { //일치하는 경우
			
			memberInfo=new Member(memberId,memberPw,memberName,memberAge);
			
			//메서드 반환형을 void 에서 string으로 변경
			return"회원가입 성공!";
		}else { //일치하지 않는 경우
			return "회원가입 실패! (비밀번호 불일치)";
		}
		
		
		
	}
	//로그인 기능 
	
	public String login() {
		
		System.out.println("\n******로그인");
		
		// 회원가입을 했는지부터 확인 
		// == memberInfo가 객체를 참조하고 있는지 확인 (null인지 아닌지 확인)
		
		if(memberInfo==null) { // 회원가입을 안한 경우 ,안했으니 안쪽이다 null이지
			//null : 아무것도 참조하고 있지 않음 
			return "회원가입부터 진행해주세요";
			
		}
		
		//회원가입을 했다면 로그인 기능 수행 
		System.out.println("아이디");
		String memberId= sc.next();
		
		System.out.println("비밀번호");
		String memberPw=sc.next();
		
		//회원가입 정보(memberInfo가 참조하는 Member객체) 
		//저장된 아이디, 비밀번호가 
		// 입력한 아이디, 비밀번호와 같으면 "로그인 성공"
		//같지 않으면 "아이디 또는 비밀번호 불일치" 리턴

		//아이디 , 비밀번호가 모두 일치할 경우
		if(memberId.equals(memberInfo.getMemberId()) &&
			memberPw.equals(memberInfo.getMemberPW())) {
			//로그인하려고 입력받은 memberI와 
			//memberInfo 필드에서 참조중인 Member객체의 memberId가 같은지 확인
			// &&
			//로그인하려고 입력받은 memberPw와 
			//memberInfo 필드에서 참조중인 member객체의 MemberPw가 같은지 확인 
	
			//loginMember에 memberInfo가 참조하고 있는 개체의 주소 대입 
		loginMember=memberInfo;
		//얕은 복사
		
		// 회원가입 정보를 loginMember에 대입하여 
		// 어떤 회원이 로그인했는지를 구분할수있게함
		return loginMember.getMemberName()+"님 환ㅇ여합니다.";
		}else {
			
			return"아이디 또는 비밀번호가 일치하지 않습니다.";
		}
		
		
	}
	
	
	
	//회원정보 조회 기능
	//조회하려면
	// 로그인을 했나 안했나 따져보기
	// 1. 로그인 했으면? 로그인한 사람의 정보를 저장하고 있는 객체에서
	// 정보꺼내오기 (이름, 아이디 , 나이)
	// 2. 로그인 안했으면 ? 로그인 후 이용해라 
	//회원정보 수정 기능 
	
	
	
	
	
	
}
