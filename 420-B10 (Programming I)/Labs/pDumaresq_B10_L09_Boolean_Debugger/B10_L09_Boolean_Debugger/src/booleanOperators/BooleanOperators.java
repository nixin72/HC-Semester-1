package booleanOperators;

/**
 * Title:        BooleanOperators
 * Description:  Determine the values of the Boolean operator truth tables
 * Copyright:    Copyright (c) 2014
 * Company:      Heritage College
 * @author Anne Hamilton
 * @version 1.0
 */
public class BooleanOperators
{
	public static void main(String[] args)
	{
		boolean A, B;
		// The AND truth table
		A = true;
		B = true;
		System.out.println("\nThe XOR Truth Table");
		System.out.println("--------------------");
		if (A ^ B)
			System.out.println(A + " ^ " + B + " is true");
		else
			System.out.println(A + " ^ " + B + " is false");
		A = true;
		B = false;
		if (A ^ B)
			System.out.println(A + " ^ " + B + " is true");
		else
			System.out.println(A + " ^ " + B + " is false");
		A = false;
		B = true;
		if (A ^ B)
			System.out.println(A + " ^ " + B + " is true");
		else
			System.out.println(A + " ^ " + B + " is false");
		A = false;
		B = false;
		if (A ^ B)
			System.out.println(A + " ^ " + B + " is true");
		else
			System.out.println(A + " ^ " + B + " is false");
	} // main()

} // BooleanOperators
