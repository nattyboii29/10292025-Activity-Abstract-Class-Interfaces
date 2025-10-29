package printerInterface;

import javax.swing.JOptionPane;

public class ImagePrinter implements Printable{
	public void print(String content) {
		JOptionPane.showMessageDialog(null, "Printing Image: " + content);
	}
}
