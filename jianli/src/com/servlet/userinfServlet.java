package com.servlet;

import com.bean.Qiuzhi;
import com.bean.User;
import com.dao.daoiml.qiuzhidaoimpl;
import com.dao.qiuzhidao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/userinfServlet")
public class userinfServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Object userObject = session.getAttribute("user");

        User user = (User) userObject;
        String userName = user.getUsername();
        System.out.println(userName);
        qiuzhidao qz=new qiuzhidaoimpl();
        Qiuzhi xx=qz.userinf(userName);
        System.out.println(xx);
        request.setAttribute("xx", xx);
        request.getRequestDispatcher("/bianji.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
