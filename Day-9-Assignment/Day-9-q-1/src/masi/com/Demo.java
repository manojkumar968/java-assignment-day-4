package masi.com;

public class Demo {

	public static void main(String[] args) {
		
		Student s=new Student();
		
		s.displayDetails();
		
		System.out.println("===============================================");
		
		Student s2=new Student(456,"Parveen",300);
		
		System.out.println("rollNumber: "+s2.getRoll());
		System.out.println("Name: "+s2.getName());
		System.out.println("marks: "+s2.getMarks());
		System.out.println("grade: "+s2.getGrade());
	}
}
