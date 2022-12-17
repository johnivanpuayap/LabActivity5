package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JCheckBox cSundae;

    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean foodSelected = false;
                double total = 0;

                if(cPizza.isSelected()){
                    total += 100;
                    foodSelected = true;
                }
                if(cBurger.isSelected()){
                    total += 80;
                    foodSelected = true;
                }
                if(cFries.isSelected()){
                    total += 65;
                    foodSelected = true;
                }
                if(cSoftDrinks.isSelected()){
                    total += 55;
                    foodSelected = true;
                }
                if(cTea.isSelected()){
                    total += 50;
                    foodSelected = true;
                }
                if(cSundae.isSelected()){
                    total += 40;
                    foodSelected = true;
                }

                if(rb5.isSelected()){
                    total = total - (total * 0.05);
                }else if(rb10.isSelected()){
                    total = total - (total * 0.10);
                }else if(rb15.isSelected()){
                    total = total - (total * 0.15);
                }
                JOptionPane.showMessageDialog(panel1, "The total is Php" + String.format("%.2f", total));
            }

        });
    }
    public static void main(String[] args) {
        FoodOrderGUI order = new FoodOrderGUI();
        order.setContentPane(order.panel1);
        order.setSize(500, 500);
        order.setDefaultCloseOperation(EXIT_ON_CLOSE);
        order.setVisible(true);
        order.setTitle("Simple Calculator");
    }
}