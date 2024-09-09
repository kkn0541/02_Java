package edu.kh.oarr.run;

import edu.kh.oarr.model.service.MemberService;

public class MemberRun {
public static void main(String[] args) {
	MemberService service = new MemberService();
	//기본생성자로  인덱스 0 ,1 2, 값을 넣은채로 시작 
	service.displayMenu();
	
}
}
