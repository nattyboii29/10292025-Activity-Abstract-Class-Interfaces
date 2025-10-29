package employmentPaymentSystem;

public abstract class Employee {

	String name;
	double ratePerHr;
	double hours;
	
	Employee (String name, double ratePerHr, double hours) {
		this.name = name;
		this.ratePerHr = ratePerHr;
		this.hours = hours;
	}
	
	abstract double calculatePay();
}
