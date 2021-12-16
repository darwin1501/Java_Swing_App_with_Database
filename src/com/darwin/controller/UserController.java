package com.darwin.controller;

import com.darwin.model.UserModel;
import com.darwin.view.StudentUI;

public class UserController {

    private StudentUI studentUI;
    private UserModel userModel;

    public UserController(StudentUI studentUI, UserModel userModel){
        this.studentUI = studentUI;
        this.userModel = userModel;
        initController();
    }

    public void initController(){
        studentUI.getSubmitBtn().addActionListener((e)->{
            String username;
            String email;

            username = studentUI.getUsernameTextbox().getText();
            email = studentUI.getEmailTextbox().getText();

            userModel.addUser(username, email);
//            update view
            UserModel.getAllUser();
        });
    }
}
