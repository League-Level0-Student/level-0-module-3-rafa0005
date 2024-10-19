package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areyouhappy {

	public static void main(String[] args) {
	
		String happy = JOptionPane.showInputDialog("are you happy?");
		if(happy .equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
		if(happy .equalsIgnoreCase("no")) {
			String sad = JOptionPane.showInputDialog("Do you want to be happy?");
			if(sad .equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Then try to change something");
		}
			if(sad .equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Then just sulk your entire life");
		}
	}
}
}