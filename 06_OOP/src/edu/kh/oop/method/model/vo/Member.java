package edu.kh.oop.method.model.vo;

public class Member { // 속성+ 기능

	// 필드
	private String memberId; // 아이디
	private String memberPW; // 비밀번호
	private String memberName; // 이름
	private int memberAge; // 나이

	// 생성자
	// 생성자 규칙 : 반환형이 없고 클래스명과 이름이 같아야한다.

	// 기본생성자
	// 컨트롤 스페이스 엔터
	public Member() {
	}

	// 매개변수 생성자 (필드 모두 초기화)
	//// alt + shift + s + o
	public Member(String memberId, String memberPW, String memberName, int memberAge) {
		// 오버로딩 적용(매개변수의 개수 다름)

		// 매개변수로 전달받은 값을 필드에 대입 과정
		this.memberId = memberId;
		this.memberPW = memberPW;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	// 메서드
	// getter/setter
	// alt + shift + s +r
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

}
