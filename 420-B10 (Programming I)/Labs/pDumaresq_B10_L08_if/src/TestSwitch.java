/**
 * Title:        TestSwitch
 * Description:  This program demonstrates a switch statement
 * Copyright:    Copyright (c) 2001
 * Company:      Heritage College
 * @author Anne Hamilton
 * @version 1.0
 */

import java.util.Scanner;
public class TestSwitch
{
  public static void main(String args[]) 
  {
  // Local variables
    Scanner input = new Scanner(System.in);
    String inputString;
    char marcode;

  // Objects
    Person somebody = new Person();

    System.out.print("Enter a marital code: ");
    inputString = input.next();
    marcode = inputString.charAt(0);  // convert String to char
    marcode = Character.toUpperCase(marcode);
    somebody.setMaritalStatus(marcode);
    System.out.println("Individual's marital status is "
          + somebody.getFullStatus() + ".");
  } // main
} // TestSwitch class
