package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String water = JOptionPane.showInputDialog("Is being dehydrated good?");
				// 3.  Use an if statement to check if their answer is correct
				if (water.equals("no")) {
					 JOptionPane.showMessageDialog(null, "Good. I hope you are hydrated!");
					// 4.  if the user's answer was correct, add one to their score 
					score += 1;
				}
				else {
				JOptionPane.showMessageDialog(null, "Wrong. Drink a cup of water right now.");
				score -= 1;
				}
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String type = JOptionPane.showInputDialog("Should you learn how to type?");
		if (type.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You are two steps ahead of most kids.");
			score += 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Do you even have a computer?!");
			score -= 1;
		}
			
		String life = JOptionPane.showInputDialog("What country has the highest life expectancy?");
				if (life.equals("Hong Kong")) {
					JOptionPane.showMessageDialog(null,"Wow. Correct!");
					score += 1;
				}
				else {
					JOptionPane.showMessageDialog(null, "Wrong.");
					score -= 1;
				}

		// After all the questions have been asked, tell the user their final score 
		
	}
}
