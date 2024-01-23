import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ColorPickerGUI extends JFrame {
    private JColorChooser colorChooser;
    private JPanel colorPanel;

    public ColorPickerGUI() {
        this.setTitle("Color Picker");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        colorChooser = new JColorChooser();
        colorPanel = new JPanel();

        colorChooser.getSelectionModel().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                Color selectedColor = colorChooser.getColor();
                colorPanel.setBackground(selectedColor);
            }
        });

        this.add(colorChooser, BorderLayout.NORTH);
        this.add(colorPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorPickerGUI colorPickerGUI = new ColorPickerGUI();
            colorPickerGUI.setVisible(true);
        });
    }
}
