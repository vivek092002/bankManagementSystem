package bankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class signUpOne extends JFrame {

    signUpOne()  {

        //for centre align
        setLayout(null);

        //generating random number for registration number
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        //title layout
        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140,20, 600,40);
        add(formno);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new signUpOne();
    }
}
