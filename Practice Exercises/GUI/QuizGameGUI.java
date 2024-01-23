import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizGameGUI extends JFrame implements ActionListener {
    private JLabel questionLabel;
    private JRadioButton optionA, optionB, optionC, optionD;
    private ButtonGroup optionGroup;
    private JButton nextButton;

    public QuizGameGUI() {
        this.setTitle("Quiz Game");
        this.setSize(400, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        questionLabel = new JLabel("What is the capital of France?");
        optionA = new JRadioButton("A. London");
        optionB = new JRadioButton("B. Berlin");
        optionC = new JRadioButton("C. Paris");
        optionD = new JRadioButton("D. Madrid");
        optionGroup = new ButtonGroup();
        optionGroup.add(optionA);
        optionGroup.add(optionB);
        optionGroup.add(optionC);
        optionGroup.add(optionD);
        nextButton = new JButton("Next");
        nextButton.addActionListener(this);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(4, 1));
        optionsPanel.add(optionA);
        optionsPanel.add(optionB);
        optionsPanel.add(optionC);
        optionsPanel.add(optionD);

        this.add(questionLabel, BorderLayout.NORTH);
        this.add(optionsPanel, BorderLayout.CENTER);
        this.add(nextButton, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            // Implement quiz logic, update questionLabel, and clear selected options
            questionLabel.setText("What is the capital of Germany?");
            optionGroup.clearSelection();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QuizGameGUI quizGame = new QuizGameGUI();
            quizGame.setVisible(true);
        });
    }
}
