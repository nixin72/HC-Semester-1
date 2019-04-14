package taxCalculator;

/**
 * Title:        Purchase class
 * Description:	 Calculates the taxes and total owing on a purchase. 
 * Copyright:    Copyright (c) 2013
 * Company:      Heritage College
 * @author Anne Hamilton
 * @version 1.0
 */

public class Purchase
{
	public static final double PST = 0.07;
	public static final double GST = 0.05;
	private double amount = 0;

	public Purchase()
	{
	} // Purchase()

	public void setAmount(double a)
	{
		amount += a;
	} // setAmount(double)

	public double getAmount()
	{
		return amount;
	} // getAmount()

	public double calcPST()
	{
		return PST * amount;
	} // calcPST()

	public double calcGST()
	{
		return GST * amount;
	} // calcPST()

	public double calcTotal()
	{
		return amount + calcPST() + calcGST();
	} // calcTotal()
} // Purchase