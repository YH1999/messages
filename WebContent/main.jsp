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

	<span>欢迎${name3 }登录</span>
	<span><a href="fxx.jsp">发消息</a></span>
	<span><a href="exitdl">退出</a></span><br/>

	<table>
	<c:forEach items="${list }" var="user">
	<c:if test="${user.state==0 }">
	<tr style="background-color: pink">
	</c:if>
	<c:if test="${user.state==1}">
	<tr>
	</c:if>
	<td><a href="zt?msgid=${user.msgid }&&con=${user.msgcontent }&name=${user.uname}">标题:${user.title }时间: ${user.date }</a></td>
	<td><a href="hf.jsp?uname=${user.uname }">回复</a></td>
	<td><a href="newdel?msgid=${user.msgid }">删除</a></td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>