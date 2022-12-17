package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String operation = (String) cbOperations.getSelectedItem();
                    int n1 = Integer.parseInt(tfNumber1.getText());
                    int n2 = Integer.parseInt(tfNumber2.getText());
                    int result = 0;

                    if (operation.equals("+")) {
                        result = n1 + n2;
                    }
                    if (operation.equals("-")) {
                        result = n1 - n2;
                    }
                    if (operation.equals("*")) {
                        result = n1 * n2;
                    }
                    if (operation.equals("/")) {
                        result = n1 / n2;
                    }
                    lblResult.setText(String.valueOf(result));
                } catch (ArithmeticException arithmeticException) {
                    JOptionPane.showMessageDialog(panel1, "Division by Zero is not possible", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (NumberFormatException numberFormatException) {
                    JOptionPane.showMessageDialog(panel1, "Input should be a number", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
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
