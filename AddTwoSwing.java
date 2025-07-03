// Program to add two numbers implementing
//  ActionListener using Swing.

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AddTwoSwing extends JFrame implements ActionListener{
    JTextField numberOne , numberTwo;
    JLabel labelText;
    JButton calButton;
    public AddTwoSwing() {
        setSize(1000,1500);
        setTitle("Add Two Numbers");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        numberOne = new JTextField(10);
        numberTwo = new JTextField(10);
        numberOne.setSize(100,100);
        numberTwo.setSize(100,100);
        labelText = new JLabel("");
        calButton = new JButton("Calculate");
        calButton.setSize(400,200);
        calButton.addActionListener(this);

        add(calButton);
        add(numberOne);
        add(numberTwo);
        add(labelText);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        int num1 = Integer.parseInt(numberOne.getText());
            int num2 = Integer.parseInt(numberTwo.getText());
            int sum = num1 + num2;

            labelText.setText("Sum = " + sum);
    }

    public static void main(String[] args) {
        new AddTwoSwing();
    }
}
