package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class adventure {
public static void main(String[] args) {
	String world = JOptionPane.showInputDialog("What type of the following worlds do you want: "
			+ "Plain (1), Desert (2), Forest (3) Arctic (4)");
	int label = Integer.parseInt(world);
	
	
	if(label == 1) {
		JOptionPane.showMessageDialog(null, "You have been eaten by a lion");
	}
	if(label == 2) {
		JOptionPane.showMessageDialog(null, "You have been scorched to death");
}
	if(label == 3) {
		JOptionPane.showMessageDialog(null, "You have been eaten by a bear");
}
	if(label == 4) {
		JOptionPane.showMessageDialog(null, "You have froze to death");
}
}
}
















































