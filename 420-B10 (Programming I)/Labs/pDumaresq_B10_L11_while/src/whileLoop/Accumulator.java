package whileLoop;

/**
 * Title:        Accumulator class
 * Description:	 A class that allows a client to accumulate counts, sums and products.
 * Copyright:    Copyright (c) 2013
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */
public class Accumulator
{
	private int count, sum, product;
	double average;

	public Accumulator()
	{
		count = 0;
		sum = 0;
		product = 1;
		average = 1;
	} // Accumulator()

	public int getCount()
	{
		return count;
	} // getCount()

	public void updateAccumulators(int num)
	{
		count = count + 1;
		sum = sum + num;
		product = product * num;
		average = sum / count;
	} // updateAccumulators(int)

	public int getSum()
	{
		return sum;
	} // getSum()

	public int getProduct()
	{
		return product;
	} // getProduct()
	public double getAverage()
	{
		return average;
	}
} // Accumulator class