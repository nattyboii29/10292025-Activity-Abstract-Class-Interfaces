package onlineOrderSystem;

import javax.swing.JOptionPane;

public class OnlineOrder implements Order{
	@Override
	public void placeOrder(String itemName) {
		JOptionPane.showMessageDialog(null, "Online order placed for: " + itemName);
	}
}
