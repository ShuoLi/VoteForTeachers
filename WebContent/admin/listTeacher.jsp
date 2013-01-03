<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>教师列表</title>
<link rel="stylesheet" href="css/table.css" type="text/css" />
<script type="text/javascript" src="js/jquery-1.3.1.min.js"></script>

<script type="text/javascript">
	
	var view={
		totalPage:0
		,page:0
	}
	
	
	$(function(){
		view.totalPage=eval($("#totalPage").text());
		view.page=eval($("#page").text()-1);
		
		var str="";
		for (var i=0; i<view.totalPage; i++) {
			str+="<option>"+(i+1)+"</option>";
		};	
		
		$("select").html(str);
		
		$("option:eq(0)").removeAttr("selected");
		$("option:eq("+view.page+")").attr("selected","selected");
		$()
		
		$("select").change(function(){
			window.location="listTeacher.action?page="+($(this)[0].value-1);
		})	
	})
	
	function gotoPage(val){
		window.location="listTeacher.action?page="+val;
	}
</script>


</head>

<body>
<h1>教师列表</h1>
	
	

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

<div id="control" style="text-align:right;">
	<button onclick="gotoPage(0)">首页</button>
	<button onclick="gotoPage((view.page-1)>=0?(view.page-1):view.page)" >上一页</button>
	<select style="width:65px">
	</select>
	<button onclick="gotoPage((view.page+2)<=view.totalPage?(view.page+1):view.page)">下一页</button>
	<button onclick="gotoPage(view.totalPage-1)">尾页</button>
	
	<span id="totalPage">${totalPage}</span>
	/
	<span id="page">${page+1}</span>
	
</div>
	
</body>
</html>