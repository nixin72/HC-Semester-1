/**
 * 
 */
package strings;

/**
 * @author pdumaresq
 *
 */
import java.util.Scanner;
public class JavaPsychiatrist
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Tell me how you feel. "
				+ " Begin your sentence with \"I am\" and finish with a period");
	
		String mood = keyboard.nextLine();
		String response = mood.toLowerCase();
		response = response.replaceFirst("i am", "So, you are");
		response = response.replace('.', '?');
		
		System.out.println(response);
		System.out.println("Tell me more");
		System.out.println("Tell me something that you love. "
				+ "Begin your sentence with \"I love\" and finish with a period.");	
		
		String text = keyboard.nextLine();
		String response2 = text.toLowerCase();
		response2 = response2.replaceFirst("i", "You");
		response2 = response2.replace(".", "!");
		
		int lastWordBeginsAt = response2.lastIndexOf(" ");
		String lastWord; 		
		String firstPart;
		
		//I tried for a lot and just didn't understand how to do this part. 
		
		System.out.println(response2);
		
			
		
	}

}
