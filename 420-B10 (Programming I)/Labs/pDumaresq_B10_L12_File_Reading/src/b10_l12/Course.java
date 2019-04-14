package b10_l12;

import java.io.*;
import java.util.Scanner;

public class Course
{
	public static void main(String[] args)
	{
		Scanner input = null;
		Scanner sC = new Scanner(System.in);
		Student student;
		int numStudents, numTests;
		File studentFile;
		studentFile = new File("students.txt");
		String name;
		
		double grade;
		student = new Student();
		numStudents = 1;
		
				try
				{
					studentFile = new File("students.txt");
					input = new Scanner(studentFile);
				}
				catch (FileNotFoundException e)
				{
					System.err.println("students.txt could not be found.");
					System.exit(-1);
				} // catch (FileNotFoundException e)
				catch (IOException e)
				{
					System.err.println("I/O error. " + e.getMessage());
						System.exit(-2);
				} // catch (IOException)
		
			input.useDelimiter("~|\r\n");
	
			System.out.print("What is the file name for the students in the course? ");
			String filename = sC.next();
			
			while (!studentFile.exists() && filename != "X") {
			System.out.println(" is not in the project folder. Enter the proper path"
			+ "or enter X to exit: ");
//			String filename = sC.next();					
		  }			
			while (input.hasNext()) // start of outer loop
			{
			name = input.next();
			student.setStudentName(name);
			student.newStudent(); // clear the totals for
			// this student
			numTests = 1;
			while (numTests <= 5) // start of inner loop
			{
				grade = input.nextDouble();
				student.updateTotals(grade); // add the grade to the total
				++numTests;
			} // end of the inner loop
			
			System.out.println("\nThe average for " + name + " is "
					+ student.calculateAverage());
			System.out.println();
			++numStudents;	
		}	
		System.out.println("There are " + numStudents + " in the class. The class average is ");
	} // end of the outer loop
	// main()
} // Course class