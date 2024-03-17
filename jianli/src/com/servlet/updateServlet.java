package com.servlet;

import com.bean.Cont;
import com.dao.Contdao;
import com.dao.daoiml.ContdaoImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mid=request.getParameter("mid");

        Contdao cont=new ContdaoImpl();
        Cont xx=cont.ByMid(mid);

        System.out.println(xx);
        request.setAttribute("xx", xx);
        request.getRequestDispatcher("/listbianji.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
