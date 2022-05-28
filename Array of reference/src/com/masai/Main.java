package com.masai;

public class Main {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0]=new Student(123,"manoj");
		students[1]=new Student(456,"parveen");
		students[2]=new Student(789,"kumar");
//		students[0].printStudent();
		for(Student el:students) {
			el.printStudent();
		}
		
	}
}
