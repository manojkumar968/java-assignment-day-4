package p1;

public abstract class Student {

	String name;
	String address;
	
	public abstract String getParcentage(int marks);
	public Student(String name,String add) {
		this.name=name;
		this.address=add;
	}


}
