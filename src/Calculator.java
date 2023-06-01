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

        // Calculator display text field
        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myFont);
        textField.setEditable(false); // prevent from typing text in calculator display

        //initializing char to the button
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        // puts buttons in function array
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;


        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}