package usingDebugger;
/**
 * Title:        Calculator
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:      Heritage College
 * @author Anne Hamilton
 * @version 1.0
 */
public class Calculator
{

  public double doArithmetic(double num1, double num2, int code)
  {
    double result;
    switch (code)
    {
      case 1:
        result = num1 + num2;
        break;
      case 2:
        result = num1 * num2;
        break;
      case 3:
        result = num1 / num2;
        break;
      default:
        result = 0;
    } // end of switch
    return result;
  } // doArithmetic(double, double, int)


} // Calculator class
