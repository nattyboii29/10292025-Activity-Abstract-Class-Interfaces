package employmentPaymentSystem;

public class FullTimeEmployee extends Employee{
	FullTimeEmployee(String name, double ratePerHr, double hours){
		super(name, ratePerHr, hours);
	}

	@Override
	double calculatePay() {
		return  ratePerHr * hours;
	}
}
