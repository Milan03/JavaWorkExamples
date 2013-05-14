/*
 * File Name: FlowLayoutExample.java
 * Date:      May 9, 2013
 * Author:    Milan Sobat
 * Student #: 0469245
 * Course:    INFO-5051
 * Purpose:   Review of layout managers.
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class FlowLayoutExample extends JFrame {
	// Constants
	private static final long serialVersionUID = 1L;
	private static final double FR_WIDTH_FACTOR = 0.5;
	private static final double FR_HEIGHT_FACTOR = 0.5;
	
	public FlowLayoutExample() throws HeadlessException {
		super();
		// Setup the basic JFrame Window
		this.setTitle("");
		int frWidth = (int)(FR_WIDTH_FACTOR * this.getToolkit().getScreenSize().width);
		int frHeight = (int)(FR_HEIGHT_FACTOR * this.getToolkit().getScreenSize().height);
		this.setSize( frWidth, frHeight );
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Use FlowLayout
		this.setLayout(new FlowLayout());
		
		// Add some buttons to the JFrame
		JButton[] buttonsArray = new JButton[10];
		for( int i = 0; i < buttonsArray.length; ++i ) {
			buttonsArray[i] = new JButton( "Button " +(i+1) );
			this.add( buttonsArray[i] );
		}
		
		this.setVisible(true);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutExample();
	}
}
