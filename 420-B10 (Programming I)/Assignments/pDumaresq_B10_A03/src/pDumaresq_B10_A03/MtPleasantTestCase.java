/**
 * 
 */
package pDumaresq_B10_A03;

import java.util.Scanner;

public class MtPleasantTestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sC = new Scanner(System.in);
		Customer mtPleasant = new Customer();
		String residentName;
		boolean heaterRental;
		int months;
		double gallons;

		System.out.print("Enter resident name: ");
		residentName = sC.next();
		mtPleasant.setCustomerName(residentName);
		
		System.out.print("Does the resident rent a water heater (Y/N)? ");
		heaterRental = sC.nextBoolean();
		mtPleasant.setRentingHeater(heaterRental);

		System.out.print("Enter number of months: ");
		months = sC.nextInt();
		mtPleasant.setNumberOfMonths(months);

		if (months > 3)
			System.out.println(months + "is an invalid number. Months has been set to 3.");
		months = 3;

		System.out.print("Enter number of gallons of water used:  ");
		gallons = sC.nextDouble();
		mtPleasant.setWaterUsed(gallons);

		System.out.println("Mount Pleasant");
		System.out.println("Water Bill");

		System.out.println("Resident Name: " + residentName);
		System.out.println("Number of Months Billed: " + months);
		System.out.println("Number of Gallons Used: " + gallons);
		System.out.println("Sanitation Charge: " +
		mtPleasant.calculateSanitationCharge());
		//System.out.println("Water Charge: " +
		//mtPleasant.calculateWaterCharge());
		System.out.println("Water Heater Rental: " +
		mtPleasant.calculateWaterHeaterCharge());
		System.out.println("Total Amount Owing: " +
		mtPleasant.calculateTotalFee());
		System.out.println("\nThank you");

	}

}
