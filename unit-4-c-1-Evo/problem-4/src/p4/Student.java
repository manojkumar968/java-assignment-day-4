package p4;

public class Student {

	private int rollNumber;
	private String studentName;
	private int marks;
	
	void setRoll(int rol) {
		rollNumber=rol;
	}
	
	int getRoll() {
		return rollNumber;
	}
	
	void setName(String name) {
		studentName=name;
	}
	
	String getName() {
		return studentName;
	}
	
	void setMarks(int mark) {
		marks=mark;
	}
	int getMarks() {
		return marks;
	}
	
	Student(){
		
	}
	
	Student(int rol,String nam,int mark){
		this.rollNumber=rol;
		this.studentName=nam;
		this.marks=mark;
	}
}
