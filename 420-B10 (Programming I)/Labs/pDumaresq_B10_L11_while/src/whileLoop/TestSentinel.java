package whileLoop;

import java.util.Scanner;

/**
 * Title:        TestSentinel class
 * Description:	 Demonstrate how a sentinel can be used to end a loop.
 * Copyright:    Copyright (c) 2013
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */

public class TestSentinel
{
	public static final int SENTINEL = -1;

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number;
		Accumulator collection = new Accumulator();

		System.out.println("Enter one value per line (-999 to end).");
		number = input.nextInt();
		while (number != SENTINEL)
		{
			System.out.println("Count is " + collection.getCount() + " Number is "
					+ number);
			collection.updateAccumulators(number);
			number = input.nextInt();
		} // while loop
		System.out.println("The value of count after the loop is "
				+ collection.getCount());
		System.out.println("The sum is " + collection.getSum());
		System.out.println("The product is " + collection.getProduct());
		if (collection.getCount() > 0)
			System.out.println("the average is " + collection.getAverage());
		else
			System.out.println("The average is undefined");
	} // main()
} // TestSentinel class
