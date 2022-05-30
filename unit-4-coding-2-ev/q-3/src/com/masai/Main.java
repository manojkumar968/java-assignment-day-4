package com.masai;

	import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of passengers");
		int p=sc.nextInt();
		System.out.println("Enter number of kilometers ");
		int km=sc.nextInt();
		
		sc.close();
		

		//Write logic to get numberOfPassenger and numberOfKms

		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(p,km);
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is "+ res);
		}
}
