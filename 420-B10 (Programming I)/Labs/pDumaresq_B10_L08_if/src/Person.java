/**
 * Title:        Person Class
 * Description:  Represents a person
 * Copyright:    Copyright (c) 2001
 * Company:      Heritage College
 * @author Philip Dumaresq
 * @version 1.0
 */

public class Person
{
  // instance variables
  private char maritalStatus;
  // constructor

  public Person()
  {
  } // default constructor
  // public methods

  public void setMaritalStatus(char status)
  {
    maritalStatus = status;
  } // setMaritalStatus(char)

  public String getFullStatus()
  {
  	String status;
  	switch (maritalStatus)
  	{
  	    case 'M':
  	    {
  	        System.out.println("in case 'M'");
  	        status = "married";
  	        break;
  	    } // case 'M'
  	    case 'C':
  	    {
  	    		System.out.println("in case 'C'");
  	    		status = "child";
  	    		break;
  	    }
  	    case 'S':
  	    {
  	        System.out.println("in case 'S'");
  	        status = "single";
  	        break;
  	    } // case 'S'
  	    case 'D':
  	    {
  	       System.out.println("in case 'D'");
  	       status = "divorced";
  	       break;
  	    } // case 'D'
  	    case 'W':
  	    {
  	        System.out.println("in case 'W'");
  	        status = "widowed";
  	        break;
  	    } // case 'W'
  	    default:
  	    {
  	        System.out.println("in default");
  	        status = "unknown";
  	    } // default} // switch
  		}
  	 return status;
  	 // getFullStatus()
  	}

} // Person class
