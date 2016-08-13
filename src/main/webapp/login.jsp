<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
<head>  
<title>登录页面</title>  
<meta http-equiv="pragma" content="no-cache">  
<meta http-equiv="cache-control" content="no-cache">  
<meta http-equiv="expires" content="0">  
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
<meta http-equiv="description" content="This is my page">  
</head>  
<body>  
<div>当前登录SessionID:<%=session.getId() %></div><br>
  <form  method="post" action="LoginServlet" id="loginform">  
     <table bgcolor="#F8C3C3" border="1" borderColor="#FF0000"  
          align="center" width="260" height="160">  
          <tr>  
               <td height="15" colspan="2" align="center"  
                    style="background-color: #000000; font-size: 28px; color: #FFFF00"><b>用户登录</b></td>  
          </tr>  
               <tr>  
                    <td width="80" align="center"><b>用户名</b></td>  
                    <td><input type="text" name="userName" value="" /></td>  
               </tr>  
               <tr>  
                    <td align="center"><b>密 码</b></td>  
                    <td><input type="password" name="password" value="" /></td>  
               </tr>  
               <tr>  
                    <td colspan="2" align="center" style="background-color: #000000;">  
                         <input type="submit" value="登 录" />  <input type="reset"  
                         value="重 置" />  
                    </td>  
               </tr>  
     </table>  
      </form>  
</body>  
</html>  