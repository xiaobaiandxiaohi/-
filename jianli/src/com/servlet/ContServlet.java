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
import java.util.List;

@WebServlet("/ContServlet")
public class ContServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Object userObject = session.getAttribute("user");
        User user = (User) userObject;
        String userName = user.getUsername();
        Contdao lj=new ContdaoImpl();
        List<Cont> items = lj.list(userName);
        request.getSession().setAttribute("list", items);
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
