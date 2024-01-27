import javax.swing.*;
import java.awt.*;
import java.awt.event.*;





public class ProgrammingProblem {

    public static void main(String[] args) {

        // Create Panel 1
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Type of Transaction: ");
        JRadioButton defaultButton = new JRadioButton("Default");
        JRadioButton depositButton = new JRadioButton("Deposit");
        JRadioButton withdrawButton = new JRadioButton("Withdraw");
        ButtonGroup buttonGroup = new ButtonGroup();

        	panel1.add(label1);
        	buttonGroup.add(defaultButton);
        	buttonGroup.add(depositButton);
        	buttonGroup.add(withdrawButton);

        		panel1.add(defaultButton);
        		panel1.add(depositButton);
        		panel1.add(withdrawButton);

        		
        		
        		
        		
        		
        // Create Panel 2
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        JLabel label2 = new JLabel("Previous Balance   ");
        JTextField textField1 = new JTextField(20);

        	panel2.add(label2);
        	panel2.add(textField1);

        	
        	
        	
        	
        	
        // Create Panel 4
        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(0, 4));

        JPanel c1 = new JPanel();
        c1.setLayout(new GridLayout(0, 1));
        
        	JPanel checkBoxColumn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        	JPanel checkBoxColumn2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        	JPanel checkBoxColumn3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        	JPanel checkBoxColumn4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        	JPanel checkBoxColumn0 = new JPanel();
        	
        		checkBoxColumn0.add(new JLabel());
        		checkBoxColumn1.add(new JCheckBox());
        		checkBoxColumn2.add(new JCheckBox());
        		checkBoxColumn3.add(new JCheckBox());
        		checkBoxColumn4.add(new JCheckBox());
        		
        			c1.add(checkBoxColumn0);
        			c1.add(checkBoxColumn1);
        			c1.add(checkBoxColumn2);
        			c1.add(checkBoxColumn3);
        			c1.add(checkBoxColumn4);
        			
        					panel4.add(c1);

        JPanel c2 = new JPanel();
        c2.setLayout(new GridLayout(0, 1));
        
        	JPanel labelColumn0 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        	JPanel labelColumn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        	JPanel labelColumn2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        	JPanel labelColumn3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        	JPanel labelColumn4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        		labelColumn0.add(new JLabel("Denomination"));
        		labelColumn1.add(new JLabel("₱1000"));
        		labelColumn2.add(new JLabel("₱500"));
        		labelColumn3.add(new JLabel("₱200"));
        		labelColumn4.add(new JLabel("₱100"));
        
        			c2.add(labelColumn0);
        			c2.add(labelColumn1);
        			c2.add(labelColumn2);
        			c2.add(labelColumn3);
        			c2.add(labelColumn4);
        
        				panel4.add(c2);

        JPanel c3 = new JPanel();
        c3.setLayout(new GridLayout(0, 1));
        
        JPanel textFieldColumn0 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel textFieldColumn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel textFieldColumn2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel textFieldColumn3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel textFieldColumn4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        	textFieldColumn0.add(new JLabel("Number of Pieces"));
        	textFieldColumn1.add(new JTextField(10));
        	textFieldColumn2.add(new JTextField(10));
        	textFieldColumn3.add(new JTextField(10));
        	textFieldColumn4.add(new JTextField(10));
        
        		c3.add(textFieldColumn0);
        		c3.add(textFieldColumn1);
        		c3.add(textFieldColumn2);
        		c3.add(textFieldColumn3);
        		c3.add(textFieldColumn4);
        		
        			panel4.add(c3);

        JPanel c4 = new JPanel();
        c4.setLayout(new GridLayout(0, 1));
        
        	JPanel textField1Column0 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        	JPanel textField1Column1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        	JPanel textField1Column2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        	JPanel textField1Column3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        	JPanel textField1Column4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        		textField1Column0.add(new JLabel("Amount"));
        		textField1Column1.add(new JTextField(10));
        		textField1Column2.add(new JTextField(10));
        		textField1Column3.add(new JTextField(10));
        		textField1Column4.add(new JTextField(10));
        
        			c4.add(textField1Column0);
        			c4.add(textField1Column1);
        			c4.add(textField1Column2);
        			c4.add(textField1Column3);
        			c4.add(textField1Column4);
        
