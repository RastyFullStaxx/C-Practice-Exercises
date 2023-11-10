package BroCodeCourse;
import javax.swing.JOptionPane;

public class GUI_Intro {

	public static void main(String[] args) {
		
		// Initialize the object to get input
		String name = JOptionPane.showInputDialog("Enter your name:");
		// Initialize the object to show input
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		// Wrap showInputDialog to accept integer instead of string
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
		// Show input
		JOptionPane.showMessageDialog(null, "You are " + age + " years old!");		
		
		// Wrap showInputDialog to accept double instead of integer
		double gurls = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of your h0es:"));
		// Show input
		JOptionPane.showMessageDialog(null, "You have " + gurls + " hoes!");
		
	}

}
