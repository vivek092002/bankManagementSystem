package bankManagementSystem;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame{

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

        JTextField cardTextFeild = new JTextField();
        cardTextFeild.setBounds(300,150,250,30);
        add(cardTextFeild);

        //enter the pin
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120,230,400,30);
        add(pin);

        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);

        JButton login = new JButton("SIGN IN");
        login.setBounds(300,350,100,30);
        //login.setBackground(Color.BLACK);
        //login.setForeground(Color.WHITE);
        add(login);

        //background colour
        getContentPane().setBackground(Color.WHITE);

        //size of the frame
        setSize(800,480);
        //to show the frame
        setVisible(true);
        setLocation(350,200);
    }

    public static void main(String[] args) {
        new Login();
    }
}
