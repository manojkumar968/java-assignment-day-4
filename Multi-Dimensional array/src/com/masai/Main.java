package com.masai;

public class Main {
 
	public static void main(String[] args) {
		int[][] mat=new int[3][3];
		int i=0;
		for(int x=0;x<mat.length;x++) {
			for(int y=0;y<mat[x].length;y++) {
				mat[x][y]=i;
				i++;
			}
		}
		for(int[] el:mat){
//			System.out.println(el[0]);
			for(int el2:el) {
				System.out.println(el2);
			}
		}
	}
}
