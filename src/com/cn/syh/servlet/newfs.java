package com.cn.syh.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.syh.DaoImp.DaoImp;
import com.cn.syh.entity.User;

/**
 * Servlet implementation class newfs
 */
public class newfs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String sjr = request.getParameter("sjr");
			String bt = request.getParameter("bt");
			String nr = request.getParameter("nr");
			request.getSession(true).setAttribute("sjra",sjr);
			String name = (String)request.getSession().getAttribute("name3");
			DaoImp di = new DaoImp();
			Date date = new Date();
			int i = di.fxx(name, bt, nr, sjr,date);
			if(i>0){
				List<User> list = di.sel(name);
				request.getSession().setAttribute("list",list);
				request.getRequestDispatcher("main.jsp").forward(request, response);
			}
	}

}
