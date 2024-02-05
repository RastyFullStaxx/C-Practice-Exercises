package LayoutManagers;

import javax.swing.*;
import java.awt.*;

// BoxLayout = arranges components in a single row or column.
//			   Components are aligned in a straight line.

public class BoxLayoutExample {

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

            panel.add(new JButton("Button 1"));
            panel.add(new JButton("Button 2"));
            panel.add(new JButton("Button 3"));

            
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);

            frame.add(panel);

        frame.setVisible(true);
    }
}
