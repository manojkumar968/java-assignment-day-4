package com.masai;

	import java.util.Scanner;
public class Main {

	public static Person generatePerson(Person person) {
		if(person instanceof Student) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student id");
			int id=sc.nextInt();
			System.out.println("Enter courseEnrolled");
			String ci=sc.next();
			System.out.println("Enter course fee");
			int fee=sc.nextInt();
			sc.close();
	
			
			Student s=(Student)person;
			s.studentId=id;
			s.courseEnrolled=ci;
			s.courseFee=fee;
			
			return s;
			
			
		}
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter instructor id");
			int id=sc.nextInt();
			System.out.println("Enter course salary");
			int salary=sc.nextInt();
			sc.close();
			
			Instructor i=new Instructor();
			i.instructorId=id;
			i.salary=salary;
			
			return i;
	
			
	}
	
	public static void main(String[] args) {
		
		Person newStudent = generatePerson(new Student());
		System.out.println(newStudent);

		Person newTeacher = generatePerson(new Instructor());

		
		System.out.println(newTeacher);
	}
}
