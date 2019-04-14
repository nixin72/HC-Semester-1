package booleanOperators;

import java.util.Scanner;

public class DayPlanner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int hour;
		String Mon, Tues, Wed, Thur, Fri, Sat, Sun;
		Sat = "Sat";
		Sun = "Sun";
		System.out.println("Enter day abbreviation: ");
		String day = keyboard.next();
		System.out.println("Enter time: ");
		String time = keyboard.next();
		if (time <= 2 )
			hour = Integer.parseInt(time);
		else if (time > 2)
			time.substring(0, indexOf(:));
		if (hour >= 22:00 && hour <= 6:00)
			System.out.println("Sleep");
		else if (day == Sat || day == Sun)
			System.out.println("Weekend");
		
		else
			if (hour >= 8:00 && hour <= 18:00)
				System.out.println("School");
			else
				if (hour >= 19:00 && hour < 22:00)
					System.out.println("Homework");
				else if (hour >= 24:00)
					System.err.println("Error: invalid time. Time must be between 00:00 - 23:59"); 
				else
					System.out.println("Between activities");
		keyboard.close();
	} // main()
} // DayPlanner class
