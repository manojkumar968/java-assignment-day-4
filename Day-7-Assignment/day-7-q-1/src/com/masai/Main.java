package com.masai;

public class Main {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Maonj";
		emp.age=25;
		emp.address="Haryana";
		emp.Department="IT";
		emp.phoneNumber="123456789";
		emp.Specialisation="Java language";
		emp.salary=50000;
		
		System.out.println("Name: "+emp.name);
		System.out.println("Age: "+emp.age);
		System.out.println("Address: "+emp.address);
		System.out.println("Phone number: "+emp.phoneNumber);
		emp.printSalary();
		System.out.println("Department: "+emp.Department);
		System.out.println("Specialisation: "+emp.Specialisation);

		System.out.println("===========================================");
		
		Manager men=new Manager();
		men.name="Parveen";
		men.age=30;
		men.address="Haryana";
		men.Department="Mechanical";
		men.phoneNumber="123456789";
		men.Specialisation="Engine";
		men.salary=60000;
		
		System.out.println("Name: "+men.name);
		System.out.println("Age: "+men.age);
		System.out.println("Address: "+men.address);
		System.out.println("Phone number: "+men.phoneNumber);
		men.printSalary();
		System.out.println("Department: "+men.Department);
		System.out.println("Specialisation: "+men.Specialisation);
	}
}
