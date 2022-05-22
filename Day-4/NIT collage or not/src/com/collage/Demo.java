package com.collage;

public class Demo {

	public static void main(String[] args) {
		Student s1=Student.getStudent(true);
		System.out.println("----NIT collage student---");
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getCollageName());
		
		Student s2=Student.getStudent(false);
		System.out.println("----NON NIT collage student----");
		System.out.println(s2.getRoll());
		System.out.println(s2.getName());
		System.out.println(s2.getAddress());
		System.out.println(s2.getCollageName());
		
	}
}
