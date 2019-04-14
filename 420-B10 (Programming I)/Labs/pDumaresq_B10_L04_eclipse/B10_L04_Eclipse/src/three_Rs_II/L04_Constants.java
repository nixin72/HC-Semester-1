package three_Rs_II;

/**
 * Calculate the taxes and total bill for a sale.
 * 
 * @author Philip Dumaresq
 * @version 1.0
 */
public class L04_Constants
{
	/** The goods and services tax percentage */
	public static final double GST = 0.05;
	public static final double QST = 0.085;
	/**
	 * This method calculates the total sales taxes (GST) on a purchase
	 * and prints the bill with the purchase amount, the GST amount, 
	 * and the total owing. 
	 * @param args
	 */
	public static void main(String[] args)
	{
		double qstTaxAmount;
		double sale;
		double gstTaxAmount, totalBill;
		sale = 100.0;
		qstTaxAmount = QST * (sale + GST);
		gstTaxAmount = sale * GST;
		totalBill = sale + gstTaxAmount + qstTaxAmount;
		System.out.println("The sale amount is " + sale);
		System.out.println("The GST owing is " + gstTaxAmount);
		System.out.println("The QST owing is " + qstTaxAmount);
		System.out.println("The total bill is " + Math.round(totalBill));
	} // main
} // L04_Constants