/**
 * Title:        L03_Arithmetic_Operators
 * Description:  Demonstrate the arithmetic operators
 * Copyright:    Copyright (c) 2015
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */
import java.util.Scanner;
public class L03_Arithmetic_Operators
{
  public static void main(String[] args)
  {
Scanner keyboard = new Scanner (System.in);
    
    int j, k; 
    double x, y, z;

System.out.print("Please enter a j and a k value ");
j = keyboard.nextInt();
k = keyboard.nextInt();

System.out.print("Please enter an x and a y value ");
x = keyboard.nextDouble();
y = keyboard.nextDouble();

z = 2*((x/3)+(4*y/3));

    System.out.println("j/k is " + j/k);
    System.out.println("The remainder is j and k is " + j%k);
    
    System.out.println("x/y is " + x/y);
    System.out.println("x*y is " + x*y);

    System.out.println("z =  " + z);
    
  } // main
} // L03_Arithmetic_Operators class
