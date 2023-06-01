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

        //functions buttons loop
        for(int i=0; i<8; i++)
        {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false); // for ignore outliner of the buttons
        }

        //number buttons loop
        for(int i=0; i<10; i++)
        {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
        }

        delButton.setBounds(50,430,145,50); // delete button frame position
        clrButton.setBounds(205, 430, 145,50); // clear button frame position

        //creating buttons backgrounds panel
        panel = new JPanel();
        panel.setBounds(50,100,300,300);
        panel.setLayout(new GridLayout(4,4,10,10));
        panel.setBackground(Color.GRAY);


        frame.add(panel);// add button background panel to the frame
        frame.add(delButton);// add delete button to the frame
        frame.add(clrButton);// add clear button to the frame
        frame.add(textField); // add display of calculator in the app frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}