/**
 * Title:        StringComparer
 * Description:  This program demonstrates a String comparison
 * Copyright:    Copyright (c) 2002
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */

import java.util.Scanner;

public class StringComparer
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String word;

		System.out.print("Enter a word: ");
		word = sc.next();

		if (word.equalsIgnoreCase("hello"))
			System.out.println("Hello yourself");
		else
			if (word.equals("goodbye"))
				System.out.println("See you later");
			else
				System.out.println("What's up?");

	} // main
} // StringComparer class

