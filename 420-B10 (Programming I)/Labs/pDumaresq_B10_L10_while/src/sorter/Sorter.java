package sorter;

/**
 * Title:        Sorter class
 * Description:	 A class that sorts three integers in ascending sequence. It compares
 * 							 adjacent values and switches them if they out of order.
 * Copyright:    Copyright (c) 2013
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */
public class Sorter
{
	private int a, b, c;

	public void sortNumber()
	{
		int temp;
		if (a > b)
		{ // if a > b, switch a and b
		temp = b;
	  b = a;
		a = temp;
		
		} // if (a > b)
		if (b > c)
		{ // if b > c, switch b and c
		temp = c;
		c = b;
		b = temp;		
			
		} // if (b > c)
		if (a > b)
		{ // if a > b, switch a and b
		temp = b;
	  b = a;
		a = temp;
		}
	} // sortNumber(int, int, int)

	public void setA(int newA)
	{
		a = newA;
	} // setA(int)

	public int getA()
	{
		return a;
	} // getA()

	public void setB(int newB)
	{
		b = newB;
	} // setB(int)

	public int getB()
	{
		return b;
	} // getB()

	public void setC(int newC)
	{
		c = newC;
	} // setC(int)

	public int getC()
	{
		return c;
	} // getC()
} // Sorter
