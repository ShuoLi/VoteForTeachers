<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <script type="text/javascript" src="js/jquery-1.3.1.min.js"></script>
		<link rel="stylesheet" href="css/table.css" type="text/css" />
		<script type="text/javascript">
			function checkAll(){
				if($("#checkBtn").attr("checked")==true){
					$("fieldset:eq(0) input:enabled:gt(1)").attr("checked",true);
				}else{
					$("fieldset:eq(0) input:enabled:gt(1)").attr("checked",false);
				}
			}
		</script>
		
        <title>导出配置</title>
    </head>
    <body>
    	<h1>选择导出范围</h1>
        <form id="form1" method="post" action="exportVotes.action">
        <div style="border:1px solid #c0c0c0;padding:10px"><fieldset>
            <legend>
              	教师信息
            </legend>
            <label>
                <input type="checkbox" name="exportInfor" value="teacherId" checked="checked" onclick="return false"/> 编号
            </label>
            <label>
                <input type="checkbox" name="exportInfor" value="teacherName" checked="checked" onclick="return false"/> 姓名
            </label>
            <label>
                <input type="checkbox" name="exportInfor" value="teacherGender" />性别
            </label>
            <label>
                <input type="checkbox" name="exportInfor" value="teacherBirth" />出身年月
            </label>
            <label>
                <input type="checkbox" name="exportInfor" value="politicalStatus" />政治面貌 
                <br/>
                <br/>
                <input type="checkbox" name="exportInfor" value="position" />职位
            </label>
            <label>
                <input type="checkbox" name="exportInfor" value="title" />职称
            </label>
            <label>
                <input type="checkbox" name="exportInfor" value="unit" />所属单位
            </label>
            <label>
                <input type="checkbox" name="exportInfor" value="recommendUnit" />推荐单位
            </label>
            <label>
                <input type="checkbox" name="exportInfor" value="teacherType" />参评类别
            </label>
			
			<p style="background:#fafafa;">
				<input type="checkbox" id="checkBtn" onclick="checkAll()" />全选
			</p>
        </fieldset>
        </br>
        </br>
        <fieldset>
            <legend>
                票选信息
            </legend>
            <label>
                <input type="checkbox" name="exportInfor" value="count" checked onclick="return false;"/> 所得票数
            </label>
        </fieldset></div>
		<div style="background-color:#c0c0c0;padding:10px">
		<input type="submit" value="提交"/>
		</div>
        </form>
    </body>
</html>