package getInterestRate;

public class Main {

	public static void main(String[] args) {
		
		Bank b=new SBI();
		System.out.println(b.getRateOfInterest());
		Bank b2=new ICICI();
		System.out.println(b2.getRateOfInterest());
		Bank b3=new AXIS();
		System.out.println(b3.getRateOfInterest());
	}
}
