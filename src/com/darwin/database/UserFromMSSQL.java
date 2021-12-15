package com.darwin.database;

import java.sql.*;

public class UserFromMSSQL {

    private Connection con;

//    public static void testCon(){
//        try{
//        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//         con=DriverManager.getConnection("jdbc:sqlserver://JONATHAN\\SQLEXPRESS;databaseName=basic_user;integratedSecurity=true;");
//        //                test connection
//        //                if (con != null) {
//        //                    System.out.println("Connected");
//        //                }else{
//        //                    System.out.println("Not Connected");
//        //                }
//        Statement stmt=con.createStatement();
//        ResultSet rs=stmt.executeQuery("select * from user_list");
//
//        while(rs.next())
//            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//        con.close();
//        }catch(Exception e){ System.out.println(e);}
//        }

    public Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection("jdbc:sqlserver://JONATHAN\\SQLEXPRESS;databaseName=basic_user;integratedSecurity=true;");

        }catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public void testConnection(Connection con){
        if (con != null) {
            System.out.println("Connected");
        }else{
            System.out.println("Not Connected");
        }
    }
}
