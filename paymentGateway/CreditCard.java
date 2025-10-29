package paymentGateway;

import javax.swing.JOptionPane;

public class CreditCard implements Payment{
	public void processPayment(double amount) {
		JOptionPane.showMessageDialog(null, "Paid $" + String.format("%.2f", amount) + " using Credit Card.");
	}
}
