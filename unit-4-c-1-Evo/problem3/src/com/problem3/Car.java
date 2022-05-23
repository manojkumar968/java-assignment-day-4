package com.problem3;

public class Car {

//	Engine e=new Engine();
	private String model;
	private String companyName;
	private String Color;
	private String engine;
	
	Car(){
		
	};
	void printCar() {
		System.out.println("model "+model);
		System.out.println("companyName "+companyName);
		System.out.println("Color "+Color);
		System.out.println("Engine "+engine);
	}
	Car(String mod,String comp,String col,String eng ){
		
		this.model=mod;
		this.companyName=comp;
		this.Color=col;
		this.engine=eng;
		this.printCar();
		
		
	}
	
	
	

	
	
	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car("new","Tata","Black","123");
		Engine e=new Engine(456,789,"masai");
		e.setTurbo(true);
		System.out.println("has Turbo " +e.getTurbo());
//		Engine e=new Engine();
//		Car.Engine.e.makeTurbo();
		
		
	}
}


