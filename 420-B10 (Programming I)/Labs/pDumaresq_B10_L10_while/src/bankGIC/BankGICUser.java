package bankGIC;

import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Title:        BankGICUser class
 * Description:	 A class that compares the amount accumulated in a CD (Certificate of Deposit) 
 * 							 after some number of years using daily and annual interest compounding.
 * Copyright:    Copyright (c) 2013
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */
public class BankGICUser
{
	private BankGIC cd = new BankGIC();

	public void run()
	{
		System.out.println("Compares daily and annual CD compounding.");
		getInput();
		System.out.println("\nDaily Compounding: ");
		cd.calcAccumulatedPrincipal(365);
		printResults();
		System.out.println("\nAnnual Compounding: ");
		cd.calcAccumulatedPrincipal(1);
		printResults();
	} // run()

	private void getInput()
	{
		Scanner input = new Scanner(System.in);
		// Prompt the user and get the input
		System.out.print("Input the initial principal, e.g. 1000.55 > ");
		cd.setPrincipal(input.nextDouble());

		System.out.print("Input the interest rate, e.g. 6.5 > ");
		cd.setInterestRate(input.nextDouble() / 100.0);

		System.out.print("Input the number of years, e.g., 10.5 > ");
		cd.setNumberOfYears(input.nextDouble());
	} //getInput()

	private void printResults()
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMaximumFractionDigits(3);
		System.out.println("The original principal is " + money.format(cd.getPrincipal()));
		System.out.println("The resulting principal compounded at "
			   + percent.format(cd.getInterestRate()) + " is " 
			   + money.format(cd.getAccumulatedPrincipal()));


	} // printResults()

	public static void main(String[] args)
	{
		BankGICUser user = new BankGICUser();
		user.run();
	} // main()
} // BankGICUser