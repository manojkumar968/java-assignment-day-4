package com.masai;
 import java.util.Scanner;
public class Demo {
//	int i=10;
	public static void main(String[] args) {
		
//		Demo obj=new Demo();
//		System.out.println(obj.i);
		String s1="Manoj";
		String s2=new String("mmAnoj");
		StringBuilder s3=new StringBuilder("maNoj");
//		System.out.println(s1.length());
//		System.out.println(s2.length());
//		System.out.println(s3.length());
//		System.out.println(s1.charAt(0));
//		System.out.println(s2.charAt(1));
//		System.out.println(s3.charAt(2));
//		System.out.println(s1.substring(0));
//		System.out.println(s2.substring(1));
//		System.out.println(s3.substring(2));
//		System.out.println(s1.substring(0,1));
//		System.out.println(s2.substring(1,2));
//		System.out.println(s3.substring(2,3));
//		System.out.println(s1.concat(s2));
		
		//  concat not applay for StringBuilder
		
		
//		System.out.println(s3.append(s2));
		char c='a';
//		System.out.println(s2.indexOf('j'));
		
		// indexOf not apply on StringBuilder
		
		
//		System.out.println(s2.lastIndexOf('m'));
//		System.out.println(s2.indexOf('m'));
//		System.out.println(s2.indexOf('m',0));
		String s4="manoj";
		String s5="manoj";
		String s6=new String("manoj");
//		System.out.println(s4.equals(s1));
//		System.out.println(s1.equalsIgnoreCase(s4));
		
		
		//  euals  not apply on StringBuilder
		
//		System.out.println(s1.compareTo(s4));
//		System.out.println(s2.compareTo(s1));
		
		//  compareTo not apply on stringBulider
		
		
//		System.out.println(s1.compareToIgnoreCase(s5));
//		System.out.println(s1.toUpperCase());
//		System.out.println(s4.toUpperCase());
		
		//   toUpperCase not apply on StringBuilder
		
//		System.out.println(s1.replace('j','J'));
		
		//  replace() not apply on StringBuilder
		
//		System.out.println(s1.toCharArray()[0]);
//		System.out.println(s1);
//		System.out.println(s5.toCharArray()[4]);
		
		//  toCharArray()  not appaly for StringBuilder
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name=s.nextLine();
		System.out.println(name);
		System.out.println("enter age");
		int age=s.nextInt();
		System.out.println(age);
		
		System.out.println("enter salary");
		double salary=s.nextDouble();
		System.out.println(salary);

	}
	
}
