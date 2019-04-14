package leapYear;


import java.awt.Window;
import java.awt.BorderLayout;
import javax.swing.*;

import java.awt.event.*;
/**
 * This frame will determine whether or not a year is a leap year. 
 * Type the year in the field and hit enter.
 *  
 * @author Anne Hamilton
 * 
 */
public class LeapYearFrame
  extends JFrame
  implements ActionListener
{
  // instance variables
	private JTextField fldYear = new JTextField(10);
  private JLabel lblYear = new JLabel("What year do you want to check?");
  private JTextArea areaDisplay = new JTextArea(5, 10);
  private JPanel inputPanel;
  
  public LeapYearFrame()
  {
    setTitle("Leap Year Tester"); 
    inputPanel = new JPanel();
    inputPanel.add(lblYear);
    inputPanel.add(fldYear);
    getContentPane().add(areaDisplay, BorderLayout.SOUTH);
    getContentPane().add(inputPanel, BorderLayout.CENTER);
    areaDisplay.setEditable(false);
    fldYear.addActionListener(this);
  } // init()

  public void actionPerformed(ActionEvent e)
  {
    // convert text in integer and determine if it's a leap year
  	int year;
  	year = Integer.parseInt(fldYear.);
  	
  	Year.isLeapYear(year);
    // display message
//  	setText("");
  } // actionPerformed()

  public static void main(String[] args)
  {
    LeapYearFrame lyFrame = new LeapYearFrame();
    lyFrame.setSize(350, 150);
    lyFrame.setLocation(100, 150);
    lyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    lyFrame.setVisible(true);
  } // main()
} // LeapYearApplet