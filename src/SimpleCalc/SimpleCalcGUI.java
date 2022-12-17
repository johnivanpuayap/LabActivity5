package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {

    }
    public static void main(String[] args){
        SimpleCalcGUI calculator = new SimpleCalcGUI();
        calculator.setContentPane(calculator .panel1);
        calculator.setSize(500, 500);
        calculator.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calculator.setVisible(true);
        calculator.setTitle("Leap Year Checker");
    }
}
