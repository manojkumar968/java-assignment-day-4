package com.masai;

public class Parent {

	final int number;
	
	void method1() {
		System.out.println("method1 belong to parent class");
		System.out.println("Number access form parent: "+number);
//		number=20;
	}
	
	void method2() {
		System.out.println("method2 belong to parent class");
	}
	
	void method3() {
		System.out.println("method3 belong to parent class");
	}
	
	Parent(int num){
		this.number=num;
	}
}
