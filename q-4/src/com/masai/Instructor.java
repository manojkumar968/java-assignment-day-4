package com.masai;

public class Instructor extends Person {

	int instructorId ;
	int salary ;
	
	@Override
	public String toString() {
	
		return "instructorId = "+instructorId+", salary= "+salary+", address=Address  [city=Chennai, state=TN, pincode=60001";                     
	}
}
