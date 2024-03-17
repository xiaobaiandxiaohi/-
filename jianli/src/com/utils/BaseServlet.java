package com.utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String methodName = req.getParameter("method");
		if (methodName == null || "".equals(methodName.trim())) {
			throw new RuntimeException("您提交的方法为空!");
		} else {
			try {
				Method m = this.getClass().getMethod(methodName,HttpServletRequest.class, HttpServletResponse.class);
				m.invoke(this, req, resp);
			} catch (Exception e) {
				throw new RuntimeException("您要调用的方法：" + methodName + "它不存在！", e);
			}
		}
	}
}
