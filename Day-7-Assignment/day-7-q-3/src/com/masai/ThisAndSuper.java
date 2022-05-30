package com.masai;

public class ThisAndSuper {

	//Q3) What is the use of ‘this’ and ‘super’ keyword in java explain with example.
	
	//ans:- 1) use of this -
	
	//         this keyword use in constructor to set non static instance variable and invoke the method of class
	//         this keyword hold the class object address.
	//         this explain in Example -1
	
	//      2) use of super
	
	//         super keyword use to invoke constructor of parent class
	//         it is use for immediate invoke of parent class method
	//         it is use for refer to the parent class instance variable.
	//         super keyword show in Example-2
	
	public static void main(String[] args) {
		
		Student s=new Student(123,"Manoj",25);
		
		Dog d=new Dog();
		d.eat();
	}
	
	
	
}

//  Example-1

class Student{
	int studentId;
	String name;
	int age;
	
	Student(int studentId,String name,int age){
		this.studentId=studentId;
		this.name=name;
		this.age=age;
		
		System.out.println(this);//  refer to class object address
	}
	
}



//Example-2

class Animal{
	String name;
	
	 void eat() {
		System.out.println("eat method belong to Animal");
		
	}
	
	Animal(String name){
		this.name=name;
	}
}

class Dog extends Animal{
	String name="Dog";
	
	@Override
	 void eat() {
		System.out.println("eat method belong to Dog class");
		super.eat();
		System.out.println(name);
		System.out.println(super.name);
		
		
	}
	
	
	Dog(){
		super("Mammals");
		
	}
	
}












