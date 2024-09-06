package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {

	public void practice() {
		Hero user1 = new Hero("이구역짱", "전사", 200, 20, 1, 0);

		Hero user2 = new Hero("Zi존위자드", "마법사", 100, 100, 1, 0);

		
		

		System.out.println("----------" + user1.getNickname() + "님의 시선" + "==============");

		user1.attack(100);
		user1.attack(50.5);
		user1.attack(49.5);
	
		user1.dash();
		user1.dash();
		user1.dash();

	
		//hero - tostring 메서드에서 그대로 가져옴
		System.out.printf(user1.toString(),
				user1.getNickname(),
				user1.getLevel(),
				user1.getHp(),
				user1.getMp(),
				user1.getExp());
		
		System.out.println("----------" + user2.getNickname() + "님의 시선" + "==============");
		
		
		
		user2.attack(300.0);
		user2.dash();
		user2.attack(300.0);
		user2.attack(300.0);
		
		System.out.printf(user2.toString(),
				user2.getNickname(),
				user2.getLevel(),
				user2.getHp(),
				user2.getMp(),
				user2.getExp());
		
	}

}
