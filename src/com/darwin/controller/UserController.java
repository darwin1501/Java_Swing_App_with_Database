package com.darwin.controller;

import com.darwin.model.UserModel;
import com.darwin.table_builder.TableBuilder;
import com.darwin.view.StudentUI;

public class UserController {

    private StudentUI studentUI;
    private UserModel userModel;
    private TableBuilder table;

    public UserController(StudentUI studentUI, UserModel userModel){
        this.studentUI = studentUI;
        this.userModel = userModel;

        Object[][] rowArray = (Object[][]) userModel.getAllUser().get(0);
        Object[] columnArray = (Object[]) userModel.getAllUser().get(1);

        table = new TableBuilder();
        table.buildTable(studentUI.getFrame(), rowArray, columnArray);

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
//            UserModel.getAllUser();

            updateTable();
        });
    }

    public void updateTable(){

        Object[][] rowArray = (Object[][]) userModel.getAllUser().get(0);
        Object[] columnArray = (Object[]) userModel.getAllUser().get(1);

        studentUI.getFrame().remove(table.getScrollPane());
        table.buildTable(studentUI.getFrame(), rowArray, columnArray);
    }
}
