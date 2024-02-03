package JListPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


// JList = a Swing component in Java that displays a list of items
//		   provides a scrollable area containing that allows users to select one or more items


public class JListPractice { 

	public static void main(String[] args) {	
		
		// Create a model
		DefaultListModel<String> myListModel = new DefaultListModel<>();


			//	Add Elements
			myListModel.addElement("Danielo");
			myListModel.addElement("KC");
			myListModel.addElement("Rasty");
			myListModel.addElement("Janice");
			myListModel.addElement("Michaela");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			myListModel.addElement("Kharl");
			
			
			
			
		// Create the JList
		JList<String> myList = new JList<>(myListModel); // set its model
		
			// Set its SELECTION mode
			myList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
				
						
		// Add a JScrollPane = If the number of items is more than what can be displayed in the available space
		JScrollPane scrollPane = new JScrollPane(myList);	// set the list, scrollpane will contain
			// Set ScrollPane orientation
			//scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		
		// Buttons with action listener
		JButton showButton = new JButton("SHOW");
		showButton.addActionListener (e -> {
			String selectedItems = Arrays.toString(myList.getSelectedValuesList().toArray());
			JOptionPane.showMessageDialog(null, "Selected Items: " + selectedItems);
		});
		
		
		
		
		// Frame
		JFrame frame = new JFrame();
		frame.setSize(200,300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
			
			frame.add(scrollPane, BorderLayout.CENTER);
			frame.add(showButton, BorderLayout.SOUTH);
		
		frame.setVisible(true);

	}

}

// LEVEL: Elements -> Model -> JList -> ScrollPane