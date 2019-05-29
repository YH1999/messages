package com.cn.syh.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cn.syh.DaoImp.DaoImp;
import com.cn.syh.entity.User;

/**
 * Servlet implementation class newzc
 */
@WebServlet("/newzc")
public class newzc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("name");
		String upwd= request.getParameter("pwd");
		String uemail = request.getParameter("email");
		User u = new User();
		u.setUname(uname);
		u.setUpwd(upwd);
		u.setEmail(uemail);
		DaoImp di = new DaoImp();
		List<User> list = di.pd(uname);
	 	if(list.size()==0){
	 		int q = di.zc(uname, upwd, uemail);
	 			if(q>0){
	 				request.setAttribute("msg","注册成功请登录!");
	 				request.getRequestDispatcher("dl.jsp").forward(request, response);
	 			}
	 	}else{
				request.setAttribute("msg1","用户名被注册.请更换用户名!");
				request.getRequestDispatcher("zc.jsp").forward(request, response);
			}
	
	}

}
