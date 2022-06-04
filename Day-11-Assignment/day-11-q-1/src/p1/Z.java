package p1;

public interface Z extends X,Y{

	void meth21();
//	
	public default void meth2() {
		System.out.println("default method of interface X Override in Z interface");
	}
}
