package com.servlet;

import com.bean.Qiuzhi;
import com.bean.User;
import com.dao.daoiml.qiuzhidaoimpl;
import com.dao.qiuzhidao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj
@WebServlet("/qiuzhiadd")
public class qiuzhiaddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Object userObject = session.getAttribute("user");
        User user = (User) userObject;
        String userName = user.getUsername();
        System.out.println(userName);
        qiuzhidao qz=new qiuzhidaoimpl();
        Qiuzhi xx=qz.userinf(userName);
        if(xx==null)
        {

        }


        qiuzhidao q=new qiuzhidaoimpl();
        String uname=request.getParameter("uname");
        String name=request.getParameter("name");
        String age=request.getParameter("age");
        String phone=request.getParameter("phone");
        String address=request.getParameter("address");
        String email=request.getParameter("email");
        String workyear=request.getParameter("workyear");
        String cszy=request.getParameter("cszy");
        String qwyz=request.getParameter("qwyz");
        String school=request.getParameter("school");
        String schooldate=request.getParameter("schooldate");
        String major=request.getParameter("major");
        String education=request.getParameter("education");
        String zs=request.getParameter("zs");
        String gs1=request.getParameter("gs1");
        String zw1=request.getParameter("zw1");
        String zzsj1=request.getParameter("zzsj1");
        String sqyx1=request.getParameter("sqyx1");
        String gzms1=request.getParameter("gzms1");
        String gs2=request.getParameter("gs2");
        String zw2=request.getParameter("zw2");
        String zzsj2=request.getParameter("zzsj2");
        String sqyx2=request.getParameter("sqyx2");
        String gzms2=request.getParameter("gzms2");
        String zwpj=request.getParameter("zwpj");

//uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj
     if(xx==null)
     {
         Qiuzhi qiuzhi=new Qiuzhi(uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj);
         q.add(qiuzhi);
         xx=qz.userinf(userName);
         request.setAttribute("xx", xx);
         request.getRequestDispatcher("/bianji.jsp").forward(request, response);
     }
     else
     {
         Qiuzhi qiuzhi=new Qiuzhi(uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj);
         q.update(qiuzhi);
         xx=qz.userinf(userName);
         request.setAttribute("xx", xx);
         request.getRequestDispatcher("/bianji.jsp").forward(request, response);
     }

//        HttpSession session = request.getSession();
//        Object userObject = session.getAttribute("user");
//        User user = (User) userObject;
//        String userName = user.getUsername();
//        System.out.println(userName);
//        qiuzhidao qz=new qiuzhidaoimpl();
//        Qiuzhi xx=qz.userinf(userName);
//        System.out.println(xx);
//        request.setAttribute("xx", xx);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
