/**
 * 
 */
package simpleClass;

/**
 * @author pdumaresq
 *
 */
import java.util.Scanner;

public class TemperatureUser
{
	//uses the Temperature class to convert from Celsius to Fahrenheit and vice versa.
	/**
	 * @param args
	 */

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		//declaration of variables		
		Temperature fahr;
		Temperature cels;
		double fahrTemperature;
		fahr = new Temperature();
		cels = new Temperature();

		fahr.setFahrenheit(212);
		cels.setCelsius(20);

		// print the Fahrenheit temperature for fahr
		System.out.println("fahr object: ");
		System.out.print("\tfahrenheit: ");
		System.out.println(fahr.getFahrenheit());
		// print the Fahrenheit temperature for cels
		System.out.print("\tCelsius: ");
		System.out.println(fahr.getCelsius());

		System.out.println();

		// print the celsius temperature for cels
		System.out.println("cels object: ");
		System.out.print("\tcelsius: ");
		System.out.println(cels.getCelsius());
		// print the Fahrenheit temperature for cels
		System.out.print("\tFahrenheit: ");
		System.out.println(cels.getFahrenheit());

		System.out.println();

		//printing out a fahrenheit temperature
		System.out.println("Enter a Fahrenheit temperature: ");

		fahrTemperature = keyboard.nextDouble();
		fahr.setFahrenheit(fahrTemperature);

		System.out.println("fahr object: \n Fahrenheit: " + fahr.getFahrenheit() + "\n Celsius: "
				+ cels.getCelsius());

	}

}
