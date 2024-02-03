package JMenuPractice;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




// Menu bar -> Menu -> Menu Items


public class MenuBarPractice {
    
    public static void main(String[] args) {


        // Panel 1
        JPanel panel1 = new JPanel();
        JMenuBar menuBar = new JMenuBar();

            JMenu menu = new JMenu("MENU");

                JMenuItem menuItem1 = new JMenuItem("David");
                JMenuItem menuItem2 = new JMenuItem("Geisler");
                JMenuItem menuItem3 = new JMenuItem("Mapaghayag");

                    menu.add(menuItem1);
                    menu.add(menuItem2);
                    menu.add(menuItem3);

                        panel1.add(menu);
                        menuBar.add(menu);

        


        // Main Frame
        JFrame mainFrame = new JFrame("JFrame");
        mainFrame.setSize(500,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(null);
        
            mainFrame.setJMenuBar(menuBar);

        mainFrame.setVisible(true);

    }


}
