package p1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public boolean validate(String name, String mobileNum, String aadharCard) {
		boolean b1=Pattern.matches("[a-zA-Z]{3,8}", name);
		boolean b2=Pattern.matches("[0-9]{12}",aadharCard);
		boolean b3=Pattern.matches("[6789][0-9]{9}", mobileNum);
//		System.out.println(b1+" "+b2+" "+b3);
		if(b1&&b2&&b3) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter Aadhar Number");
		String aadharNumber=sc.next();
		System.out.println("Enter mobile number");
		String mobileNumber=sc.next();
		
		sc.close();
		Demo d=new Demo();
		boolean b=d.validate(name, mobileNumber,aadharNumber);
		if(b==true) {
			Citizen c=new Citizen(name, aadharNumber, mobileNumber);
			System.out.println("Name: "+c.getName());
			System.out.println("Aadhar number: "+c.getAadharNumber());
			System.out.println("Mobile number; "+c.getMobileNumber());
		}
		else {
			System.out.println("Please enter vaild detail");
		}

	}

}
