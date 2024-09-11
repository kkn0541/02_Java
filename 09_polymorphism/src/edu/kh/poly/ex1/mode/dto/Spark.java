package edu.kh.poly.ex1.mode.dto;

public class Spark extends Car{ //경차 
	
	private double discountOffer; //할인 혜택 
	
	
	
	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}

	// 기본생성자 
	public Spark() {
		// TODO Auto-generated constructor stub
	}
	//매개변수생성자 + 부모 

	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}
	
	
	//car . tostring
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString() +" / "+discountOffer;
		}
	

}
