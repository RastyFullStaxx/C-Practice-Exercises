package JMenuPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


// JMenu = a Swing component that represents a menu, which is a collection of items that can be selected by the user



public class JMenuPractice {

	public static void main(String[] args) {

		// Create the label
		JLabel label1 = new JLabel("MENU 1");
		label1.setFont(new Font("Arial", Font.BOLD, 20));
		
		
		
		// Create the menu bar
		JMenuBar menuBar = new JMenuBar();
		
		
		
		// Create the menu 
		JMenu menu = new JMenu("MENU");
			// Create elements to be added to the menu using "JMenuItem'
			JMenuItem item1 = new JMenuItem("ITEM 1");
			JMenuItem item2 = new JMenuItem("ITEM 2");
			JMenuItem item3 = new JMenuItem("ITEM 3");
				// Add the elements to the menu
				menu.add(item1);
				menu.add(item2);
				menu.add(item3);
		
				// Add the menu to the menu bar
				menuBar.add(menu);
				
		// Add actions to the items
		item1.addActionListener(e -> {
			JFrame menuFrame = new JFrame("JMENU");

				menuFrame.setSize(100, 100);
				menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				menuFrame.setLayout(new FlowLayout());
				menuFrame.setLocationRelativeTo(null);
					menuFrame.add(label1);

					menuFrame.setVisible(true);
		});
	
		item2.addActionListener(e -> {
			JFrame menuFrame = new JFrame("JMENU");
			menuFrame.setSize(100, 100);
			menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			menuFrame.setLayout(new FlowLayout());
			menuFrame.setLocationRelativeTo(null);
				menuFrame.add(label1);
			menuFrame.setVisible(true);
		});

		item3.addActionListener(e -> {
			JFrame menuFrame = new JFrame("JMENU");
			menuFrame.setSize(100, 100);
			menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			menuFrame.setLayout(new FlowLayout());
			menuFrame.setLocationRelativeTo(null);
				menuFrame.add(label1);
			menuFrame.setVisible(true);
			menuFrame.add(new JButton("EXIT"));
		});
				
		
		
		// Create the Frame
		JFrame frame = new JFrame("JMENU");
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setLocationRelativeTo(null);
		
			// Add the menu bar as the menu bar
			frame.setJMenuBar(menuBar);
		
		frame.setVisible(true);

	}

}
