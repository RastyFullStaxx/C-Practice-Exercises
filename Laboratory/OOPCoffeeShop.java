package LongQuiz;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class OOPCoffeeShop {
    
    // Global variables
    static JComboBox drinkList; 
    static ButtonGroup brewingStyleGroup;
    static JRadioButton selectDrip, selectpourOver, selectcold, selectespresso, selectristretto;
    static JCheckBox hot, bread, toastedBread;
    static JTextField amount;


    public static void main(String[] args) {


    // Panel 1
    JPanel panel1 = new JPanel();
    panel1.setLayout(new FlowLayout());

        String[] drink = {"Espresso", "Red Eye", "Black Eye", "Americano", "Macchiato", "Cappuccino", "Cafè Latte"};
        drinkList = new JComboBox(drink);
        drinkList.setPreferredSize(new Dimension (200,20));

            panel1.add(new JLabel("Drink"));
            panel1.add(drinkList);

                drinkList.setSelectedIndex(-1);




    // Panel 2
    JPanel panel3 = new JPanel();
    panel3.setLayout(new GridLayout(0,1));
       
        brewingStyleGroup = new ButtonGroup();

            selectDrip = new JRadioButton("Drip");
            selectpourOver = new JRadioButton("Pour over");
            selectcold = new JRadioButton("Cold");
            selectespresso = new JRadioButton("Espresso");
            selectristretto = new JRadioButton("Ristretto");

            hot = new JCheckBox("Hot");
            bread = new JCheckBox("Bread");
            toastedBread = new JCheckBox("Toasted Bread");

                brewingStyleGroup.add(selectDrip);
                brewingStyleGroup.add(selectpourOver);
                brewingStyleGroup.add(selectcold);
                brewingStyleGroup.add(selectespresso);
                brewingStyleGroup.add(selectristretto);

                    panel3.add(new JLabel("Brewing Style"));
                    panel3.add(selectDrip);
                    panel3.add(selectpourOver);
                    panel3.add(selectcold);
                    panel3.add(selectespresso);
                    panel3.add(selectristretto);
                    panel3.add(hot);
                    panel3.add(bread);
                    panel3.add(toastedBread);



    // Panel 3
    JPanel panel4 = new JPanel();
    panel4.setLayout(new FlowLayout());

        JButton calculate = new JButton("Calculate");
        JButton clear = new JButton("Clear");
                        
            panel4.add(calculate);
            panel4.add(clear);



    // Panel 4
    JPanel panel5 = new JPanel();
    panel5.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel amountLabelText = new JLabel("Amount (PHP)");
        amount = new JTextField(4);
        amount.setEnabled(false);

            panel5.add(amountLabelText);
            panel5.add(amount);





    // clear-btn Functionality
    clear.addActionListener(e -> {

        brewingStyleGroup.clearSelection();
        hot.setSelected(false);
        bread.setSelected(false);
        toastedBread.setSelected(false);
        amount.setText("");
        drinkList.setSelectedIndex(-1);

    });



    // calculate-btn Functionality
    calculate.addActionListener (e ->{

        int totalAmount;

        if (brewingStyleGroup.getSelection() == null && !toastedBread.isSelected() && !hot.isSelected() && !bread.isSelected()) {
            
            amount.setText("");
            String selectedDrink = (String) drinkList.getSelectedItem();
            int itemPrice = getItemPrice(selectedDrink);
            totalAmount = Integer.parseInt(amount.getText() + itemPrice);

        } else {

            amount.setText("");
            totalAmount = calculateAmount();

        } amount.setText(String.valueOf(totalAmount));

    });


    // Main Frame
    JFrame mainFrame = new JFrame("OOPCoffeeShop");
    mainFrame.setSize(350,550);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new GridLayout(4,1));
        mainFrame.setResizable(true);

            mainFrame.add(panel1);
            mainFrame.add(panel3);
            mainFrame.add(panel4);
            mainFrame.add(panel5);

        mainFrame.setVisible(true);





    } // MainFrame ----------------------------------------------------------------





    // Switch cases for drinkList drop down menu 
    static int getItemPrice (String selectedDrink) {

        int itemPrice = 0;

        switch(selectedDrink) {

            case "Espresso":
            return 120;

            case "Red Eye":
            return 115;

            case "Black Eye":
            return 115;

            case "Americano":
            return 117;

            case "Macchiato":
            return 125;

            case "Cappuccino":
            return 126;

            case "Cafè Latte":
            return 128;

            default:
            return 0;
        }
    }




    // Switch cases for calculate function
    static int calculateAmount() {

        int totalPrice = 0;
        String selectedDrink = (String) drinkList.getSelectedItem();

        switch(selectedDrink) {

            case "Espresso":
            totalPrice += 120;
                break;

            case "Red Eye":
            totalPrice += 115;
                break;

            case "Black Eye":
            totalPrice += 115;
                break;

            case "Americano":
            totalPrice += 117;
                break;

            case "Macchiato":
            totalPrice += 125;
                break;

            case "Cappuccino":
            totalPrice += 126;
                break;

            case "Cafè Latte":
            totalPrice += 128;
                break;

            default:
                break;

        }

        // Check if the JTextField amount is not empty
        if (!amount.getText().isEmpty()) {
            totalPrice += Integer.parseInt(amount.getText());
        }
        
                // One-Liner Ifs for brewing style 
                if (selectDrip.isSelected()) totalPrice += 15;
                if (selectpourOver.isSelected()) totalPrice += 17;
                if (selectcold.isSelected()) totalPrice += 12;
                if (selectespresso.isSelected()) totalPrice += 10;
                if (selectristretto.isSelected()) totalPrice += 12;

                    // One-Liner Ifs for check box items additionals
                    if (hot.isSelected()) totalPrice += 5;
                    if (bread.isSelected()) totalPrice += 15;
                    if (toastedBread.isSelected()) totalPrice += 23;

            return totalPrice;

    }





} // OOPCoffeeShop ----------------------------------------------------------------