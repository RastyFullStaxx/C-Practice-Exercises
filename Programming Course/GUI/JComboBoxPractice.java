package lateNightGrind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JComboBoxPractice {

    public static void main(String[] args){

        // JComboBox = a Swing component that provides a drop-down list of items from which the user can make a selection	



        // Panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

            // [1] Create an array of items you wanted to display in the drop-down
            String[] names = {"Rasty", "JM", "Marian", "Geisler", "Marc", "JhaNixz"};

                // [2] Install the array to drop-down (combo box)
                JComboBox<String> myTropas = new JComboBox<>(names);
                myTropas.setSelectedIndex(-1);
                myTropas.setPreferredSize(new Dimension(100,20));

                    JLabel label = new JLabel("Sinong Susuntukin?!! ______");

                        panel.add(label);
                        panel.add(myTropas);

                            // Action Listener for Drop-down
                            myTropas.addActionListener(e -> {
                                String selectedTropa = myTropas.getSelectedItem().toString();
                                label.setText("Si " + selectedTropa + "  ");
                                myTropas.setSelectedIndex(-1);
                                JOptionPane.showMessageDialog(panel, "Si " + selectedTropa,"SUSUNTUKIN!", JOptionPane.PLAIN_MESSAGE);
                            });
        
        

        // Main Frame
        JFrame mainFrame = new JFrame();
        mainFrame.setSize(500,500);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setLocationRelativeTo(null);

            // Components
            mainFrame.add(panel);

        mainFrame.setVisible(true);


    } // Main
} // JComboBoxPractice Class
