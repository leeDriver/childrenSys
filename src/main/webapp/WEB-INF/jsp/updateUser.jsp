<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
      
    <title>My JSP 'addUser.jsp' starting page</title>  
      
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
    <form id="addUser" action="usercommon/updateMethod" method="post">   
        	用户名: <input id="name" name="name" /><br/>   
        	性别: <input id="sex" name="sex" /><br/>   
        	出生日期: <input id="brith" name="brith" /><br/>   
        	户口所在地: <input id="identents" name="identents" /><br/>   
        	联系方式: <input id="mobile" name="mobile" /><br/>   
        	名言警句: <input id="say" name="say" /><br/>   
        	所在学校: <input id="school" name="school" /><br/>   
        	兴趣爱好: <input id="like" name="like" /><br/>   
        	个人介绍: <input id="intro" name="intro" /><br/>   
        <input type="submit" value="更新"/>   
    </form>  
  </body>  
</html>  