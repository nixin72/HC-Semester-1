package usingDebugger;
/**
 * Title: CalculatorSwitch
 * Description: This program demonstrates the switch statement
 * Copyright:    Copyright (c) 2002
 * Company:      Heritage College
 * @author Anne Hamilton
 * @version 1.0
 */

import java.util.Scanner;
public class CalculatorSwitch
{

  public static void main(String args[]) 
  {
    Scanner input = new Scanner(System.in);
    int opselect;
    double fnum, snum;
    String inString;
    Calculator calc = new Calculator();

    System.out.println("Please type in first number: ");
    fnum = input.nextDouble();
    System.out.println("Please type in second number: ");
    snum = input.nextDouble();
    System.out.println("Enter a select code: ");
    System.out.println("  1 for addition");
    System.out.println("  2 for multiplication");
    System.out.println("  3 for division");
    opselect = input.nextInt();
    System.out.println("\nThe result is "
      + calc.doArithmetic(fnum, snum, opselect));
  } // main()
} // CalculatorSwitch
