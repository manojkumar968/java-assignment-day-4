package com.masai;

public class AxisBank extends Bank {

	double rateOfInterest;
	
	@Override
	void displayDetails() {
		System.out.println("Branch name: "+branchName);
		System.out.println("Ifsc code: "+IfscCode);
		System.out.println("rate of interest:"+rateOfInterest);
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}
	
	AxisBank(){
		
	}
	
	AxisBank(String branchName,String ifscCode,double rateInterest){
		this.branchName=branchName;
		this.IfscCode=ifscCode;
		this.rateOfInterest=rateInterest;
		
	}
}
