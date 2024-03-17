package com.utils;


import java.sql.*;

//?useUnicode=true&characterEncoding=utf8";
public class JDBCUtil {
     private static   Connection con =  null;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jianli",  "root", "123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  con;
    }
    public static   void close(ResultSet resultSet, Statement statement, Connection con){
        if (resultSet!=null){
            try {
                  resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if ( statement!=null){
            try {
                 statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (con!=null){
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
