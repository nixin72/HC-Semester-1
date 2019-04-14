package three_Rs_II;

/**
 * Demonstrate several of the Math library functions
 * 
 * @author Philip Dumaresq
 * @version 1.0
 */

public class L04_Math_class
{
	/**
	 * This method demonstrates how the Math.abs(), Math.ceil(), Math.log(), 
	 * Math.pow(), Math.round() and Math.random() methods work. 
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		int j;
		double x;
		// initialize variables
		j = 25;
		x = 100;

		// Test Math methods
		System.out.println("The square root of " + x + "is " + Math.sqrt(x));
		System.out.println("The floor of " + x + "is " + Math.floor(x));
		System.out.println("The abs method for " + j + " returns " + Math.abs(j));
		System.out.println("The abs method for " + x + " returns " + Math.abs(x));
		System.out.println("The ceil method for " + x + " returns " + Math.ceil(x));
		System.out.println("The log method for " + x + " returns " + Math.log(x));
		System.out.println("The pow ( " + x + ", " + j + ") method returns "
				+ Math.pow(x, j));
		System.out.println("The round method for " + x + " returns "
				+ Math.round(x));
		System.out.println("The random method returns " + Math.random());
	} // main()
} // L04_Math_class class
