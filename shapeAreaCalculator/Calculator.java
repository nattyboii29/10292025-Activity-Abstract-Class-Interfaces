package shapeAreaCalculator;

import javax.swing.JOptionPane;

public class Calculator {

	public static void main(String[] args) {
		
		String shapeType = JOptionPane.showInputDialog("Enter shape (circle/rectangle): ");
		Shape shape = null;
		
		if (shapeType == null) {
			System.exit(0);
		} else if (shapeType.equals("circle")) {
			double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius: "));
			shape = new Circle(radius);	
		} else if (shapeType.equals("rectangle")) {
			double length = Double.parseDouble(JOptionPane.showInputDialog("Enter length: "));
			double width = Double.parseDouble(JOptionPane.showInputDialog("Enter width: "));
			shape = new Rectangle(length, width);
		} else {
			JOptionPane.showMessageDialog(null, "Invalid shape type!");
			System.exit(0);
		}
		
		double area = shape.calculateArea();
		JOptionPane.showMessageDialog(null, "Area = " + area);
		
	}

}
