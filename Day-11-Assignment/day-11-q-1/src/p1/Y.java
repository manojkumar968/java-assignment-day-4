package p1;

public interface Y {

	void meth11();
	default void meth12() {
		System.out.println("default meth12 inside interface Y");
	}
	static void meth13() {
		System.out.println("static meth13 inside interface Y");
	}
}
