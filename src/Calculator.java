import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// imported graphics library

public class Calculator implements ActionListener{ // actionlistener is a java awt events method

    JFrame frame; // creating apps frame variable
    JTextField textField; // creating calculator display variable
    JButton[] numberButtons = new JButton[10]; // declaring number button variable
    JButton[] functionButtons = new JButton[8]; // declaring function button variable
    JButton addButton, subButton, mulButton, divButton; // declaring operator button variable
    JButton decButton, equButton, delButton, clrButton;

    JPanel panel;

    Font myFont = new Font("Ink free", Font.BOLD,40); // declaring font style

    double num1=0, num2=0, result=0; // declaring variable for solve the calculation
    char operator; // declaring operator variable to contain the operator during solving equation


    public Calculator() {
        frame = new JFrame("CALCULATOR"); // frame name
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);


        frame.setVisible(true);
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}