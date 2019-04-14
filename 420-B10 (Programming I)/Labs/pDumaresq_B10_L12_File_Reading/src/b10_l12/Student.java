package b10_l12;

public class Student
{
	private double total;
	private int numMarks;
	String studentName;

	public void setStudentName(String unknown)
	{
		studentName = unknown;
	}

	public String getStudentName()
	{
		return studentName;
	}

	public Student()
	{
		total = 0.0;
		numMarks = 0;

	} // Student()

	public void newStudent()
	{
		total = 0.0;
		numMarks = 0;
		studentName = "unknown";
	} // newStudent()

	public void updateTotals(double mark)
	{
		++numMarks;
		total += mark;
	} // updateTotals(double)

	public double calculateAverage()
	{
		return total / numMarks;
	} // calculateAverage()

} // Student class

