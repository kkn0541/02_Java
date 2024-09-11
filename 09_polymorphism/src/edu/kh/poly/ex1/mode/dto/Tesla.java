package edu.kh.poly.ex1.mode.dto;

public class Tesla extends Car {  //전기차  car 상속  

	private int batteryCapcity; //배터리 용량 
	
	public Tesla() {
		// TODO Auto-generated constructor stub
	}
	//매개변수 생성자 + 상속받은 것도 포함 
	public Tesla(String engine, String fuel, int wheel, int batteryCapcity) {
		super(engine, fuel, wheel);
		this.batteryCapcity = batteryCapcity;
	}
	public int getBatteryCapcity() {
		return batteryCapcity;
	}
	public void setBatteryCapcity(int batteryCapcity) {
		this.batteryCapcity = batteryCapcity;
	}
	
	// car 의 tostring() 오버라이딩 
	@Override
	public String toString() {
		return super.toString() + "/"+ batteryCapcity;
	
	}
	
	
}
