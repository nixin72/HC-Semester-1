package pDumaresq_B10_A03;

public class Customer {
	private String customerName;
	private int numberOfMonths;
	private double waterUsed;
	private boolean rentingHeater;

	// mutator methods
	public void setCustomerName(String cN) {
		customerName = cN;
	}

	public void setNumberOfMonths(int numMonths) {
		numberOfMonths = numMonths;
	}

	public void setWaterUsed(double wU) {
		waterUsed = wU;
	}

	public void setRentingHeater(boolean rH) {
		rentingHeater = rH;
	}

	// accessor methods
	public String getCustomerName() {
		return customerName;
	}

	public int getNumberOfMonths() {
		return numberOfMonths;
	}

	public double getWaterUsed() {
		return waterUsed;
	}

	public boolean getRentingHeater() {
		return rentingHeater;
	}

	// calculations
	public double calculateSanitationCharge() {
		if (numberOfMonths > 3)
			numberOfMonths = 3;
		double sC = ((numberOfMonths * 7.50) * 100.0) / 100.0;
		return sC;
	}

	public double calculateWaterCharge() {
		double water = 0;
		if (waterUsed < 1000.0)
			water = ((waterUsed * 0.03) * 100.0) / 100.0;
		else if (waterUsed >= 1000.0 && waterUsed <= 2000.0)
			water = ((30.0 + (0.02 * (waterUsed - 1000.0))) * 100.0) / 100.0;
		else if (waterUsed > 2000.0)
			water = ((50.0 + (0.015 * (waterUsed - 2000.0))) * 100.0) / 100.0;

		return water;
	}

	public double calculateWaterHeaterCharge() {
		if (numberOfMonths > 3){
			numberOfMonths = 3;}
		double rentCharge = ((numberOfMonths * 12.75) * 100.0) / 100.0;
		return rentCharge;
		
	}

	public double calculateTotalFee() {
		double totalFee;
		if (numberOfMonths > 3)
			numberOfMonths = 3;
		double sanC = (numberOfMonths * 7.50);
		double rent = (numberOfMonths * 12.75);
		double waterHC = 0;
		if (waterUsed < 1000.0)
			waterHC = ((waterUsed * 0.03) * 100.0) / 100.0;
		else if (waterUsed >= 1000.0 && waterUsed <= 2000.0)
			waterHC = ((30.0 + (0.02 * (waterUsed - 1000.0))) * 100.0) / 100.0;
		else if (waterUsed > 2000.0)
			waterHC = ((50.0 + (0.015 * (waterUsed - 2000.0))) * 100.0) / 100.0;
		else
			System.err.println("Error: value cannot be a negative");

		totalFee = ((sanC + rent + waterHC) * 100.0) / 100.0;
		return totalFee;
	}
}
