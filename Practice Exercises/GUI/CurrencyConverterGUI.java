import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverterGUI extends JFrame implements ActionListener {
    private JTextField amountField;
    private JComboBox<String> fromCurrencyComboBox, toCurrencyComboBox;
    private JButton convertButton;
    private JLabel resultLabel;

    public CurrencyConverterGUI() {
        this.setTitle("Currency Converter");
        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        amountField = new JTextField();
        fromCurrencyComboBox = new JComboBox<>(new String[]{"USD", "EUR", "GBP"});
        toCurrencyComboBox = new JComboBox<>(new String[]{"USD", "EUR", "GBP"});
        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);
        resultLabel = new JLabel();

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Amount:"));
        inputPanel.add(amountField);
        inputPanel.add(new JLabel("From Currency:"));
        inputPanel.add(fromCurrencyComboBox);
        inputPanel.add(new JLabel("To Currency:"));
        inputPanel.add(toCurrencyComboBox);

        this.add(inputPanel, BorderLayout.NORTH);
        this.add(convertButton, BorderLayout.CENTER);
        this.add(resultLabel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {
            // Implement currency conversion logic and update resultLabel
            double amount = Double.parseDouble(amountField.getText());
            String fromCurrency = (String) fromCurrencyComboBox.getSelectedItem();
            String toCurrency = (String) toCurrencyComboBox.getSelectedItem();
            double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);
            resultLabel.setText(String.format("%.2f %s = %.2f %s", amount, fromCurrency, convertedAmount, toCurrency));
        }
    }

    private double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        // Implement currency conversion rates
        // For simplicity, assume a fixed conversion rate for this exercise
        double conversionRateUSDToEUR = 0.85;
        double conversionRateUSDtoGBP = 0.74;

        if ("USD".equals(fromCurrency) && "EUR".equals(toCurrency)) {
            return amount * conversionRateUSDToEUR;
        } else if ("USD".equals(fromCurrency) && "GBP".equals(toCurrency)) {
            return amount * conversionRateUSDtoGBP;
        } else {
            return amount; // Default: no conversion
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CurrencyConverterGUI currencyConverter = new CurrencyConverterGUI();
            currencyConverter.setVisible(true);
        });
    }
}
