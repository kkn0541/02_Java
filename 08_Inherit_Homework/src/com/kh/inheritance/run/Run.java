package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스마트폰 객체생성
		SmartPhone smp = new SmartPhone("samsung", "galaxy s20", 2020, 12000, "android", 128);
//사용자정의자료형 변수명
		smp.printInfo();//오버라이딩 0 -> smartPhone(자식)에서 재정의한 메서드

		System.out.println("============================");
		
		BasicPhone bp = new BasicPhone("nokia", "3310", 2000, 10000, true);
		bp.printInfo();
		bp.checkKeyboard();

//		smp.setBrand("samsumg");
//		smp.setModel("galaxy s20");
//		smp.setYear(2020);
//		smp.setPrice(120000);
//		smp.setOperatingSystem("android");
//		smp.setStorageCapacity(128);
		
	
//
//		bp.setBrand("nokia");
//		bp.setModel("3310");
//		bp.setYear(2000);
//		bp.setPrice(100000);
//		bp.setHasPhysicalKeyboard(true);
	}

}
