package com.student;

public class Student {
	private int roll;
	private String name;
	private int age;
	private int markes;
	

	
	void printDetail() {
		System.out.println("roll number is "+roll);
		System.out.println("Name is "+name);
		System.out.println("age "+age);
		System.out.println("markes "+markes);
	}
	
	void setRoll(int roll) {
		
			this.roll=roll;
		
		
	}
	
	int getRoll() {
		return roll;
	}
	
	void setName(String name) {
		this.name=name;
	}
	
	String getName() {
		return name;
	}
	
	void setAge(int age) {
		if(age>=18&&age<60) {
			this.age=age;
		}
		
	}
	
	int getAge(){
		if(age==0) {
			System.out.println("Enter valid age");
		}
		return age;		
	}
	
	void setMarkes(int markes) {
		if(markes>=0&&markes<=500) {
		this.markes=markes;
		}
	}
	
	int getMarkes() {
		if(markes==0) {
			System.out.println("Enter vaild markes");
		}
		return markes;
	}
	
	
	Student(){
		
	}
	
	Student(int roll,String name,int age,int markes){
		if(age>=18&&age<=60) {
			this.age=age;
		}
		if(markes>=0&&markes<=500) {
			this.markes=markes;
		}
		this.name=name;
		this.roll=roll;
		
	}
}
