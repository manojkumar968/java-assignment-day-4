package com.masai;

public class Student extends Person {

	int studentId;
	String courseEnrolled ;
	int courseFee ;
	
	@Override
	public String toString() {
	
		return "StudentId = "+studentId+", course Fee= "+courseFee+", address=Address  [city=Chennai, state=TN, pincode=60001";                     
	}
}
