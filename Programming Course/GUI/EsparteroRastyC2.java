package PracticalApplications;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class EsparteroRastyC2 {

    // Fields to hold student data
    private static JTextField studentID, lastName, firstName, middleName, ccyy, mm, dd, hh, mm2;

    public static void main(String[] args) {
        // Panel 1
        JPanel panel1 = new JPanel();
        JLabel modeLabel = new JLabel("Mode");
        JTextField mode = new JTextField(20);
        panel1.setLayout(new FlowLayout());
        panel1.add(modeLabel);
        panel1.add(mode);

        // Panel 2
        JPanel panel2 = new JPanel();
        JLabel codeLabel = new JLabel("Code");
        studentID = new JTextField(20);
        panel2.setLayout(new FlowLayout());
        panel2.add(codeLabel);
        panel2.add(studentID);

        // Panel 3
        JPanel panel3 = new JPanel();
        JLabel lastLabel = new JLabel("Last Name");
        lastName = new JTextField(20);
        panel3.setLayout(new FlowLayout());
        panel3.add(lastLabel);
        panel3.add(lastName);

        // Panel 4
        JPanel panel4 = new JPanel();
        JLabel firstLabel = new JLabel("First Name");
        firstName = new JTextField(20);
        panel4.setLayout(new FlowLayout());
        panel4.add(firstLabel);
        panel4.add(firstName);

        // Panel 5
        JPanel panel5 = new JPanel();
        JLabel middleLabel = new JLabel("Middle Name");
        middleName = new JTextField(20);
        panel5.setLayout(new FlowLayout());
        panel5.add(middleLabel);
        panel5.add(middleName);

        // Panel 6
        JPanel panel6 = new JPanel();
        JLabel DOBLabel = new JLabel("DOB");
        ccyy = new JTextField(7);
        mm = new JTextField(4);
        dd = new JTextField(4);
        hh = new JTextField(4);
        mm2 = new JTextField(4);
        panel6.setLayout(new FlowLayout());
        panel6.add(DOBLabel);
        panel6.add(ccyy);
        panel6.add(mm);
        panel6.add(dd);
        panel6.add(hh);
        panel6.add(mm2);

        // Panel 7 = Buttons
        JPanel panel7 = new JPanel();
        panel7.setLayout(new FlowLayout());
        JButton newButton = new JButton("New");
        JButton editButton = new JButton("Edit");
        JButton saveButton = new JButton("Save");
        JButton cancelButton = new JButton("Cancel");
        panel7.add(newButton);
        panel7.add(editButton);
        panel7.add(saveButton);
        panel7.add(cancelButton);

        // Main Frame
        JFrame mainFrame = new JFrame("Student Data Entry");
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setSize(600, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout(7, 0));
        mainFrame.setResizable(false);

        mainFrame.add(panel1);
        mainFrame.add(panel2);
        mainFrame.add(panel3);
        mainFrame.add(panel4);
        mainFrame.add(panel5);
        mainFrame.add(panel6);
        mainFrame.add(panel7);

        mainFrame.setVisible(true);

        // Action Listeners
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode.setText("New student");
                clearFields();
            }
        });

// Modify the Edit button ActionListener
editButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        mode.setText("Edit student info");
        String targetStudentID = studentID.getText();
        String existingData = searchStudentData(targetStudentID);

        if (existingData != null) {
            // Populate the fields with existing data
            String[] dataParts = existingData.split(",");
            lastName.setText(dataParts[1]);
            firstName.setText(dataParts[2]);
            middleName.setText(dataParts[3]);
            ccyy.setText(dataParts[4]);
            mm.setText(dataParts[5]);
            dd.setText(dataParts[6]);
            hh.setText(dataParts[7]);
            mm2.setText(dataParts[8]);
        } else {
            showMessageDialog("Student not found.");
            clearFields();
        }
    }
});

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveData();
                mode.setText("");
                showMessageDialog("Information saved.");
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mode.setText("");
                clearFields();
                showMessageDialog("Student info not saved.");
            }
        });
    }

    private static void clearFields() {
        studentID.setText("");
        lastName.setText("");
        firstName.setText("");
        middleName.setText("");
        ccyy.setText("");
        mm.setText("");
        dd.setText("");
        hh.setText("");
        mm2.setText("");
    }

private static void saveData() {
    String studentInfo = studentID.getText() + "," +
            lastName.getText() + "," +
            firstName.getText() + "," +
            middleName.getText() + "," +
            ccyy.getText() + "," +
            mm.getText() + "," +
            dd.getText() + "," +
            hh.getText() + "," +
            mm2.getText();

    String existingData = searchStudentData(studentID.getText());
    if (existingData != null) {
        // If data exists, update it
        updateData(studentInfo);
    } else {
        // If data doesn't exist, save it as new data
        saveNewData(studentInfo);
    }
}

private static void updateData(String newData) {
    try {
        File file = new File("C:/Users/MSI/eclipse-workspace/GUISwing/src/PracticalApplications/student.csv");
        File tempFile = new File("C:/Users/MSI/eclipse-workspace/GUISwing/src/PracticalApplications/studentTemp.csv");

        BufferedReader reader = new BufferedReader(new FileReader(file));
        PrintWriter writer = new PrintWriter(new FileWriter(tempFile));

        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length > 0 && parts[0].equals(studentID.getText())) {
                writer.println(newData);
            } else {
                writer.println(line);
            }
        }
        reader.close();
        writer.close();
        if (file.delete()) {
            tempFile.renameTo(file);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

private static void saveNewData(String newData) {
    try (PrintWriter writer = new PrintWriter(new FileWriter("C:/Users/MSI/eclipse-workspace/GUISwing/src/PracticalApplications/student.csv", true))) {
        writer.println(newData);
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}

    private static void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    // method to search for an existing student ID
    private static String searchStudentData(String targetStudentID) {
        try (Scanner scanner = new Scanner(new File("C:/Users/MSI/eclipse-workspace/GUISwing/src/PracticalApplications/student.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length > 0 && parts[0].equals(targetStudentID)) {
                    return line;
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}

