package college;

public class Course
{
	private String courseNumber;
	private String courseName;
	private int numStudents;
	private double totalMarks;

	public Course()
	{
		System.out.println("In the Course() constructor");
		courseNumber = "Unassigned";
		courseName = "Unknown";
		numStudents = 0;
		totalMarks = 0.0;
	} // Course()
	public String getCourseNumber()
	{
		return courseNumber;
	} // getCourseNumber()

	public void setCourseNumber(String number)
	{
		courseNumber = number;
	} // setCourseNumber(String) 

	public String getCourseName()
	{
		return courseName;
	} // getCourseName()

	public void setCourseName(String name)
	{
		courseName = name;
	} // setCourseName(String)

	public int getNumStudents()
	{
		return numStudents;
	} // getNumStudents()

	public void addMark(double mark)
	{
		totalMarks += mark;
		++numStudents;
	} // addMark(double) 
	public Course(String number, String name)
	{
		System.out.println("In the Course(String, String) constructor");
		courseNumber = number;
		courseName = name;
		numStudents = 0;
		totalMarks = 0.0;
	} // Course(String, String)
	public Course(String number, String name, int students)
	{
		System.out.println("In the Course(String, String, int) constructor");
		courseNumber = number;
		courseName = name;
		numStudents = 0;
		totalMarks = 0.0;
	}	
} // Course class
