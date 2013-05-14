/*
 * File Name: PracticeQuestion02.java
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

public class PracticeQuestion02 extends JFrame {
	// Constants
	private static final long serialVersionUID = 1L;
	private static final double FR_WIDTH_FACTOR = 0.4;
	private static final double FR_HEIGHT_FACTOR = 0.4;
	
	public PracticeQuestion02() throws HeadlessException {
		super();
		// Setup the basic JFrame Window
		this.setTitle("What is your name.");
		int frWidth = (int)(FR_WIDTH_FACTOR * this.getToolkit().getScreenSize().width);
		int frHeight = (int)(FR_HEIGHT_FACTOR * this.getToolkit().getScreenSize().height);
		this.setSize( frWidth, frHeight );
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		
		this.setVisible(true);
		
		addComponents();
		addMenu();
		addToolbar();
	}
	
	private void addComponents() {
		JLabel FName = new JLabel("First Name: ");
		FName.setBounds( 50, 50, 100, 25 );
		this.add(FName);
		
		JTextField FNameInput = new JTextField();
		FNameInput.setBounds( 170, 50, 150, 25 );
		this.add(FNameInput);
		
		JLabel LName = new JLabel("Last Name: ");
		LName.setBounds( 50, 100, 100, 25 );
		this.add(LName);
		
		JTextField LNameInput = new JTextField();
		LNameInput.setBounds( 170, 100, 150, 25 );
		this.add(LNameInput);
		
		JButton submitButton = new JButton("Submit");
		JButton cancelButton = new JButton("Cancel");
		submitButton.setBounds( 50, 200, 120, 25 );
		cancelButton.setBounds( 200, 200, 120, 25 );
		this.add(submitButton);
		this.add(cancelButton);
		
	}

	private void addMenu() {
		JMenuBar menu = new JMenuBar();
		this.setJMenuBar(menu);
		
		JMenu fileMenu = new JMenu("File");
		JMenuItem fileOpen = new JMenuItem("Open");
		fileMenu.add(fileOpen);
		JMenuItem fileClose = new JMenuItem("Close");
		fileMenu.add(fileClose);
		JMenuItem fileExit = new JMenuItem("Exit");
		fileMenu.add(fileExit);
		
		menu.add(fileMenu);
	}
	
	private void addToolbar() {
		JToolBar toolbar = new JToolBar();
		this.add( toolbar, BorderLayout.PAGE_START );
		
		JButton cutButton = new JButton();
		cutButton.setIcon( new ImageIcon( "Cut.png", "Cut" ) );
		cutButton.setToolTipText( "Cut text" );
		toolbar.add(cutButton);
		
		JButton copyButton = new JButton();
		copyButton.setIcon( new ImageIcon("Copy.png", "Copy") );
		copyButton.setToolTipText( "Copy text" );
		toolbar.add(copyButton);
		
		JButton pasteButton = new JButton();
		pasteButton.setIcon( new ImageIcon("Paste.png", "Paste") );
		pasteButton.setToolTipText( "Paste text" );
		toolbar.add(pasteButton);
	}

	public static void main(String[] args) {
		new PracticeQuestion02();

	}
}
