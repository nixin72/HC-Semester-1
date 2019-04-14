package taxWhiz;

/**
 * This class calculates the tax on two purchases using two different tax rates.
 * The TaxWhiz class contains the instance variables and methods to do this.
 * 
 * @author Philip Dumaresq
 */
public class TaxWhizUser
{
	public static void main(String[] args)
	{
		// Create a TaxWhiz object
		TaxWhiz taxUser1 = new TaxWhiz();
		// set tax rate to 15% for taxUser1
		taxUser1.setTaxRate(15);
		// Calculate and print the tax on a purchase of $10 using the first TaxWhiz
		// object
		System.out.println("The tax on a purchase of $10 at a tax rate of "
				+ taxUser1.getTaxRate() + "% is $" + taxUser1.calculateTax(10));

		// Create a second TaxWhiz object
		TaxWhiz taxUser2 = new TaxWhiz();
		// set tax rate to 14% for taxUser2
		taxUser2.setTaxRate(14);
		// Calculate and print the tax on a purchase of $10 using the second TaxWhiz
		// object
		System.out.println("The tax on a purchase of $15 at a tax rate of "
				+ taxUser2.getTaxRate() + "% is $" + taxUser2.calculateTax(15));
	} // main()
} // TaxWhisUser class
