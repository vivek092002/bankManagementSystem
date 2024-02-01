package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {

        setLayout(null);

        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(70,10,100,100);
        add(label1);

        //welcome to atm
         JLabel text = new JLabel("WELCOME TO ATM");
         text.setFont(new Font("Osward", Font.BOLD, 38));
         text.setBounds(200,40,400,40);
         add(text);

         //enter the card
        JLabel cardno = new JLabel("CARD NO:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120,150,150,30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,40);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        //enter the pin
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120,230,400,30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,230,250,40);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(300,300,120,35);
        login.setBackground(Color.BLACK);
        login.setOpaque(true);
        login.setBorderPainted(false);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430,300,120,35);
        clear.setBackground(Color.BLACK);
        clear.setOpaque(true);
        clear.setBorderPainted(false);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,250,35);
        signup.setBackground(Color.BLACK);
        signup.setOpaque(true);
        signup.setBorderPainted(false);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        //background colour
        getContentPane().setBackground(Color.WHITE);

        //size of the frame
        setSize(800,480);
        //to show the frame
        setVisible(true);
        setLocation(350,200);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource() == login){

        } else if (ae.getSource() == signup){

        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
