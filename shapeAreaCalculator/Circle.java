package shapeAreaCalculator;

public class Circle extends Shape{
	
	double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	double calculateArea() {
		return Math.PI * radius * radius;
	}
	
}
