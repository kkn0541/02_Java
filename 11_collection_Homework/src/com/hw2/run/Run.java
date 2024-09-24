package com.hw2.run;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {

	// zoo객체 생성

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Zoo z = new Zoo();  //zoo 객체 
		
		
		Tiger t = new Tiger("호랑이"); //호랑이
	  //	t.setName("호랑이");		
		z.addAnimal(t); //zoo 객체에 추가 
	
		
		Monkey m = new Monkey(); //원숭이
		m.setName("원숭이");
		
		z.addAnimal(m); // zoo객체에 추가 
		
	
		
		
		//메뉴호출 
		z.displayMenu();
		
		
	}

}
