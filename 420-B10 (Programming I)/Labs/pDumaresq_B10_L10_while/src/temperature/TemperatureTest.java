package temperature;

import java.util.Scanner; // Import the Java I/O classes
import java.text.NumberFormat; //import NumberFormat classes
/**
 * Title:        TemperatureTest class
 * Description:	 A driver class to test the Temperature class and to demonstrate 
 *               the NumberFormat class and printf() statement.
 * Copyright:    Copyright (c) 2013
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */
public class TemperatureTest
{
	
	public static void main(String[] argv)
	{
		Scanner input = new Scanner(System.in);
		NumberFormat fixed = NumberFormat.getInstance();
		
		Temperature temperature = new Temperature(); // Create a Temperature object
		double tempIn, tempResult = 0;
		char tempType, newType = 'U';

		System.out
				.println("This program will convert Fahrenheit to Celsius and vice versa.");
		System.out.print("Input a temperature > "); // Prompt for temperature
		tempIn = input.nextDouble(); // Get user input and convert to double
		System.out
				.print("What type of temperature do you want to convert? (F for Fahrenheit or C for Celsius) > "); // Prompt for temperature type
		String inString = input.next(); // Get user input
		inString = inString.toUpperCase(); // convert input to upper case
		tempType = inString.charAt(0); // convert to char
		if (tempType == 'F')
		{
			tempResult = temperature.fahrToCels(tempIn); // Convert to Celsius
			newType = 'C';
		} // if (tempType == 'F')
		else
			if (tempType == 'C')
			{
				tempResult = temperature.celsToFahr(tempIn); // Convert to Fahrenheit
				newType = 'F';
			} // if (tempType == 'C')
		if (tempType == 'C' || tempType == 'F')
			System.out.println(fixed.format(tempIn) + " degrees " 
					+ tempType + " is " + fixed.format(tempResult) 
					+ " degrees " + newType);  // Report the result 

		else
		{
			System.err.println(tempType
					+ " is an invalid temperature type. Program will end.");
			System.exit(-1);
		}
	} // main()
} // TemperatureTest
