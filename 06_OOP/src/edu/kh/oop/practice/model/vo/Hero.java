package edu.kh.oop.practice.model.vo;

public class Hero {

	// 속성
	// 필드 == 멤버변수

	private String nickName;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;

	public String getNickname() {
		return nickName;
	}

	public void setNickname(String nickname) {
		this.nickName = nickname;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp -= mp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	// 기본생성자
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	// 매개변수 생성자
	public Hero(String nickName, String job, int hp, int mp, int level, double exp) {

		this.nickName = nickName;
		this.job = job;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.exp = exp;
	
	System.out.printf(
			"=====================캐릭터 생성=============\n"
			+"%s 직업으로 '%s' 님이 생서되었습니다. \n"
			+"-현재레벨 : %d\n"
			+"-현재hp: %d\n"
			+"-현재mp : %d\n"
			+"-현재exp : %.1f\n",
			job, nickName , level , hp, mp,exp
			);
	}

	public void attack(double exp) {

		// 전달받은 경험치 받아오기
		this.exp += exp;

		
		if (this.exp >= 300) {
			level++; // 매개변수 없어서 this.level 아님
			this.exp = this.exp - 300;
			System.out.println("레벨업 현재레벨" + this.level);

		} else {
			System.out.printf("%s 은 공격을 했다 현재경험치 %.1f \n", nickName, this.exp);

		}

	}

	public void dash() {

		// 매개변수없어서 그냥 mp해도됨
		if (this.mp <= 0) {
			System.out.printf("%s 은 대쉬을 했다 현재마나 %d \n", nickName, mp);
			System.out.println("대쉬할수 없어요");
		} else {

			mp -= 10;

			System.out.printf("%s 은 대쉬을 했다 현재마나 %d \n", nickName, mp);

		}
	}

	@Override
	//pdf 파일 보고 작성
	public String toString() {
		return"======'%s'님의 정보 ======\n"
			+"-현재레벨 : %d\n"
			+"-현재hp: %d\n"
			+"-현재mp : %d\n"
			+"-현재exp : %.1f\n";
	
	}

}
