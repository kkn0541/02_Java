package com.hw1.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Friend friend = new Friend();
		
		List<Friend> name = new ArrayList<Friend>();
		
		
	
	name.add(new Friend("짱구"));
	name.add(new Friend("철수"));
	name.add(new Friend("유리"));
	name.add(new Friend("훈이"));
	name.add(new Friend("맹구"));
	
	int num = (int) (Math.random() * name.size());
	System.out.println(num);
	
	Friend daejang = name.get(num);
	System.out.println(daejang);
	
	
	
	
	
	
	
	
//	Random random = new Random();
//	Set<Integer> num= new HashSet<Integer>();
//	num.add(random.nextInt(name.size())+1);
//	
//	name.add(friend);
//	System.out.println(name);
	
	
	
//	
//	num.add(random.nextInt(name.size())); //
//	System.out.println(nu);
//	//Friend randomElement = name.get(randomIndex);
//	System.out.println( randomElement);
//	
//	
	
	
	
	
	
	}

}
