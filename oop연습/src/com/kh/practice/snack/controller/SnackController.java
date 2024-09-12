package com.kh.practice.snack.controller;

import java.util.Scanner;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {

	Scanner sc = new Scanner(System.in);
	private Snack s = new Snack();
	
	public SnackController() {
		// TODO Auto-generated constructor stub
	
	}
	public String savaData(String kind , String name, String flavor, int numOf, int price) {
		
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return"저장완료";
		
		
	}
	
	public String confirmData() {
		
		return s.confirmData();
	}
	
}
