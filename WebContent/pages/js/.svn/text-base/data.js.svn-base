/*
 * @利用的数据段
 * @author : wyvern
*/
var Chinese={
		"pic":"头像"
	   	,"teacherId":"编号"
        ,"teacherName":"姓名"
		,"title":"职称"
		,"teacherType":"类别"
		,"unit":"单位"
}
/*
 * 局部有效的数据段
 * 
*/

var Chinese2={
		"pic":"头像"
	   	,"teacherId":"编号"
        ,"teacherName":"姓名"
		,"teacherGender":"性别"
		,"politicalStatus":"政治面貌"
		,"teacherBirth":"生日"
		,"position":"职务"
		,"title":"职称"
		,"teacherType":"参评类别"
		,"unit":"所属单位"
		,"recommendUnit":"推荐单位"
}


/*
 * @AJAX请求
 * @author : wyvern
 */

function loadData(){
    var str = "";
    $.ajax({
        type: "GET",
        url: "list.action",
        dataType: "json",
        success: function(json){
				  for(index in json.teachers){
				  	str+="<span class='avatar' id='"+json.teachers[index].teacherId+"'><table>";
					  for(content in Chinese ){	
					  	if(content=='pic'){
							str+="<tr class='"+content+"'><td><img onerror=\"this.src='css/static/avatar.png'\"  src='../upload/"+json.teachers[index][content]+"' /></td></tr>";
						}else{
							str+="<tr class='"+content+"'><td title='"+Chinese[content]+"'>"+json.teachers[index][content]+"</td></tr>";
						}
					  }
					 str+="<tr><td style='text-align:center;'><a href='showTeacher.action?teacherId="+json.teachers[index].teacherId+"' target='_blank'>显示更多</a></td></tr>"
					 str+="</table></span>"; 
				  }
            $("#fromContainer").html(str);
			$("#totalVotes").text(json.totalVotes);
            enableDrag(); 
        }
    });
}


function vote(){
	//alert($("#toContainer").sortable("toArray"));
	var votes=$("#toContainer").sortable("toArray");
	var str="";
	for (var i=0; i<votes.length; i++) {
		if(i==(votes.length-1)){
			str+="id="+votes[i];
		}else{
			str+="id="+votes[i]+"&";
		}
	};
    $.ajax({
        type: "POST",
        data:str,
        url: "addVote.action",
        dataType: "json",
        success: function(json){
				alert(json.msg); 
				if(json.totalVotes!=0){
					$("#totalVotes").text(json.totalVotes);
				}
				
        }
    });
	
}

var availableVotes=3;