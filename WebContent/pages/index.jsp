<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>投票-我最喜爱的老师</title>
		<link rel="stylesheet" href="css/jquery-ui-1.7.2.custom.css" type="text/css" />
		<link rel="stylesheet" href="css/page.css" type="text/css" />
		<link rel="stylesheet" href="css/main.css" type="text/css" />
        <script src="js/jquery-1.3.1.min.js">
        </script>
        <script src="js/jquery-ui-1.7.2.custom.min.js">
        </script>
        <script src="js/jquery.autocomplete.pack.js">
        </script>
		<script src="js/data.js">
        </script>	
		<script src="js/ui.js">
        </script>
		<script type="text/javascript" charset="utf-8">
            $(function(){
				availableVotes=$("#leftVoteCount").text();
				createFilters();
				registerEvent();
				loadData();
				addSlider();
            });			
        </script>
    </head>

<body>	
    <center>
        <div id="header">
            <h2>已有<span id="totalVotes">000</span>投票</h2>
        </div>
        <div id="wrapper">
            <div id="selection">
                <div id="toContainer">
                	<!--已选区域-->
                </div>
				<span id="status" style="color:#000000;">
				
				    <s:if test="#session.student!=null">
				  	  欢迎${session.student.studentName}还有
					<strong  id="status_votes">${session.leftVoteCount}</strong
					<strong style="display:none;"  id="leftVoteCount">${session.leftVoteCount}</strong>个投票名额
					<button onclick="vote()">投票</button>
					</s:if>
					<s:if test="#session.student==null">
				  	 <a href="login.jsp">请登录</a>
					</s:if>
				</span>
            </div>
            <div id="option">
            	<a id="toggleOptions" href="javascript:toggleOptions()" style="display:none;">
					<img src="css/static/filter.png" title="打开选项" alt="打开选项">
				</a>
                <div id="optionContainer">
                	<form id="filters">
						<!--自动生成过滤-->
					</form>
					<button onclick="toggleOptions()">隐藏</button>
					<button onclick="refreshBrowser()">刷新</button>
					<button onclick="refreshBrowser(true)">显示全部</button>
					<button onclick="refreshBrowser(false)">只显示图片</button>
					<button onclick="toggleDesc()">显示说明</button>
					<br/>
					<img src="css/static/dragMe.png" title="调整滑块以缩放" alt="调整滑块以缩放">
                </div>
            </div>
			<div id="filter">
				<div id="slider">
					<!--滑块-->
				</div>
			</div>
            <div id="browse">
            	<div id="fromContainer">
	            	<!--浏览-->
					<div id="AJAX_loading" style="text-align:center;height:100%;padding-top:20px">
						<img src="css/static/loadingBar.gif">
						<p style="color:#c0c0c0;margin:0">
							载入中，若长时间无响应请更换浏览器后重试。
						</p>
					</div>
				</div>
				<hr style="clear:both;margin-bottom:0">
            </div>
        </div>
        <div id="footer">
        	&copy;2009 Glamour Taskforce
        </div>
 </center>
    </body>
</html>
