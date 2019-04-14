/**
 * Title:        Temperature Class
 * Description:  Represents a temperature in Fahrenheit and Celsius
 * Copyright:    Copyright (c) 2001
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */

public class Temperature
{
	// instance variables
	private double degrees;
	private char units;
	private double newDegrees;
	private char newUnits;

	// constructor
	public Temperature()
	{
	}

	// public methods
	public void setTemperature(double temp, char u)
	{
		units = u;
		degrees = temp;
		if (units == 'C')
		{
			newDegrees = convertToFahrenheit(); //1
			newUnits = 'F'; //2
		}
		if (units == 'F') //3
		{
			newDegrees = convertToCelsius(); //4
			newUnits = 'C'; //5
		}
		if (units == 'K')
		{
			newDegrees = convertKelvinToCelsius();
			newUnits = 'c';
		}

	} // setTemperature(double, char)

	public double getTemperature()
	{
		return degrees;
	} // getTemperature()

	public char getUnits()
	{
		return units;
	} // getUnits()

	public double getConvertedTemperature()
	{
		return newDegrees;
	} // getConvertedTemperature()

	public char getConvertedUnits()
	{
		return newUnits;
	} // getConvertedUnits()

	// private methods
	private double convertToCelsius()
	{
		return (5.0 / 9.0) * (degrees - 32.0);
	} // convertToCelsius()

	private double convertToFahrenheit()
	{
		return (9.0 / 5.0) * degrees + 32.0;
	} // void convertToFahrenheit()

	private double convertKelvinToCelsius()
	{
		return (degrees - 273.16);
	}
} // Temperature class