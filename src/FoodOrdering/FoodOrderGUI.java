package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;

    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
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

                    if(!foodSelected) {
                        throw (new NoFoodSelectedException());
                    }

                    JOptionPane.showMessageDialog(panel1, "The total is Php" + String.format("%.2f", total));

                } catch (NoFoodSelectedException noFoodSelectedException) {
                    JOptionPane.showMessageDialog(panel1, "Please Select Food", "No Food Selected", JOptionPane.ERROR_MESSAGE);
                }
            }

        });
    }
    public static void main(String[] args) {
        FoodOrderGUI order = new FoodOrderGUI();
        order.setContentPane(order.panel1);
        order.setSize(500, 500);
        order.setDefaultCloseOperation(EXIT_ON_CLOSE);
        order.setVisible(true);
        order.setTitle("Food Order");
    }

    public static class NoFoodSelectedException extends Exception {
        public NoFoodSelectedException () {
            super("Please select Food");
        }
    }
}