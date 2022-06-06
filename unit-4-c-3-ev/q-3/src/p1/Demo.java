package p1;

import java.util.Scanner;

public class Demo {

	void showDetails(Month m) {
		// JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NO,DEC
		Month month = m;
		switch (month) {
		case JAN:
			System.out.println("first month");
			break;
		case FEB:
			System.out.println("2nd month");
			break;
		case MAR:
			System.out.println("3rd month");
			break;
		case APR:
			System.out.println("4th month");
			break;
		case MAY:
			System.out.println("5th month");
			break;
		case JUN:
			System.out.println("6th month");
			break;
		case JUL:
			System.out.println("7th month");
			break;
		case AUG:
			System.out.println("8th month");
			break;
		case SEP:
			System.out.println("9th month");
			break;
		case OCT:
			System.out.println("10th month");
			break;
		case NOV:
			System.out.println("11th month");
			break;
		case DEC:
			System.out.println("12th month");
			break;

		}
	}

	public static void main(String[] args) {
		try {
			
			Demo d=new Demo();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter month name");
			String month=sc.next();
			sc.close();
			String m=month.toLowerCase();
//			System.out.println(monthm);
			switch(m) {
			case "january":
				d.showDetails(Month.JAN);
				break;
			case "february":
				d.showDetails(Month.FEB);
				break;
			case "march":
				d.showDetails(Month.MAR);
				break;
			case "april":
				d.showDetails(Month.APR);
				break;
			case "may":
				d.showDetails(Month.MAY);
				break;
			case "june":
				d.showDetails(Month.JUN);
				break;
			case "july":
				d.showDetails(Month.JUL);
				break;
			case "august":
				d.showDetails(Month.AUG);
				break;
			case "september":
				d.showDetails(Month.SEP);
				break;
			case "october":
				d.showDetails(Month.OCT);
				break;
			case "november":
				d.showDetails(Month.NOV);
				break;
			case "december":
				d.showDetails(Month.DEC);
				break;
				default:
					System.out.println("Invalid Month Name");
				
			}
		} catch (Exception e) {
			System.out.println("Invalid Month Name");
		}

	}

}
