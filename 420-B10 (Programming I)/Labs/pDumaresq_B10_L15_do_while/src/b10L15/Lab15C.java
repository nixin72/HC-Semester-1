package b10L15;
import java.util.Scanner;
// Class Name:	Lab15C
// Purpose:		This class asks the user to repeatedly input a value for age
//			until it is between 1 and 100.
//
// Input:		age - an individual's age
// Output:		An error message is issued if the age is not between 1 and 100
//
public class Lab15C
{
  public static void main(String[] args)
  {
    readAge();
  } // main()

  public static void readAge()
  {
    Scanner input = new Scanner(System.in);
    char confirm = 'n';
    int age;
    boolean validAge = false;

    System.out.print("Enter an age between 0 and 100> ");
    do
    {
      age = input.nextInt();
      // Set validAge here
      // Add test for invalid age here
      System.out.print(age + " is not between 0 and 100." + 
                       " Please Re-enter> ");
    }
    while (false); // Correct while condition here
    System.out.println(age + " is a valid age. Thank-you");
  } // readAge()
}	// Lab15C class
