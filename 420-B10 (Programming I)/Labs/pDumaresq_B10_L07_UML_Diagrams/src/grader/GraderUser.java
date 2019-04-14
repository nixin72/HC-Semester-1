
package grader;

/*
 * This program demonstrates the simple if statement
 */

import java.util.Scanner;

public class GraderUser
{
	public static void main(String args[])
	{
		// Local variables
		Scanner sc = new Scanner(System.in);
		double mark;
		// Objects
		Grader myGrade = new Grader();

		// Input Section
		System.out.print("Please type your Computer Science Mark: ");
		mark = sc.nextDouble();

		// Process Section
		myGrade.setMark(mark);
		
		// Output Section
		System.out.println(myGrade.getStatus());
	} // main() method
} // GraderUser Class
