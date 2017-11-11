<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
      
    <title>My JSP 'showUser.jsp' starting page</title>  
      
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
    <!-- 
    <link rel="stylesheet" type="text/css" href="styles.css"> 
    -->  
  
  </head>  
    
  <body>  
    <c:forEach items="${uList }" var="u">  
        用户名称：${u.name}
        用户年龄：${u.age }
                <br/>  
    </c:forEach>  
    <!--bootstrap需要依赖jQuery，所以必须在他之前先引入jQuery-->
  <script src="<%=basePath %>resources/js/bootstrap/jquery-3.2.1.min.js"></script>
  <script src="<%=basePath %>resources/js/bootstrap/bootstrap.js"></script>
  </body>  
</html>