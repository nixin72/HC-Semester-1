/**
 * 
 */
package arithmetic;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Display different arithmetic tables
 * @author Anne Hamilton
 *
 */
public class ArithmeticTablesFrame extends JFrame implements ActionListener
{

	private JButton btnSquaresAndCubes;
	private JTextArea areaDisplay;
	private JPanel buttonPanel;

	/**
	 * 
	 */
	public ArithmeticTablesFrame()
	{
		setTitle("Arithmetic Tables");
		btnSquaresAndCubes = new JButton("Squares and Cubes");
		areaDisplay = new JTextArea(15, 45);
		areaDisplay.setFont(new Font("Monospaced", Font.PLAIN, 12));
		buttonPanel = new JPanel();
		buttonPanel.add(btnSquaresAndCubes);
		getContentPane().add(buttonPanel, BorderLayout.NORTH);
		getContentPane().add(new JScrollPane(areaDisplay), BorderLayout.CENTER);
		areaDisplay.setEditable(false);
		btnSquaresAndCubes.addActionListener(this);
	} // ArithmeticTablesFrame()
	
	private void displaySquaresAndCubes() {
		String title;
		title = "Squares and cubes";
		areaDisplay.setText(String.format("%25s" , title));
		areaDisplay.append(String.format("blah"));
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
//		String msg = btnSquaresAndCubes.getText();
//			if (msg.equals("SquaresAndCubes"))
			String title = "Squares and Cubes";
			String breakerHeader = "-----------------";
			String breaker1 = "--";
			String breaker2 = "---------";
			String breaker3 = "-------";
			String header1 = "j";
			String header2 = "j squared";
			String header3 = "j cubed";
			int num;
			areaDisplay.setText(String.format("%25s" , title ));	
			areaDisplay.append(String.format("\n%25s" , breakerHeader ));	
			areaDisplay.append(String.format("\n%5s" , header1 ));
			areaDisplay.append(String.format("%15s" , header2 ));
			areaDisplay.append(String.format("%15s" , header3 ));
			areaDisplay.append(String.format("\n%5s" , breaker1 ));
			areaDisplay.append(String.format("%15s" , breaker2 ));
			areaDisplay.append(String.format("%15s" , breaker3 ));
			areaDisplay.append("\n");
			for (num = 1 ; num <= 15 ; num++) {
				areaDisplay.append(String.format("%5d" , num));
				areaDisplay.append(String.format("%15d" , (num * num)));
				areaDisplay.append(String.format("%15d " , (num * num * num)));
				areaDisplay.append("\n");
				

			}
				

	} // actionPerformed()

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArithmeticTablesFrame frame = new ArithmeticTablesFrame();
		frame.setSize(400,600);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	} // main()

} // ArithmeticTablesFrame class
