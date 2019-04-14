/**
 * 
 */
package pDumaresq_B10_A01_First_Program;

/**
 * @author PDumaresq
 *
 */
import java.util.Scanner;
public class CheckingAccount 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	//declaring scanner and variables
	Scanner keyboard = new Scanner (System.in);
	double accountNumber, accountBalance, checkAmount, newAccountBalance;
	
	//Prompting user for their account number
	System.out.println("Please enter your account number");
	accountNumber = keyboard.nextDouble();
	//Prompting user for their account balance
	System.out.println("Please enter your account balance");
	accountBalance = keyboard.nextDouble();
	//Prompting user for the check ammount
	System.out.println("Please enter the check amount");
	checkAmount = keyboard.nextDouble();
	
	//calculating the new account balance
	newAccountBalance = accountBalance - checkAmount;
	
	//printing out the new and old account balances
	System.out.println("The starting balance for account number "
	+ accountNumber + " is " + accountBalance + "."
	+ "\nThe balance in account " + accountNumber + " after drawing a check for " 
	+ checkAmount + " is " + newAccountBalance);
	
	
	}

}
