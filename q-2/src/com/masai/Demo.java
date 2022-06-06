package com.masai;

	import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		System.out.println("How many Student objects need to be created");
		int sN=sca.nextInt();
		
		Student[] arrS=new Student[sN];
		
		int sn=0;
		while(sn<sN) {
			System.out.println("Enter student "+(sn+1)+" detail");
			System.out.println("roll");
			int roll=sca.nextInt();
			System.out.println("Name");
			String name=sca.next();
			System.out.println("address");
			String add=sca.next();
			System.out.println("Markes");
			int marke=sca.nextInt();
			
			
			
			Student s=new Student(roll,name,add,marke);
			arrS[sn]=s;
			sn++;
			
		}
		sca.close();
		int sum=0;
		for(int x=0;x<arrS.length;x++) {
//			System.out.println("student number "+(x+1)+" details");
			System.out.println("student number "+(x+1)+" details");
			System.out.println("name: "+arrS[x].getName());
			System.out.println("roll number "+arrS[x].getRoll());
			
			System.out.println("Address "+arrS[x].getAddress());
			System.out.println("marks "+arrS[x].getMarks());
			sum+=arrS[x].getMarks();
			System.out.println("======================================");
			
		}
		System.out.println(sum);
		int avg=sum/sN;
		
		System.out.println(" average markes "+avg);
//		
	}
	
}
