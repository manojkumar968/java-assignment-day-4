package com.masai;

public class Student {

	int studId;
	String studName; 
	double examFee;
	
	void displayDetails() {
		System.out.println("Student id: "+studId);
		System.out.println("Student name: "+studName);
		System.out.println("Exam fee: "+examFee);
	}
	double payFee(double payExamFee) {
		
			double remamber=examFee-payExamFee;
			return remamber;	
	}
	
	Student(){
		
	}
}
