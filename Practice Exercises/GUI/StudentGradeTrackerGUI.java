import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGradeTrackerGUI extends JFrame implements ActionListener {
    private DefaultListModel<String> gradeListModel;
    private JList<String> gradeList;
    private JTextField studentNameField, gradeField;
    private JButton addGradeButton, removeGradeButton;

    public StudentGradeTrackerGUI() {
        this.setTitle("Student Grade Tracker");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        gradeListModel = new DefaultListModel<>();
        gradeList = new JList<>(gradeListModel);
        studentNameField = new JTextField();
        gradeField = new JTextField();
        addGradeButton = new JButton("Add Grade");
        addGradeButton.addActionListener(this);
        removeGradeButton = new JButton("Remove Grade");
        removeGradeButton.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Student Name:"));
        inputPanel.add(studentNameField);
        inputPanel.add(new JLabel("Grade:"));
        inputPanel.add(gradeField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addGradeButton);
        buttonPanel.add(removeGradeButton);

        this.add(new JScrollPane(gradeList), BorderLayout.CENTER);
        this.add(inputPanel, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addGradeButton) {
            String studentName = studentNameField.getText();
            String grade = gradeField.getText();
            gradeListModel.addElement(studentName + ": " + grade);
            studentNameField.setText("");
            gradeField.setText("");
        } else if (e.getSource() == removeGradeButton) {
            int selectedIndex = gradeList.getSelected
