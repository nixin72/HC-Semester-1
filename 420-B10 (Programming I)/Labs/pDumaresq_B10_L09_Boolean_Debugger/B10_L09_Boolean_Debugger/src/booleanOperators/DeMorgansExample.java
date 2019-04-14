package booleanOperators;

import java.util.Scanner;

public class DeMorgansExample
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter gender (M or F): ");
		char gender = keyboard.next().charAt(0);
		gender = Character.toUpperCase(gender);
		if (gender != 'F' && gender != 'M')
		{
			System.err.println(gender
					+ " is an invalid gender. The program will end now.");
			System.exit(0);
		} // if
		System.out.println("You entered a valid gender.");
		
		System.out.print("\nEnter age: ");
		int age = keyboard.nextInt();
		if (age < 18 || age > 65)
			System.out.println("You get a discount");
		
	} // main()

} // DeMorgansExample class
