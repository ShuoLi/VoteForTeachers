<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Zebra Tables Demo</title>
<script src="js/jquery-1.3.1.min.js">
<script type="text/javascript">
$(document).ready(function(){
//JQuery ready is quicker than onload
$(".stripeMe tr").mouseover(function() {$(this).addClass("over");}).mouseout(function() {$(this).removeClass("over");});
$(".stripeMe tr:even").addClass("alt");
}); 
</script>
<style type="text/css">

body {
	BACKGROUND:#DBE6FE; 
	FONT: 16px 宋体;
}
A { FONT: 16px 宋体; COLOR: #000000; TEXT-DECORATION: none }
	A:hover { COLOR: #428eff; TEXT-DECORATION: underline}
table {
	border-collapse: collapse;
	width: 90%;
	margin: 24px;

}

th {
	background: #3e83c9;
	color: #fff;
	font-weight: bold;
	padding: 2px 11px;
	text-align: center;
	border-right: 1px solid #fff;
	line-height: 1.8;
}

td {
	padding: 6px 11px;
	border-bottom: 1px solid #95bce2;
	vertical-align: top;
}

td * {
	padding: 6px 11px;
}

tr.alt td {
	background: #ecf6fc;
}

tr.over td {
	background: #bcd4ec;
}

</style>
</head>

<body>

<table class="stripeMe"  >
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
	<tbody>
	${totalPage }  ${page} 
	       <s:iterator value="teachers" status="st">
		<tr>
		    <td valign="top" bgcolor="#d6dff7" align="center" >${st.index+1}</td>
		    <td valign="top" bgcolor="#d6dff7" align="center" >
		       <a href="showTeacher.action?teacherId=${teacherId}">查看</a>
               <a href="editTeacher.action?teacherId=${teacherId}">修改 <a>|
               <a href="deleteTeacher.action?teacherId=${teacherId}" onclick="return confirm('确实要删除吗？')">删除<a>
            </td>
			<td valign="top" bgcolor="#d6dff7" align="center" >${teacherId}</td>
			<td valign="top" bgcolor="#d6dff7" align="center" >${teacherName}</td>
			<td valign="top" bgcolor="#d6dff7" align="center" >${teacherGender}</td>
			<td valign="top" bgcolor="#d6dff7" align="center" >${unit}</td>
			<td valign="top" bgcolor="#d6dff7" align="center" >${teacherType}</td>
		</tr>
	  </s:iterator>
	</tbody>
</table>

</body>
</html>