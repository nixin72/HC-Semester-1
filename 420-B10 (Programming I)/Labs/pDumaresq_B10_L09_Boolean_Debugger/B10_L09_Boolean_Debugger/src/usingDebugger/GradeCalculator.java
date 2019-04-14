package usingDebugger;
import java.io.*;

/**
 * Title:        420-B10 Labs - Fall, 2008
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author Anne Hamilton
 * @version 1.0
 */
public class GradeCalculator
{
  private int score;
  private int perfect;

  public GradeCalculator()
  {
    score = 0;
    perfect = 0;
  } // GradeCalculator()

  /**
   * Verifies that the score is between 0 and the perfect score
   * @return true if score is between 0 and the perfect score; otherwise returns false
   */
  public boolean isValid()
  {
    if ((score <= perfect) || (score >= 0))
      return true;
    else
      return false;
  } // isValid()

  /**
   * Converts the mark to a percentage
   * @require 0 <= score <= perfect 
   *          perfect > 0
   * @ensure 0 <= percent <= 100
   */
  public int convertMark()
  {
    int percent;
    percent = score / perfect * 100;
    return percent;
  } // convertMark()

  /**
   * Converts the percentage to a letter grade
   * @require 0 <= percent <= 100
   * @ensure grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F' 
   */
  public char convertToGrade()
  {
    char grade = ' ';
    int percent = convertMark();
    if (percent >= 90)
      grade = 'A';
    if (percent >= 80)
      grade = 'B';
    if (percent >= 70)
      grade = 'C';
    if (percent >= 60)
      grade = 'D';
    if (percent < 60)
      grade = 'F';
    return grade;
  } // convertToGrade()

  public void setScore(int sc)
  {
    score = sc;
  }

  public int getScore()
  {
    return score;
  }

  public void setPerfect(int perf)
  {
    perfect = perf;
  }

  public int getPerfect()
  {
    return perfect;
  }
} // GradeCalculator class
