package JSliderPractice;



// JSlider = a Swing component that allows the user to select a value by sliding a thumb along a track.
//			 commonly used in graphical user interfaces to represent a range of values, such as volume control, brightness settings, or any adjustable parameter within a specific range.



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class JSliderPractice {

	public static void main(String[] args) {
	
		// Create the JSlider, assigned with (direction, minimum, maximum, initial) values
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
			// Optional: Set major and minor tick spacing for better visualization of the slider's values
			slider.setMajorTickSpacing(20);
			slider.setMinorTickSpacing(5);
			slider.setPaintTicks(true);
				// Optional: you can set the numerical values in the slider by enabling set paint
				slider.setPaintLabels(true);
		
		
				
		// Add change listener to respond to the changes made from the slider
		slider.addChangeListener (e -> {
			int value = slider.getValue();
			System.out.println("Slider value " + value);
		});
				
				
		
		// Create frame
		JFrame frame = new JFrame("JSlider Practice");
		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(1,1));
		
			frame.add(slider);
		
		frame.setVisible(true);
	}

}
