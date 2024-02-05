package lateNightGrind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonPractice {

    // JButtons = a swing component in Java used to create clickable buttons in a graphical user interface (GUI)
    //            (button, checkbox, radiobutton, togglebutton)

    public static void main(String[] args){


        // Panel 1 = Buttons
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());

            JButton regularButton1 = new JButton("BUTTON 1");
            JButton regularButton2 = new JButton("BUTTON 2");
            JButton regularButton3 = new JButton("BUTTON 3");

                regularButton1.setFocusable(false);
                regularButton2.setFocusable(false);
                regularButton3.setFocusable(false);

                    panel1.add(regularButton1);
                    panel1.add(regularButton2);
                    panel1.add(regularButton3);




        // Panel 2 = Checkboxes
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());

            JCheckBox checkBox1 = new JCheckBox("Check Box 1");
            JCheckBox checkBox2 = new JCheckBox("Check Box 2");
            JCheckBox checkBox3 = new JCheckBox("Check Box 3");
            
                panel2.add(checkBox1);
                panel2.add(checkBox2);
                panel2.add(checkBox3);




        // Panel 3 = Radio Buttons
        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());

            JRadioButton radioButton1 = new JRadioButton("Radio 1");
            JRadioButton radioButton2 = new JRadioButton("Radio 2");
            JRadioButton radioButton3 = new JRadioButton("Radio 3");

                ButtonGroup buttonGroup1 = new ButtonGroup();

                    buttonGroup1.add(radioButton1);
                    buttonGroup1.add(radioButton2);
                    buttonGroup1.add(radioButton3);

                        panel3.add(radioButton1);
                        panel3.add(radioButton2);
                        panel3.add(radioButton3);




        // Panel 4 = Radio Buttons
        JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout());

            JToggleButton toggleButton1 = new JToggleButton("Toggle Button 1");
            JToggleButton toggleButton2 = new JToggleButton("Toggle Button 2");
            JToggleButton toggleButton3 = new JToggleButton("Toggle Button 3");
            
                panel4.add(toggleButton1);
                panel4.add(toggleButton2);
                panel4.add(toggleButton3);



        // Main Frame
        JFrame mainFrame = new JFrame("JBUTTONS");
        mainFrame.setSize(270,250);
        mainFrame.setLayout(new GridLayout(2,2));
        mainFrame.setLocationRelativeTo(null);

            // Components
            mainFrame.add(panel1);
            mainFrame.add(panel2);
            mainFrame.add(panel3);
            mainFrame.add(panel4);

        mainFrame.setVisible(true);



    } // Main 
} // ButtonPractice Class