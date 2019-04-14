package booleanOperators;
import java.util.Scanner;

/**
 * Title:        MarkChecker
 * Description:  Demonstrate the use of Boolean operators in a realistic example
 * Copyright:    Copyright (c) 2001
 * Company:      Heritage College
 * @author Anne Hamilton
 * @version 1.0
 */
public class MarkChecker
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double mark;

    Student me = new Student();

    System.out.print("Enter your final mark (-999 to end): ");
    mark = input.nextDouble();

    if (me.setFinalMark(mark))
      System.out.println("Congratulations you entered a valid mark");
    else
      System.out.println("Oops, " + mark + " is not a valid mark");
    
    input.close();
  } // main
}  // MarkChecker class
