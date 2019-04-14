package taxCalculator;

import java.util.Scanner;
import java.text.NumberFormat;
/**
 * Title:        TaxCalculator class
 * Description:	 Calculate and display the taxes on a purchase.
 * Copyright:    Copyright (c) 2013
 * Company:      Heritage College
 * @author Anne Hamilton
 * @version 1.0
 */

public class TaxCalculator
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
  
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    double amount;

    Purchase sale = new Purchase();

    System.out.print("Enter the amount purchased: ");
    amount = input.nextDouble();
    sale.setAmount(amount);
    System.out.println("The provincial sales tax is " 
    		+  currency.format(sale.calcPST()));
    System.out.println("The goods and services sales tax is " + 
    		currency.format(sale.calcGST()));
    System.out.println("The total bill is " + currency.format(sale.calcTotal()));
  } // main
} // TaxCalculator class