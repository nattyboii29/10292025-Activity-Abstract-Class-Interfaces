package printerInterface;

import javax.swing.JOptionPane;

public class TextPrinter implements Printable{
	public void print (String content) {
		JOptionPane.showMessageDialog(null, "Printing Text: " + content);
	}
}
