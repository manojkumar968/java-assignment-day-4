package com.Scanner;

import java.util.Scanner;
public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter name");
		String name=scanner.nextLine();
		System.out.println("Name: "+name);
		String name2=scanner.nextLine();
		String name3=scanner.nextLine();		
	}
}
