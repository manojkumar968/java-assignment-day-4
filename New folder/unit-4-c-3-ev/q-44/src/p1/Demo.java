package p1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter password");
		String pass=sc.next();
		System.out.println("enter mobile number");
		String mob=sc.next();
		System.out.println("enter email id");
		String em=sc.next();
		sc.close();
		
		boolean b1=Pattern.matches("[a-zA-Z]{3,8}","Manoj");
		boolean b2=Pattern.matches("\\w{3,8}","manojM96");
		boolean b3=Pattern.matches("[6789]\\d{9}","8470054315");
//		boolean b4=Pattern.matches("[a-zA-Z0-9&&[@]","manoj@gmail.com");
		if(b1&&b2&&b3) {
			Customer c=new Customer(name,pass,mob,em);
			System.out.println("userName: "+c.getUsername());
			System.out.println("password: "+c.getPassword());
			System.out.println("mobile number: "+c.getMobileNumber());
			System.out.println("email: "+c.getEmail());
		}
		else {
			System.out.println("enter vaild detail");
		}
		
	}


}
