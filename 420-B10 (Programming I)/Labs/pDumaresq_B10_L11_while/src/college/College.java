package college;
public class College
{
	public static void main(String[] args)
	{
		Course oldCourse = new Course("420-G99","Advanced Gobble Degook");
		Course newCourse = new Course();
		Course Course1 = new Course("420-B10" , "Programming" , 21);
		System.out.println("The new course number is "
				+ newCourse.getCourseNumber());
		System.out.println("The course name is " + newCourse.getCourseName());
		System.out.println("At the moment " + newCourse.getNumStudents()
				+ " students have completed the course.");
		
		System.out.println("The old course number is "
				+ oldCourse.getCourseNumber());
		System.out.println("The course name is " + oldCourse.getCourseName());
		System.out.println(oldCourse.getNumStudents()
				+ " students had completed the old course.");
		
		System.out.println("The course number is "
				+ Course1.getCourseNumber());
		System.out.println("The course name is " + Course1.getCourseName());
		System.out.println(Course1.getNumStudents()
				+ " students have completed the course.");
	} // main()

} // College class
