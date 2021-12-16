package com.darwin;

import com.darwin.controller.UserController;
import com.darwin.database.UserFromMSSQL;
import com.darwin.model.UserModel;
import com.darwin.view.StudentUI;

public class Main {

    public static void main(String[] args) {
//	build application
        StudentUI studentUI = new StudentUI();
        UserModel userModel = new UserModel();
        UserController userController = new UserController(studentUI, userModel);
    }
}
