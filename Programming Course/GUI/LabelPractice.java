package lateNightGrind;

import javax.swing.*;
import java.awt.*;

public class LabelPractice {

    public static void main(String[] args) {

    // JLabel = a Swing component in Java used to display text or an image on a graphical user interface (GUI)

        // Panel
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1,2));

            // JLabel label1 = new JLabel("PANEL 1");
            // JLabel label2 = new JLabel("PANEL 1");
            // JLabel label3 = new JLabel("PANEL 1");
            // JLabel label4 = new JLabel("PANEL 1");

            //     panel1.add(label1);
            //     panel1.add(label2);
            //     panel1.add(label3);
            //     panel1.add(label4);
       
        
            JPanel miniPanel1 = new JPanel();
            miniPanel1.add(new JLabel("LEFT"));
            miniPanel1.add(new JLabel("TEXT FOR LEFT"));

            JPanel miniPanel2 = new JPanel();
            miniPanel2.add(new JLabel("RIGHT"));
            miniPanel2.add(new JLabel("TEXT FOR RIGHT"));

            panel1.add(miniPanel1);
            panel1.add(miniPanel2);


        // Panel
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));

            JLabel label5 = new JLabel("PANEL 2");
            // JLabel label6 = new JLabel("PANEL 2");
            // JLabel label8 = new JLabel("PANEL 2");
            // JLabel label9 = new JLabel("PANEL 2");

                panel2.add(label5);
                // panel2.add(label6);
                // panel2.add(label8);
                // panel2.add(label9);
        


        // Main Frame
        JFrame mainFrame = new JFrame();
        mainFrame.setSize(300,600);
        mainFrame.setLayout(new GridLayout(2,1));
        mainFrame.setLocationRelativeTo(null);

            mainFrame.add(panel1);
            mainFrame.add(panel2);
            
        mainFrame.setVisible(true);

    } // Main Class
} // label Practice Class

