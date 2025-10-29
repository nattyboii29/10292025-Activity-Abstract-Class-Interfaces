package printerInterface;

import javax.swing.JOptionPane;

public class Printer {

	public static void main(String[] args) {
		String type = JOptionPane.showInputDialog("Choose printer (text/image): ");
		String content = JOptionPane.showInputDialog("Enter content: ");
		
		Printable printer;
		
		if (type.equalsIgnoreCase("text")) {
			printer = new TextPrinter();
		} else {
			printer = new ImagePrinter();
		}
		
		printer.print(content);
	}

}
