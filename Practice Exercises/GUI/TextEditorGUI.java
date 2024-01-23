import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditorGUI extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JButton saveButton, clearButton;

    public TextEditorGUI() {
        this.setTitle("Text Editor");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        textArea = new JTextArea();
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(clearButton);

        this.add(new JScrollPane(textArea), BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveButton) {
            // Implement saving functionality
            JOptionPane.showMessageDialog(this, "File Saved!");
        } else if (e.getSource() == clearButton) {
            textArea.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TextEditorGUI textEditor = new TextEditorGUI();
            textEditor.setVisible(true);
        });
    }
}
