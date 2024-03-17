package com.servlet;

import com.bean.User;
import com.dao.daoiml.userdaoImpl;
import com.dao.userdao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/register")
public class registerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String nickname=request.getParameter("nickname");
        User user=new User(username,password,nickname);
         userdao userdao = new userdaoImpl();
         System.out.println(user);
         boolean result=userdao.add(user);
      if(result)
      {
          System.out.println(user);
          response.sendRedirect(request.getContextPath()+"/login.jsp");
      }
      else
      {
          request.setAttribute("message","创建失败用户已存在");
          System.out.println(request.getAttribute("message"));
          request.getRequestDispatcher("/register.jsp").forward(request, response);
//          request.getRequestDispatcher(request.getContextPath()+"/register.jsp").forward(request, response);
      }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
