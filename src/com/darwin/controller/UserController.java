package com.darwin.controller;

import com.darwin.view.StudentUI;

public class UserController {

    private StudentUI studentUI;

    public UserController(StudentUI studentUI){
        this.studentUI = studentUI;
        initController();
    }

    public void initController(){
        studentUI.getSubmitBtn().addActionListener((e)->{
            System.out.println("submit");
        });
    }
}
