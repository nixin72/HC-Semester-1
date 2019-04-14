package b10_l12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFirstFrame extends JFrame implements ActionListener {
private JButton when;
	public void actionPerformed(ActionEvent e)
		{
    String msg = when.getText();
    if (msg.equals("NOW!"))
      when.setText("THEN!");
    else if (msg.equals("THEN!"))
      when.setText("NEVER!");
    else 
      when.setText("NOW!");
		} // actionPerformed(ActionEvent)

	public MyFirstFrame()	{

		setTitle("Philip's First Frame");
		when = new JButton("NOW!");
		getContentPane().add(when, BorderLayout.CENTER);
		when.addActionListener(this); 
	}

	public static void main(String[] args)	{
		
		
		MyFirstFrame frame = new MyFirstFrame();
		frame.setSize(300, 200);
		frame.setLocation(100, 150);
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setVisible(true);

	}

}
