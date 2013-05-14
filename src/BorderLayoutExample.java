/*
 * File Name: BorderLayoutExample.java
 * Date:      May 9, 2013
 * Author:    Milan Sobat
 * Student #: 0469245
 * Course:    INFO-5051
 * Purpose:   Review of border layouts.
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample extends JFrame {
	// Constants
	private static final long serialVersionUID = 1L;
	private static final double FR_WIDTH_FACTOR = 0.5;
	private static final double FR_HEIGHT_FACTOR = 0.5;

	public BorderLayoutExample() throws HeadlessException {
		super();
		// Setup the basic JFrame Window
		this.setTitle("");
		int frWidth = (int)(FR_WIDTH_FACTOR * this.getToolkit().getScreenSize().width);
		int frHeight = (int)(FR_HEIGHT_FACTOR * this.getToolkit().getScreenSize().height);
		this.setSize( frWidth, frHeight );
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Use BorderLayout
		this.setLayout( new BorderLayout() );
		
		// Add buttons to the JFrame Window
		JButton northButton = new JButton("North Button");
		this.add( northButton, BorderLayout.NORTH );
		JButton southButton = new JButton("South Button");
		this.add( southButton, BorderLayout.SOUTH );
		JButton eastButton = new JButton("East Button");
		this.add( eastButton, BorderLayout.EAST );
		JButton westButton = new JButton("West Button");
		this.add( westButton, BorderLayout.WEST );
		JButton centreButton = new JButton("Centre Button");
		this.add( centreButton, BorderLayout.CENTER );
		this.setVisible(true);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutExample();
	}
}
