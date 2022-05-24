package com.salaryCalculation;
  import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Id");
		int id=s.nextInt();
		System.out.println("Enter name");
		String name=s.next();
		System.out.println("Enter salary");
		int salary=s.nextInt();
		System.out.println("Enter PF percentage:");
		int pf=s.nextInt();
		
		Employee e=Employee.getEmployeeDetails(id,"name",salary);
		int pfper=Employee.getPFPercentage(pf);
		e.calculateNetSalary(pfper);
		System.out.println(e.getEmployeeId());
		System.out.println(e.getEmployeeName());
		System.out.println(e.getSalary());
		System.out.println(e.getNetSalary());
	}
}
