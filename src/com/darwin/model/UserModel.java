package com.darwin.model;

import com.darwin.database.UserFromMSSQL;
import com.darwin.table_builder.TableBuilder;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserModel {

    public static void getAllUser(){
        UserFromMSSQL userData = new UserFromMSSQL();
        ArrayList<ArrayList<Object>> row = new ArrayList<>();
        ArrayList<Object> column = new ArrayList<>();
        int columnCount;

        try{
            Statement statement = userData.getConnection().createStatement();
            ResultSet users = statement.executeQuery("SELECT * from user_list");
            columnCount = users.getMetaData().getColumnCount();

//            build row
            while (users.next()){
                ArrayList<Object> data = new ArrayList<>();
//                System.out.println(users.getInt(1)+"  "+users.getString(2)+"  "+users.getString(3));
                data.add(users.getInt(1));
                data.add(users.getString(2));
                data.add(users.getString(3));

                row.add(data);
            }
//            build column

            for (int i = 1; i <= columnCount; i++) {
                column.add(users.getMetaData().getColumnName(i));
            }

            userData.getConnection().close();
        }catch (Exception e){
            System.out.println(e);
        }
//        Array List conversion to Array Solution
//        String[][] array = list.stream()
//                .map(l -> l.stream().toArray(String[]::new))
//                .toArray(String[][]::new);

//        convert 2D array list to 2D array
        Object[][] rowArray = row.stream()
                    .map(ArrayList::toArray)
                    .toArray(Object[][]::new);
//        convert array list to array
        Object[] columnArray = column.toArray();

        TableBuilder tableBuilder = new TableBuilder();
        tableBuilder.buildTable(rowArray ,columnArray );
    }

    public void addUser(String username, String email){

        UserFromMSSQL userData = new UserFromMSSQL();
        try{
            Statement statement = userData.getConnection().createStatement();

            statement.executeUpdate("INSERT INTO user_list (username, email) VALUES ('"+username+"','"+email+"')");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
