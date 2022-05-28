package com.masai;

public class Main {
 
	double maxNumber(int[] arr) {
		double maxNum = Double.NEGATIVE_INFINITY;
		for(int el:arr) {
			if(maxNum<el) {
				maxNum=el;
			}
		}
		
		return maxNum;
	}
	
	public static void main(String [] args) {
		
		Main m=new Main();
		int[] arr= {1,2,3,4,5,5,20};
		System.out.println("Max Number "+m.maxNumber(arr));;
	}
}
