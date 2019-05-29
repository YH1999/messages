package com.cn.syh.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.syh.DaoImp.DaoImp;

/**
 * Servlet implementation class newdel
 */
@WebServlet("/newdel")
public class newdel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String msgid = request.getParameter("msgid");
			int smsgid = Integer.parseInt(msgid);
			DaoImp di = new DaoImp();
			int r = di.del(smsgid);
			if(r>0){
				request.getRequestDispatcher("del.jsp");
			}
	}
}
