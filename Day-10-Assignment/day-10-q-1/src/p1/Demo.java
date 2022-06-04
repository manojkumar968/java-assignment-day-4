package p1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		if(amount>1000) {
			return new TajHotel();
		}
		else if(amount>200&&amount<1000) {
			return new RoadSideHotel();
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr amount");
		int amount=sc.nextInt();
		sc.close();
		Demo d=new Demo();
		Hotel h1=d.provideFood(amount);
		if(h1==null) {
			System.out.println("Enter vaild amount");
		}
		else {
			h1.chickenBiryani();
			h1.masalaDosa();
		}
	}
}
