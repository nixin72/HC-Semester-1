/**
 * 
 */
package strings;

/**
 *This program illustrates the String.indexOf() and String.lastIndexOf() methods
 * @author pdumaresq
 *
 */
import java.util.Scanner;
public class IndexMethods
{
	static Scanner keyboard = new Scanner (System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String sentence;
		
		System.out.println("please type any sentance");
		sentence = keyboard.nextLine(); 
		
    int j = sentence.indexOf(' ');
    int k = sentence.lastIndexOf(' ');
    System.out.println("The first space is at position " + j);
    System.out.println("The last space is at position " + k);
 				
    j = sentence.indexOf(' ', j+1);
    k = sentence.lastIndexOf(' ', k-1);
    System.out.println("The second space is at position " 
    		+ j);
    System.out.println("The second last space is at position " 
    		+ k);
    
    j = sentence.indexOf(' ', j+2);
    k = sentence.lastIndexOf(' ', k-2);
    System.out.println("The third space is at position " 
    		+ j);
    System.out.println("The third last space is at position " 
    		+ k);
    
    //"The rain in Spain stays mainly in the plain"
    int r = sentence.indexOf(" in");
    int s = sentence.lastIndexOf(" in");
    int p = sentence.indexOf(" in");
    int m = sentence.lastIndexOf(" in");
    p = sentence.indexOf(" in", p+1);
    m = sentence.lastIndexOf(" in", m-1);
    System.out.println("The first \" in\" is at position " + r);
    System.out.println("The last \" in\" is at position " + s);
    System.out.println("The second \" in\" is at postion " + p);
    System.out.println("The second last \" in\" is at postion " + m);
	}

}
