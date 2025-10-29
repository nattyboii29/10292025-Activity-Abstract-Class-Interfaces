package vehicleSpeedControl;

import javax.swing.JOptionPane;

public class VehicleSpeedControl {

	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		
		String input = JOptionPane.showInputDialog("Enter speed increment: ");
		if (input == null) System.exit(0);
		int increment = Integer.parseInt(input);
		
		car.speedUp(increment);
	}

}
