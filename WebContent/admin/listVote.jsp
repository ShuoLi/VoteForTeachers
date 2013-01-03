<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>投票详情</title>
<link rel="stylesheet" href="css/table.css" type="text/css" />
<script type="text/javascript" src="js/jquery-1.3.1.min.js"></script>
<script type="text/javascript" src="js/table.js"></script>
</head>

<body>
<h1>投票详情</h1>
<table>
	<thead>
		<tr>
			<th>NO.</th>
			<th>学号</th>
			<th>时间</th>
			<th>IP</th>
		</tr>
	</thead>
	<tbody id="container">
       <s:iterator value="votes" status="st">
		<tr>
		    <td><s:property value="#st.index+1"/></td>
			<td>${studentId}</td>
			<td>${time}</td>
			<td>${ip}</td>
		</tr>
	  </s:iterator>
	</tbody>
</table>
	<div id="control">
	<button onclick="data.prev()">上一页</button>
	<button onclick="data.next()">下一页</button>		
	</div>
</body>
</html>