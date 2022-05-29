package masi.com;

  import java.util.Scanner;
  
public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade='A';
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void displayDetails() {
		Scanner s=new Scanner(System.in);
//		s.nextLine();
		
		System.out.println("enter roll number");
		int rollNumber=s.nextInt();
		
		System.out.println("Enter name");
		String name=s.next();
		
		System.out.println("Enetr markes");
		int markes=s.nextInt();
		s.close();
		
		
		
		Student st=new Student(rollNumber,name,markes);
		String detail=st.toString();
		System.out.println(detail);

		
	}
	
	private char calculateGrade(int marks) {
		
		if (marks >= 500) {
			return 'A';
		}
		if (marks < 500 && marks>= 400) {
			return 'B';
		}
		else {
			return 'C';
		}
	}
	
	@Override
	public String toString() {
		return "roll: "+roll+" name: "+name+" marks: "+" grade: "+grade;
	}
	
	Student(){
		
	}
	
	Student(int roll, String name,int marks ){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
		char grade=calculateGrade(marks);
		this.grade=grade;
	}
	
	
	
	
}
