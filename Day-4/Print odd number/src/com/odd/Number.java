package com.odd;

public class Number {

	public void check(int l) {
		
		int remainder=l%2;
		if(l<0) {
			System.out.println("Error");
		}
		
		else if(remainder!=0) {
			System.out.println(l);
		}
		
		else {
			remainder=l%10;
			int num=10-remainder;
			System.out.println(l+num);
		}
	}
	
	public static void main(String[] args) {
		
		Number n=new Number();
		n.check(-5);
	}
}
