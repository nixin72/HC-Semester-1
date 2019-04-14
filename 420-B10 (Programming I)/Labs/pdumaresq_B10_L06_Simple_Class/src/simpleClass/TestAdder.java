/**
 * 
 */
package simpleClass;

/**
 * @author pdumaresq
 *
 */
import java.util.Scanner;
public class TestAdder
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		NumberAdder adder1, adder2;
		int number1, number2;
		
		System.out.println("Enter two intergers: ");
		number1 = keyboard.nextInt();
	  number2 = keyboard.nextInt();
		
		adder1 = new NumberAdder();
	  adder1.setNum1(number1);
		adder1.setNum2(number2);
	  
	  System.out.println("Enter two more intergers: ");
	 
	  number1 = keyboard.nextInt();
	  number2 = keyboard.nextInt();
	  System.out.println("Adder 1: The sum of " + number1 + " and " + number2 + " is ");
	
	  adder2 = new NumberAdder();
		adder2.setNum1(number1);
		adder2.setNum2(number2);
		System.out.println("Adder 2: The sum of " + number1 + " and " + number2 + " is ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//setNum1(number1);
		
		
		
		
		//Scanner keyboard = new Scanner(System.in);
		//NumberAdder adder1, adder2;
		//int number1, number2;
		
		//System.out.println("Enter two intergers");
		//number1 = keyboard.nextInt();
		//number2 = keyboard.nextInt();
	  
		//setNum1(number1);
		
		
		//System.out.println("Enter two more intergers");
		//number1 = keyboard.nextInt();
		//number2 = keyboard.nextInt();
		
		
		//System.out.println("The sum of " + number1 + " and " + number2 + " is ");
	 
	 
	 
	  //System.out.println("The sum of " + number1 + " and " + number2 + " is ");
		
	}
	
}