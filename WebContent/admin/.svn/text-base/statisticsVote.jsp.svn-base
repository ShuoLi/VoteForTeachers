<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>票选结果</title>
<link rel="stylesheet" href="css/table.css" type="text/css" />
<script type="text/javascript" src="js/jquery-1.3.1.min.js"></script>
<script type="text/javascript" src="js/table.js"></script>
</head>

<body>
<h1>票选结果</h1>
<table>
	<thead>
		<tr>
			<th>NO.</th>
		 	<th>操作</th>
			<th>编号</th>
			<th>姓名</th>
			<th>性别</th>
			<th>所属单位</th>
			<th>参评类别</th>
			<th>所得票数</th>
		</tr>
	</thead>
	<tbody id="container">
       <s:iterator value="voteStatistics" status="st">
		<tr>
		    <td>${st.index+1}</td>
		    <td>
		       <a href="showVotes.action?teacherId=${teacherId}">查看详细</a>
            </td>
			<td>${teacherId}</td>
			<td>${teacherName}</td>
			<td>${teacherGender}</td>
			<td>${unit}</td>
			<td>${teacherType}</td>
			<td>${count}</td>
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