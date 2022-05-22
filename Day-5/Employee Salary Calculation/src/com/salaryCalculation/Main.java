package com.salaryCalculation;

public class Main {
	public static void main(String[] args) {
		Employee e=Employee.getEmployeeDetails(101,"Vivek",20000.0);
		int pfper=Employee.getPFPercentage(7);
		e.calculateNetSalary(pfper);
		System.out.println(e.getEmployeeId());
		System.out.println(e.getEmployeeName());
		System.out.println(e.getSalary());
		System.out.println(e.getNetSalary());
	}
}
