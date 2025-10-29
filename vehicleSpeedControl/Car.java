package vehicleSpeedControl;

import javax.swing.JOptionPane;

public class Car implements Vehicle {
	int speed = 0;
	
	@Override
	public void start() {
		JOptionPane.showMessageDialog(null, "Car started.");
	}
	
	@Override
	public void speedUp(int increment) {
		speed += increment;
		JOptionPane.showMessageDialog(null, "Car Speed: " + speed + " km/h");
	}
}
