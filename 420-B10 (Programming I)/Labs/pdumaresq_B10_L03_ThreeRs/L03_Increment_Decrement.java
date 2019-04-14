/**
 * Title:        L03_AutoIncrement_Decrement
 * Description:  Demonstrate the autoincrement and autodecrement operators.
 * Copyright:    Copyright (c) 2015
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */

public class L03_Increment_Decrement
{
  public static void main(String[] args)
  {
    int count;

    count = 0;
    System.out.println("The initial value of count is " + count + ".");
    count = count + 1;
    System.out.println("   count is now " + ++count + ".");
    count = count + 1;
    System.out.println("   count is now " + ++count + ".");
    count = count + 1;
    System.out.println("   count is now " + ++count + ".");
    count = count + 1;
    System.out.println("   count is now " + ++count + ".");
    
    int j = 17;
    int k = 5;
    int m = 50;

    System.out.println("To start: j = " + j + "; k= " + k);
    j = k++ * 3;
    System.out.println("After j = k++ *3 : j = " + j + "; k= " + k);
    j = 17;
    k = 5;
    j = ++k;
    System.out.println("After j = ++k : j = " + j + "; k= " + k);
    j = 17;
    k = 5;
    j = k--;
    System.out.println("After j = k-- : j = " + j + "; k= " + k);
    j = 17;
    k = 5;
    j = --k;
    System.out.println("After j = --k : j = " + j + "; k= " + k);

  

    System.out.println("To start: j = " + j + "; k= " + k);
    j = --k + 2;
    System.out.println("After j = --k + 2 : j = " + j + "; k= " + k);
    j = k++ *3;
    System.out.println("After j = k++ * 3 : j = " + j + "; k= " + k);


  } // main
} // L03_Increment_Decrement class
