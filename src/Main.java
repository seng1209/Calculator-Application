import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    private JButton addButton, subButton, multiButton, divButton, percentButton, clearButton;
    private JTextField txtFirstNumber, txtSecondNumber, txtResult;
    private JLabel lblFirstNumber, lblSecondNumber, lblResult;

    private double firstNumber, secondNumber;
    Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator Application");
        this.setLocationRelativeTo(null);

        JPanel layout = new JPanel(new GridLayout(6,2));

        lblFirstNumber = new JLabel("First Number:");
        lblSecondNumber = new JLabel("Second Number:");
        lblResult = new JLabel("Result:");

        txtFirstNumber = new JTextField();
        txtSecondNumber = new JTextField();
        txtResult = new JTextField();
        txtResult.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divButton = new JButton("/");
        percentButton = new JButton("%");
        clearButton = new JButton("Clear");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multiButton.addActionListener(this);
        divButton.addActionListener(this);
        percentButton.addActionListener(this);
        clearButton.addActionListener(this);

        layout.add(lblFirstNumber);
        layout.add(txtFirstNumber);
        layout.add(lblSecondNumber);
        layout.add(txtSecondNumber);
        layout.add(lblResult);
        layout.add(txtResult);
        layout.add(addButton);
        layout.add(subButton);
        layout.add(multiButton);
        layout.add(divButton);
        layout.add(percentButton);
        layout.add(clearButton);

        this.add(layout);
        this.setSize(400,300);
        this.setVisible(true);
    }

    public void clear(){
        txtFirstNumber.setText(null);
        txtSecondNumber.setText(null);
        txtResult.setText(null);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == clearButton)
            this.clear();
        if (e.getSource() == addButton){
            try{
                firstNumber = Double.parseDouble(txtFirstNumber.getText());
                secondNumber = Double.parseDouble(txtSecondNumber.getText());
                txtResult.setText(String.valueOf(firstNumber + secondNumber));
            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(null, "Error : " + exception.getMessage());
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
            }
        }
        if (e.getSource() == subButton){
            try{
                firstNumber = Double.parseDouble(txtFirstNumber.getText());
                secondNumber = Double.parseDouble(txtSecondNumber.getText());
                txtResult.setText(String.valueOf(firstNumber - secondNumber));
            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(null, "Error : " + exception.getMessage());
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
            }
        }
        if (e.getSource() == multiButton){
            try{
                firstNumber = Double.parseDouble(txtFirstNumber.getText());
                secondNumber = Double.parseDouble(txtSecondNumber.getText());
                txtResult.setText(String.valueOf(firstNumber * secondNumber));
            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(null, "Error : " + exception.getMessage());
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
            }
        }
        if (e.getSource() == divButton){
            try{
                firstNumber = Double.parseDouble(txtFirstNumber.getText());
                secondNumber = Double.parseDouble(txtSecondNumber.getText());
                txtResult.setText(String.valueOf(firstNumber / secondNumber));
            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(null, "Error : " + exception.getMessage());
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
            }
        }
        if (e.getSource() == percentButton) {
            try{
                firstNumber = Double.parseDouble(txtFirstNumber.getText());
                secondNumber = Double.parseDouble(txtSecondNumber.getText());
                txtResult.setText(String.valueOf(firstNumber % secondNumber));
            }catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(null, "Error : " + exception.getMessage());
            }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
            }
        }
    }
}