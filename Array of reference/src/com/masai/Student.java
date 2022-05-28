package com.masai;

public class Student {

	public int rollNumber;
	public String name;
	
	Student(int rol,String name){
		this.rollNumber=rol;
		this.name=name;
	}
	
	void printStudent() {
		System.out.println("student rollNumber: "+rollNumber);
		System.out.println("name: "+name);
	}
}
