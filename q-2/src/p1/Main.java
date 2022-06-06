package p1;

public class Main {

	public static void main(String[] args) {
		
		Loan l=Loan.meth();
		PermanentEmployee pe=new PermanentEmployee(123,"manoj",50000);
		TemporaryEmployee te=new TemporaryEmployee(345,"parveen",500,500);
		System.out.println("loan for PermanentEmployee: "+l.calculateLoanAmount(pe));
		System.out.println(pe);
		System.out.println("============================================");
		System.out.println("loan for TemporaryEmployee: "+l.calculateLoanAmount(te));
		System.out.println(te);
		System.out.println("=====================================================");
		
		double ln=l.calculateLoanAmount(null);
		if(ln==0) {
			System.out.println("put vaild object");
		}

	}

}
