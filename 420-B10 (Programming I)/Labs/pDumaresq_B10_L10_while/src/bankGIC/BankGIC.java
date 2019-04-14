package bankGIC;

/**
 * Title:        BankGIC class
 * Description:	 A class that calculates the accumulated principal of a GIC (Guaranteed Income Certificate)
 *               over a number of years using compounded interest.
 * Copyright:    Copyright (c) 2013
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */
public class BankGIC
{
	private double principal; // The CD's initial principal
	private double interestRate; // CD's interest rate
	private double numberOfYears; // Number of years to maturity
	private double accumulatedPrincipal;

	public void setPrincipal(double p)
	{
		principal = p;
	} // setPrincipal(double)

	public void setInterestRate(double rate)
	{
		interestRate = rate;
	} // setInterestRate(double)

	public void setNumberOfYears(double years)
	{
		numberOfYears = years;
	} // setNumberOfYears(int)

	public double getPrincipal()
	{
		return principal;
	} // getPrincipal()

	public double getInterestRate()
	{
		return interestRate;
	} // getInterestRate()

	public double getNumberOfYears()
	{
		return numberOfYears;
	} // getNumberOfYears()

	public double getAccumulatedPrincipal()
	{
		return accumulatedPrincipal;
	} // getAccumulatedPrincipal()

	public void calcAccumulatedPrincipal(int frequency)
	{ // Calculate the result
		accumulatedPrincipal = principal
				* Math.pow(1 + interestRate / frequency, numberOfYears * frequency);
	} // calcAccumulatedPrincipal (int)

} // BankGIC