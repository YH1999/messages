<%@page import="com.cn.syh.entity.User"%>
<%@page import="java.util.List"%>
<%@page import="com.cn.syh.DaoImp.DaoImp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="fs">
	
	<% 
	String uname = request.getParameter("uname");
	%>
	 <span>
	<%
	%>
	<span>欢迎${name3 }登录</span>
			<select name="sjr">
			<option><%=uname %></option>
		</select>
	</span>
		标题:<input type="text" style="width:60px" name="bt">
	<br/>
	<textarea rows="10px" cols="30px" name="nr"></textarea><br/>
	<input type="submit">
	</form>
</body>
</html>