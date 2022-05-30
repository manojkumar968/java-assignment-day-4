package com.masai;

public class Main {

	public static void main(String[] args) {
		DayScholar d=new DayScholar(123,"Manoj",2000,10000);
		d.displayDetails();
		System.out.println("TransportFee: "+d.transportFee);
		
		double remainingFee=d.payFee(8000);
		
		System.out.println("Remaining Fee: "+remainingFee);
		
		System.out.println("==================================");
		
		Hosteller h=new Hosteller(456,"Parveen",2000,50000);
		h.displayDetails();
		System.out.println("TransportFee: "+h.hostelFee);
		
		double feePainding=h.payFee(40000);
		
		System.out.println("Remaining Fee: "+feePainding);
		
		
	}
}
