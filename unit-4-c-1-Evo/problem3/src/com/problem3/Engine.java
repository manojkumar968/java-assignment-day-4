package com.problem3;

public class Engine {

	private int rmp;
	private int Power;
	private String manufacturer;
	private Boolean hasTurbo;
	
	void setTurbo(boolean bo) {
		hasTurbo=bo;
	}
	Boolean getTurbo() {
		return hasTurbo;
	}
	
	void printEngine() {
		System.out.println("------Engine Detail-------");
		System.out.println("Rmp "+rmp);
		System.out.println("Power "+Power);
		System.out.println("manufacturer "+manufacturer);
		System.out.println("hasTurbo "+hasTurbo);
	}
	
	
	Engine(int rmp,int power,String manu){
		this.rmp=rmp;
		this.Power=power;
		this.manufacturer=manu;
//		this.hasTurbo=bo;
		this.printEngine();
	}
}
