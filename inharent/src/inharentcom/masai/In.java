package inharentcom.masai;

public class In {

	@Override
	public String toString() {
		
		return "manoj";
	}
	void print() {
		System.out.println("hello");
	}
	void doSomething(Animal a) {
		if(a instanceof Dog) {
			Dog d=(Dog)a;
			d.speak();
		}
	}
	public static void main(String[] args) {

//		Animal a=new Dog();
		In i=new In();
		i.print();
		System.out.println(i);
		System.out.println(i.toString());
		Animal a=new Animal();
		i.doSomething(a);
		
	}

}

class Animal {
	String name="Animal";
	void eat() {
		System.out.println("animal is eating");
	}
}

class Dog extends Animal {
	String name="Animal";
	@Override
	void eat() {
		System.out.println("Dod is eating bread");
	}

	void speak() {
		System.out.println("dog speak loud");
	}
	
}

//class Cat extends Dog{
//	String clas="Cat";
//	@Override
//	void move() {
//		System.out.println("Cat can jump");
//		 System.out.println("normal clas "+clas);
//		 System.out.println("super.clas "+super.clas);
//	}
//}
