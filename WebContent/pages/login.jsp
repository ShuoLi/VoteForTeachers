<%@ page language="java" pageEncoding="utf-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>LoginPage</title>
<style type="text/css">
<!--
td {
	font-weight: bold;
	background-color:#666;
	color: #CFC;
}
#input {
	font-size: 16px;
	
}
#new1 {
	font-size: 9px;
}
#input tr td center form #but right #new1 {
	font-weight: normal;
}
-->
</style>
</head>
<body>
<form method ="post" action="login.action">
<TABLE border="0" align="center" id="input">
<TR>
	<TD><img SRC="css/static/login.jpg" WIDTH="600" HEIGHT="450" border="-1"></TD>
</TR>
<TR>
<TD>
<center>
请您登陆
<br>
请输入姓名:
<input name="student.studentName">
<br>请输入学号:
<input name="student.studentId" type="password">
<br>
<div id="but">
  <p>
    <input type="submit" id="input" value="登陆">
  </p>

    <p id="new1"> 2009.12 copyRight 0702<a href="mailto:dantein88@gmail.com">email-address</a></p>

</div>

</center>
	</TD>
</TR>
</TABLE>
</form>
</body>
</html>