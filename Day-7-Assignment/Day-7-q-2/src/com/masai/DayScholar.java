package com.masai;

public class DayScholar extends Student {

	double transportFee;
	
	@Override
	double payFee(double feePay) {
		System.out.println("FeePay: "+feePay);
		double totalFee=examFee+transportFee;
		double remamber=totalFee-feePay;
		return remamber;	
	}
	
	DayScholar(int studentId,String studentName,double examFee,double transportFee){
		this.studId=studentId;
		this.studName=studentName;
		this.examFee=examFee;
		this.transportFee=transportFee;
		
	}
}
