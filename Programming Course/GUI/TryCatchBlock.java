package lateNightGrind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TryCatchBlock {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Try-Catch Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        JButton button = new JButton("Divide by Zero");
        JLabel resultLabel = new JLabel();

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {
                    int result = 10 / 0; // This will throw an ArithmeticException
                    resultLabel.setText("Result: " + result);                    
                } 
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(panel, "PUTANGINAMO MALI", "INVALID ARITHMETIC EXPRESSION", JOptionPane.WARNING_MESSAGE);
                } 
            }
        });

        panel.add(button);
        panel.add(resultLabel);
        frame.add(panel);

        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

