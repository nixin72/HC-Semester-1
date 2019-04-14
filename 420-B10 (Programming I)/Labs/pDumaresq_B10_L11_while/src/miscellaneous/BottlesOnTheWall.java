/**
 * 
 */
package miscellaneous;

/**
 * @author pdumaresq
 *
 */
public class BottlesOnTheWall
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		int bottles = 99;
		
		while (bottles > 0)
		{
		System.out.println( bottles + " bottles of beer on the wall. " + bottles + " bottles of beer. \n"
				+ "take one down, pass it around, " + bottles + " bottles of beer on the wall.");
		
		bottles--;
		}
	}

}
