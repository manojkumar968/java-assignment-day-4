package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int arrLength = sc.nextInt();
			int[] arr = new int[arrLength];
			System.out.println("Enter the elements in the array");
			int count1 = 0;
			while (count1 < arr.length) {
				int num = sc.nextInt();
				arr[count1] = num;
				count1++;
			}
			System.out.println("Enter the index of the array element you want to access");
			int ind = sc.nextInt();
			sc.close();
			System.out.println(arr[ind]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("enter vaild index");
		
		}
		catch (InputMismatchException e) {
			System.out.println("enter vaild number");
			
		}

	}

}
