// Program to build a login page
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginPage extends JFrame implements ActionListener {
    // Components of the login page
    private Container container;
    private JLabel userLabel;
    private JTextField userTextField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton resetButton;
    private JLabel messageLabel;

    // Constructor to initialize the components
    public LoginPage() {
        setTitle("Login Page");
        setBounds(300, 90, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        container.add(userLabel);

        userTextField = new JTextField();
        userTextField.setBounds(150, 50, 150, 30);
        container.add(userTextField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);
        container.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 150, 30);
        container.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(50, 150, 100, 30);
        loginButton.addActionListener(this);
        container.add(loginButton);

        resetButton = new JButton("Reset");
        resetButton.setBounds(200, 150, 100, 30);
        resetButton.addActionListener(this);
        container.add(resetButton);

        messageLabel = new JLabel("");
        messageLabel.setBounds(50, 200, 250, 30);
        container.add(messageLabel);

        setVisible(true);
    }

    // Handle button actions
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText = userTextField.getText();
            String pwdText = new String(passwordField.getPassword());

            // For demonstration, using fixed username and password
            if (userText.equals("admin") && pwdText.equals("password")) {
                messageLabel.setText("Login successful!");
            } else {
                messageLabel.setText("Invalid username or password.");
            }
        } else if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
            messageLabel.setText("");
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new LoginPage();
    }
}
