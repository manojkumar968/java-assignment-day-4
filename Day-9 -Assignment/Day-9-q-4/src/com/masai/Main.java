package com.masai;

public class Main {

	public static void main(String[] args) {
		
		Animal[] animalArray=new Animal[3];
		
		Animal a1=new Dog();
		
		Animal a2=new Cat();
		
		Animal a3=new Tiger();
		
		animalArray[0]=a1;
		animalArray[1]=a2;
		animalArray[2]=a3;
		
		for(Animal el: animalArray) {
			
			el.makeNoise();
			el.eat();
			el.walk();
			System.out.println("==========================");
		}
	}
}
