package com.servlet;

import com.bean.Cont;
import com.bean.Qiuzhi;
import com.bean.User;
import com.dao.Contdao;
import com.dao.daoiml.ContdaoImpl;
import com.dao.daoiml.qiuzhidaoimpl;
import com.dao.qiuzhidao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/xiugaiServlet")
public class xiugaiServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Contdao cont=new ContdaoImpl();

        String mid=request.getParameter("mid");
        String mname=request.getParameter("mname");
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
        Cont xx=new Cont(mid,mname,uname,name,age,phone,address,email,workyear,cszy,qwyz,school,schooldate,major,education,zs,gs1,zw1,zzsj1,sqyx1,gzms1,gs2,zw2,zzsj2,sqyx2,gzms2,zwpj);
        System.out.println("这是修改：");
        System.out.println(xx);
       boolean result=cont.update(xx);
        System.out.println(result);
        request.getRequestDispatcher("/ContServlet").forward(request, response);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
