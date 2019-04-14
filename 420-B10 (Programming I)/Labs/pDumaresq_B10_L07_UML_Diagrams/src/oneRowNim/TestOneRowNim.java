/**
 * 
 */
package oneRowNim;

/**
 * @author pdumaresq
 *
 */
import java.util.Scanner;
public class TestOneRowNim
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		OneRowNim game = new OneRowNim();
		game.startGame(7);
		
		System.out.println("At the start of the game, there are " + game.getNumSticks() + " sticks.");
				
		System.out.println("It is player " + game.getPlayer() + "'s turn.");
		/*game.takeThree();
		 * Before The code got changed
		 */
		System.out.println("How many sticks do you want to take?");
		game.numSticks = keyboard.nextInt();
		System.out.println("There are now " + game.getNumSticks() + " sticks.");
		
		System.out.println("It is player " + game.getPlayer() + "'s turn.");
		/*game.takeOne();
		 * before The code got changed
		 */
		System.out.println("How many sticks do you want to take?");
		game.numSticks = keyboard.nextInt();
		System.out.println("There are now " + game.getNumSticks() + " sticks.");

		System.out.println("It is player " + game.getPlayer() + "'s turn.");
		/*game.takeOne();
		 * Before The code got changed
		 */
		System.out.println("How many sticks do you want to take?");
		game.numSticks = keyboard.nextInt();
		System.out.println("There are now " + game.getNumSticks() + " sticks.");

		System.out.println("It is player " + game.getPlayer() + "'s turn.");
		/*game.takeTwo();
		 * Before The code got changed
		 */
		System.out.println("How many sticks do you want to take?");
		game.numSticks= keyboard.nextInt();
		System.out.println("There are now " + game.getNumSticks() + " sticks.");

		return isGameOver();
	
	
	
	
	
	}

}
