package com.masai;

public class Q1 {

	//Q1) Explain the difference between IS-A and Has-A relationship with the help of an
	//example and explain about access modifiers and their accessibility?
	
	
	//ans   1)  IS-A relationship between parent and child in wich child extends parent member like 
	//           variable and method;
	//            in IS-A relation we can override the method and access all the member or parent
	
	//             show in example-1;
	
	//      2)   Has-A relationShip there are more the same name method can be present but different 
	//           parameter we can cell any method by different class but if both method
	//           same parameter in method then JVM confuse and then run time error
	//            show in example-2;
	
	public static void main(String[] args) {
		
	}
	
	//Example-1;
	
	class Parent{
		
		void method1() {
			System.out.println("i am in parent calss");
		}
	}
	
	class Child extends Parent {
		@Override
		void method1() {
			System.out.println("i am in child class");
		}
	}
	
	
	
	//Example-2
	
	class Parent2{
		
		void method1(int x) {
			System.out.println("i am in method1(int x)");
		}
		
		void method1() {
			System.out.println("i am in method1()");
		}
	}
	
	class Child2{
		Parent p=new Parent();
	}
	
	
}
