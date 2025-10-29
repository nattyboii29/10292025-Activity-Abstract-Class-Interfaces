package bankingSystem;

import javax.swing.JOptionPane;

public class SavingsAccount implements BankAccount{
	private double balance = 0;
	
	public void deposit (double amount) {
		balance += amount;
		JOptionPane.showMessageDialog(null, String.format("Deposited: %.2f \nBalance: %.2f", amount, balance));
	}
	
	public void withdraw(double amount) {
		if (amount > balance ) {
			JOptionPane.showMessageDialog(null, "Insufficient Balance!");
		} else {
			balance -= amount;
			JOptionPane.showMessageDialog(null, String.format("Withdrew: %.2f \nBalance: %.2f", amount, balance));
		}
	}

}
