package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SanckMenu {

	private Scanner sc= new Scanner(System.in);
	private SnackController scr = new SnackController();	

	
public void menu() {
	
	System.out.println("스냅류 입력");
	System.out.println("종류");
	String kind = sc.next();
	
	System.out.println("이름");
	String name = sc.next();
	
	System.out.println("맛");
	String flavor = sc.next();
	
	System.out.println("개수");
	int numOf = sc.nextInt();
	
	System.out.println("가격");
	int price = sc.nextInt();
	
	System.out.println(scr.savaData(kind, name, flavor, numOf, price));
	
	
	System.out.println(scr.confirmData());
	
}


}
