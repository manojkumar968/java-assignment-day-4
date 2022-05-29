package com.masai;

	import java.util.Scanner;
	
public final class Child extends Parent {

	@Override
	void method1() {
		System.out.println("method1 belong to child class");
		System.out.println("Number access form child: "+number);
	}
	
	void method4() {
		System.out.println("method4 belong to child class");
	}
	
	Child(int num){
		super(num);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=0;
		while(num<1||num>10) {
			System.out.println("Please enter a number range between 1 to 10 ");
			num=s.nextInt();
			if(num<1&&num>10) {
				System.out.println("Invalid number");
			}
		}
		s.close();
		
		Parent p=new Child(num);
		p.method1();
		p.method2();
		p.method3();
		
		if(p instanceof Child ) {
			Child ch=(Child)p;
			ch.method4();
		}
		
		
	}
	
	
}
