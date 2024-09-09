package com.kh.practice.snack.controller;

import java.util.Scanner;

import com.kh.practice.snack.model.vo.Snack;

//Controller : 사용자의 요청을 받아서 처리하고 그 입력에 따라 
// model view(데이터처리 , 비즈니스 로직)과 view(화면출력)을 연결해주는 역할 

//클라이언트 -> 요청-> controller ->service -> DB
public class SnackController {

	//필드
	Scanner sc = new Scanner(System.in);
	private Snack s = new Snack();

	public SnackController() {
		// TODO Auto-generated constructor stub
	}

	//메서드
	//데이터를 setter를 이용하여 저장하고 
	//저정완료 결과를 반환하는 메서드
	//return값에 저장완료되었습니다 입력 
	public String saveData(String kind, String name, String flavor, int numOf, int price) {

		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		return "저장완료되었습니다."
				+"\n 저장한 정보를 확인하시겠습니까( y/n)" ;

	}

	public String confirmData() {
		//저장된 데이터를 반환함 
		return s.information();
	}
}
