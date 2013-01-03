<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>过滤设置</title>
        <link rel="stylesheet" type="text/css" href="css/basic.css" />
        <script src="js/jquery-1.3.1.min.js">
        </script>
		<script type="text/javascript">
		function askFor(){
			alert("sd");
			//var val=window.prompt("输入数值");
		}
        </script>
    </head>
    <body>
        <h1>过滤设置</h1>
        
        <form style="border:1px solid #c0c0c0;" action="config.action" method="post">
            <fieldset>
                <legend>
				票数限制
                </legend>
				<p>
				每个学生可以投票数。
		        </p>
				<input type="text" name="studentAllowedCount"  value=<s:property value="#application.studentAllowedCount" />>
            </fieldset>
            <fieldset>
                <legend>
				安全设置
                </legend>
				<p>
				 开启IP过滤设置，限制同一IP投票数来有效防止刷票的情况。
		        </p>
				<input type="text" name="ipAllowedCount" value=<s:property value="#application.ipAllowedCount" />>
            </fieldset>			
		
		<div style="background-color:#c0c0c0;padding:10px">
		<input type="submit" value="提交"/>
		</div>
			
        </form>
		
    </body>
</html>