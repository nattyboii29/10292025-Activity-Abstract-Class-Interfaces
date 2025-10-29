package studentGradingSystem;

import javax.swing.JOptionPane;

public class GradingSystem {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter 3 grades: ");
		if (input == null) System.exit(0);
		
		String[] parts = input.split(" ");
		if (parts.length != 3) {
			JOptionPane.showMessageDialog(null, "Please enter exactly 3 grades separately by spaces.");
			return;
		}
		
		double[] grades = new double[3];
		for (int i = 0; i < 3; i++) {
			grades[i] = Double.parseDouble(parts[i]);
		}
		
		Student student = new CollegeStudent();
		double average = student.calculateAverage(grades);
		
		JOptionPane.showMessageDialog(null, "Average = " + String.format("%.1f", average));
	}

}
