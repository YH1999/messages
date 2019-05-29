<%@page import="org.apache.catalina.ant.SessionsTask"%>
<%@page import="com.cn.syh.entity.User"%>
<%@page import="java.util.List"%>
<%@page import="com.cn.syh.DaoImp.DaoImp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="fs">
	 <span>
	<%
			String name = (String)request.getSession().getAttribute("name3");
			DaoImp di = new DaoImp();
			List<User> list = di.sel(name);
	%>
	<span>欢迎${name3 }登录</span>
			<select name="sjr">
		<%
			for(int i = 0;i <list.size() ; i++){
		%>
			<option><%=list.get(i).getUname() %></option>
		<%} %>
		</select>
	</span>
		标题:<input type="text" style="width:60px" name="bt">
	<br/>
	<textarea rows="10px" cols="30px" name="nr"></textarea><br/>
	<input type="submit">
	</form>
</body>
</html>