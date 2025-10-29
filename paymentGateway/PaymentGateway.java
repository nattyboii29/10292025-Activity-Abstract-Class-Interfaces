package paymentGateway;

import javax.swing.JOptionPane;

public class PaymentGateway {

	public static void main(String[] args) {
		String method = JOptionPane.showInputDialog("Choose payment method (Credit/GCash): ");
		if (method == null) System.exit(0);
		
		String amountInput = JOptionPane.showInputDialog("Enter amount: ");
		if (amountInput == null) System.exit(0);
		
		double amount = Double.parseDouble(amountInput);
		Payment payment;
		
		if (method.equalsIgnoreCase("credit")) {
			payment = new CreditCard();
		} else if (method.equalsIgnoreCase("gcash")) {
			payment = new Gcash();
		} else {
			JOptionPane.showMessageDialog(null, "Invalid payment method!");
			return;
		}
		
		payment.processPayment(amount);
	}

}
