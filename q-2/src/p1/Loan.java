package p1;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
//			System.out.println(employeeObj.getSalary());
			return employeeObj.getSalary()*0.15;
		}
		else if(employeeObj instanceof TemporaryEmployee) {
			return employeeObj.getSalary()*0.10;
		}
		else {
			return 0;
		}
	}
	
	private Loan(){
		
	}
	
	static Loan meth() {
		return new Loan();
	}
}
