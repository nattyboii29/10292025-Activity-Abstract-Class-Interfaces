package applianceControlSystem;

import javax.swing.JOptionPane;

public class Light implements Appliance{
	public void turnOn() {
		JOptionPane.showMessageDialog(null, "Light is now On!");
	}
	public void turnOff() {
		JOptionPane.showMessageDialog(null, "Light is now Off!");
	}
	
}
