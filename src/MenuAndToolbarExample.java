/*
 * File Name: MenuAndToolbarExample.java
 * Date:      May 9, 2013
 * Author:    Milan Sobat
 * Student #: 0469245
 * Course:    INFO-5051
 * Purpose:   How to add menus and toolbars.
 */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class MenuAndToolbarExample extends JFrame {
	// Constants
	private static final long serialVersionUID = 1L;
	private static final double FR_WIDTH_FACTOR = 0.5;
	private static final double FR_HEIGHT_FACTOR = 0.5;	
	
	public MenuAndToolbarExample() throws HeadlessException {
		super();
		// Setup the basic JFrame Window
		this.setTitle("Menu and Toolbar Examples");
		int frWidth = (int)(FR_WIDTH_FACTOR * this.getToolkit().getScreenSize().width);
		int frHeight = (int)(FR_HEIGHT_FACTOR * this.getToolkit().getScreenSize().height);
		this.setSize( frWidth, frHeight );
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Add components
		addMenu();
		addToolbar();
		
		this.setVisible(true);
	}

	private void addMenu() {
		// Add menu bar
		JMenuBar mainMenu = new JMenuBar();
		this.setJMenuBar(mainMenu);
		
		// Add a File menu
		JMenu fileMenu = new JMenu("File");
		JMenuItem fileOpen = new JMenuItem("Open");
		fileMenu.add(fileOpen);
		JMenuItem fileClose = new JMenuItem("Close");
		fileMenu.add(fileClose);
		JMenuItem fileExit = new JMenuItem("Exit");
		fileMenu.add(fileExit);
		
		// Add an Edit menu
		JMenu editMenu = new JMenu("Edit");
		JMenuItem editCut = new JMenuItem("Cut");
		editMenu.add(editCut);
		JMenuItem editCopy = new JMenuItem("Copy");
		editMenu.add(editCopy);
		JMenuItem editPaste = new JMenuItem("Paste");
		editMenu.add(editPaste);
		
		mainMenu.add(fileMenu);
		mainMenu.add(editMenu);
	}
	
	private void addToolbar() {
		// Add a toolbar
		JToolBar toolbar = new JToolBar();
		this.add( toolbar, BorderLayout.PAGE_START );
		
		// Add buttons to toolbar
		JButton cutButton = new JButton();
		cutButton.setIcon( new ImageIcon("Cut.png", "Cut") );
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
		new MenuAndToolbarExample();
	}
}
