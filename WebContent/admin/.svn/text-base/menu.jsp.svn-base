<%@ page language="java" pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>后台管理</title>
        <link rel="stylesheet" type="text/css" href="css/sdmenu.css" />
        <link rel="stylesheet" type="text/css" href="css/main.css" />
        <script src="js/jquery-1.3.1.min.js"></script>
        <script src="js/jquery-ui-1.7.2.custom.min.js"></script>
        <script src="js/sdmenu.js"></script>
        <script type="text/javascript" charset="utf-8">
            $(function(){
                var myMenu;
                myMenu = new SDMenu("my_menu");
                myMenu.init();
                $("#tabs").tabs();
                $("#tabs2").tabs();
            });
        </script>
    </head>
    <body>
        <div id="nav">
        </div>
        <div id="form">
            <TABLE width="100%" border="0">
                <TR>
                    <TD width="150px" valign="top">
                        <div style="float: left" id="my_menu" class="sdmenu">
                            <div class="collapsed">
                                <span>教师管理</span>
                               
                                <a href="listTeacher.action" target="mainFrame">教师列表
								</a>
								 <a href="addTeacher.jsp" target="mainFrame">添加教师</a>
                            </div>
                            <div class="collapsed">
                                <span>结果统计</span>
                                <a href="statisticsVote.action" target="mainFrame">票选结果</a>
                                <a href="export.jsp" target="mainFrame">结果导出</a>
                            </div>
                            <div class="collapsed">
                                <span>系统设置</span>
                                <a href="config.jsp" target="mainFrame">过滤设置</a>
                                <a href="changePass.jsp" target="mainFrame">修改密码</a>
                                <a href="logout.action" target="mainFrame">退出登录</a>
                            </div>
                        </div>
                    </TD>
                   </TR>
                        </TABLE>
          </div>
    </body>
</html>

