import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListGUI extends JFrame implements ActionListener {
    private DefaultListModel<String> toDoListModel;
    private JList<String> toDoList;
    private JTextField taskInput;
    private JButton addButton, removeButton;

    public ToDoListGUI() {
        this.setTitle("To-Do List");
        this.setSize(300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        toDoListModel = new DefaultListModel<>();
        toDoList = new JList<>(toDoListModel);
        JScrollPane listScrollPane = new JScrollPane(toDoList);

        taskInput = new JTextField();
        addButton = new JButton("Add Task");
        removeButton = new JButton("Remove Task");

        addButton.addActionListener(this);
        removeButton.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BorderLayout());
        inputPanel.add(taskInput, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        this.add(listScrollPane, BorderLayout.CENTER);
        this.add(inputPanel, BorderLayout.NORTH);
        this.add(removeButton, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String task = taskInput.getText();
            if (!task.isEmpty()) {
                toDoListModel.addElement(task);
                taskInput.setText("");
            }
        } else if (e.getSource() == removeButton) {
            int selectedIndex = toDoList.getSelectedIndex();
            if (selectedIndex != -1) {
                toDoListModel.remove(selectedIndex);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ToDoListGUI toDoListGUI = new ToDoListGUI();
            toDoListGUI.setVisible(true);
        });
    }
}
