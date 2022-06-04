package p1;

public class ZImpl implements Z{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("meth1 inside class ZImpl");
		
	}

	@Override
	public void meth11() {
		// TODO Auto-generated method stub
		System.out.println("meth11 inside class ZImpl");
		
	}

	@Override
	public void meth21() {
		// TODO Auto-generated method stub
		System.out.println("meth21 inside class ZImpl");
		
	}
	
	public static void main(String[] args) {
		ZImpl zimp=new ZImpl();
		zimp.meth1();
		zimp.meth2();
		zimp.meth11();
		zimp.meth12();
		zimp.meth21();
		X.meth3();
		Y.meth13();
	}
	
	

}
