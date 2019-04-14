/**
 * Title:        L03_Assignment_Operators
 * Description:  Demonstrate the assignment operations.
 * Copyright:    Copyright (c) 2015
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */

public class L03_Assignment_Operators
{
  public static void main(String[] args)
  {
     int sum;
     int j, k, m;

     j = 16;
     k = 5;
     m = 50;


     sum = 0;
     System.out.println("The value of sum is initially set to " + sum + ".");
     sum += 96;
     System.out.println("After adding 96, the sum is   " + sum + ".");
     sum += 70;
     System.out.println("After adding 70, the sum is   " + sum + ".");
     sum += 85;
     System.out.println("After adding 85, the sum is   " + sum + ".");
     sum += 60;
     System.out.println("After adding 60, the sum is   " + sum + ".");
     m %= ++k + ++j;
     System.out.println("m = " + m + "k = " + k + "j = " + j + ".");
   }
} // L03_Assignment_Operators
