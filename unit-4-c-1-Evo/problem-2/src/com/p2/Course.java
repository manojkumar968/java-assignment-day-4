package com.p2;
 import java.util.Scanner;
public class Course {

	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails() {
		System.out.println("courseId: "+courseId);
		System.out.println("courseName "+courseName);
		System.out.println("courseFee "+courseFee);
		
	}
	
	static void authenticate(String userName,String password){
		
		if(userName=="Admin"&&password=="1234") {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter userId ");
			int courseId=scanner.nextInt();
			System.out.println("Enter course name");
			String courseName=scanner.next();
			System.out.println("Enter course fee");
			int courseFee=scanner.nextInt();
			Course c=new Course(courseId,courseName,courseFee);
			scanner.close();
			c.displayCourseDetails();
//			c.courseId=courseid;
		}
		else {
			System.out.println("Invalid Username or password");
		}
		
	}
	
	Course(int id,String name,int fee){
		this.courseId=id;
		this.courseName=name;
		this.courseFee=fee;
	}
	
	public static void main(String[] args) {
		Course.authenticate("Admin","1234");
	}
}
