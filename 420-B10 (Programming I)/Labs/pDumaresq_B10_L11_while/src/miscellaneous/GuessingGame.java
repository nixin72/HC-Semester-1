package miscellaneous;

import java.util.Scanner;

public class GuessingGame
{
	public static void main(String[] args)
	{
		//declarations
		Scanner kb = new Scanner(System.in);
		char letter = (char) ((int) 'a' + (int) (Math.random() * 26));
		char again = 'Y';
		again = Character.toUpperCase(again);
		System.out
				.println("I have picked a letter between a and z. What do you think it is? ");
		char guess = kb.next().charAt(0);
		String direction;

		while (again == 'Y')
		{

			//while loop for individual game
			while (guess != letter)
			{
				if (Character.getNumericValue(guess) > Character
						.getNumericValue(letter))
					direction = "before";
				else
					direction = "after";
				System.out.println("Sorry - you are wrong. The letter is " + direction
						+ " " + guess + " in the alphabet. " + "Guess again.");

				guess = kb.next().charAt(0);

			} //end while
			System.out.println("Congratulations! You guessed it!");
			System.out.println("Do you want to continue playing?");
			again = kb.next().charAt(0);
		}
	} // main()
} // GuessingGame class