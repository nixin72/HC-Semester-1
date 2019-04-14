package b10L15;

import java.util.Scanner;

// Class Name:	Lab15A
// Purpose:	This class contains an example of a do while loop. It asks the user
//		to input 5 values and prints the sum and the product of the
//		values.
//
// Input:	number - an integer
// Output:	count - the number of times the loop is executed
//		sum - the sum of the numbers input
//		product - the product of the numbers input
//

public class Lab15A
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int count, number, sum, product, n;

    sum = 0;
    product = 1;
    System.out.println("How many times do you want to repeat the loop?");
    n = input.nextInt();
    System.out.println("Enter " + n + " values, one per line: ");
    count = 0;
    
    
    do
   {
      number = input.nextInt();
      System.out.println("Count is " + count + ". Number is " + number + ".");
      sum += number;
      product *= number;
      ++count;
    } while (count < n);


    System.out.println("The value of count after the loop is " + count);
    System.out.println("The sum is " + sum);
    System.out.println("The product is " + product);
  } // main()
} // Lab15A class
