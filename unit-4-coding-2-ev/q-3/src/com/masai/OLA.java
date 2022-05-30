package com.masai;

public class OLA {

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		int num=3;
		if(numberOfPassenger==num||numberOfPassenger<num) {
			HatchBack h=new HatchBack();
			h.numberOfPassenger=numberOfPassenger;
			h.numberOfKms=numberOfKMs;
			return h;
		}
		else {
			Sedan s=new Sedan();
			s.numberOfPassenger=numberOfPassenger;
			s.numberOfKms=numberOfKMs;
			return s;
		}
		
	}
	
	public int calculateBill(Car car) {
		int km=car.numberOfKms;
		int fare=0;
		if(car instanceof Sedan) {
			Sedan s=(Sedan)car;
			fare=s.farePerKm;
		}
		
		else if(car instanceof HatchBack) {
			HatchBack s=(HatchBack)car;
			fare=s.farePerKm;
		}
		
		int tf=km*fare;
		return tf;
		
	}
}
