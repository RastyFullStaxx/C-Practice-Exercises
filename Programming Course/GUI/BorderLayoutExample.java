package LayoutManagers;

import javax.swing.*;
import java.awt.*;

// BorderLayout = places components in five regions: North, South, East, West, and Center.
//				  Components are added to specific regions of the container.

public class BorderLayoutExample {

    public static void main(String[] args) {

        JPanel panel = new JPanel(new BorderLayout());

            panel.add(new JButton("North"), BorderLayout.NORTH);
            panel.add(new JButton("South"), BorderLayout.SOUTH);
            panel.add(new JButton("East"), BorderLayout.EAST);
            panel.add(new JButton("West"), BorderLayout.WEST);
            panel.add(new JButton("Center"), BorderLayout.CENTER);


        JFrame frame = new JFrame("BorderLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

            frame.add(panel);

        frame.setVisible(true);
    }
}
