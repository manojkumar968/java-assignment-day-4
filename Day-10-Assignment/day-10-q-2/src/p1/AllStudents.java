package p1;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter science student detail");
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter address");
		String address=sc.nextLine();
		System.out.println("enter Physic marks");
		int physicMarks=sc.nextInt();
		System.out.println("enter chemistory marks");
		int chemistoryMarks=sc.nextInt();
		System.out.println("enter math marks");
		int mathMarks=sc.nextInt();
		
		Student s1=new ScienceStudent(physicMarks,chemistoryMarks,mathMarks,name,address);
		System.out.println(s1);
		System.out.println("==============================================");
		
		System.out.println("enter history student detail");
		System.out.println("enter name");
		String nameH=sc.next();
		System.out.println("enter address");
		String addressH=sc.next();
		System.out.println("enter history marks");
		int historyMarks=sc.nextInt();
		System.out.println("enter civic marks");
		int civicMarks=sc.nextInt();
		
		sc.close();
		
		Student s2=new HistoryStudent(historyMarks,civicMarks,nameH,addressH);
		System.out.println(s2);
		
		

	}

}
