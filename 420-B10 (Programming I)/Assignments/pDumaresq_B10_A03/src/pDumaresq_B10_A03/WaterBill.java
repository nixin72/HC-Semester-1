/**
 * 
 */
package pDumaresq_B10_A03;

import java.util.Scanner;
import java.text.NumberFormat;

public class WaterBill {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumberFormat money = NumberFormat.getCurrencyInstance();
		Scanner sC = new Scanner(System.in);
		Customer user = new Customer();
		String residentName, yORn;
		boolean heaterRental;
		int months;
		double gallons;

		// setting variables
		System.out.print("Enter resident name: ");
		residentName = sC.next();
		user.setCustomerName(residentName);

		System.out.print("Does the resident rent a water heater (Y/N)? ");
		yORn = sC.next();
		if (yORn == "y")
			heaterRental = true;
		else if (yORn == "x")
			heaterRental = false;

		// user.setRentingHeater(heaterRental);

		System.out.print("Enter number of months: ");
		months = sC.nextInt();
		user.setNumberOfMonths(months);
		if (months > 3) {
			System.err.println("" + months
					+ " is an invalid number. Months has been set to 3.");
			months = 3;
		}

		System.out.print("Enter number of gallons of water used:  ");
		gallons = sC.nextDouble();
		user.setWaterUsed(gallons);

		// output "header"
		String header1 = "Mount Pleasant";
		String header2 = "Water Bill";
		System.out.printf("\n %26s", header1);
		System.out.printf(" \n %24s", header2);

		// return
		System.out.printf("\n\nResident Name: %21s", residentName);
		System.out.printf("\nNumber of Months Billed: %11d", months);
		System.out.printf("\nNumber of Gallons Used: %12.2f", gallons);
		System.out.printf("\nSanitation Charge: %16.2f$",
				user.calculateSanitationCharge());
		System.out.printf("\nWater Charge: %21.2f$",
				user.calculateWaterCharge());
		if (yORn == "yes") {
			System.out.printf("\nWater Heater Rental: %14.2f$",
					user.calculateWaterHeaterCharge());
		}
		System.out.printf("\nTotal Amount Owing: %15.2f$",
				user.calculateTotalFee());
		System.out.printf("\n\nThank you");

	}
}