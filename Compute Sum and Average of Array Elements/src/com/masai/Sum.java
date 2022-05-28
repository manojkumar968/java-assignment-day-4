package com.masai;

public class Sum {
 
	public static void main(String[] args) {
		String[] arr1=new String[3];
		arr1[0]="manoj";
		arr1[2]="yadav";
		
		int[] arr= {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		
		int sum=0;
		for(int el:arr) {
			sum+=el;
		}
		System.out.println("sum: "+sum);
		
		int avg=sum/arr.length;
		System.out.println("average: "+avg);
	}
}
