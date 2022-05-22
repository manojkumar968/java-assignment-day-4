package com.recursion;

public class Demo {

	
	public Demo(){
		this("Manoj");
		System.out.println("constructer Demo()");
		
	}
	
	public Demo(String name){
		this(100);
		System.out.println("constructer Demo(String s) "+name);
	}
	
	public Demo(int i) {
		this(25.0f);
		System.out.println("constructor Demo(int i) "+i);
	}
	
	public Demo(float f) {
		System.out.println("constructor DemoI(float f) "+f);
	}
	
	public static void main(String[] args) {
		Demo d=new Demo();
	}
}
