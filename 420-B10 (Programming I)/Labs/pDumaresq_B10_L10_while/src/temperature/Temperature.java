package temperature;

/**
 * Title:        Temperature Class
 * Description:	 A class that converts Fahrenheit temperatures to Celsius and vice versa.
 * Copyright:    Copyright (c) 2013
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */
public class Temperature
{
	public double fahrToCels(double temp)
	{
		return (5.0 * (temp - 32.0) / 9.0);
	} // fahrToCels(double)

	public double celsToFahr(double temp)
	{
		return (9.0 * temp / 5.0 + 32.0);
	} // celsToFahr(double)
} // Temperature class
