/*
 * File Name: PracticeQuestion04.java
 * Date:      May 13, 2013
 * Author:    Milan Sobat
 * Student #: 0469245
 * Course:    INFO-5051
 * Purpose:   
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class PracticeQuestion04 extends JFrame {
	// Constants
	private static final long serialVersionUID = 1L;
	private static final double FR_WIDTH_FACTOR = 0.17;
	private static final double FR_HEIGHT_FACTOR = 0.17;
	protected String[] comboChoices = { "Miles to Kilometers", "Kilometers to Miles" };
	protected JComboBox comboBox = new JComboBox(comboChoices);
	protected JTextField input = new JTextField();
	protected JTextField output = new JTextField();
	
	/*4. Code a Java GUI application which uses borderLayout to display a JFrame that looks very similar to this:

		Distance Converter GUI

		    The control at the top is a JTextField which is provided for user-input.
		    The control at the bottom is a non-editable (read-only) JTextField which is intended to display the calculation's result.
		    The control in the middle is a JComboBox which presents the two choices "Convert from kilometres to miles" and "Convert from miles to kilometres".
		    The control at the right is a JButton.
	 */


	public PracticeQuestion04() throws HeadlessException {
		super();
		// Setup the basic JFrame Window
		this.setTitle("Distance Converter");
		int frWidth = (int)(FR_WIDTH_FACTOR * this.getToolkit().getScreenSize().width);
		int frHeight = (int)(FR_HEIGHT_FACTOR * this.getToolkit().getScreenSize().height);
		this.setSize( frWidth, frHeight );
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout( new BorderLayout() );		
		
		addComponents();
	}
	
	private void addComponents() {
		comboBox.addActionListener( new cmbBoxListener() );
		
		this.add( input, BorderLayout.NORTH );		
		this.add( comboBox, BorderLayout.CENTER );
		
		JButton convertButton = new JButton("Convert");
		convertButton.addActionListener( new convertButtonListener() );
		this.add( convertButton, BorderLayout.EAST );		
		
		output.setEditable(false);
		this.add( output, BorderLayout.SOUTH );
		
		this.setVisible(true);
		
	}
	
	private class cmbBoxListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input.setText("");
			output.setText("");
		}
	}
	
	private class convertButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {	
			try {
				if ( comboBox.getSelectedIndex() == 0 )
					output.setText( Double.toString( Double.parseDouble( input.getText() )* 1.6));
				else
					output.setText( Double.toString( Double.parseDouble( input.getText() )* 0.62));	
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Please enter a numeric value to convert.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public static void main(String[] args) {
		new PracticeQuestion04();

	}
}
