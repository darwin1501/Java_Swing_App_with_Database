package com.darwin;

import com.darwin.controller.UserController;
import com.darwin.database.UserFromMSSQL;
import com.darwin.model.UserModel;
import com.darwin.table_builder.TableBuilder;
import com.darwin.view.StudentUI;

public class Main {

    public static void main(String[] args) {
        StudentUI studentUI = new StudentUI();
        UserModel userModel = new UserModel();
        UserController userController = new UserController(studentUI, userModel);
        UserModel.getAllUser();
    }
}
