package three_Rs_II;

/**
 * Demonstrate integer overflow and underflow
 * 
 * @author Philip Dumaresq 
 * @version 1.0
 */

public class L04_Numeric_Data_Types
{
	/**
	 * This method will add one to the largest possible integer to  
	 * what happens when an integer overflows the space allocated to it. 
	 * 	  
	 * @param args
	 */
	public static void main(String[] args)
	{
		long i = 2147483647;					//declaring 
		int j = Integer.MIN_VALUE;	 //variables
		// Example of Overflow
		System.out.println("Adding 1 to 2147483647 for an int gives " + (i + 1));
		System.out.println("The smallest int value is " + j);
		System.out.println("Subracting 1 from 2147483647 is " + (1 - j)); 
	} // main()
} // L04_Numeric_Data_Types