        				panel4.add(c4);

        				
        				
        				
        				
        // Create Panel 9 = Total Deposit
        JPanel panel9 = new JPanel();
        panel9.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 30));
        
        JLabel totalLabel = new JLabel("Total Deposit:   ");
        JTextField totalTextField = new JTextField(20);
        
        		panel9.add(totalLabel);
        		panel9.add(totalTextField);

        
        
        
        
        // Create Panel 5 = Current Balance
        JPanel panel5 = new JPanel();
        panel5.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        
        	JLabel currentLabel = new JLabel("Current Balance:   ");
        	JTextField currentTextField = new JTextField(20);
        	
        		panel5.add(currentLabel);
        		panel5.add(currentTextField);

        
        
        
        
        // Create Panel 6 = Submit Button
        JPanel panel6 = new JPanel();
        panel6.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        
        	JButton submitButton = new JButton("COMPUTE");
        	panel6.add(submitButton);

        	
        	
        	
        	
        // Create the Main Frame
        JFrame mainFrame = new JFrame();
        mainFrame.setUndecorated(true);
        mainFrame.setSize(600, 600);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new GridLayout(6, 1));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.add(panel1);
        mainFrame.add(panel2);
        mainFrame.add(panel4);
        mainFrame.add(panel9);
        mainFrame.add(panel5);
        mainFrame.add(panel6);

    
        
     
        // DEFAULT mode conditions
        defaultButton.setSelected(true);      
        disableComponents(c1, textField1, textFieldColumn1, textFieldColumn2, textFieldColumn3, textFieldColumn4,
                textField1Column1, textField1Column2, textField1Column3, textField1Column4, totalTextField,
                currentTextField, submitButton);
       
        defaultButton.addActionListener(e -> {
            disableComponents(c1, textField1, textFieldColumn1, textFieldColumn2, textFieldColumn3, textFieldColumn4,
                    textField1Column1, textField1Column2, textField1Column3, textField1Column4, totalTextField,
                    currentTextField, submitButton);
        });

        
        
        
        
        // DEPOSIT mode conditions
        depositButton.addActionListener(e -> {
            enableComponents(textField1, checkBoxColumn1, checkBoxColumn2, checkBoxColumn3, checkBoxColumn4, submitButton);

            JCheckBox checkBox1 = (JCheckBox) checkBoxColumn1.getComponent(0);
            JCheckBox checkBox2 = (JCheckBox) checkBoxColumn2.getComponent(0);
            JCheckBox checkBox3 = (JCheckBox) checkBoxColumn3.getComponent(0);
            JCheckBox checkBox4 = (JCheckBox) checkBoxColumn4.getComponent(0);

            checkBox1.addItemListener(itemEvent -> {
                if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                    enableComponents(textFieldColumn1);
                } else {
                    disableComponents(textFieldColumn1);
                }
            });

            checkBox2.addItemListener(itemEvent -> {
                if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                    enableComponents(textFieldColumn2);
                } else {
                    disableComponents(textFieldColumn2);
                }
            });

            checkBox3.addItemListener(itemEvent -> {
                if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                    enableComponents(textFieldColumn3);
                } else {
                    disableComponents(textFieldColumn3);
                }
            });

            checkBox4.addItemListener(itemEvent -> {
                if (itemEvent.getStateChange() == ItemEvent.SELECTED) {
                    enableComponents(textFieldColumn4);
                } else {
                    disableComponents(textFieldColumn4);
                }
            });
            
        });
        
        
        
        
        // WITHDRAW button conditions
        withdrawButton.addActionListener(e -> {
            enableComponents(textField1, submitButton);

            // Remove ItemListeners for Deposit mode
            JCheckBox checkBox1 = (JCheckBox) checkBoxColumn1.getComponent(0);
            JCheckBox checkBox2 = (JCheckBox) checkBoxColumn2.getComponent(0);
            JCheckBox checkBox3 = (JCheckBox) checkBoxColumn3.getComponent(0);
            JCheckBox checkBox4 = (JCheckBox) checkBoxColumn4.getComponent(0);

            for (ItemListener itemListener : checkBox1.getItemListeners()) {
                checkBox1.removeItemListener(itemListener);
            }

            for (ItemListener itemListener : checkBox2.getItemListeners()) {
                checkBox2.removeItemListener(itemListener);
            }

            for (ItemListener itemListener : checkBox3.getItemListeners()) {
                checkBox3.removeItemListener(itemListener);
            }

            for (ItemListener itemListener : checkBox4.getItemListeners()) {
                checkBox4.removeItemListener(itemListener);
            }
        });

        
        
        
        // SUBMIT button functions
        submitButton.addActionListener(submitEvent -> {
        	
        	if (withdrawButton.isSelected()) {
        		showWithdrawDialog(currentTextField);
        	} else {
        		
            // Previous balance
            String previousBalanceText = textField1.getText();
            int previousBalance = previousBalanceText.isEmpty() ? 0 : Integer.parseInt(previousBalanceText);

            	// Deposit values
            	String textColumn1 = ((JTextField) textFieldColumn1.getComponent(0)).getText();
            	String textColumn2 = ((JTextField) textFieldColumn2.getComponent(0)).getText();
            	String textColumn3 = ((JTextField) textFieldColumn3.getComponent(0)).getText();
            	String textColumn4 = ((JTextField) textFieldColumn4.getComponent(0)).getText();

            		// Default values if the text fields are empty
            		int valueColumn1 = textColumn1.isEmpty() ? 0 : Integer.parseInt(textColumn1);
            		int valueColumn2 = textColumn2.isEmpty() ? 0 : Integer.parseInt(textColumn2);
            		int valueColumn3 = textColumn3.isEmpty() ? 0 : Integer.parseInt(textColumn3);
            		int valueColumn4 = textColumn4.isEmpty() ? 0 : Integer.parseInt(textColumn4);

            			// Calculate total deposit
            			int totalDeposit = (valueColumn1 * 1000) + (valueColumn2 * 500) + (valueColumn3 * 200) + (valueColumn4 * 100);

            				// Calculate current balance
            				int currentBalance = previousBalance + totalDeposit;

            					// Update total text field
            					totalTextField.setText(Integer.toString(totalDeposit));
            						
            						// Update current text field
            						currentTextField.setText(Integer.toString(currentBalance)); 
            
            							// Update amount
            							((JTextField) textField1Column1.getComponent(0)).setText(Integer.toString(valueColumn1 * 1000));
            							((JTextField) textField1Column2.getComponent(0)).setText(Integer.toString(valueColumn2 * 500));
            							((JTextField) textField1Column3.getComponent(0)).setText(Integer.toString(valueColumn3 * 200));
            							((JTextField) textField1Column4.getComponent(0)).setText(Integer.toString(valueColumn4 * 100));
        																																	}
        });
        
        
        
        
        
        
        mainFrame.setVisible(true);
        
        
        
        
        
    }
    
    
    
    
    
    public static void showWithdrawDialog(JTextField currentTextField) {
        JPanel panel = new JPanel(new GridLayout(2, 1));
        
        	JTextField withdrawAmount = new JTextField(5);
        	JLabel messageLabel = new JLabel("Enter Amount:");
        	
        		panel.add(messageLabel);
        		panel.add(withdrawAmount);

        int result = JOptionPane.showConfirmDialog(null, panel, "Withdraw", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
        	
            // Process the entered withdraw amount
            String withdrawAmountText = withdrawAmount.getText();
            if (!withdrawAmountText.isEmpty()) {
                int withdrawValue = Integer.parseInt(withdrawAmountText);

                // Check conditions if valid number or not
                if (withdrawValue <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Value. Please enter a positive value.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (withdrawValue > Integer.parseInt(currentTextField.getText())) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    // Allow the user to reenter a new value
                    showWithdrawDialog(currentTextField);
                } else {
                	
                    // Update current balance
                    int updatedBalance = Integer.parseInt(currentTextField.getText()) - withdrawValue;
                    currentTextField.setText(Integer.toString(updatedBalance));
                }
            }
        }
    }
    
    
    
    
    
    private static void disableComponents(Component... components) {
        for (Component component : components) {
            if (component instanceof Container) {
                disableComponents(((Container) component).getComponents());
            }
            component.setEnabled(false);
        }
    }

    
    
    
    
    private static void enableComponents(Component... components) {
        for (Component component : components) {
            if (component instanceof Container) {
                enableComponents(((Container) component).getComponents());
            }
            component.setEnabled(true);
        }
    }
}
