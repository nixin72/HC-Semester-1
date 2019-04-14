package arithmetic;

import java.util.Scanner;

public class ArithmeticTables
{
		public static void main(String[] args)
		{
			Scanner keyboard = new Scanner(System.in);
			int option = 0;
			while (option != 3)
			{
				System.out.println("Arithmetic Tables\n");
				System.out.println("Select one of the following options:");
				System.out.println("  1. Table of squares and cubes");
				System.out.println("  2. Addition Table");
				System.out.println("  3. Exit");
				option = keyboard.nextInt();
				switch (option)
				{
				case 1:
					displaySquaresAndCubes();
					break;
				case 2:
					displayAdditionTable();
					break;
				case 3:
					System.out.println("Thank you for using this program.");
					break;
				default:
					System.err.println("Invalid option. You must enter 1, 2 or 3");
				} // switch
				if (option != 3)
				{
					System.out.println("Hit any key to continue");
					keyboard.nextLine();
					keyboard.nextLine();
				}
			} // while (option != 3) 
		} // main()}

		public static void displaySquaresAndCubes()
		{
			int j = 1;
			System.out.printf("%25s\n", "Squares and Cubes");
			System.out.printf("%25s\n", "-----------------");
			System.out.printf("%5s%15s%15s\n", "j", "j squared", "j cubed");
			while (j <= 15)
			{
				System.out.printf("%5d%15d%15d\n", j, j * j, j * j * j);
				++j;
			} // while (j <= 15)

		} // displaySquaresAndCubes()

		public static void displayAdditionTable()
		{
			int row = 0;
			int col = 0;
			System.out.printf("%32s\n", "Addition Table");
			int j = 0;
			while (j < 50)
			{
				System.out.print("-");
				++j;
			}
			System.out.println();
			while (row < 10)
			{
				col = 1;
				while (col <= 10)
				{
					System.out.printf("%5d", row + col);
					++col;
				} // col <= 10
				System.out.println();
				++row;
			} // while (row < 10)
		} // displayAdditionTable()

	} // ArithmeticTables class