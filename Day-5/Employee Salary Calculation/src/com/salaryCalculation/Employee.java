package com.salaryCalculation;

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	int getEmployeeId() {
		return employeeId;
	}
	
	String getEmployeeName() {
		return employeeName;
	}
	double getSalary() {
		return salary;
	}
	double getNetSalary() {
		return netSalary;
	}
	
	 public void calculateNetSalary(int pfpercentage) {
//		 System.out.println(pfpercentage);
		 double perCal=pfpercentage*0.01*salary;
//		 System.out.println(perCal);
		 netSalary=salary-perCal;
	 }
	 
	 public static Employee getEmployeeDetails(int employeeId,String employeeName,double salary) {
		 Employee e=new Employee();
		 e.employeeId=employeeId;
		 e.employeeName=employeeName;
		 e.salary=salary;
		 return(e);
	 }
	 
	 public static int getPFPercentage(int pfpercentage) {
		 return pfpercentage;
	 }


}
