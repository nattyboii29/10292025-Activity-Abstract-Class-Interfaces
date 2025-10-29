package employmentPaymentSystem;

public class PartTimeEmployee extends Employee{
	PartTimeEmployee(String name, double ratePerHr, double hours){
		super(name, ratePerHr, hours);
	}
	
	@Override
	double calculatePay() {
		return (ratePerHr * hours) * 0.8;
	}
}
