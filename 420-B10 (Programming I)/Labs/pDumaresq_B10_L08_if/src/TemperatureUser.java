/* Title:         Lab7c.java
 * Description:   This program demonstrates a compound if statement
 */

import java.util.Scanner;

public class TemperatureUser
{
	public static void main(String args[])
	{
		// Local variables
		Scanner sc = new Scanner(System.in);
		String inputString;
		double temp;
		char units;

		// Objects
		Temperature weather = new Temperature();

		System.out.print("Enter the temperature to be converted: ");
		temp = sc.nextDouble();
		System.out.print("Enter an F if the temperature is in Fahrenheit"
				+ ", a C if the temperature is in Celsius "
				+ "or a K if the temperature is in Kelvin: ");
		inputString = sc.next();
		units = inputString.charAt(0); // convert String to char
		units = Character.toUpperCase(units); // convert input to uppercase

		weather.setTemperature(temp, units);
		System.out.println(weather.getTemperature() + " degrees "
				+ weather.getUnits() + " is equal to "
				+ weather.getConvertedTemperature() + " degrees "
				+ weather.getConvertedUnits());
	} // main method
} // Lab7c class

