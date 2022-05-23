package p4;
 import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number of Students you want to enter");
		int num=s.nextInt();
		
		int su=1;
		while(su<=num) {
			System.out.println("Enter the Roll Number :");
			int roll=s.nextInt();
			System.out.println("Enter the Name :");
			String name=s.next();
			System.out.println("Enter the marks :");
			int marks=s.nextInt();
			
			
			Student st=new Student(roll,name,marks);
			System.out.println("Student Detail:"+su);
			System.out.println(st.getRoll());
			System.out.println(st.getName());
			System.out.println(st.getMarks());
			
			su++;
			
			}
		
		s.close();
		

	}

}
