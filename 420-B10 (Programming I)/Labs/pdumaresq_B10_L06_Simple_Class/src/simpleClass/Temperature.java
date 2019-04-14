package simpleClass;
/**
* <p>Course:	420-B10 Programming I</p>
* <p>Lab 6:	Defining a simple class</p>
* <p>Description: represents a Temperature in both Celsius and Fahrenheit.</p>
* @author pDumaresq 
*/
public class Temperature
{
	/** The Celsius value of the temperature */
	private double celsius;

	/** The fahrenheit value of the temperature */
	private double fahrenheit;

	
	/** Assign a Celsius temperature and calculate the Fahrenheit 
	 * temperature for the object 
	 * @param c the double precision Celsius temperature of the object
	*/
	public void setCelsius(double c)
	{
	// Initialize the Celsius instance variable
	  celsius = c;	 
	// Calculate the Fahrenheit equivalent
	  fahrenheit = 9 * celsius / 5 + 32;
	} // setCelsius(double)

	
	/** Return the Celsius temperature of the object 
	 * @return the double precision Celsius temperature */
	public double getCelsius()
	{
		return celsius;
	} // getCelsius()

	
	/** Assign a Fahrenheit temperature and calculate the Fahrenheit 
	 * temperature for the object 
	 * @param f the double precision Fahrenheit temperature of the object
	*/
	public void setFahrenheit(double f)
	{
			fahrenheit = f;
		  celsius = 5*(f-32)/9;
		
	} // setFahrenheit(double)

	/** Return the Fahrenheit temperature of the object 
	 * @return the double precision Fahrenheit temperature */
	public double getFahrenheit()
	{
		return fahrenheit;
	} // getFahrenheit()

	
}
