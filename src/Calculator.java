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

        // added 1 2 3 button to the panel and add button
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);

        // added 4 5 6 button to the panel and sub button
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);

        // added 7 8 9 button to the panel and mul button
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);

        // added the other buttons
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);


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
        for(int i=0; i<10; i++)
        {
            if(e.getSource() == numberButtons[i]) // get numbers input to the calculator display
            {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if(e.getSource() == decButton)// get . (point) input to the display
        {
            textField.setText(textField.getText().concat("."));
        }

        if(e.getSource() == addButton)// get + (add) input to the display
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText(" ");
        }

        if(e.getSource() == subButton)// get - (sub) input to the display
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText(" ");
        }

        if(e.getSource() == mulButton)// get * (mul) input to the display
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText(" ");
        }

        if(e.getSource() == mulButton)// get / (div) input to the display
        {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText(" ");
        }

        if(e.getSource() == equButton) // solving equation
        {
            num2 = Double.parseDouble(textField.getText());
            switch (operator)
            {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case'*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }


    }
}