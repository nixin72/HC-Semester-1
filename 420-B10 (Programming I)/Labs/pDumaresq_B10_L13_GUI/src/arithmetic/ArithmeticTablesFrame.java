/**
 * 
 */
package arithmetic;

/**
 * @author pdumaresq
 * The purpose is to display different arithmetic tables.
 */


import java.awt.Window;
import java.awt.BorderLayout;

import javax.swing.*;

import java.awt.event.*;

public class ArithmeticTablesFrame
		extends JFrame
	  implements ActionListener
{
	private JButton btnSquaresAndCubes = new JButton("Squares and Cubes");
	private JButton btnAddition = new JButton("Addition Table");
	private JTextArea areaDisplay = new JTextArea(15 , 45);
	private JPanel buttonPanel;
	
	/**
	 * 
	 */
	public ArithmeticTablesFrame()
	{
		// TODO Auto-generated constructor stub
		setTitle("blah");
		buttonPanel = new JPanel();
		buttonPanel.add(btnSquaresAndCubes);
		buttonPanel.add(btnAddition);
		getContentPane().add(buttonPanel, BorderLayout.NORTH);
		getContentPane().add(areaDisplay, BorderLayout.CENTER);
		areaDisplay.setEditable(false);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnSquaresAndCubes)
	}

	private void displaySquaresAndCubes()
	{
		int j = 1;
		System.out.printf("%25s\n", "Squares and Cubes");
		System.out.printf("%25s\n", "-----------------");
		System.out.printf("%5s%15s%15s\n", "j", "j squared", "j cubed");
		while (j <= 15)
		{
			System.out.printf("%5d%15d%15d\n", j, j * j, j * j * j);
			++j;
		} // while (j <= 15)

	} // displaySquaresAndCubes()

	private void displayAdditionTable()
	{
		int row = 0;
		int col = 0;
		System.out.printf("%32s\n", "Addition Table");
		int j = 0;
		while (j < 50)
		{
			System.out.print("-");
			++j;
		}
		System.out.println();
		while (row < 10)
		{
			col = 1;
			while (col <= 10)
			{
				System.out.printf("%5d", row + col);
				++col;
			} // col <= 10
			System.out.println();
			++row;
		} // while (row < 10)
	} // displayAdditionTable()
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArithmeticTablesFrame tblFrame = new ArithmeticTablesFrame();
		tblFrame.setSize(450 , 350);
		tblFrame.setLocation(100 , 100);
		tblFrame.setVisible(true);
		tblFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
