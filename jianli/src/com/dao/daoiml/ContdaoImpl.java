package com.dao.daoiml;

import com.bean.Cont;
import com.bean.Qiuzhi;
import com.bean.User;
import com.dao.Contdao;
import com.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ContdaoImpl implements Contdao {
    @Override
    public boolean add(Cont lj) {
        Connection con= null;
        PreparedStatement preparedStatement=null;
        try {
            con = JDBCUtil.getConnection();
            String sql="insert into cont(uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj,mname,mid) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,lj.getUname());
            preparedStatement.setString(2,lj.getName());
            preparedStatement.setString(3,lj.getAge());
            preparedStatement.setString(4,lj.getPhone());
            preparedStatement.setString(5,lj.getAddress());
            preparedStatement.setString(6,lj.getEmail());
            preparedStatement.setString(7,lj.getWorkyear());
            preparedStatement.setString(8,lj.getCszy());
            preparedStatement.setString(9,lj.getQwyz());
            preparedStatement.setString(10,lj.getSchool());
            preparedStatement.setString(11,lj.getSchooldate());
            preparedStatement.setString(12,lj.getMajor());
            preparedStatement.setString(13,lj.getEducation());
            preparedStatement.setString(14,lj.getZs());
            preparedStatement.setString(15,lj.getGs1());
            preparedStatement.setString(16,lj.getZw1());
            preparedStatement.setString(17,lj.getZzsj1());
            preparedStatement.setString(18,lj.getSqyx1());
            preparedStatement.setString(19,lj.getGzms1());
            preparedStatement.setString(20,lj.getGs2());
            preparedStatement.setString(21,lj.getZw2());
            preparedStatement.setString(22,lj.getZzsj2());
            preparedStatement.setString(23,lj.getSqyx2());
            preparedStatement.setString(24,lj.getGzms2());
            preparedStatement.setString(25,lj.getZwpj());
            preparedStatement.setString(26,lj.getMname());
            preparedStatement.setString(27,lj.getMid());
            int rows = preparedStatement.executeUpdate();
            if (rows == 1) {
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public  List<Cont> list(String username)
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Cont> contlist = new ArrayList<>();
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select  * from cont where  uname=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String mid = resultSet.getString("mid");
                String mname = resultSet.getString("mname");
                String uname = resultSet.getString("uname");
                String name=resultSet.getString("name");
                String age= resultSet.getString("age");
                String phone=resultSet.getString("phone");
                String address=resultSet.getString("address");
                String email=resultSet.getString("email");
                String workyear=resultSet.getString("workyear");
                String cszy=resultSet.getString("cszy");
                String qwyz=resultSet.getString("qwyz");
                String school=resultSet.getString("school");
                String schooldate=resultSet.getString("schooldate");
                String major=resultSet.getString("major");
                String education=resultSet.getString("education");
                String zs=resultSet.getString("zs");
                String gs1=resultSet.getString("gs1");
                String zw1=resultSet.getString("zw1");
                String zzsj1=resultSet.getString("zzsj1");
                String sqyx1=resultSet.getString("sqyx1");
                String gzms1=resultSet.getString("gzms1");
                String gs2=resultSet.getString("gs2");
                String zw2=resultSet.getString("zw2");
                String zzsj2=resultSet.getString("zzsj2");
                String sqyx2=resultSet.getString("sqyx2");
                String gzms2=resultSet.getString("gzms2");
                String zwpj=resultSet.getString("zwpj");

                Cont cont =new Cont(mid,mname,uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj);
                contlist.add(cont);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contlist;
    }
    public Cont ByMid(String Mid)
    {
        Cont cont=null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select  * from cont where  mid=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,Mid);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String mname = resultSet.getString("mname");
                String uname = resultSet.getString("uname");
                String name=resultSet.getString("name");
                String age= resultSet.getString("age");
                String phone=resultSet.getString("phone");
                String address=resultSet.getString("address");
                String email=resultSet.getString("email");
                String workyear=resultSet.getString("workyear");
                String cszy=resultSet.getString("cszy");
                String qwyz=resultSet.getString("qwyz");
                String school=resultSet.getString("school");
                String schooldate=resultSet.getString("schooldate");
                String major=resultSet.getString("major");
                String education=resultSet.getString("education");
                String zs=resultSet.getString("zs");
                String gs1=resultSet.getString("gs1");
                String zw1=resultSet.getString("zw1");
                String zzsj1=resultSet.getString("zzsj1");
                String sqyx1=resultSet.getString("sqyx1");
                String gzms1=resultSet.getString("gzms1");
                String gs2=resultSet.getString("gs2");
                String zw2=resultSet.getString("zw2");
                String zzsj2=resultSet.getString("zzsj2");
                String sqyx2=resultSet.getString("sqyx2");
                String gzms2=resultSet.getString("gzms2");
                String zwpj=resultSet.getString("zwpj");
                cont =new Cont(Mid,mname,uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cont;
    }
    public boolean update(Cont lj)
    {
        Connection con= null;
        PreparedStatement preparedStatement=null;
        try {
            con = JDBCUtil.getConnection();
            String sql="update cont SET name = ?, age = ?, phone = ?, address = ?, email = ?, workyear = ?, cszy = ?, qwyz = ?, school = ?, schooldate = ?, major = ?, education = ?, zs = ?, gs1 = ?, zw1 = ?, zzsj1 = ?, sqyx1 = ?, gzms1 = ?, gs2 = ?, zw2 = ?, zzsj2 = ?, sqyx2 = ?, gzms2 = ?, zwpj = ? WHERE mid = ?;";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,lj.getName());
            preparedStatement.setString(2,lj.getAge());
            preparedStatement.setString(3,lj.getPhone());
            preparedStatement.setString(4,lj.getAddress());
            preparedStatement.setString(5,lj.getEmail());
            preparedStatement.setString(6,lj.getWorkyear());
            preparedStatement.setString(7,lj.getCszy());
            preparedStatement.setString(8,lj.getQwyz());
            preparedStatement.setString(9,lj.getSchool());
            preparedStatement.setString(10,lj.getSchooldate());
            preparedStatement.setString(11,lj.getMajor());
            preparedStatement.setString(12,lj.getEducation());
            preparedStatement.setString(13,lj.getZs());
            preparedStatement.setString(14,lj.getGs1());
            preparedStatement.setString(15,lj.getZw1());
            preparedStatement.setString(16,lj.getZzsj1());
            preparedStatement.setString(17,lj.getSqyx1());
            preparedStatement.setString(18,lj.getGzms1());
            preparedStatement.setString(19,lj.getGs2());
            preparedStatement.setString(20,lj.getZw2());
            preparedStatement.setString(21,lj.getZzsj2());
            preparedStatement.setString(22,lj.getSqyx2());
            preparedStatement.setString(23,lj.getGzms2());
            preparedStatement.setString(24,lj.getZwpj());
            preparedStatement.setString(25,lj.getMid());
            int rows = preparedStatement.executeUpdate();
            if (rows == 1) {
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
