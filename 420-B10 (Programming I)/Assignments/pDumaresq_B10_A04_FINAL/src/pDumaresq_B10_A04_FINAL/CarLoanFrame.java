package pDumaresq_B10_A04_FINAL;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;

public class CarLoanFrame extends JFrame implements ActionListener {

	CarLoan reach = new CarLoan();
	
	private JLabel lblMonthlyPayment = new JLabel("Monthly Payment: ");
	private JLabel lblInterestRate = new JLabel("Interest rate (percentage): ");
	private JTextField fldMonthlyPayment = new JTextField(15);
	private JTextField fldInterestRate = new JTextField(15);

	private JButton btnCalculate = new JButton("Calculate now!");

	private JPanel inputPanel = new JPanel();
	private JTextArea areaDisplay = new JTextArea(5, 2);

	public CarLoanFrame() {
		setTitle("Car Loan Calculator");

		inputPanel.add(lblMonthlyPayment);
		inputPanel.add(fldMonthlyPayment);
		inputPanel.add(lblInterestRate);
		inputPanel.add(fldInterestRate);
		inputPanel.add(btnCalculate);

		getContentPane().add(inputPanel, BorderLayout.NORTH);
		getContentPane().add(areaDisplay, BorderLayout.CENTER);

		areaDisplay.setEditable(false);
		areaDisplay.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnCalculate.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			File integerFile = new File("CarLoan.txt");
			Scanner inFile = new Scanner(integerFile);
			inFile = inFile.useDelimiter("~|\r\n");

// First Row
			String car = "Car";
			String loan = "loan";
			String monthly = "monthly";
			String number = "number of";
			String total = "total";
			String cash = "Total";
// Second Row
			String amount = "amount";
			String payment = "payment";
			String NumberPayments = "payments";
			String interest = "Interest";
			String paid = "Paid";
// Third Row
			String breaker1 = "-------------------- ";
			String breaker2 = "------------ ";
			String breaker3 = "--------- ";
			String breaker4 = "------------ ";
			String breaker5 = "------------- ";
			String breaker6 = "--------------";
// Data Row
			
// First
			areaDisplay.append(String.format("%3s", car));
			areaDisplay.append(String.format("%30s", loan));
			areaDisplay.append(String.format("%10s", monthly));
			areaDisplay.append(String.format("%13s", number));
			areaDisplay.append(String.format("%14s", total));
			areaDisplay.append(String.format("%15s", cash));
// Second
			areaDisplay.append(String.format("\n%33s", amount));
			areaDisplay.append(String.format("%10s", payment));
			areaDisplay.append(String.format("%13s", NumberPayments));
			areaDisplay.append(String.format("%14s", interest));
			areaDisplay.append(String.format("%15s", paid));
// Third
			areaDisplay.append("\n" + breaker1);
			areaDisplay.append(breaker2);
			areaDisplay.append(breaker3);
			areaDisplay.append(breaker4);
			areaDisplay.append(breaker5);
			areaDisplay.append(breaker6);
			
			
	// reading the next lines
			String carName;
			double carPrice;
			double interestRate = 0;
			double monthly1;
			
			while (inFile.hasNext()) {
				areaDisplay.append("\n");
				carName = inFile.next();
				carPrice = inFile.nextInt();
					
//				reach.setMake(carName);
				reach.setLoanAmount(carPrice);
				reach.setInterest(interestRate);
				
				reach.setMonthlyPayment(Double.parseDouble(fldMonthlyPayment.getText()));
				reach.setInterest(Double.parseDouble(fldInterestRate.getText()));
	// Actual output
			areaDisplay.append(String.format("%20s" , carName));
			areaDisplay.append(String.format("%13s" , String.valueOf(carPrice)));
			areaDisplay.append(String.format("%10s" , String.valueOf(reach.getMonthlyPayment())));
			areaDisplay.append(String.format("%13s" , String.valueOf(reach.calculateTimesPayed())));
			areaDisplay.append(String.format("%14s" , String.valueOf(reach.calculateTotalInterest())));
			areaDisplay.append(String.format("%15s" , String.valueOf(reach.calculateTotalCost())));
			
			}
			
					
		} // try
		catch (FileNotFoundException e1) {
			System.out.println(e1.toString());
			System.exit(-1);
			
		} // catch (FileNotFoundException e)

	} // actionPerformed()

	public static void main(String[] args) {
		CarLoanFrame frame = new CarLoanFrame();
		frame.setSize(650, 400);
		frame.setLocation(720, 0);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	} // main()
} // CarLoanFrame class






