package applianceControlSystem;

import javax.swing.JOptionPane;

public class Fan implements Appliance{
	public void turnOn() {
		JOptionPane.showMessageDialog(null, "Fan is now On!");
	}
	public void turnOff() {
		JOptionPane.showMessageDialog(null, "Fan is now Off!");
	}
}
