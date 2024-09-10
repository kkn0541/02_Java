package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone {
	private String operatingSystem; // os
	private int storageCapacity;// 스토리지 공간 크기

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public int getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("operatingSystem :" + operatingSystem);
		System.out.println("storageCapacity :" + storageCapacity +"gb");
	}

}
