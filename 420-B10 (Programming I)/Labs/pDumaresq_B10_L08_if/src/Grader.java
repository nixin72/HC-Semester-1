/**
 * Title:        Grader class
 * Description:  Contains the grade for a course and determines the resulting
 *               status.
 * Copyright:    Copyright (c) 2001
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */

public class Grader
{
	// instance variables
	private double mark;
	private char grade = 'U';

	// constructor
	public Grader()
	{
	} // default constructor

	// public methods
	public void setMark(double m)
	{
		mark = m;
		{
			setGrade();
		}
		if (m <= 100)
			return;
		else
			System.err.println(m
					+ " is an invalid mark. The mark must be less than or equal to 100.");
	} // setMark(double)

	private void setGrade()
	{
		if (mark >= 90)
			grade = 'A';
		else
			if (mark >= 80)
				grade = 'B';
			else
				if (mark >= 70)
					grade = 'C';
				else
					if (mark >= 60)
						grade = 'D';
				else
					grade = 'F';
	} // setGrade()

	public String getStatus()
	{
		if (mark < 60.0)
			return "Poor.";
		else
			return "Passed";

	} // getStatus()

	public char getGrade()
	{
		return grade;
	}
}
// Grader class