package onlineOrderSystem;

import javax.swing.JOptionPane;

public class OrderSystem {

	public static void main(String[] args) {
		String orderType = JOptionPane.showInputDialog("Order type (online/phone): ");
		if (orderType == null) System.exit(0);
		
		String itemName = JOptionPane.showInputDialog("Enter item name: ");
		if (itemName == null) System.exit(0);
		
		Order order;
		
		if (orderType.equalsIgnoreCase("online")) {
			order = new OnlineOrder();
		} else if (orderType.equalsIgnoreCase("phone")) {
			order = new PhoneOrder();
		} else {
			JOptionPane.showMessageDialog(null, "Invalid order type!");
			return;
		}
		
		order.placeOrder(itemName);
	}

}
