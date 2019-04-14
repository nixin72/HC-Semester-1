/**
 * 
 */
package b10_l14_for_loops;

/**
 * @author pdumaresq
 *
 */
import java.util.Scanner;
public class TestAccumulator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Accumulator accumulator = new Accumulator();
		int n, n1, n2;
		int x = 0;
		System.out.print("Enter number of numbers (-1 to end): ");
		n = input.nextInt();
		
		while (n != -1) {
		System.out.println("The sum of 1 to " + n + " = "
				+ accumulator.accumulateSum(n));
		System.out.print("Enter number of numbers (-1 to end): ");
		
		n = input.nextInt();
		}
		
		System.out.print("\nEnter the first number to sum: ");
		n1 = input.nextInt();
		System.out.print("Enter the second number to sum: ");
		n2 = input.nextInt();
		System.out.print("The sum of all numbers between " + n1 + " and "
				+ n2 + " is " + accumulator.accumulateSum(n1 , n2));
		
		System.out.println("\n\nThe average of all integers between " + n1 + " and "
				+ n2 + " is " + (n1 + n2) / 2.0);
		
		System.out.println("*** End of TestAccumulator ***");
	}
}