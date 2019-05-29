package com.cn.syh.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.syh.DaoImp.DaoImp;

/**
 * Servlet implementation class newupzt
 */
@WebServlet("/newupzt")
public class newupzt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int id = Integer.parseInt(request.getParameter("msgid"));
			//String name= request.getParameter("name");
			String con = request.getParameter("con");
			request.setAttribute("con", con);
			DaoImp di = new DaoImp();
			int i = di.upzt(id);
			if(i>0){
				//request.setAttribute("name", name);
				request.getRequestDispatcher("nr.jsp").forward(request, response);
			}
	
	}

}
