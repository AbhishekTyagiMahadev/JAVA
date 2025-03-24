// Program to build a calculator by using applet with a simple java code
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Applet implements ActionListener {
    TextField input;
    Button[] buttons = new Button[10];
    Button add, sub, mul, div, eq, clr;
    String operator;
    double num1, num2, result;

    public void init() {
        input = new TextField();
        input.setBounds(30, 40, 240, 30);
        add(input);

        int x = 30, y = 80;
        for (int i = 0; i < 10; i++) {
            buttons[i] = new Button(String.valueOf(i));
            buttons[i].setBounds(x, y, 50, 40);
            add(buttons[i]);
            buttons[i].addActionListener(this);
            x += 60;
            if (x > 210) {
                x = 30;
                y += 50;
            }
        }

        add = new Button("+");
        add.setBounds(250, 80, 50, 40);
        sub = new Button("-");
        sub.setBounds(250, 130, 50, 40);
        mul = new Button("*");
        mul.setBounds(250, 180, 50, 40);
        div = new Button("/");
        div.setBounds(250, 230, 50, 40);
        eq = new Button("=");
        eq.setBounds(250, 280, 50, 40);
        clr = new Button("C");
        clr.setBounds(250, 330, 50, 40);

        add(add);
        add(sub);
        add(mul);
        add(div);
        add(eq);
        add(clr);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        eq.addActionListener(this);
        clr.addActionListener(this);

        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == buttons[i]) {
                input.setText(input.getText() + i);
            }
        }
        if (e.getSource() == add) {
            num1 = Double.parseDouble(input.getText());
            operator = "+";
            input.setText("");
        }
        if (e.getSource() == sub) {
            num1 = Double.parseDouble(input.getText());
            operator = "-";
            input.setText("");
        }
        if (e.getSource() == mul) {
            num1 = Double.parseDouble(input.getText());
            operator = "*";
            input.setText("");
        }
        if (e.getSource() == div) {
            num1 = Double.parseDouble(input.getText());
            operator = "/";
            input.setText("");
        }
        if (e.getSource() == eq) {
            num2 = Double.parseDouble(input.getText());
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            input.setText(String.valueOf(result));
        }
        if (e.getSource() == clr) {
            input.setText("");
        }
    }
}