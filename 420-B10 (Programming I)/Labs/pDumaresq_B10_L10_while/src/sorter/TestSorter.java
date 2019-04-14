package sorter;

/**
 * Title:        TestSorter class
 * Description:	 A class containing test cases for the Sorter class.
 * Copyright:    Copyright (c) 2013
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */
public class TestSorter
{
	public static void main(String[] args)
	{
		Sorter sort = new Sorter();
		
		// Test Case 1
		
		sort.setA(1);
		sort.setB(2);
		sort.setC(3);
		System.out.println("Test Case 1: \n\tBefore sorting the order is :"
				+ sort.getA() + " " + sort.getB() + " " + sort.getC());
		sort.sortNumber();
		System.out.println("\tAfter sorting the order is :" + sort.getA() + " "
				+ sort.getB() + " " + sort.getC());
		// Test Case 2
		sort = new Sorter();
		sort.setA(1);
		sort.setB(3);
		sort.setC(2);
		System.out.println("Test Case 2: \n\tBefore sorting the order is :"
				+ sort.getA() + " " + sort.getB() + " " + sort.getC());
		sort.sortNumber();
		System.out.println("\tAfter sorting the order is :" + sort.getA() + " "
				+ sort.getB() + " " + sort.getC());
		// Test Case 3
		sort = new Sorter();
		sort.setA(2);
		sort.setB(1);
		sort.setC(3);
		System.out.println("Test Case 3: \n\tBefore sorting the order is :"
				+ sort.getA() + " " + sort.getB() + " " + sort.getC());
		sort.sortNumber();
		System.out.println("\tAfter sorting the order is :" + sort.getA() + " "
				+ sort.getB() + " " + sort.getC());
		// Test Case 4
		sort = new Sorter();
		sort.setA(2);
		sort.setB(3);
		sort.setC(1);
		System.out.println("Test Case 4: \n\tBefore sorting the order is :"
				+ sort.getA() + " " + sort.getB() + " " + sort.getC());
		sort.sortNumber();
		System.out.println("\tAfter sorting the order is :" + sort.getA() + " "
				+ sort.getB() + " " + sort.getC());
		// Test Case 5
		sort = new Sorter();
		sort.setA(3);
		sort.setB(1);
		sort.setC(2);
		System.out.println("Test Case 5: \n\tBefore sorting the order is :"
				+ sort.getA() + " " + sort.getB() + " " + sort.getC());
		sort.sortNumber();
		System.out.println("\tAfter sorting the order is :" + sort.getA() + " "
				+ sort.getB() + " " + sort.getC());
		// Test Case 6
		sort = new Sorter();
		sort.setA(3);
		sort.setB(2);
		sort.setC(1);
		System.out.println("Test Case 6: \n\tBefore sorting the order is :"
				+ sort.getA() + " " + sort.getB() + " " + sort.getC());
		sort.sortNumber();
		System.out.println("\tAfter sorting the order is :" + sort.getA() + " "
				+ sort.getB() + " " + sort.getC());
		// Test Case 7
		sort = new Sorter();
		sort.setA(1);
		sort.setB(2);
		sort.setC(1);
		System.out.println("Test Case 7: \n\tBefore sorting the order is :"
				+ sort.getA() + " " + sort.getB() + " " + sort.getC());
		sort.sortNumber();
		System.out.println("\tAfter sorting the order is :" + sort.getA() + " "
				+ sort.getB() + " " + sort.getC());

	}
} // TestSorter class
