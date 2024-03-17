package com.dao.daoiml;

import com.bean.User;
import com.dao.userdao;
import com.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userdaoImpl implements userdao {
    @Override
    public boolean add(User user) {
        Connection con= null;
        PreparedStatement preparedStatement=null;
        try {
            con = JDBCUtil.getConnection();
            String sql="insert into user(username,password,nickname) values(?,?,?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setString(3,user.getNickname());
            int rows = preparedStatement.executeUpdate();
            if (rows == 1) {
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User Byid(String username, String password) {
        Connection con= null;
        PreparedStatement preparedStatement=null;
        User user=null;
        try
        {
            con=JDBCUtil.getConnection();
            String sql="SELECT * FROM `user` WHERE username=? AND password=?";
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                String usernames=rs.getString("username");
                String passwords=rs.getString("password");
                String nickname=rs.getString("nickname");
                user=new User(usernames,passwords,nickname);
            }
            return user;
        }catch (Exception e)
        {
            return null;
        }
    }
}
