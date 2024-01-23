import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageViewerGUI extends JFrame implements ActionListener {
    private JLabel imageLabel;
    private JButton browseButton;
    private JFileChooser fileChooser;

    public ImageViewerGUI() {
        this.setTitle("Image Viewer");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        imageLabel = new JLabel();
        browseButton = new JButton("Browse");
        browseButton.addActionListener(this);
        fileChooser = new JFileChooser();

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(browseButton);

        this.add(imageLabel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == browseButton) {
            int returnVal = fileChooser.showOpenDialog(this);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                // Load and display the selected image
                ImageIcon icon = new ImageIcon(fileChooser.getSelectedFile().getAbsolutePath());
                imageLabel.setIcon(icon);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageViewerGUI imageViewer = new ImageViewerGUI();
            imageViewer.setVisible(true);
        });
    }
}
