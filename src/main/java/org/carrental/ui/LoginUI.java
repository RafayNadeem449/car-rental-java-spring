package org.carrental.ui;

import org.carrental.service.AunthenticationService;

import javax.swing.*;
import java.awt.*;

public class LoginUI {

    private final AunthenticationService authService = new AunthenticationService();

    public LoginUI()
    {
        JFrame frame = new JFrame("Rental Car App");

        JTextField userTextField = new JTextField();
        userTextField.setBounds(150,100,200,30);

        JTextField passtf = new JTextField();
        passtf.setBounds(150,150,200,30);

        JButton loginBtn = new JButton("Login");

        loginBtn.setBounds(200,300,100,30);

        frame.add(userTextField);
        frame.add(passtf);
        frame.add(loginBtn);

        loginBtn.addActionListener((event)->{
            if(authService.checkLogin(userTextField.getText(), passtf.getText())){
                frame.dispose();
                new HomeUI();
            }
            else {
                JOptionPane.showMessageDialog(frame,"Incorrect Credentials");
            }

        });


        frame.setSize(500,500);
        frame.setLayout(null);

        frame.setVisible(true);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }


}
