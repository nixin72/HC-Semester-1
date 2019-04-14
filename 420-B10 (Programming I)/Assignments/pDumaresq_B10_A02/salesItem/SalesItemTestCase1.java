package salesItem;

public class SalesItemTestCase1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SalesItem item = new SalesItem();
		boolean working = true;
		item.setItemUPC(159912345689L);

		if (item.getItemUPC() != 159912345689L) {
			working = false;
			System.err.println("ERROR: UPC was not set properly. It is "
					+ item.getItemUPC() + ". It should be 159912345689");
		}
		item.setItemName("Best all time gadget");
		if (!item.getItemName().equalsIgnoreCase("Best all time gadget")) {
			working = false;
			System.err.println("ERROR: Item name was not set properly. It is "
					+ item.getItemName()
					+ ". It should be \"Best all time gadget\"");
		}
		item.setUnitCost(10);
		if (item.getUnitCost() != 10.0) {
			working = false;
			System.err.println("ERROR: Unit cost was not set properly. It is "
					+ item.getUnitCost() + ". It should be 10");
		}
		item.setRetailPrice(15.99);
		if (item.getRetailPrice() != 15.99) {
			working = false;
			System.err
					.println("ERROR: Retail price was not set properly. It is "
							+ item.getRetailPrice() + ". It should be 15.99");
		}

		item.setQuantityOnHand(50);
		if (item.getQuantityOnHand() != 50) {
			working = false;
			System.err
					.println("ERROR: Quantity on hand was not set properly. It is "
							+ item.getQuantityOnHand() + ". It should be 50");
		}
		double saleValue = item.registerSale(2);

		if (saleValue != 31.98) {
			working = false;
			System.err
					.println("ERROR: The sales amount was not calculated properly for registerSale(2). It is "
							+ saleValue + ". It should be 31.98");
		}
		if (item.getQuantitySold() != 2) {
			working = false;
			System.err
					.println("ERROR: Quantity sold was not updated properly after registerSale(2). It is "
							+ item.getQuantitySold() + ". It should be 2");
		}

		if (item.getTotalSales() != 31.98) {
			working = false;
			System.err
					.println("ERROR: Total sales was not updated properly after registerSale(2). It is "
							+ item.getTotalSales() + ". It should be 31.98");
		}
		if (item.getQuantityOnHand() != 48) {
			working = false;
			System.err
					.println("ERROR: Quantity on hand was not updated properly after registerSale(2). It is "
							+ item.getQuantityOnHand() + ". It should be 48");
		}

		saleValue = item.registerDiscountedSale(15, 10);
		if (saleValue != 215.85) {
			working = false;
			System.err
					.println("ERROR: The sales amount was not calculated properly for registerDiscountedSale(15,10). It is "
							+ saleValue + ". It should be 215.85");
		}
		if (item.getQuantitySold() != 17) {
			working = false;
			System.err
					.println("ERROR: Quantity sold was not updated properly after registerDiscountedSale(15, 10). It is "
							+ item.getQuantitySold() + ". It should be 17");
		}

		if (item.getTotalSales() != 247.83) {
			working = false;
			System.err
					.println("ERROR: Total sales was not updated properly after registerDiscountedSale(15, 10). It is "
							+ item.getTotalSales() + ". It should be 247.83");
		}
		if (item.getQuantityOnHand() != 33) {
			working = false;
			System.err
					.println("ERROR: Quantity on hand was not updated properly after registerDiscountedSale(15, 10). It is "
							+ item.getQuantityOnHand() + ". It should be 33");
		}
		saleValue = item.registerDiscountedSale(20, 15);
		if (saleValue != 271.8) {
			working = false;
			System.err
					.println("ERROR: The sales amount was not calculated properly for registerDiscountedSale(20,15). It is "
							+ saleValue + ". It should be 271.8");
		}
		if (item.getQuantitySold() != 37) {
			working = false;
			System.err
					.println("ERROR: Quantity sold was not updated properly after registerDiscountedSale(20, 15). It is "
							+ item.getQuantitySold() + ". It should be 37");
		}

		if (item.getTotalSales() != 519.63) {
			working = false;
			System.err
					.println("ERROR: Total sales was not updated properly after registerDiscountedSale(20, 15). It is "
							+ item.getTotalSales() + ". It should be 519.63");
		}
		if (item.getQuantityOnHand() != 13) {
			working = false;
			System.err
					.println("ERROR: Quantity on hand was not updated properly after registerDiscountedSale(20, 15). It is "
							+ item.getQuantityOnHand() + ". It should be 13");
		}
		saleValue = item.registerSale(10);
		if (saleValue != 159.9) {
			working = false;
			System.err
					.println("ERROR: The sales amount was not calculated properly for registerSale(10). It is "
							+ saleValue + ". It should be 159.9");
		}
		if (item.getQuantitySold() != 47) {
			working = false;
			System.err
					.println("ERROR: Quantity sold was not updated properly after registerSale(10). It is "
							+ item.getQuantitySold() + ". It should be 42");
		}

		if (item.getTotalSales() != 679.53) {
			working = false;
			System.err
					.println("ERROR: Total sales was not updated properly after registerSale(10). It is "
							+ item.getTotalSales() + ". It should be 679.53");
		}
		if (item.getQuantityOnHand() != 3) {
			working = false;
			System.err
					.println("ERROR: Quantity on hand was not updated properly after registerSale(10). It is "
							+ item.getQuantityOnHand() + ". It should be 3");
		}
		if (item.calculateCost() != 470) {
			working = false;
			System.err
					.println("ERROR: total cost was not calculated properly after registering 4 sales. It is "
							+ item.calculateCost() + ". It should be 470");
		}
		if (item.calculateProfit() != 209.53) {
			working = false;
			System.err
					.println("ERROR: The profit was not calculated properly after registering 4 sales. It is "
							+ item.calculateProfit() + ". It should be 209.53");
		}

		if (working)
			System.out.println("Congratulations! The test case works!");

	} // main(String)

} // SalesItemUser class