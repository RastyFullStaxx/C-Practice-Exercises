package lateNightGrind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextFieldPractice {
    public static final void main(String[] args){

        // JTextField =  a swing component in Java used to allow users to input text in a graphical user interface (GUI)



        // Panel 1
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());

            JTextField myTextField = new JTextField(20);
            JTextField displayTextField = new JTextField(10);
            JButton btnPrint = new JButton("PRINT");
            JButton btnClear = new JButton("CLEAR");

                panel1.add(myTextField);
                panel1.add(btnPrint);
                panel1.add(btnClear);
                panel1.add(displayTextField);

                    btnPrint.addActionListener (e -> {
                        if (!myTextField.getText().equals("")) {
                            String inputtedString = myTextField.getText();
                            displayTextField.setText(inputtedString);                           
                        } else {
                            JOptionPane.showMessageDialog(panel1,"ENTER A TEXT BITCH!", "NOTIF!!", JOptionPane.WARNING_MESSAGE);
                        }

                    });

                    btnClear.addActionListener(e ->{
                        myTextField.setText("");
                        displayTextField.setText("");
                    });


        // Main Frame
        JFrame mainFrame = new JFrame("TextField Practice");
        mainFrame.setSize(300,130);
        mainFrame.setLocationRelativeTo(null);
        
            // Components
            mainFrame.add(panel1);

        mainFrame.setVisible(true);


    } // Main
} // TextFieldPractice Class
