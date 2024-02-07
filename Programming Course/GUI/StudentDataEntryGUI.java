package PracticalApplications;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class StudentDataEntryGUI {
    private JFrame frame;
    private JTextField codeField, lastNameField;
    private JButton newButton, editButton;
    private String mode;

    public StudentDataEntryGUI() {
        frame = new JFrame("Student Data Entry");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel codeLabel = new JLabel("Code:");
        panel.add(codeLabel);

        codeField = new JTextField(10);
        panel.add(codeField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        panel.add(lastNameLabel);

        lastNameField = new JTextField(10);
        panel.add(lastNameField);

        newButton = new JButton("New");
        newButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mode = "New student";
                // Implement logic for new student entry
            }
        });
        panel.add(newButton);

        editButton = new JButton("Edit");
        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mode = "Edit student info";
                // Implement logic for editing existing student info
            }
        });
        panel.add(editButton);

        frame.setVisible(true);
    }

    public void saveStudentInfo(String[] data) {
        try {
            FileWriter writer = new FileWriter("student.csv", true);
            for (String datum : data) {
                writer.append(datum).append(",");
            }
            writer.append("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] searchStudent(String studentId) {
        // Implement logic to search for student in CSV file
        return null;
    }

    public void displayInfoSavedMessage() {
        JOptionPane.showMessageDialog(frame, "Information saved.");
    }

    public void displayInfoNotSavedMessage() {
        JOptionPane.showMessageDialog(frame, "Student info not saved.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new StudentDataEntryGUI();
            }
        });
    }
}

