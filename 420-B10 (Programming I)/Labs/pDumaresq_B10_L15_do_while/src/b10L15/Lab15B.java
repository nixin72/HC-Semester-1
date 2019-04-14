package b10L15;
import java.util.Scanner;

// Class Name:	Lab15B
// Purpose:		This class asks the user to input an unknown number of
//			values and prints the sum and the product of the values.
//
// Input:		number - an integer
// Output:		count - the number of times the loop is executed
//			sum - the sum of the numbers input
//			product - the product of the numbers input
//

public class Lab15B
{
  private static final int SENTINEL = -999;

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double count, number, sum, product;
    sum = 0;
    product = 1;
    count = 0;
    System.out.println("Enter an integer (-999 to end): ");
    number = input.nextInt();

    while (number != -999)
    {
      ++count;
      System.out.println("Count is " + count + ". Number is " + number + 
                         ".");
      sum += number;
      product *= number;
      System.out.println("Enter an integer (-999 to end): ");
      number = input.nextInt();
    }
    double average = (sum / count) * 100.00 / 100.00;
    
    System.out.println();
    System.out.println("The value of count after the loop is " + count + 
                       ".");
    System.out.println("The last number read is " + number + ".");
    System.out.println("The sum is " + sum + ".");
    System.out.println("The product is " + product + ".");
    System.out.println("The average is " + average + ".");
  } // main()
}	// Lab15B class
