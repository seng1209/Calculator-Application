import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class Main extends JFrame implements ActionListener {

    private JButton btnAdd, btnSub, btnMulti, btnDiv, btnDivP, btnClear;
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

        btnAdd = new JButton("+");
        btnSub = new JButton("-");
        btnMulti = new JButton("*");
        btnDiv = new JButton("/");
        btnDivP = new JButton("%");
        btnClear = new JButton("Clear");

        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMulti.addActionListener(this);
        btnDiv.addActionListener(this);
        btnDivP.addActionListener(this);
        btnClear.addActionListener(this);

        layout.add(lblFirstNumber);
        layout.add(txtFirstNumber);
        layout.add(lblSecondNumber);
        layout.add(txtSecondNumber);
        layout.add(lblResult);
        layout.add(txtResult);
        layout.add(btnAdd);
        layout.add(btnSub);
        layout.add(btnMulti);
        layout.add(btnDiv);
        layout.add(btnDivP);
        layout.add(btnClear);

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
        firstNumber = Double.parseDouble(txtFirstNumber.getText());
        secondNumber = Double.parseDouble(txtSecondNumber.getText());
        if (e.getSource() == btnClear)
            this.clear();
        if (e.getSource() == btnAdd)
                txtResult.setText(String.valueOf(firstNumber + secondNumber));
        if (e.getSource() == btnSub)
                txtResult.setText(String.valueOf(firstNumber - secondNumber));
        if (e.getSource() == btnMulti)
                txtResult.setText(String.valueOf(firstNumber * secondNumber));
        if (e.getSource() == btnDiv)
                txtResult.setText(String.valueOf(firstNumber / secondNumber));
        if (e.getSource() == btnDivP)
                txtResult.setText(String.valueOf(firstNumber % secondNumber));
    }
}