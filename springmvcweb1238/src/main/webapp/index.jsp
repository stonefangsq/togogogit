<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="js/jquery.js"></script>

<script type="text/javascript">
function requestBody(){
	$.ajax({
		url:"bind_request_body.do",
		data:{"name":"micky","password":"1111"},
		success:function(msg){
			alert(msg);
		}
	});
	
}
</script>
<html>
<body>
	<h2>Hello World!</h2>
	<form action="do_post.do" method="post">
		<input type="submit" value="submit" />
	</form>
	<hr>
	<form action="bind_object.do">
		name:<input type="text" name="name" /> <br> password:<input
			type="text" name="password" /> <br> <input type="submit"
			value="submit" /> <br>
	</form>
	<hr>
	<form action="bind_array.do" method="post">
		<input type="checkbox" name="ids" value="1" /> 1<br> <input
			type="checkbox" name="ids" value="2" /> 2<br> <input
			type="checkbox" name="ids" value="3" /> 3<br> <input
			type="submit" value="submit" /> <br>
	</form>
	<hr>
	<input type="button" value="requestBody" onclick="requestBody()"/>

	<hr>
	request:${requestScope.scope }
	<br> session:${sessionScope.scope }
	<br> request model:${requestScope.model }
	<br> session model:${sessionScope.model }
	<br>
</body>

</html>
