package com.servlet;

import com.bean.User;
import com.dao.daoiml.userdaoImpl;
import com.dao.userdao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String username=request.getParameter("username");
       String password=request.getParameter("password");
       System.out.println(username);
       System.out.println(password);
       userdao userdao=new userdaoImpl();
       User user=userdao.Byid(username,password);
       if(user!=null)
       {
           request.getSession().setAttribute("user", user);
           request.getRequestDispatcher("/index.jsp").forward(request, response);
       }
       else
       {
           request.setAttribute("message","用户账号或者密码错误");
           System.out.println(request.getAttribute("message"));
           request.getRequestDispatcher("/login.jsp").forward(request, response);
       }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
