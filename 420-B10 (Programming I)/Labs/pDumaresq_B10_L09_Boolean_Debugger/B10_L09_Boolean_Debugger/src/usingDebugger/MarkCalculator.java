package usingDebugger;
import java.io.*;

import java.util.Scanner;

/**
 * File:  MarkCalculator.java
 * Debugger's name:
 * Purpose: To calculate a percentage mark on a test. 
 */
public class MarkCalculator
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    GradeCalculator myGrades = new GradeCalculator();
    int score;
    int perfect;
    System.out.print("Please enter your score on the test: ");
    score = input.nextInt();
    myGrades.setScore(score);
    System.out.print("Please enter the perfect score for the test: ");
    perfect = input.nextInt();
    myGrades.setPerfect(perfect);
    if (myGrades.isValid())
    {
      myGrades.convertMark();
      System.out.print("Do you wish to know your letter grade? ");
      char ans = input.next().charAt(0);
      System.out.println("The percentage for a score of " + 
                         myGrades.getScore() + " on a test out of " + 
                         myGrades.getPerfect() + " is " + 
                         myGrades.convertMark() + "%");
      if (ans == 'y')
        System.out.println("Your letter grade is " + myGrades.convertToGrade());
      System.out.println("Thank you for using the grade conversion program.");
    }
    else
      System.out.println("An invalid score was entered . Please rerun the program.");
  } // main()
} // MarkCalculator