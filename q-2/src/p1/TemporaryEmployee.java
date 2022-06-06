package p1;

public class TemporaryEmployee extends Employee {

	private int hoursWorked;
	private int hourlyWages;
	@Override
	public void calculateSalary() {
		int salary = hoursWorked*hourlyWages;
		setSalary(salary);
		
		
	}
	
	

	@Override
	public String toString() {
		return "TemporaryEmployee [hoursWorked=" + hoursWorked + ", hourlyWages=" + hourlyWages + ", getEmployeeId()="
				+ getEmployeeId() + ", getEmployeeName()=" + getEmployeeName() + ", getSalary()=" + getSalary()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



	public TemporaryEmployee(int employeeId, String employeeName ,int hoursWorked ,int hourlyWages ) {
		super(employeeId, employeeName);
		this.hoursWorked=hoursWorked;
		this.hourlyWages=hourlyWages;
		this.calculateSalary();
		
	}
	
	

}
