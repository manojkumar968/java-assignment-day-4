package com.masai;

public class Main {

	public static void main(String[] args) {
		
		Bird b=new Parrort();
		b.fly();
		Parrort p=(Parrort)b;
		p.sing();
	}
}
