package PanelPractice;

import javax.swing.*;
import java.awt.*;

public class PanelPractice {

	public static void main(String[] args) {
		
		ImageIcon myIcon = new ImageIcon("C:\\Users\\MSI\\eclipse-workspace\\SmartPlate\\src\\assets\\SmartPlateLogo.png");
		
		
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.red);
			JLabel label1 = new JLabel();
			label1.setIcon(myIcon);
			panel1.add(label1);
		panel1.setVisible(true);
		
		
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(0,255,0));
		panel2.setVisible(true);
	
	
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(0xFFFF00));
		panel3.setVisible(true);
		
		
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.BLUE);
		panel4.setVisible(true);
	
		
		
	JFrame frame = new JFrame();
	frame.setSize(500, 500);
	frame.setLayout(new GridLayout(2,2));
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setLocationRelativeTo(null);	
	
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel4);
		frame.add(panel3);
		
	frame.setVisible(true);
	
	}
}
