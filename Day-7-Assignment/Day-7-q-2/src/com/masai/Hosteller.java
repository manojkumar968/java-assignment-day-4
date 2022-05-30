package com.masai;

public class Hosteller extends Student {

	double hostelFee;
	
	@Override
	double payFee(double feePay) {
		System.out.println("FeePay: "+feePay);
		double totalFee=examFee+hostelFee;
		double remamber=totalFee-feePay;
		return remamber;	
	}
	
	
	Hosteller(int studentId,String studentName,double examFee,double hostelFee){
		this.studId=studentId;
		this.studName=studentName;
		this.examFee=examFee;
		this.hostelFee=hostelFee;
		
	}
}
