<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
<head>  
<title>登录成功页面</title>  
<meta http-equiv="pragma" content="no-cache">  
<meta http-equiv="cache-control" content="no-cache">  
<meta http-equiv="expires" content="0">  
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
<meta http-equiv="description" content="This is my page">  
</head>  
<%  
     String userName = (String) request.getSession().getAttribute("userName");  
%>  
<body bgcolor="#000000">  
     <table width="500" height="200" align="center" border="1"  
          style="background-color: #000000;">  
          <tr>  
               <td align="center"  
                    style="background-color: #F8C3C3; color: #00FF00; font-weight: bold; font-size: 30px">  
                    当前登录用户：<%=userName %>  
               </td>  
          </tr>  
     </table>  
</body>  
</html>  