<%-- <%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>

<head>
<title>Bootstrap 实例</title>
<meta charset="utf-8">

<meta http-equiv=“Content-Type” content=“text/html; charset=UTF-8″>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>



	<div class="jumbotron">
		<form id="loginMethod" action="regiestMethod" method="post">
			<h3>
				帐号 <input id="name" name="name" />
			</h3>
			<br />
			<h3>
				密码 <input id="password" name="password" />
			</h3>
			<h3>
				确认密码 <input id="password" name="passwordConfirm" />
			</h3>
			<input type="submit" value="注册" />
		</form>

	</div>


</body>
</html>
