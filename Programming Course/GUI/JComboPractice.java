package JComboBoxPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



// JComboBox = a Swing component that provides a drop-down list of items from which the user can make a selection		   



public class JComboPractice {

	public static void main(String[] args) {
	
	// Create an array of items you wanted to display in the drop-down
	String[] groupMembers = {"Danielo", "KC", "Rasty", "Janice", "Michaela", "Kharl"};
	
	
	
	// Create the JComboBox
	JComboBox<String> myCombo = new JComboBox<>(groupMembers); // insert the array you wanted to display
	
	
	
	// Create the label to display the selected items
	JLabel selectedItems = new JLabel("Select Someone");
	
	
	
	// Add action listener for the selected item from the drop box
	myCombo.addActionListener (e -> {
		String selectedNames = myCombo.getSelectedItem().toString();
		selectedItems.setText("Selected: " + selectedNames);
	});	
	
	
	
	// Create the frame
	JFrame frame = new JFrame();
	frame.setSize(350,350);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.setLayout(new FlowLayout());
		
		frame.add(selectedItems);
		frame.add(myCombo);
	
	frame.setVisible(true);
		
	}

}
