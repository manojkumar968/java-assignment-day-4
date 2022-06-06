package p1;

public class PermanentEmployee extends Employee {

	private double basicPay;

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		double salary = basicPay-(basicPay*0.12);
		setSalary(salary);
		
		
	}
	
	



	@Override
	public String toString() {
		return "PermanentEmployee [basicPay=" + basicPay + ", getEmployeeId()=" + getEmployeeId()
				+ ", getEmployeeName()=" + getEmployeeName() + ", getSalary()=" + getSalary() + "]";
	}





	public PermanentEmployee(int employeeId, String employeeName,double bas) {
		super(employeeId, employeeName);
		this.basicPay=bas;
		
	}
	
	
}
