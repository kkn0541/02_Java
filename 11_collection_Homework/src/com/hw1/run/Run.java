package com.hw1.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.print.DocFlavor.STRING;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Friend friend = new Friend();

		List<Friend> frName = new ArrayList<Friend>();

//		List<String> aaa = new ArrayList<String>();
//		aaa.add("짱구");
//		aaa.add("철수");
//		aaa.add("유리");
//		aaa.add("훈이");

//		int num = (int) (Math.random() * aaa.size());
//		String bbb=aaa.get(num);
		// System.out.println(friend);

		frName.add(new Friend("짱구"));
		frName.add(new Friend("철수"));
		frName.add(new Friend("유리"));
		frName.add(new Friend("훈이"));
		frName.add(new Friend("맹구"));

		System.out.println(frName.get(2));
		int num = (int) (Math.random() * frName.size());
		System.out.println(num);

		Friend name = frName.get(num); // frName 리스트에서 num번째 인덱스에
										// 위치한값 뽑기

//	frName.get(num).pickLeader();

		name.pickLeader();

		// 객체명만 호출해도 tostring 호출

	}

}
