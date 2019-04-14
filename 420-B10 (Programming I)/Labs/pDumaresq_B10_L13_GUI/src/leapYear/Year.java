package leapYear;
/**
 * Title:        420-B10 Java Labs
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:      Heritage College
 * @author Anne Hamilton
 * @version 1.0
 */

public class Year
{

  private Year()
  {
  }

  public static boolean isLeapYear(int yyyy)
  {
    if (yyyy % 4 > 0)
      return false;
    else if (yyyy % 100 > 0)
      return true;
    else if (yyyy % 400 > 0)
      return false;
    else
      return true;
  } // isLeapYear(int)
} // Year