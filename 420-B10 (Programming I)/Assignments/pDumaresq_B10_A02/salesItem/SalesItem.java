package salesItem;

public class SalesItem {
	// instance variables
	private long itemUPC;
	private int quantityOnHand;
	private int quantitySold;
	private double unitCost;
	private double totalSales;
	private double retailPrice;
	private String itemName;

	// set methods
	public void setItemUPC(long upc) {
		upc = itemUPC;
	}

	public void setQuantityOnHand(int qOH) {
		qOH = quantityOnHand;
	}

	public void setItemName(String name) {
		name = itemName;
	}

	public void setUnitCost(double uC) {
		uC = unitCost;
	}

	public void setRetailPrice(double price) {
		price = retailPrice;
	}

	public void setRgisterSale(double n) {

	}

	// get methods
	public long getItemUPC() {
		return 159912345689L;
	}

	public String getItemName() {
		return itemName;
	}

	public int getQuantityOnHand() {
		return quantityOnHand;
	}

	public double getUnitCost() {
		return unitCost;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public int getQuantitySold() {
		return quantitySold;
	}

	public double getTotalSales() {
		return totalSales;
	}

	// calculations
	public double registerSale(int n) {
		quantityOnHand -= n;
		quantitySold += n;
		totalSales += retailPrice * n;
		return ((retailPrice * n) * 100.0 / 100.0);
	}

	public double registerDiscountedSale(int n, double p) {
		double salePrice, saleAmount;
		quantityOnHand -= n;
		quantitySold += n;
		salePrice = (retailPrice * (1 - p / 100) * 100.0 / 100.0);
		saleAmount = salePrice * n;
		totalSales += saleAmount;
		return saleAmount * 100.0 / 100.0;
	}

	public double calculateCost() {
		return unitCost * quantitySold;
	}

	public double calculateProfit() {
		return totalSales - (unitCost * quantitySold) * 100.0 / 100.0;
	}
}
