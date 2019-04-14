package grader;

/**
 * Contains the grade for a course and determines the resulting status.
 * Copyright: Copyright (c) 2001 Company: Heritage College
 * 
 * @author Philip Dumaresq
 * @version 1.0
 */

public class Grader
{
	// instance variables
	private double mark;

	// public methods
	public void setMark(double m)
	{
		mark = m;
	} // setMark(double)

	public String getStatus()
	{
		if (mark < 0)
			return "error";
		if (mark > 100)
			return "error";
		if (mark < 60.0)
			return "Poor.";
		if (mark == 100.0)
			return "Perfect";
		if (mark >= 60.0)
			return "Passed";
		return "Error";
	} // getStatus()

} // Grader class