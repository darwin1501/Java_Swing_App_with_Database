package com.darwin.view;

import javax.swing.*;
import java.awt.*;

public class StudentUI {

    private JTextField usernameTextbox;
    private JTextField emailTextbox;
    private JButton submitBtn;
    private JLabel userLbl;
    private JLabel emailLbl;
    private JFrame frame;


    public StudentUI(){
        frame = new JFrame();
        frame.setSize(new Dimension(450,500));
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        username label
        userLbl = new JLabel("Username");
        userLbl.setBounds(10,10,100,20);
        frame.add(userLbl);
//        username text box
        usernameTextbox = new JTextField();
        usernameTextbox.setHorizontalAlignment(JTextField.CENTER);
        usernameTextbox.setBounds(10,30,200,25);
        frame.add(usernameTextbox);
//        email label
        emailLbl = new JLabel("Email");
        emailLbl.setBounds(10,60,100,20);
        frame.add(emailLbl);
//        email text box
        emailTextbox = new JTextField();
        emailTextbox.setBounds(10,80,200,25);
        emailTextbox.setHorizontalAlignment(JTextField.CENTER);
        frame.add(emailTextbox);
//        submit btn
        submitBtn = new JButton("Add User");
        submitBtn.setBounds(10,120,100,50);
        frame.add(submitBtn);
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
    public JFrame getFrame(){
        return frame;
    }
}
