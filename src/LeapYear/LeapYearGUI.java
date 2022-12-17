package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.NumberFormatException;
import java.lang.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI(){

        btnCheckYear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double year = Double.parseDouble(tfYear.getText());
                    boolean isLeapYear = false;

                    if(year < 0) {
                        throw (new NegativeInputException());
                    }

                    if(year == 0) {
                        throw (new ZeroInputException());
                    }

                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                isLeapYear = true;
                            }
                        } else {
                            isLeapYear = true;
                        }
                    }

                    if (isLeapYear) {
                        JOptionPane.showMessageDialog(panel1, "Leap Year");
                    } else {
                        JOptionPane.showMessageDialog(panel1, "Not a Leap Year");
                    }
                } catch(NumberFormatException numberFormatException) {
                    JOptionPane.showMessageDialog(panel1, "Input should be a number", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NegativeInputException negativeNumberException) {
                    JOptionPane.showMessageDialog(panel1, "Input should not be a negative number", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (ZeroInputException zeroInputException) {
                    JOptionPane.showMessageDialog(panel1, "Input should not be zero", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args){
        LeapYearGUI leap = new LeapYearGUI();
        leap.setContentPane(leap.panel1);
        leap.setSize(500, 500);
        leap.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leap.setVisible(true);
        leap.setTitle("Leap Year Checker");
    }

    public static class ZeroInputException extends Exception {
        public ZeroInputException () {
            super("Input must be nonzero");
        }
    }
    public static class NegativeInputException extends Exception {
        NegativeInputException() {
            super("Input must not be a negative number");
        }
    }

}