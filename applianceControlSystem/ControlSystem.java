package applianceControlSystem;

import javax.swing.JOptionPane;

public class ControlSystem {

	public static void main(String[] args) {
		String choice = JOptionPane.showInputDialog("Choose appliance (fan/light): ");
		Appliance appliance;
		
		if (choice.equalsIgnoreCase("fan")) {
			appliance = new Fan();
		} else {
			appliance = new Light();
		}
		
		appliance.turnOn();
		appliance.turnOff();
	}

}
