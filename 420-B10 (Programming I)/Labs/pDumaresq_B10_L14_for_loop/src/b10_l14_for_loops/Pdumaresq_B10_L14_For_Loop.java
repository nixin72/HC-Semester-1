/**
 * 
 */
package b10_l14_for_loops;

/**
 * @author pdumaresq
 *
 */
public class Pdumaresq_B10_L14_For_Loop
{

	public static void main(String[] args)
	{
		int j;

//		Part A		
		
		System.out.println("Part A First Loop");
		j = 1;
		for (j = 7 ; j <= 10 ; ++j) {
			System.out.println("j = " + j);
		}
		System.out.println("Final vaule of j is " + j);
		System.out.println("\nPart A second loop");
		for (j = 0 ; j <= 20 ; j += 5) {
			System.out.println("j = " + j);
		}
		System.out.print("\n");
		
//		Part B 
		
		System.out.println("Part B counting down");
		for (j = 100 ; j >= 90 ; --j) {
				System.out.println("j = " + j);
		}
		System.out.print("\n");
		
//		Part D
		
		System.out.println("Part D Character Counters");
		System.out.print("\n");
		for (char ch = 'A' ; ch <= 'Z' ; ++ch) {
			System.out.print(ch);
		}
		
		System.out.println("");
		
		for (char dh = 'a' ; dh <= 'z' ; ++dh) {
			System.out.print(dh);
		}
	}

}
