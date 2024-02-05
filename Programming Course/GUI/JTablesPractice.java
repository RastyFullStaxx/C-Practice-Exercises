package JTablesPractice;



// JTables = a Swing component that provides a tabular view for displaying and editing data



import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;



public class JTablesPractice {

	public static void main(String[] args) {
		
	// Create an array to represent the data
	String[][] data = {
			{"Danielo Kim", "Ang"},
			{"Kristina Cassandra", "Bognot"},
			{"Rasty", "Espartero"},
			{"Janice", "Fungo"},
			{"Michaela", "Malimban"},
			{"Kharl Chester", "Velasco"},
	};
	
	
	
	// Create another array to represent the fields
	String[] fieldNames = {"First Name", "Last Name"};
	
		
		
	
	// Create the table model
	DefaultTableModel myTable = new DefaultTableModel(data, fieldNames); // Insert the arrays the model will carry
	
	
	
	// Create the JTables
	JTable myJTable = new JTable(myTable); // set the model of the JTable
	
	
	
	// Create the ScrollPane 
	JScrollPane scrollPane = new JScrollPane(myJTable); // set what component the scroll pane will carry
	
	
	
		
	// Create the frame
	JFrame frame = new JFrame("JTABLES");
	frame.setSize(300,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);
	frame.setLayout(new BorderLayout());
	
		frame.add(scrollPane, BorderLayout.CENTER);
		
	frame.setVisible(true);
	}
}
