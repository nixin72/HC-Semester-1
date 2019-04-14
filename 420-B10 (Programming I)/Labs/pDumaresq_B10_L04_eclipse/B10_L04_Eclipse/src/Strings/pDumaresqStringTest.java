/**
 * 
 */
package Strings;

/**
 * @author pdumaresq
 *
 */
public class pDumaresqStringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String one = "one";
	    String two = "two";
	    String three = "three";
	    String four = two;
	    String five = "five";
	    String six = "";
	    int numberFour = 4;
	    char a = 'a';
	    String numbers;

	    System.out.println("one is " + one);
	    System.out.println("two is " + two);
	    System.out.println("three is " + three);
	    four = String.valueOf(numberFour);
	    System.out.println("four is " + four);
	    System.out.println("five is " + five);
	    	    System.out.println("six is " + six);
	    System.out.println("The length of one is " + one.length());
	    System.out.println("The length of three is " + three.length());
	    System.out.println("The length of six is " + six.length());
	    
	    numbers =  one + " " + two + " " + three + " " + four + " " + five;
	    System.out.println("numbers is " + numbers); 
	    System.out.println("The length of numbers is " + numbers.length());
	} // main()

} // StringTest class
