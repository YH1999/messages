package com.cn.syh.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.syh.DaoImp.DaoImp;
import com.cn.syh.entity.User;

/**
 * Servlet implementation class newdl
 */
public class newdl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String pwd = request.getParameter("upwd");
		DaoImp di = new DaoImp();
		String i = di.dl(name, pwd);
		if(i.equals(name+pwd)){
			List<User> list = di.sjrcx(name);
			request.getSession().setAttribute("list",list);
			request.getSession(true).setAttribute("name3", name);
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}else{
			response.sendRedirect("dl.jsp");
		}
	}
	
}
