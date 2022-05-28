package com.masai;

public class Main {
	
	//Explain dynamic polymorphism ?
	
	//ans-Dynamic polymorphism is also called runtime polymorphism because at run
	
	    // time we can override the parent class method in child class through referance 
	
	    // variable of parent class.
	
	// Exampile:-
	
	public static void main(String[] args) {
		
		Animal a=new Dog();
		a.makeNoise();
	}
	
	

}

class Animal{
	
	public void makeNoise() {
		System.out.println("Animal making noise");
	}
}

class Dog extends Animal{
	
	@Override
	
	public void makeNoise() {
		System.out.println("Dog is barking");
	}
}





