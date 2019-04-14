package whileLoop;

import java.util.Scanner;

/**
 * Title:        Validator class
 * Description:  Verify that a number that is entered is valid.
 * Copyright:    Copyright (c) 2013
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */
public class Validator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int number;

		System.out.println("Enter a number between 0 and 100: ");
		number = input.nextInt();
		while(number >=100 || number <= 0)
		{
			System.out.println(number + " is not between 0 and 100");
			System.out.println("Please Re-enter: ");
			number = input.nextInt();
		} // while loop
		System.out.println(number + " is valid. Thank-you");
	} // main
} // Validator class