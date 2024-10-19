
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int randomnumber = new Random().nextInt(101);
		
		// 2. Print out the random variable above
		System.out.println(randomnumber);
		// 11. Repeat steps 1 to 10 10 times
		
		for(int i=0; i < 10; i++ ) {
		
	
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String save = JOptionPane.showInputDialog("Guess a number");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int label = Integer.parseInt(save);
			// 5. if the guess is correct
			if(label == randomnumber){
				JOptionPane.showMessageDialog(null, "YOU WIN!");
				System.exit(0);
			}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			
			// 7. if the guess is high
			if(label > randomnumber) {
				JOptionPane.showMessageDialog(null, "your guess is too high");
			}
				// 8. Tell them it's too high
			// 9. if the guess is low
			if(label < randomnumber) {
				JOptionPane.showMessageDialog(null, "your guess is too low");
			}
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}
}


