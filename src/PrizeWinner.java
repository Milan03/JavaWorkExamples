/*
 * File Name: PrizeWinner.java
 * Date:      May 8, 2013
 * Author:    Milan Sobat
 * Student #: 0469245
 * Course:    INFO-5051
 * Purpose:   
 */

import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.*;

public class PrizeWinner extends JFrame {
	
	
	public PrizeWinner() throws HeadlessException {
		super();
		
		// Set-up the JFrame window
		this.setTitle( "You win!" );
		this.setDefaultCloseOperation( EXIT_ON_CLOSE );
		Dimension scrSize = this.getToolkit().getScreenSize();
		this.setSize( scrSize.width / 2, scrSize.height / 2 );
		this.setLocationRelativeTo( null );
		
		// Add components to the JFrame Window
		addComponents();
		
		// Display the JFrame window
		this.setVisible( true );
	}
	
	private void addComponents() {
		// Remove the default layout manager
		this.setLayout(null);
		
		//Add a heading
		JLabel heading = new JLabel("You've won a prize!");
		heading.setSize( 250, 30 );
		heading.setLocation( 140, 30 );
		Font oldFont = heading.getFont();
		Font newFont = new Font( oldFont.getFontName(), Font.BOLD, 32 );
		heading.setFont(newFont);
		this.add(heading);
		
		// Add a name prompt
		JLabel namePrompt = new JLabel("Enter your name:");
		namePrompt.setBounds(80, 100, 200, 30);
		this.add(namePrompt);
		
		// Add a name input field
		JTextField nameInput = new JTextField();
		nameInput.setBounds(250, 100, 200, 30);
		this.add(nameInput);
		
		// Add a name prompt
		JLabel emailPrompt = new JLabel("Enter your name:");
		emailPrompt.setBounds(80, 150, 200, 30);
		this.add(emailPrompt);
				
		// Add a name input field
		JTextField emailInput = new JTextField();
		emailInput.setBounds(250, 150, 200, 30);
		this.add(emailInput);
		
		//Add a submit button
		JButton submitButton = new JButton("Submit");
		submitButton.setBounds(200, 200, 100, 50);
		this.add(submitButton);
	
	}

	public static void main(String[] args) {
		PrizeWinner winner = new PrizeWinner();
	}

}
