import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

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
        fileChooser = new JFileChooser();

        browseButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(browseButton);

        this.add(imageLabel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == browseButton) {
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    Image img = ImageIO.read(selectedFile);
                    ImageIcon icon = new ImageIcon(img);
                    imageLabel.setIcon(icon);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageViewerGUI imageViewerGUI = new ImageViewerGUI();
            imageViewerGUI.setVisible(true);
        });
    }
}
