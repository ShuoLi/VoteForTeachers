<%@ page language="java" pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>添加教师</title>
        <link rel="stylesheet" type="text/css" href="css/main.css" />
		<link rel="stylesheet" type="text/css" href="css/basic.css" />
        <script src="js/jquery-1.3.1.min.js">
        </script>
        <script src="js/jquery-ui-1.7.2.custom.min.js">
        </script>
        <script type="text/javascript" charset="utf-8">
            $(function(){
                $("#tabs").tabs();
                $("#tabs2").tabs();
            });
        </script>
    </head>
    <body>
    	<h1>添加教师</h1>
       
        <div id="form">
           
                  <fieldset>
                  <legend>头像</legend>
                  <form  action="imageUpload.action" method="post" enctype="multipart/form-data">
                                <span>选择头像</span><br/>
                                <img onerror="this.src='css/static/avatar.png'" src=../upload/${attachmentFileName}>
                                <br/>
                                <input type="file" name="attachment"/>
								
								<input type="submit" value="上传" >
					</form>	
                  </fieldset>
                        


							
                        <form action="addTeacher.action" method="post">
               <fieldset>
					<legend>基本信息</legend>
					
				
                        	<input type="hidden" name="teacher.pic" class="" value="${attachmentFileName}">												
                            <p>
                                <label>
                                    姓名:
                                </label>
                                <input type="text" name="teacher.teacherName" class="">
                                <label>
                                    编号:
                                </label>
                                <input type="text" name="teacher.teacherId" class="">
                            </p>
                            <p>
                                <label>
                                    性别 :
                                </label>
                                <select name="teacher.teacherGender">
                                    <option>男</option>
                                    <option>女</option>
                                </select>
                            </p>
                            <p>
                                <label>
                                    出生年:
                                </label>
                                <select name="year">
                                    <option value="1950">1950</option>
                                    <option value="1951">1951</option>
                                    <option value="1952">1952</option>
                                    <option value="1953">1953</option>
                                    <option value="1954">1954</option>
                                    <option value="1955">1955</option>
                                    <option value="1956">1956</option>
                                    <option value="1957">1957</option>
                                    <option value="1958">1958</option>
                                    <option value="1959">1959</option>
                                    <option value="1960">1960</option>
                                    <option value="1961">1961</option>
                                    <option value="1962">1962</option>
                                    <option value="1963">1963</option>
                                    <option value="1964">1964</option>
                                    <option value="1965">1965</option>
                                    <option value="1966">1966</option>
                                    <option value="1967">1967</option>
                                    <option value="1968">1968</option>
                                    <option value="1969">1969</option>
                                    <option value="1970">1970</option>
                                    <option value="1971">1971</option>
                                    <option value="1972">1972</option>
                                    <option value="1973">1973</option>
                                    <option value="1974">1974</option>
                                    <option value="1975">1975</option>
                                    <option value="1976">1976</option>
                                    <option value="1977">1977</option>
                                    <option value="1978">1978</option>
                                    <option value="1979">1979</option>
                                    <option value="1980">1980</option>
                                    <option value="1981">1981</option>
                                    <option value="1982">1982</option>
                                </select>        
                                    出生月:
                                <select name="month">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                    <option value="6">6</option>
                                    <option value="7">7</option>
                                    <option value="8">8</option>
                                    <option value="9">9</option>
                                    <option value="10">10</option>
                                    <option value="11">11</option>
                                    <option value="12">12</option>
                                </select>
                                <input type="hidden" name="teacher.teacherBirth" value="1970年5月"/>
                            </p>
                            <p>
                                <label>
                                    政治面貌:
                                </label>
                                <input type="text" name="teacher.politicalStatus" class="">
                            </p>
                            <p>
                                <label>
                                    推荐单位:
                                </label>
                                <input type="text" name="teacher.recommendUnit" class="">
                                <label>
                                    所属单位:
                                </label>
                                <input type="text" name="teacher.unit" class="">
                            </p>
                            <p>
                                <label>
                                    职称:
                                </label>
                                <input type="text" name="teacher.title" class="">
                                <label>
                                    职务:
                                </label>
                                <input type="text" name="teacher.position" class="">
                            </p>
                            <p>
                                <label>
                                    参评类别:
                                </label>
                                <select name="teacher.teacherType">
                                    <option>专业课</option>
                                    <option>服务管理</option>
                                    <option>公共课</option>
                                </select>
                            </p>
		</fieldset>
		
		<fieldset>
					<legend>老师介绍</legend>
                            <div id="tabs">
                                <ul>
                                    <li>
                                        <a href="#experience">工作经历及任职情况</a>
                                    </li>
                                    <li>
                                        <a href="#outcomes">教学及科研成果</a>
                                    </li>
                                    <li>
                                        <a href="#fragment-3">老师事迹</a>
                                    </li>
                                    <li>
                                        <a href="#comment">学生评语</a>
                                    </li>
                                </ul>
                                <br/>
                                <div id="experience">
                                    <textarea name="teacher.experience"></textarea>
                                </div>
                                <div id="outcomes">
                                    <textarea name="teacher.outcomes"></textarea>
                                </div>
                                <div id="fragment-3">
                                    <div id="tabs2">
                                        <ul>
                                            <li>
                                                <a href="#deeds">整体介绍</a>
                                            </li>
                                            <li>
                                                <a href="#period-1">2007.9-2008.1</a>
                                            </li>
                                            <li>
                                                <a href="#period-2">2008.3-2008.7</a>
                                            </li>
                                            <li>
                                                <a href="#period-3">2008.9-2009.1</a>
                                            </li>
											<li>
                                                <a href="#period-4">2009.3-2009.7</a>
                                            </li>
                                            <li>
                                                <a href="#period-5">2009.9至今</a>
                                            </li>
                                        </ul>
                                        <br/>
                                        <div id="deeds">
                                            <textarea name="teacher.deeds"></textarea>
                                        </div>
                                        <div id="period-1">
                                         	<input type="hidden" value="2007.9-2008.1" name="teacher.infors[0].period"/>
                                            <textarea name="teacher.infors[0].content"></textarea>
                                        </div>
                                        <div id="period-2">
                                        	<input type="hidden" value="2008.3-2008.7" name="teacher.infors[1].period"/>
                                            <textarea name="teacher.infors[1].content"></textarea>
                                        </div>
                                        <div id="period-3">
                                        	<input type="hidden" value="2008.9-2009.1" name="teacher.infors[2].period"/>
                                            <textarea name="teacher.infors[2].content"></textarea>
                                        </div>
                                        <div id="period-4">
                                            <input type="hidden" value="2009.3-2009.7" name="teacher.infors[3].period"/>
                                            <textarea name="teacher.infors[3].content"></textarea>
                                        </div>
										<div id="period-5">
                                            <input type="hidden" value="2009.9至今" name="teacher.infors[4].period"/>
                                            <textarea name="teacher.infors[4].content"></textarea>
                                        </div>
                                    </div>
                                </div>
                                <div id="comment">
                                    <textarea name="teacher.comments"></textarea>
                                </div>
                            </div>
							<div id="subbmitDiv">
								<input type="submit" value="提交">
							</div>
							
							</fieldset>
                            <form>

                    </div>
                    </body>
                </html>
