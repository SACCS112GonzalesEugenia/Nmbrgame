import java.text.NumberFormat;
import java.util.Scanner;

public class nmbrGameHWAAE {
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
//integers
	
	int userNum = 0;
	int compNum = 0;
	int goodGuesses = 0;
	int badGuesses = 0;
	int count = 0;
	int round = 1;
	int again = 0;
	float roundPer = 0;
	float gamePer = 0;
	
	System.out.println("You will have 3 tries per round to guess a number from 1 to 10");
	
	
	
		do {
		System.out.printf("Round %d\n",round);
		
		for (int i = 0; i < 3; i++) {
		System.out.printf("Game %d: ",(i + 1));
		userNum = input.nextInt();
		compNum = 1 + (int) (Math.random() * 10);
			
		if (userNum == compNum) {
		System.out.println("You win!");
		goodGuesses++;
		} if (userNum != compNum) {
		System.out.println("Sorry, try again");
		badGuesses++;
		}
		count++;
		}
				
		System.out.printf("Your number of correct guesses: %d\n",goodGuesses);
				
		System.out.printf("Your number of incorrect guesses: %d\n",badGuesses);
				
		roundPer = (float) ((goodGuesses * 100) / 3);
				
		System.out.print("Your guess percentage for round " + round + " is " + roundPer + "%\n");
		round++;
				
		gamePer = (float) ((goodGuesses * 100) / count);
		System.out.print("Your overall guess percentage is " + gamePer + "%\n");
				
		System.out.printf("Would you like to play again? Yes = 1, No = 2 \n");
		again = input.nextInt();
				
		if (again == 0) {
		System.out.println("Thanks for playing");
		}
		
		} while(again == 1);
		
		}
}
	
	