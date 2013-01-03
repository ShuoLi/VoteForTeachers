/**
 * 
 */
package cn.neu.pioneer.vote.student.web;

import cn.neu.pioneer.vote.student.service.IStudentManager;
import cn.neu.pioneer.vote.student.to.Student;
import cn.neu.pioneer.vote.vote.service.IVoteManager;
import cn.neu.pioneer.vote.web.BaseAction;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public class StudentAction	extends BaseAction {
	private IStudentManager studentManager;
	private IVoteManager	voteManager;
	
	private Student student;
	
	
	public void setVoteManager(IVoteManager voteManager) {
		this.voteManager = voteManager;
	}

	public void setStudentManager(IStudentManager studentManager) {
		this.studentManager = studentManager;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	public String login(){
		try {
			if(studentManager.exist(student)){
				this.getSession().put("student", student);
				Object sObj=this.servletContext.getAttribute("studentAllowedCount");
	            int studentAllowedCount=10;
				if(sObj!=null){
					studentAllowedCount=Integer.parseInt(sObj.toString());
				}
				int left=studentAllowedCount-voteManager.getVoteCountByStudent(student.getStudentId());
				if(left<0) left=0;
				this.session.put("leftVoteCount", left);
				return SUCCESS;
			}
			else
				return INPUT;
		} catch (Exception e) {	
			e.printStackTrace();
		}
		return ERROR;
	}
}
