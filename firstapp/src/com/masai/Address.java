package com.masai;

public class Address {
	
	String artist;
	String title;
	void play(){
	System.out.println(artist+" is singing "+title);
	}
	public static void main(String[] args){
		Address Address1=new Address();
	Address1.artist="Lata";
	Address1.title="wande matram";
	Address1.play();
//	Address track2=new Address();
//	track2.artist="Sukhwindar";
//	track2.title="Jai Ho";
//	track2.play();
	}
}
