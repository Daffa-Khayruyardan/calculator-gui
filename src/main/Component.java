package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Component {
    // init panel and layout
    private JPanel mainPanel;
    private GridBagConstraints gbc;

    // make var for result and calculation
    private double enterNumber, resultNumber;
    private int calcIt;

    // init components here
    private JTextField display;

    private JLabel previousNumber;

    private JButton clear, delete, divide, percent;
    private JButton seven, eight, nine, multiple;
    private JButton four, five, six, minus;
    private JButton one, two, three, plus;
    private JButton zero, dot, equals;

    public void calculateNumber() {
        switch(calcIt) {
            // addition process
            case 1:
                resultNumber = enterNumber + Double.parseDouble(display.getText());
                display.setText(Double.toString(resultNumber));
            break;

            case 2:
                resultNumber = enterNumber - Double.parseDouble(display.getText());
                display.setText(Double.toString(resultNumber));
            break;

            case 3:
                resultNumber = enterNumber * Double.parseDouble(display.getText());
                display.setText(Double.toString(resultNumber));
            break;

            case 4:
                resultNumber = enterNumber / Double.parseDouble(display.getText());
                display.setText(Double.toString(resultNumber));
            break;

            case 5:
                resultNumber = enterNumber % Double.parseDouble(display.getText());
                display.setText(Double.toString(resultNumber));
            break;
        }
    }

    public JPanel calcPanel() {
        // declare main panel for app
        mainPanel = new JPanel();

        // set main panel layout
        mainPanel.setLayout(new GridBagLayout());

        // declare grid bag constraints
        gbc = new GridBagConstraints();

        // declare some components here
        display = new JTextField();

        // declare some label here
        previousNumber = new JLabel();

        // set editable text field
        display.setEditable(false);

        // declare some button here
        clear = new JButton("C");
        delete = new JButton("DEL");
        divide = new JButton("/");
        percent = new JButton("%");

        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        multiple = new JButton("*");

        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        minus = new JButton("-");

        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        plus = new JButton("+");

        zero = new JButton("0");
        dot = new JButton(".");
        equals = new JButton("=");

        // make some listener to button
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                previousNumber.setText("");
            }
        });

        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int lengthDisplay = display.getText().length();
                int numberDisplay = display.getText().length() - 1;
                String result;

                if(lengthDisplay > 0) {
                    StringBuilder backspace = new StringBuilder(display.getText());
                    backspace.deleteCharAt(numberDisplay);

                    result = backspace.toString();
                    display.setText(result);
                }
            }
        });

        zero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "0");
            }
        });

        dot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + ".");
            }
        });

        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "1");
            }
        });

        two.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "2");
            }
        });
        
        three.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "3");
            }
        });

        four.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "4");
            }
        });

        five.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "5");
            }
        });

        six.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "6");
            }
        });

        seven.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "7");
            }
        });

        eight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "8");
            }
        });

        nine.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText() + "9");
            }
        });

        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // convert string to double data type
                enterNumber = Double.parseDouble(display.getText());

                // to make switch case running
                calcIt = 1;

                // set text into display
                display.setText("");

                // set label previous number
                previousNumber.setText(enterNumber + "+");
            }
        });

        minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // convert string to double data type
                enterNumber = Double.parseDouble(display.getText());

                // to make switch case running
                calcIt = 2;

                // set text into display
                display.setText("");

                // set label previous number
                previousNumber.setText(enterNumber + "+");
            }
        });

        multiple.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // convert string to double data type
                enterNumber = Double.parseDouble(display.getText());

                // to make switch case running
                calcIt = 3;

                // set text into display
                display.setText("");

                // set label previous number
                previousNumber.setText(enterNumber + "+");
            }
        });

        divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // convert string to double data type
                enterNumber = Double.parseDouble(display.getText());

                // to make switch case running
                calcIt = 4;

                // set text into display
                display.setText("");

                // set label previous number
                previousNumber.setText(enterNumber + "+");
            }
        });

        percent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // convert string to double data type
                enterNumber = Double.parseDouble(display.getText());

                // to make switch case running
                calcIt = 5;

                // set text into display
                display.setText("");

                // set label previous number
                previousNumber.setText(enterNumber + "%");
            }
        });

        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateNumber();
            }
        });

        // set grid bag constraints horizontal
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // add display
        gbc.ipady = 10;
        gbc.gridheight = 1;
        gbc.gridwidth = 4;
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(display,gbc);

        // add previousNumber label 
        gbc.ipady = 10;
        gbc.gridheight = 1;
        gbc.gridwidth = 4;
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(previousNumber,gbc);

        // add clear
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(clear,gbc);

        // add delete
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 1;
        gbc.gridy = 2;
        mainPanel.add(delete,gbc);

        // add percent
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 2;
        gbc.gridy = 2;
        mainPanel.add(percent,gbc);

        // add square
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 3;
        gbc.gridy = 2;
        mainPanel.add(divide,gbc);

        // add seven
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 3;
        mainPanel.add(seven,gbc);

        // add eight
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 1;
        gbc.gridy = 3;
        mainPanel.add(eight,gbc);

        // add nine
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 2;
        gbc.gridy = 3;
        mainPanel.add(nine,gbc);

        // add multiple
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 3;
        gbc.gridy = 3;
        mainPanel.add(multiple,gbc);

        // add four
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 4;
        mainPanel.add(four,gbc);

        // add five
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 1;
        gbc.gridy = 4;
        mainPanel.add(five,gbc);

        // add six
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 2;
        gbc.gridy = 4;
        mainPanel.add(six,gbc);

        // add minus
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 3;
        gbc.gridy = 4;
        mainPanel.add(minus,gbc);

        // add one
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 5;
        mainPanel.add(one,gbc);

        // add two
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 1;
        gbc.gridy = 5;
        mainPanel.add(two,gbc);

        // add three
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 2;
        gbc.gridy = 5;
        mainPanel.add(three,gbc);

        // add plus
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 3;
        gbc.gridy = 5;
        mainPanel.add(plus,gbc);

        // add zero
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 6;
        mainPanel.add(zero,gbc);

        // add dot
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 1;
        gbc.gridy = 6;
        mainPanel.add(dot,gbc);

        // add equals
        gbc.gridheight = 1;
        gbc.gridwidth = 2;
        gbc.gridx = 2;
        gbc.gridy = 6;
        mainPanel.add(equals,gbc);

        return mainPanel;
    }
}