package usingDebugger;
import java.util.Scanner;

public class TestGradeCalculator
{
  GradeCalculator gradeCalculator;

  public TestGradeCalculator()
  {
    gradeCalculator = new GradeCalculator();
  }

  public void testisValid()
  {
    // Test case 1: Valid score between 0 and perfect
    gradeCalculator.setPerfect(20);
    gradeCalculator.setScore(15);
    if (gradeCalculator.isValid())
      System.out.println("isValid() Test case 1 passed.");
    else
      System.out.println("isValid() Test case 1 failed.");

    // Test case 2: Valid score = 0 
    gradeCalculator.setPerfect(20);
    gradeCalculator.setScore(0);
    if (gradeCalculator.isValid())
      System.out.println("isValid() Test case 2 passed.");
    else
      System.out.println("isValid() Test case 2 failed.");

    // Test case 3: Valid score = perfect
    gradeCalculator.setPerfect(20);
    gradeCalculator.setScore(20);
    if (gradeCalculator.isValid())
      System.out.println("isValid() Test case 3 passed.");
    else
      System.out.println("isValid() Test case 3 failed.");

    // Test case 4: Invalid score < 0 
    gradeCalculator.setPerfect(20);
    gradeCalculator.setScore(-10);
    if (gradeCalculator.isValid())
      System.out.println("isValid() Test case 4 failed.");
    else
      System.out.println("isValid() Test case 4 passed.");

    // Test case 5: Invalid score > perfect
    gradeCalculator.setPerfect(20);
    gradeCalculator.setScore(25);
    if (gradeCalculator.isValid())
      System.out.println("isValid() Test case 5 failed.");
    else
      System.out.println("isValid() Test case 5 passed.");
  } // testisValid()

  public void testconvertMark()
  {
    // Test case 1: score == perfect
    gradeCalculator.setPerfect(20);
    gradeCalculator.setScore(20);
    if (gradeCalculator.convertMark() == 100)
      System.out.println("testconvertMark() Test case 1 passed.");
    else
      System.out.println("testconvertMark() Test case 1 failed.");

    // Test case 2: score == 0
    gradeCalculator.setPerfect(20);
    gradeCalculator.setScore(0);
    if (gradeCalculator.convertMark() == 0)
      System.out.println("testconvertMark() Test case 2 passed.");
    else
      System.out.println("testconvertMark() Test case 2 failed.");

    // Test case 3: 0 < score < perfect
    gradeCalculator.setPerfect(20);
    gradeCalculator.setScore(15);
    if (gradeCalculator.convertMark() == 75)
      System.out.println("testconvertMark() Test case 3 passed.");
    else
      System.out.println("testconvertMark() Test case 3 failed.");

  } // testconvertMark()

  public void testconvertToGrade()
  {
    // Test case 1: Grade == A 
    gradeCalculator.setPerfect(100);
    gradeCalculator.setScore(100);
    if (gradeCalculator.convertToGrade() == 'A')
      System.out.println("convertToGrade() Test case 1 passed.");
    else
      System.out.println("convertToGrade() Test case 1 failed.");

    // Test case 2: Grade == B
    gradeCalculator.setPerfect(100);
    gradeCalculator.setScore(85);
    if (gradeCalculator.convertToGrade() == 'B')
      System.out.println("convertToGrade() Test case 2 passed.");
    else
      System.out.println("convertToGrade() Test case 2 failed.");

    // Test case 3: Grade == C
    gradeCalculator.setPerfect(100);
    gradeCalculator.setScore(75);
    if (gradeCalculator.convertToGrade() == 'C')
      System.out.println("convertToGrade() Test case 3 passed.");
    else
      System.out.println("convertToGrade() Test case 3 failed.");

    // Test case 4: Grade == D
    gradeCalculator.setPerfect(100);
    gradeCalculator.setScore(65);
    if (gradeCalculator.convertToGrade() == 'D')
      System.out.println("convertToGrade() Test case 4 passed.");
    else
      System.out.println("convertToGrade() Test case 4 failed.");

    // Test case 5: Grade == F
    gradeCalculator.setPerfect(100);
    gradeCalculator.setScore(55);
    if (gradeCalculator.convertToGrade() == 'F')
      System.out.println("convertToGrade() Test case 5 passed.");
    else
      System.out.println("convertToGrade() Test case 5 failed.");
  }

  public static void main(String[] args)
  {
    TestGradeCalculator testGradeCalculator = new TestGradeCalculator();
    Scanner sc = new Scanner(System.in);

    System.out.println("Which method do you wish to test? Enter \n\t1 for isValid(); " + 
                       "\n\t2 for convertMark(); \n\t3 for convertToGrade() \n\t4 for all");
    int option = sc.nextInt();
    if (option == 1)
      testGradeCalculator.testisValid();
    else if (option == 2)
      testGradeCalculator.testconvertMark();
    else if (option == 3)
      testGradeCalculator.testconvertToGrade();
    else
    {
      testGradeCalculator.testisValid();
      testGradeCalculator.testconvertMark();
      testGradeCalculator.testconvertToGrade();
    } // else
  } // main()
} // TestGradeCalculator class
