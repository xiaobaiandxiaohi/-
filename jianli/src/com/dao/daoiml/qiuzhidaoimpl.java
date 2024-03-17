package com.dao.daoiml;

import com.bean.Qiuzhi;
import com.bean.User;
import com.dao.qiuzhidao;
import com.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


//uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj
public class qiuzhidaoimpl implements qiuzhidao {
    public boolean add(Qiuzhi qiuzhi)
    {
        Connection con= null;
        PreparedStatement preparedStatement=null;
        try {
            con = JDBCUtil.getConnection();
            String sql="insert into qiuzhi(uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,qiuzhi.getUname());
            preparedStatement.setString(2,qiuzhi.getName());
            preparedStatement.setString(3,qiuzhi.getAge());
            preparedStatement.setString(4,qiuzhi.getPhone());
            preparedStatement.setString(5,qiuzhi.getAddress());
            preparedStatement.setString(6,qiuzhi.getEmail());
            preparedStatement.setString(7,qiuzhi.getWorkyear());
            preparedStatement.setString(8,qiuzhi.getCszy());
            preparedStatement.setString(9,qiuzhi.getQwyz());
            preparedStatement.setString(10,qiuzhi.getSchool());
            preparedStatement.setString(11,qiuzhi.getSchooldate());
            preparedStatement.setString(12,qiuzhi.getMajor());
            preparedStatement.setString(13,qiuzhi.getEducation());
            preparedStatement.setString(14,qiuzhi.getZs());
            preparedStatement.setString(15,qiuzhi.getGs1());
            preparedStatement.setString(16,qiuzhi.getZw1());
            preparedStatement.setString(17,qiuzhi.getZzsj1());
            preparedStatement.setString(18,qiuzhi.getSqyx1());
            preparedStatement.setString(19,qiuzhi.getGzms1());
            preparedStatement.setString(20,qiuzhi.getGs2());
            preparedStatement.setString(21,qiuzhi.getZw2());
            preparedStatement.setString(22,qiuzhi.getZzsj2());
            preparedStatement.setString(23,qiuzhi.getSqyx2());
            preparedStatement.setString(24,qiuzhi.getGzms2());
            preparedStatement.setString(25,qiuzhi.getZwpj());
            int rows = preparedStatement.executeUpdate();
            if (rows == 1) {
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public  Qiuzhi userinf(String uname)
    {
        Connection con= null;
        PreparedStatement preparedStatement=null;
        Qiuzhi qiuzhi=null;
        try
        {
            con=JDBCUtil.getConnection();
            String sql="SELECT * FROM `qiuzhi` WHERE uname=? ";
            preparedStatement=con.prepareStatement(sql);
            preparedStatement.setString(1,uname);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                String name=rs.getString("name");
                String age= rs.getString("age");
                String phone=rs.getString("phone");
                String address=rs.getString("address");
                String email=rs.getString("email");
                String workyear=rs.getString("workyear");
                String cszy=rs.getString("cszy");
                String qwyz=rs.getString("qwyz");
                String school=rs.getString("school");
                String schooldate=rs.getString("schooldate");
                String major=rs.getString("major");
                String education=rs.getString("education");
                String zs=rs.getString("zs");
                String gs1=rs.getString("gs1");
                String zw1=rs.getString("zw1");
                String zzsj1=rs.getString("zzsj1");
                String sqyx1=rs.getString("sqyx1");
                String gzms1=rs.getString("gzms1");
                String gs2=rs.getString("gs2");
                String zw2=rs.getString("zw2");
                String zzsj2=rs.getString("zzsj2");
                String sqyx2=rs.getString("sqyx2");
                String gzms2=rs.getString("gzms2");
                String zwpj=rs.getString("zwpj");
                qiuzhi=new Qiuzhi(uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj);
            }
            return qiuzhi;
        }catch (Exception e)
        {
            return null;
        }
    }
    public boolean update(Qiuzhi qiuzhi)
    {
        Connection con= null;
        PreparedStatement preparedStatement=null;
        try {
            con = JDBCUtil.getConnection();
            String sql="update qiuzhi SET name = ?, age = ?, phone = ?, address = ?, email = ?, workyear = ?, cszy = ?, qwyz = ?, school = ?, schooldate = ?, major = ?, education = ?, zs = ?, gs1 = ?, zw1 = ?, zzsj1 = ?, sqyx1 = ?, gzms1 = ?, gs2 = ?, zw2 = ?, zzsj2 = ?, sqyx2 = ?, gzms2 = ?, zwpj = ? WHERE uname = ?;";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1,qiuzhi.getName());
            preparedStatement.setString(2,qiuzhi.getAge());
            preparedStatement.setString(3,qiuzhi.getPhone());
            preparedStatement.setString(4,qiuzhi.getAddress());
            preparedStatement.setString(5,qiuzhi.getEmail());
            preparedStatement.setString(6,qiuzhi.getWorkyear());
            preparedStatement.setString(7,qiuzhi.getCszy());
            preparedStatement.setString(8,qiuzhi.getQwyz());
            preparedStatement.setString(9,qiuzhi.getSchool());
            preparedStatement.setString(10,qiuzhi.getSchooldate());
            preparedStatement.setString(11,qiuzhi.getMajor());
            preparedStatement.setString(12,qiuzhi.getEducation());
            preparedStatement.setString(13,qiuzhi.getZs());
            preparedStatement.setString(14,qiuzhi.getGs1());
            preparedStatement.setString(15,qiuzhi.getZw1());
            preparedStatement.setString(16,qiuzhi.getZzsj1());
            preparedStatement.setString(17,qiuzhi.getSqyx1());
            preparedStatement.setString(18,qiuzhi.getGzms1());
            preparedStatement.setString(19,qiuzhi.getGs2());
            preparedStatement.setString(20,qiuzhi.getZw2());
            preparedStatement.setString(21,qiuzhi.getZzsj2());
            preparedStatement.setString(22,qiuzhi.getSqyx2());
            preparedStatement.setString(23,qiuzhi.getGzms2());
            preparedStatement.setString(24,qiuzhi.getZwpj());
            preparedStatement.setString(25,qiuzhi.getUname());
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
