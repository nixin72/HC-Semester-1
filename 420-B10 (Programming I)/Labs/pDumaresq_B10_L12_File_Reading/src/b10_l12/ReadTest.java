package b10_l12;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTest
{

	public static void main(String[] args)
	{
		File integerFile;
		File realFile;
		Scanner inFile = null;
		Scanner inFile2 = null;
		double total, total2;
		total = 0;
		total2 = 0;
		try
		{
			integerFile = new File("someIntegers.dat");
			inFile = new Scanner(integerFile);
		}
		catch (FileNotFoundException e)
		{
			System.err.println("someIntegers.dat could not be found.");
			System.exit(-1);
		} // catch (FileNotFoundException e)
		catch (IOException e)
		{
			System.err.println("I/O error. " + e.getMessage());
			System.exit(-2);
		} // catch (IOException)
		int num1, num2;
		num1 = inFile.nextInt();
		num2 = inFile.nextInt();
		System.out.println("num1 is " + num1);
		System.out.println("num2 is " + num2);
		System.out.println("inFile.hasNext() is " + inFile.hasNext());

		int count = 3;
		
		while (inFile.hasNext())
		{
			num1 = inFile.nextInt();
			System.out.println("The count is " + count + ". The number read is "
					+ num1);
			++count;
			total += num1 + num2;
			System.out.println("inFile.hasNext() is " + inFile.hasNext());
		} // while (inFile.hasNext())
		inFile.close();
	
		
		try
		{
			realFile = new File("someReals.dat");
			inFile2 = new Scanner(realFile);
		}
		catch (FileNotFoundException e)
		{
			System.err.println("someReals.dat could not be found.");
			System.exit(-1);
		} // catch (FileNotFoundException e)
		catch (IOException e)
		{
			System.err.println("I/O error. " + e.getMessage());
			System.exit(-2);
		} // catch (IOException)
		double num3, num4;
		num3 = inFile2.nextDouble();
		num4 = inFile2.nextDouble();
		System.out.println("num1 is " + num3);
		System.out.println("num2 is " + num4);
		System.out.println("inFile2.hasNext() is " + inFile2.hasNext());

		int count1 = 0;
		while (inFile2.hasNext())
		{
			num3 = inFile2.nextDouble();
			System.out.println("The count is " + count + ". The number read is "
					+ num3);
			++count;
			total2 += num3 + num4;
			System.out.println("inFile2.hasNext() is " + inFile2.hasNext());
		} // while (inFile2.hasNext())
		System.out.println("The average is "+Math.round((total2 / count) * 100.0) / 100.0);
		inFile2.close();
	}

}
/*
	 
*/