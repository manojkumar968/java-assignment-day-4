package com.student;

public class Main {
	
	Student s=new Student();
	
	Main(){
		
	}


	public static void main(String[] args) {
		Student m1=new Student();
//		m1.printDetail();
		m1.setRoll(12345);
		m1.setName("Manoj");
		m1.setAge(70);
		m1.setMarkes(600);
		System.out.println("---Print detail by gtter method---");
		System.out.println("rollNumber "+m1.getRoll());
		System.out.println("Name "+m1.getName());
		System.out.println("age "+m1.getAge());
		System.out.println("Markes "+m1.getMarkes());
		
		
		Student m2=new Student(54321,"Parveen",30,500);
		System.out.println("---Print detail by PrintDetail method---");
		m2.printDetail();
		
	}
}
