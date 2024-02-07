package LayoutManagers;

import javax.swing.*;
import java.awt.*;

// GridLayout = organizes components in a grid of rows and columns.
// 				Components are evenly distributed in a grid.

public class GridLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3,3));

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 4"));
        panel.add(new JButton("Button 4"));

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

