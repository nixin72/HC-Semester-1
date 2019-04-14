/**
 * 
 */
package usingEclipse;

/**
 * @author Philip Dumaresq
 *
 */
import java.util.Scanner;
public class Message // Message Class
{

	/**
	 * @param args
	 */
	public static void main(String[] args) // main()
	
	{
		Scanner keyboard = new Scanner (System.in);
		String name;
		System.out.println("What is your name? ");
		name = keyboard.nextLine();
		String greeting;
		greeting = "hello ";
		System.out.println(greeting + name);
		System.out.println("Goodbye " + name);
	}

}
