import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListGUI extends JFrame implements ActionListener {
    private DefaultListModel<String> toDoListModel;
    private JList<String> toDoList;
    private JTextField taskField;
    private JButton addButton, removeButton;

    public ToDoListGUI() {
        this.setTitle("To-Do List");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        toDoListModel = new DefaultListModel<>();
        toDoList = new JList<>(toDoListModel);
        taskField = new JTextField();
        addButton = new JButton("Add Task");
        addButton.addActionListener(this);
        removeButton = new JButton("Remove Task");
        removeButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);

        this.add(new JScrollPane(toDoList), BorderLayout.CENTER);
        this.add(taskField, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String task = taskField.getText();
            toDoListModel.addElement(task);
            taskField.setText("");
        } else if (e.getSource() == removeButton) {
            int selectedIndex = toDoList.getSelectedIndex();
            if (selectedIndex != -1) {
                toDoListModel.remove(selectedIndex);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ToDoListGUI toDoListApp = new ToDoListGUI();
            toDoListApp.setVisible(true);
        });
    }
}
