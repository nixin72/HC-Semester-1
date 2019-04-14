package taxWhiz;

public class TaxWhiz
{
	//declare variables
	private double taxRate;

	//setTaxRate method
	public void setTaxRate(double rate)
	{
		taxRate = rate;
	}

	//getTaxRate method
	public double getTaxRate()
	{
		return taxRate;
	}

	//calculateTax method
	public double calculateTax(double purchase)
	{
		return purchase * taxRate / 100;
	}
}