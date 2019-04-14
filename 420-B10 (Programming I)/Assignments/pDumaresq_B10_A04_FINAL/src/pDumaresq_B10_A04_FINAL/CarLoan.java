package pDumaresq_B10_A04_FINAL;


public class CarLoan {
	double cost, loanAmount, interest, monthlyPayment, totalInterest;
	int timesPayed;
	String make, model;

//	Constructor methods
	public void variables() {
		cost = 0;
		loanAmount = 0;
		interest = 0;
		monthlyPayment = 0;
		totalInterest = 0;
		timesPayed = 0;
		make = "unknown";
		model = "unknown";
	}
	
	public void variables(String ma, String mo, double loanA){
		make = ma;
		model = mo;
		loanAmount = loanA;
		
		timesPayed = 0;
		cost = 0;
		interest = 0;
		monthlyPayment = 0;
		totalInterest = 0;
	}
	
	public void variables(double monthlyP, double interestR) {
		monthlyPayment = monthlyP;
		interest = interestR;
		
		cost = 0;
		loanAmount = 0;
		totalInterest = 0;
		timesPayed = 0;
		make = "unknown";
		model = "unknown";
	}
	
//	Access methods
	public double getCost() {
		return cost;	
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public double getInterest() {
		return interest;
	}
	public double getMonthlyPayment() {
		return monthlyPayment;
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	public int getTimesPayed() {
		return timesPayed;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}

//	Mutator methods
	void setMake(String ma) {
		make = ma;
	}
	void setModel(String mo) { 
		model = mo;
	}
	void setLoanAmount(double lA) {
		loanAmount = lA;
	}
	void setInterest(double i) {
		interest = i;
	}
	void setMonthlyPayment(double mP) {
		monthlyPayment = mP;
	}
	
//	Calculate methods
	
	public double calculateTotalInterest() {
			
		double placeholder;
		double costRemaining;
		costRemaining = loanAmount;
		
		while (costRemaining >= 0) {
			placeholder = costRemaining - monthlyPayment;
			placeholder = (placeholder * 3.5) * 100.0 / 100.0;
			costRemaining += placeholder;
			costRemaining = (costRemaining * 100.0)/100.0;
			
			timesPayed++;
			totalInterest += placeholder;
		}
		int numPayments = timesPayed;
		return totalInterest;
		
	}
	
	public double calculateTotalCost() {
		double finalCost;
		finalCost = loanAmount + totalInterest;
		return finalCost;
	}
	
	public int calculateTimesPayed () {
		return timesPayed;
	}
}













