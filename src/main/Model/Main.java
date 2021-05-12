package main.Model;

import main.Controller.JOP;
import main.View.Sound;

public class Main { // Main class that boots the program up.

	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception { // Main method to run the program.
		// TODO Auto-generated method stub
		Sound sound = new Sound("resources/horror.wav");

		JOP.msg("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n"
				+ "<html><font face='MonoSpace' size='20' color='red'>THE MAZE OF TERROR \r\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		JOP.msg("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n"
				+ " Game Intructions: Escape the maze of terror before the Minotaur strikes! \r\n"
				+ "-> \u2666 : Exit \n" + "-> \u2665 : Player \n" + "-> \u2660 : Minotaur \n" + "-> \u2663 : Spiders \n"
				+ "-> ~} : Sword (Find and use the Sword to kill the Minotaur and win!) \n"
				+ "->Press e, m, or h to refresh the maze. \n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		String s = JOP.in("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n"
				+ " Please select the difficulty level \r\n" + "->Easy (e) (\u2660)\n" + "->Medium (m) (\u2660 \u2660)\n"
				+ "->Hard (h) (\u2660 \u2660 \u2660)\n"
				+ "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		if (s != null && !s.equalsIgnoreCase("e") && !s.equalsIgnoreCase("m") && !s.equalsIgnoreCase("h")) {
			s = "e";
		}
		World obj = new World(s);

		
	}

}
