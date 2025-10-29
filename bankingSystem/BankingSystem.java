package bankingSystem;

import javax.swing.JOptionPane;

public class BankingSystem {

	public static void main(String[] args) {
		BankAccount account = new SavingsAccount();
		
		String transType = JOptionPane.showInputDialog("Enter transaction type (deposit/withdraw): ");
		if (transType.equalsIgnoreCase("deposit")) {
			String depInput = JOptionPane.showInputDialog("Enter deposit amount: ");
			double depAmount = Double.parseDouble(depInput);
			account.deposit(depAmount);
		} else if (transType.equalsIgnoreCase("withdraw")) {
			String withInput = JOptionPane.showInputDialog("Enter withdraw amount: ");
			double withAmount = Double.parseDouble(withInput);
			account.withdraw(withAmount);
		} else {
			JOptionPane.showMessageDialog(null, "Invalid Transaction Type!");
		}
	}
}
