package com.collage;

public class Student {
 
	int roll;
	String name;
	String address;
	String collageName;
	
	int getRoll() {
		return roll;
	}
	String getName() {
		return name;
	}
	String getAddress() {
		return address;
	}
	String getCollageName() {
		return collageName;
	}
	
	public static Student getStudent(boolean isFromNIT) {
		
		if(isFromNIT==true) {
			Student s=new Student(123,"Manoj","Mohlara");
			s.collageName="NIT";
			return(s);
		}
		else {
			Student s=new Student(345,"Parveen","Bhojawas","Suraj collage");
			return s;
		}
		
	}
	
	Student(){
		
	}
	
	public Student(int roll,String name,String address){
		this.name=name;
		this.roll=roll;
		this.address=address;
	}
	
	public Student(int roll,String name,String address,String collageName) {
		this.name=name;
		this.roll=roll;
		this.address=address;
		this.collageName=collageName;
	}
}
