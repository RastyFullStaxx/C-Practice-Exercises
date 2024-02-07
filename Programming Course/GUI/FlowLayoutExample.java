package LayoutManagers;

import javax.swing.*;
import java.awt.*;

// FlowLayout = arranges components in a row, wrapping to the next row if necessary.
//		        Components are added sequentially in a flow-like manner.

public class FlowLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        //frame.setResizable(false);
        frame.setVisible(true);
    }
}

