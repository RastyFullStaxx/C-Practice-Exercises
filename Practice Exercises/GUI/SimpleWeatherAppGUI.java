import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleWeatherAppGUI extends JFrame implements ActionListener {
    private JTextField cityField;
    private JButton searchButton;
    private JLabel resultLabel;

    public SimpleWeatherAppGUI() {
        this.setTitle("Simple Weather App");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        cityField = new JTextField();
        searchButton = new JButton("Search");
        searchButton.addActionListener(this);
        resultLabel = new JLabel("Enter a city and click Search");

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 1));
        inputPanel.add(cityField);
        inputPanel.add(searchButton);

        this.add(inputPanel, BorderLayout.NORTH);
        this.add(resultLabel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchButton) {
            String cityName = cityField.getText();
            // Perform weather API request and update resultLabel with weather information
            resultLabel.setText("Weather for " + cityName + ": Sunny, 25°C");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleWeatherAppGUI weatherApp = new SimpleWeatherAppGUI();
            weatherApp.setVisible(true);
        });
    }
}
