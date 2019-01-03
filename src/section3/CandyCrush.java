package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	private static final char[] name = null;
	private static String Stringname;

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
Stringname = JOptionPane.showInputDialog("Who do you not like?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on name");
		// 3. Ask the user for the name of their best friend
		JOptionPane.showMessageDialog(null, "Your best friend is as sweet as candy\n" + 
				"");
		// 4. Tell them their best friend is as sweet as candy

	} 
}



