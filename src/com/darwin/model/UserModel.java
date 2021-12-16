package com.darwin.model;

import com.darwin.database.UserFromMSSQL;

import java.sql.ResultSet;
import java.sql.Statement;

public class UserModel {

    public static void getAllUser(){
        UserFromMSSQL userData = new UserFromMSSQL();
        try{
            Statement statement = userData.getConnection().createStatement();
            ResultSet users = statement.executeQuery("SELECT * from user_list");

            while (users.next()){
                System.out.println(users.getString(1)+"  "+users.getString(2)+"  "+users.getInt(3));
            }
            userData.getConnection().close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void addUser(String username, String email){

        UserFromMSSQL userData = new UserFromMSSQL();
        try{
            Statement statement = userData.getConnection().createStatement();
//            st.executeUpdate("INSERT INTO Customers " +
//                    "VALUES (1001, 'Simpson', 'Mr.', 'Springfield', 2001)");
//            statement.executeUpdate(String.format("INSERT INTO user_list "+"VALUES (%s, %s)",username, email));
            statement.executeUpdate("INSERT INTO user_list (username, email) VALUES ('"+username+"','"+email+"')");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
