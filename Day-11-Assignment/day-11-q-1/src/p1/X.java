package p1;

public interface X {

	void meth1();
	default void meth2() {
		System.out.println("default meth1 inside interface X");
	};
	
	static void meth3() {
		System.out.println("static meth3 inside interface X");
	}
}
