package FramePractice;



import javax.swing.*;			// Heavy weight elements	=	holds elements
import java.awt.*;				// Light weight components	= 	components placed to containers
import java.awt.event.*;		// back end functionality



public class FramePractice {

	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame("My Main Frame");
		myFrame.setSize(350, 350);
		myFrame.setLocationRelativeTo(null);
		myFrame.setLayout(new GridLayout(4,2));
		
			myFrame.setResizable(true);
			myFrame.setExtendedState(JFrame.MAXIMIZED_HORIZ);
			myFrame.setAlwaysOnTop(false);
		
		
		JPanel panel_1 = new JPanel(new GridLayout(1,2));
			panel_1.add(new JLabel("PANEL 1"));
			panel_1.add(new JLabel("PANEL 2"));
			panel_1.add(new JButton("SUBMIT"));
		
		JPanel panel_2 = new JPanel();
			panel_2.add(new JButton("SUBMIT"));
			panel_2.setBackground(Color.green);
		
		JPanel panel_3 = new JPanel();
			panel_3.add(new JButton("SUBMIT"));
			panel_3.setBackground(Color.blue);
		
		JPanel panel_4 = new JPanel();
			panel_4.add(new JButton("SUBMIT"));
			panel_4.setBackground(Color.yellow);
			
		JPanel panel_5 = new JPanel();
			panel_5.add(new JButton("SUBMIT"));
			panel_5.setBackground(Color.orange);
		
		
		
			myFrame.add(panel_1);
			myFrame.add(panel_2);
			myFrame.add(panel_3);
			myFrame.add(panel_4);
			myFrame.add(panel_5);
		
		
		myFrame.setVisible(true);

	}

}
