package com.masai;

public class ICICIBank extends Bank {

	double rateOfInterest;
	
	@Override
	void displayDetails() {
		System.out.println("Branch name: "+branchName);
		System.out.println("Ifsc code: "+IfscCode);
		System.out.println("rate of interest:"+rateOfInterest);
	}
	
	ICICIBank(){
		
	}
	
	ICICIBank(String branchName,String ifscCode,double rateInterest){
		this.branchName=branchName;
		this.IfscCode=ifscCode;
		this.rateOfInterest=rateInterest;
		
	}
}
