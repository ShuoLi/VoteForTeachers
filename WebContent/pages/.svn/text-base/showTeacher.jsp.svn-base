<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>教师信息</title>
        <link rel="stylesheet" href="css/page.css" type="text/css" />
        <script src="js/jquery-1.3.1.min.js"></script>
		
        <script type="text/javascript" charset="utf-8">
			var view ={
				totalPage:0
				,currentPage:0
			}

            $(function(){
				
				
				$(".calendar td").each(function(index){
					$(this).attr("id","td"+index);
					$(this).hover(function(){
						$('.content').hide();
						$('.content').eq(index).fadeIn();
					});
					$(this).mouseout(function(){
						$('.content').hide();
					});
				});
				
				loadMessage($("#teacherId").text(),0);
				
	            $('form').submit(function(){
					var data={
							"message.teacherId":$("#teacherId").text()
							,"message.message":$("#message").val()
					};
					
					var str="";
					$.ajax({
				        type: "POST",
				        url: "addMessage.action",
				        data:data,
				        dataType: "json",
				        success:function(json){
				        for(index in json.messages){
						str+="<li><em>"+json.messages[index].time+"</em><strong>"+json.messages[index].message+"</strong></li>";
					    }
					    $('ol').html(str);
				        }
					});
					
					
               		$('form input').attr({
                    "disabled":"disabled"
                    ,"value":"留言已提交"
                    });
					return false;
                });
            });
			
			function showMore(){
				view.currentPage=view.currentPage+1;
				loadMessage($("#teacherId").text(),view.currentPage);
			};
			
			
			function handleError(){
				$("#wrapper").html("<center><strong>不存在的老师</strong></center>");
			}
			
			function loadMessage(teacherId,page){	                
				var data={
						"teacherId":teacherId
						,"page":page
				}
				var str="";
				
				$.ajax({
			        type: "POST",
			        url: "listMessage.action",
			        data:data,
			        dataType: "json",
			        success:function(json){
						
							if($("#teacherId").text()==''){
								handleError();
								return;
							}
					
					view.totalPage=json.totalPage;
					if(json.totalPage<1){
						return;
					}
			        for(index in json.messages){
						str+="<li><em>"+json.messages[index].time+"</em><strong>"+json.messages[index].message+"</strong></li>";
				    }
					
					
					if(view.totalPage-view.currentPage-1>0){
						$("#moreBtn").text("更多("+(view.totalPage-view.currentPage-1)+")");
					}else{
						$("#moreBtn").text("更多(没有了)");
					}
					
				    $(str).appendTo('ol');
			        }
				});
            };
        </script>
		<style type="text/css">

		
		</style>
    </head>
    <body>
    <center>
        <div id="header">
        </div>
        <div id="wrapper">
        	<div id="teacherPic" style="float:left;">
				<img src=../upload/${teacher.pic} width="200px;">
				<p>${teacher.teacherName}</p>
        	</div>
            <div id="teacherInfo" style="float:left;">
			<table>
				<tr><td class="tdDes">编号:</td><td id='teacherId'>${teacher.teacherId}</td></tr>
				<tr><td class="tdDes">姓名:</td><td>${teacher.teacherName}</td></tr>
				<tr><td class="tdDes">性别:</td><td>${teacher.teacherGender}</td></tr>
				<tr><td class="tdDes">职称:</td><td>${teacher.title}</td></tr>
				<tr><td class="tdDes">职务:</td><td>${teacher.position}</td></tr>
				<tr><td class="tdDes">参评类别:</td><td>${teacher.teacherType}</td></tr>
				<tr><td class="tdDes">出生年月:</td><td>${teacher.teacherBirth}</td></tr>
				<tr><td class="tdDes">政治面貌:</td><td>${teacher.politicalStatus}</td></tr>
				<tr><td class="tdDes">推荐学院:</td><td>${teacher.recommendUnit}</td></tr>
				<tr><td class="tdDes">所属单位:</td><td>${teacher.unit}</td></tr>
			</table>
            </div>
			<div id="workInfo" style="clear:both;">
				<h2>老师简介</h2>	
				<p>${teacher.deeds}</p>
				
				<h2>老师事迹</h2>
				
				<p>${teacher.comments}</p> 
				
				<h2>教学及科研成果</h2>
				
				<p>${teacher.outcomes}</p>
				
				<h2>工作经历及任职情况</h2>
				<p>${teacher.experience}</p>
				
				<table class="calendar">
					<tr>
					<td>2007.9-2008.1</td>
					<td>2008.3-2008.7</td>
					<td>2008.9-2009.1</td>
					<td>2009.3-2009.9</td>
					<td>2009.9至今</td>
					</tr>	
				</table>
				
				<p class="content" style="display:none;">${teacher.infors[0].content}</p>
				<p class="content" style="display:none;">${teacher.infors[1].content}</p>
				<p class="content" style="display:none;">${teacher.infors[2].content}</p>
				<p class="content" style="display:none;">${teacher.infors[3].content}</p>
				<p class="content" style="display:none;">${teacher.infors[4].content}</p>
			</div>
			
			
			<div id="messageBox">
				<form action="#" method="" accept-charset="utf-8">
					<textarea id="message" style="width:100%"></textarea>
					
					<p><input type="submit" value="留言"/></p>
				</form>
				<ol>
				</ol>
				
				<div style="text-align:center;">
					<button id="moreBtn" style="border:1px solid #c0c0c0;" onclick="showMore()" >更多</button>
				</div>
				
			</div>
			
        </div>
        <div id="footer">
            &copy;2009 Glamour Taskforce
        </div>
        </center>
    </body>
</html>
