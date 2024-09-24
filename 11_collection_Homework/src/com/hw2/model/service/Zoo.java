package com.hw2.model.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {

	private List<Animal> animals=new ArrayList<Animal>(); 

	public Zoo() {
		// TODO Auto-generated constructor stub
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
		
		
	}

	public void  showAnimals(){
		//sound메서드 
		for(Animal ani : animals) {
			ani.sound();
		
	
	
	}
	
		
	}
	
	public void displayMenu() {
	Scanner sc = new Scanner(System.in);
		
		int menuNum=0;
		
		do {
			System.out.println("==============kh 동물원=========");
			System.out.println("원하는 작업선택");
			System.out.println("1 .소리듣기");
			System.out.println("2 .종료");
			System.out.print("선택");

			try {
				menuNum = sc.nextInt();
				switch (menuNum) {
				case 1:
					showAnimals();
					break;
				case 2:
					System.out.println("프로그램종료");
					break;
				default:
					System.out.println("메뉴에 작성된 번호만 입력하세요");
				}

			} catch (Exception e) {
				// TODO: handle exception
			}

		} while (menuNum != 0);
	}

	
	
}
