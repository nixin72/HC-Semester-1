/**
 * 
 */
package pDumaresq_B10_A01_First_Program;

/**
 * @author PDumaresq
 *
 */
import java.util.Scanner;
public class Sphere
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	//declaring my Scanner class and variables
	Scanner keyboard = new Scanner (System.in);
	double r, volume, surfaceArea;
	String unitOfMeasurement;
	
	//explaining what the program does to the user
	System.out.println("This program calculates the surface area and volume of a sphere.");
	System.out.println(""); //printing a blank line
	//prompting for the units of measurement for the sphere
	System.out.println("What are the units of measurement? ");
	unitOfMeasurement = keyboard.next();
	//prompting for the radius of the sphere
	System.out.println("What is the radius? ");
	r = keyboard.nextDouble();
	
	 
	
	//calculating surface area of the sphere
	surfaceArea = 4.0 * 3.14 * Math.pow(r , 2);
	//rounding to the nearest 5 decimal places
	surfaceArea = Math.round(surfaceArea * 100000);
	surfaceArea = surfaceArea/100000;
	//printing out the radius of the sphere
	System.out.println("The surface area of a sphere with a radius of "
			+ r + " " + unitOfMeasurement + " is " + surfaceArea + " square " + unitOfMeasurement);
	
	//calculating the volume of the sphere
	volume = ( 4.0 / 3.0 ) * 3.14 * Math.pow( r , 3 ); 
	//rounding to the nearest 5 decimal places
	volume = Math.round(volume * 100000);
	volume = volume/100000;
	//printing out the surface area of the sphere
	System.out.println("The volume of a sphere with a radius of "
			+ r + " " + unitOfMeasurement + " is " + volume + " cubic " + unitOfMeasurement);
	
	
	
	}

}
