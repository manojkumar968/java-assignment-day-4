package com.masai;

	import java.util.Scanner;
public class Demo {
	
	public static Bank getBank(String bank) {
		String branchName;
		String ifscCode;
		double interestRate;
		if(bank.compareTo("axis")==0) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter branch name");
			branchName=s.next();
			
			System.out.println("Enter ifsc code");
			ifscCode=s.next();
			
			System.out.println("Enter interest rate");
			interestRate=s.nextDouble();
			s.close();
			
			AxisBank ab=new AxisBank(branchName,ifscCode,interestRate);
			return ab;
		}

		
		else if(bank.compareTo("icici")==0) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter branch name");
			branchName=s.next();
			
			System.out.println("Enter ifsc code");
			ifscCode=s.next();
			
			System.out.println("Enter interest rate");
			interestRate=s.nextDouble();
			s.close();
			
			ICICIBank ib=new ICICIBank(branchName,ifscCode,interestRate);
			return ib;
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter bank name");
		String bankName=s.next();
//		System.out.println(bankName.compareTo("axis"));
		s.close();
			
		Bank b=Demo.getBank(bankName);
		if(b!=null) {
			b.displayDetails();
			
			if(bankName.compareTo("axis")==0) {
				if(b instanceof AxisBank) {
					AxisBank ab=(AxisBank)b;
					ab.getCreditCard();
				}
			}
		}
		else {
			System.out.println("Enter vaild bank name");
		}
		
		
		
		
	}
	
	
	
	

}
