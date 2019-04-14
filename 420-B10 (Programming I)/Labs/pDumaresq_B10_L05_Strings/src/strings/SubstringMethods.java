package strings;
import java.util.Scanner;

/**
 * This program illustrates the String.substring() method.
 * @author Philip Dumaresq
 *
 */
public class SubstringMethods
{
		public static void main(String[] args)
		{
		  String sentence;
			char ch;
		  char lc;
		  Scanner keyboard = new Scanner(System.in);
			System.out.print("Please enter a sentence: ");
						
			sentence = keyboard.nextLine();
			ch = sentence.charAt(0);
			lc = sentence.charAt(sentence.length()-1);
			System.out.println("The first character in the sentence is '" + ch + "'.");
			System.out.println("The last character in the sentance is '" + lc + "'.");
		  		
			int startIndex;
			System.out.print("Enter an integer less than " 
			      + sentence.length()+ "> ");
			startIndex = keyboard.nextInt();
			String sub = sentence.substring(startIndex); // extract the
							// substring that starts at the index read in
			System.out.println("The substring starting at position " 
				   + startIndex + " is \"" + sub + "\"");

			sub = sentence.substring(1, 3);
			System.out.println("substring(1, 3) is  \"" + sub + "\"");

			sub = sentence.substring(3);
			System.out.println("substring(3) is  \"" + sub + "\"");
			
			sub = sentence.substring(4);
			System.out.println("substring(4) is  \"" + sub + "\"");
			
			sub = sentence.substring(5);
			System.out.println("substring(5) is  \"" + sub + "\"");
			
			sub = sentence.substring(6);
			System.out.println("substring(6) is  \"" + sub + "\"");
			
			sub = sentence.substring(7);
			System.out.println("substring(7) is  \"" + sub + "\"");
			
			sub = sentence.substring(startIndex, startIndex + 3);
			System.out.println("The 3 characters starting at position " 
					+ startIndex + " are \"" + sub + "\"");
	
			int h;
   		h = sentence.indexOf(" ");
			sub = sentence.substring(0, h);
			System.out.println("The first word is  \"" + sub + "\"");
			
			}  // main()
}  // SubstringMethods class