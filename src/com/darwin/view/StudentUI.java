package com.darwin.view;

import javax.swing.*;
import java.awt.*;

public class StudentUI extends JFrame {

    private JTextField usernameTextbox;
    private JTextField emailTextbox;
    private JButton submitBtn;
    private JLabel userLbl;
    private JLabel emailLbl;


    public StudentUI(){
        super("User Information");
        setSize(new Dimension(450,500));
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        username label
        userLbl = new JLabel("Username");
        userLbl.setBounds(10,10,100,20);
        add(userLbl);
//        username text box
        usernameTextbox = new JTextField();
        usernameTextbox.setHorizontalAlignment(JTextField.CENTER);
        usernameTextbox.setBounds(10,30,200,25);
        add(usernameTextbox);
//        email label
        emailLbl = new JLabel("Email");
        emailLbl.setBounds(10,60,100,20);
        add(emailLbl);
//        email text box
        emailTextbox = new JTextField();
        emailTextbox.setBounds(10,80,200,25);
        emailTextbox.setHorizontalAlignment(JTextField.CENTER);
        add(emailTextbox);
//        submit btn
        submitBtn = new JButton("Add User");
        submitBtn.setBounds(10,120,100,50);
        add(submitBtn);
        setVisible(true);
    }

    public JButton getSubmitBtn(){
        return submitBtn;
    }
    public JTextField getUsernameTextbox(){
        return usernameTextbox;
    }
    public JTextField getEmailTextbox(){
        return emailTextbox;
    }
}
