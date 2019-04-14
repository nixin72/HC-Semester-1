package whileLoop;

import java.util.Scanner;

/**
 * Title:        WhileExample class
 * Description:	 Demonstrate the operation of the while. 
 * Copyright:    Copyright (c) 2013
 * Company:      Heritage College
 * @author Anne Hamilton
 * @version 1.0
 */
public class WhileExample
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number;
		int count = 0;
		System.out.println("Enter 5 values, one per line ");
		while (count < 5)
		{
			number = input.nextInt();
			System.out.println("Count is " + count + " Number is " + number);
			++count;
		} // while
		System.out.println("The value of count after the loop is " + count);
		input.close();
	} // main()
} // WhileExample class
