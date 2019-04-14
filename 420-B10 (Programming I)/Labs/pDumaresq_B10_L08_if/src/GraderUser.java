/*
 * Title:       GraderUser.java
 * Description: This program demonstrates the simple if statement
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
		System.out.println(myGrade.getStatus());
		//displaying grade (a, b, c, d, f)
		System.out.println("Your grade is: " + myGrade.getGrade());
	} // main() method
} // GraderUser Class
