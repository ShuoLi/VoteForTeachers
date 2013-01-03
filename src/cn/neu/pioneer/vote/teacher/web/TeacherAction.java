/**
 * 
 */
package cn.neu.pioneer.vote.teacher.web;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.neu.pioneer.vote.message.service.IMessageManager;
import cn.neu.pioneer.vote.message.to.Message;
import cn.neu.pioneer.vote.teacher.service.ITeacherManager;
import cn.neu.pioneer.vote.teacher.to.Teacher;
import cn.neu.pioneer.vote.vote.service.IVoteManager;
import cn.neu.pioneer.vote.web.PaginatedAction;

/**
 * @author changer
 *
 * Dec 11, 2009
 */
public class TeacherAction extends PaginatedAction {
	private Teacher 			teacher;
	private List<Teacher>   	teachers;
	private String			    teacherId;
	private int					totalVotes;
	private List<Message>		messages;
	
	private  ITeacherManager 			teacherManager;
	private  IMessageManager 			messageManager;
	private transient IVoteManager		voteManager;
	
	
	public List<Message> getMessages() {
		return messages;
	}
	public int getTotalVotes() {
		return totalVotes;
	}
	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}
	public void setVoteManager(IVoteManager voteManager) {
		this.voteManager = voteManager;
	}
	public void setTeacherManager(ITeacherManager teacherManager) {
		this.teacherManager = teacherManager;
	}
	public void setMessageManager(IMessageManager messageManager) {
		this.messageManager = messageManager;
	}
	
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	public String prepareAdd(){
		return SUCCESS;
	}
	public String jsonList(){
		try{
			totalVotes=voteManager.getTotalCount();
			this.itemTotal=teacherManager.getCount();
			Map map=new HashMap();
			map.put("start", 0);
			map.put("count",itemTotal);
			teachers=teacherManager.getBriefList(map);	
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	public String add(){
		try{
			//System.out.println("add"+teacher.getTeacherId());
			teacherManager.saveTeacher(teacher);
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	public String show(){
		try {
			teacher = teacherManager.getById(teacherId);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	public String edit(){
		try {
			teacher = teacherManager.getById(teacherId);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
		
	}
	public String update(){
		try {
			//System.out.println("haha"+teacher.getTeacherId());
			teacherManager.updateTeacher(teacher);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	public String delete(){
		try {
			teacherManager.deleteTeacher(teacherId);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	public String list(){
		try{
			this.itemTotal=teacherManager.getCount();
			this.numPerPage=20;
			this.totalPage=(this.numPerPage+itemTotal-1)/this.numPerPage;
			Map map=new HashMap();
			map.put("start", page*numPerPage);
			map.put("count",this.numPerPage);
			teachers=teacherManager.getPaginatedList(map);	
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
}
