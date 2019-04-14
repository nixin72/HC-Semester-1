/**
 * Title:        Temperature Converter
 * Description:	 
 * Company:      Heritage College
 * @author Philip
 * @version 1.0
 */
import java.util.Scanner;
public class TemperatureConverter
{

  public static void main(String args[])
  {
    Scanner keyboard = new Scanner (System.in);
    int celsiusTemperature;
    double fahrenheitTemperature;

    String yourName;

    System.out.print("What is your name? ");
    yourName = keyboard.next();
    System.out.println("Hello " + yourName);


    System.out.print("What is the temperature in Celsius? ");
    celsiusTemperature = keyboard.nextInt();

  
    fahrenheitTemperature = (celsiusTemperature/5 *9) +32;

    System.out.println("Celsius temperature is " 
                        + celsiusTemperature);
    System.out.println("Fahrenheit temperature is "
                        + fahrenheitTemperature);
  } // main(String[])
} // TemperatureConverter class
