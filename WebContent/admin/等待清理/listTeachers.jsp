<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>教师列表</title>
<link rel="stylesheet" href="css/table.css" type="text/css" />
<script type="text/javascript" src="js/jquery-1.3.1.min.js"></script>
<script type="text/javascript" src="js/table.js"></script>
</head>

<body>
<h1>教师列表</h1>
	${totalPage }  ${page} 
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
		</tr>
	</thead>
	
	<tbody id="container">
       <s:iterator value="teachers" status="st">
		<tr>
		    <td>${st.index+1}</td>
		    <td>
		       <a href="../pages/showTeacher.action?teacherId=${teacherId}" target="_blank"><img src="css/static/user_view.png" title="查看" alt="查看"></a>
               <a href="editTeacher.action?teacherId=${teacherId}"><img src="css/static/user_edit.png" title="编辑" alt="编辑"><a>
               <a href="deleteTeacher.action?teacherId=${teacherId}" onclick="return confirm('确实要删除吗？')"><img src="css/static/user_del.png" title="删除" alt="删除"><a>
            </td>
			<td >${teacherId}</td>
			<td>${teacherName}</td>
			<td>${teacherGender}</td>
			<td>${unit}</td>
			<td>${teacherType}</td>
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