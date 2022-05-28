package com.masai;

public class Main {

	//Q2:- Explain ClassCastException with the help of the example.
	
	//ans:- Suppose parent class Animal and child class Dog we creat parent object
	
	        // Parent p= new Parent();  (Upcasting)
	
	        // Dog d= (Dog)p  (Dowencasting)
	        
	       // and we try to access methods of child class then its show run time error  
	
	       // called classCastException
	
	// this error can be avoid by using instanceof operator
	
	
	// Exampile:-
	
	public static void main(String[] args) {
		Animal a=new Animal();
		
		Dog d=(Dog)a;
		d.makeNoise();
		
//		if(a instanceof Dog) {
//			Dog dog=(Dog)a;
//			dog.makeNoise();
//		}
		
	}
	
	
}

class Animal{
	
	public void makeNoise() {
		System.out.println("Animal make noise");
	}
}

class Dog extends Animal{
	@Override
	public void makeNoise() {
		System.out.println("Dog is barking");
	}
}







