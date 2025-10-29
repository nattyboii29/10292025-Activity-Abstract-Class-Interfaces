package employmentPaymentSystem;

import javax.swing.JOptionPane;

public class PaymentSystem {

	public static void main(String[] args) {
		
		String type = JOptionPane.showInputDialog("Enter Employee Type (Full/Part): ");
		if (type == null) {System.exit(0);
		}
		
		String input = JOptionPane.showInputDialog("Enter name, rate/hour, and hours: ");
		if (input == null) System.exit(0);
		
		String[] parts = input.split(" ");
		if(parts.length < 3) {
			JOptionPane.showMessageDialog(null, "Invalid input format!");
			System.exit(0);
		}
		
		String name = parts[0];
		double rate = Double.parseDouble(parts[1]);
		double hours = Double.parseDouble(parts[2]);
		
		Employee emp;
		
		if (type.equalsIgnoreCase("full")) {
			emp = new FullTimeEmployee(name, rate, hours);
		} else if (type.equalsIgnoreCase("part")) {
			emp = new PartTimeEmployee(name, rate, hours);
		} else {
			JOptionPane.showMessageDialog(null, "Invalid employee type!");
			return;
		}
		
		double pay = emp.calculatePay();
		JOptionPane.showMessageDialog(null, "Employee Name: " + name + "\nPay: " + String.format("%.2f", pay));
	}
	
	

}
