/**
 * 
 */
package three_Rs_II;

/*
 * //this program illustrates how the cast operator works.
 * @author Philip Dumaresq
 *
 */
import java.util.Scanner;
public class CastingDemo
{

	/**
	 * This method demonstrates:
	 * How casting can be used to solve problems with integer divison
	 * what happens when a real number is cast to an integer
	 * and how a char is coded as an interger.
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		
		double myDouble;
		int doubleInt;
		int firstNum = 5, secondNum = 6, thirdNum = 10;
		double newNum;
		char ch = 'p';

		System.out.println("myDouble");
		myDouble = keyboard.nextDouble();
				
		doubleInt = (int)myDouble; 
		
		
		System.out.println("the 'myDouble' variable is equal to " + myDouble + 
				" and the doubleInt variable is equal to " + doubleInt);
		
		newNum = (double) firstNum / secondNum * thirdNum;
		System.out.println("The answer to " + firstNum + "/" 
				+ secondNum + "*"+ thirdNum + " is " + newNum);
		
		System.out.println(doubleInt = (int)ch);
	}

}
