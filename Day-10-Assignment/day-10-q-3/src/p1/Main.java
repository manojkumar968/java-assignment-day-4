package p1;

public class Main {

	public static void main(String[] args) {
		//Q3) Explain abstract class and interface with an example.
		
		// Ans:- 1) important point of abstract class
		// a.    in abstract class we can not use multiple inheritance 
		// b.    abstract class allow 0 to upto 100% abstraction
		// c.    in abstraction class we can assign both abstract method and non abstract method(method with body)
		// d.    in abstract class we can assign public,static,default members
		
		//       abstract class explain in examples-1
		
		
		
		// 2)  important point of interface
		// a.  in interface we can use multiple inheritance
		// b.  interface allow 100% abstraction
		// c.  in interface we can only assign public abstract method but in JDK 8 we can assign default method and also static method
		// d.  in interface we can assign only public final data variable
		
		//     interface explain in example-2
		
		
		
		
		
		

	}
	
	// Example-1
	
	
	abstract class Animal{
		String type;
		
		public abstract void eat();
		
		void slip() {
			System.out.println("animals slips");
		}
	}
	
	class Dog extends Animal{

		@Override
		public void eat() {
			
			System.out.println("dog eats bread");
		}
		
	}
	
	
	
	// Example-2
	
	interface Hotel{
		public final int num=100;
		void chickenBiryani();
		void masalaDosa();
		default void drinkingWater() {
			System.out.println("drinking water from hotel");
		}
		static void mask() {
			System.out.println("mask form hotel side");
		}
	}
	
	interface hot2{
		void offer();
	}
	
	class TajHotel implements Hotel,hot2{

		@Override
		public void offer() {
			System.out.println("offer from TajHotel");
			
		}

		@Override
		public void chickenBiryani() {
			System.out.println("chicken biryani from TajHotel");
			
		}

		@Override
		public void masalaDosa() {
			System.out.println("masa dosa from TajHotel");
			
		}
		
	}

}
