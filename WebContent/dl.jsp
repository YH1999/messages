<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${msg }
	<form action="dl" method="post" id="e">
		用户名:  &nbsp;&nbsp;<input type="text" name="uname" id="name"><br/>
		密码:  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="password" name="upwd" id="pwd"><br/>
		<input type="submit" value="登录">
	</form>
	
	<script src="js/jquery-1.8.3.min.js"></script>
	<script src="js/jquery.validate.min.js"></script>
	<script>
	$(function(){
		$("#e").validate({
			rules:{
				name:{
					required:true,
				},
				pwd:{
					required:true,
				}
			},
			messages:{
				name:{
					required:"用户名必填",
				},
				pwd:{
					required:"密码必填",
				}
			}
		})
		
	})

	</script>
</body>
</html>