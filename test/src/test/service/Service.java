package test.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import test.vo.Member;

public class Service {

	private List<Member> member = new ArrayList<Member>();

	Scanner sc = new Scanner(System.in);

	public Service() {

		member.add(new Member("김길동", "1234", "19692222"));
		member.add(new Member("이이이", "4567", "19692222"));
		member.add(new Member("박박박", "9999", "19692222"));
		member.add(new Member("admin", "0000", "19692222"));

		
		for(Member mem : member) {
			System.out.println(mem);
		}
		
	}

	public void join() {

		boolean flag = true;

		while (flag) {

			System.out.print("아이디:");
			String id = sc.next();

			System.out.print("비밀번호:");
			String pw = sc.next();

			System.out.print("비밀번호 확인:");
			String pw2 = sc.next();

			System.out.print("생년월일:");
			String birth = sc.next();

			if (pw.equals(pw2)) {
				System.out.println("성공");
				member.add(new Member(id, pw, birth));

				for (Member mb : member) {
					System.out.println(mb);
				}

				flag = false;
				break;
			} else {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");

			}

		}

	}

	// 조회
	public void login() {
		// TODO Auto-generated method stub

		boolean flag = true;
		while (flag) {
			System.out.println("\n======로그인-======");

			System.out.println("아이디 입력 : ");
			String id = sc.next();

			System.out.println("비밀번호 입력");
			String pw = sc.next();

			for (Member mb : member) {
				// 둘중하나라도 참이면 참인 ||을 ! 을 사용하여 반대로 만듬
				System.out.println(mb);

				if (!(mb.getId().equals(id) || mb.getPw().equals(pw))) {

					System.out.println("일치하는 회원없음");
					System.out.println(mb);
					break;

				}else if(mb.getId().equals(id) && mb.getPw().equals(pw) && mb.getId().equals("admin")) {

					
					System.out.println( "관리자 님 환영합니다.");
					flag = false;
					break;

				} else if (mb.getId().equals(id) && mb.getPw().equals(pw)) {

					System.out.println(id + "님 환영합니다.");
					flag = false;
					break;

				}

			}

		}
	}
}

