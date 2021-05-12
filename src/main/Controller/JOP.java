package main.Controller; // JOP Class in charge of all JOP.in and JOP.msg pop ups.

import javax.swing.JOptionPane;

public class JOP {

	public static void msg(String msg) { // Method in charge of messages in pop ups.
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static String in(String msg) { // Method in charge of message along with String input value. 
		return JOptionPane.showInputDialog(msg);
	}
}
