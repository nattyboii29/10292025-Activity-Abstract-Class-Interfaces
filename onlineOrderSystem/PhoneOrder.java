package onlineOrderSystem;

import javax.swing.JOptionPane;

public class PhoneOrder implements Order{
	@Override
	public void placeOrder(String itemName) {
		JOptionPane.showMessageDialog(null, "Phone order placed for: " + itemName);
	}
}
