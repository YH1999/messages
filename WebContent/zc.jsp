<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${msg1 }
	<form action="newzc" method="post" id="w">
		用户名:  &nbsp;&nbsp;<input type="text" name="name" id="name"><br/>
		密码:  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="password" name="pwd" id="pwd"><br/>
		确认密码:<input type="password" name="pwd1" id="pwd1"><br/>
		邮箱:  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="email" id="email"><br/>
		<input type="submit" value="注册">
	</form>
	
	
	<script src="js/jquery-1.8.3.min.js"></script>
	<script src="js/jquery.validate.min.js"></script>
	<script>
	$(function(){
		$("#w").validate({
			rules:{
				name:{
					required:true,
				},
				pwd:{
					required:true,
				},
				pwd1:{
					required:true,
					equalTo:"#pwd"
				},
				email:{
					required:true,
				}
			},
			messages:{
				name:{
					required:"用户名必填",
				},
				pwd:{
					required:"密码必填",
				},
				pwd1:{
					required:"密码必填",
				},
				email:{
					required:"邮箱必填",
				}
			}
		})
		
	})

	</script>
	
	
	
	
</body>
</html>