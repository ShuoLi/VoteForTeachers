/**
 * 
 */
package cn.neu.pioneer.vote.admin.web;

import cn.neu.pioneer.vote.admin.service.IAdministratorManager;
import cn.neu.pioneer.vote.admin.to.Administrator;
import cn.neu.pioneer.vote.vote.service.IVoteManager;
import cn.neu.pioneer.vote.web.BaseAction;

/**
 * @author dante
 *
 * Dec 13, 2009
 */
public class AdminAction extends BaseAction {

	private Administrator admin ;
	private IAdministratorManager adminManager;
	private IVoteManager		  voteManager;
	
	private String  newPassword;
	private String  secondPassword;
	
	private int		studentAllowedCount;
	private int		ipAllowedCount;
	
	public void setVoteManager(IVoteManager voteManager) {
		this.voteManager = voteManager;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public void setSecondPassword(String secondPassword) {
		this.secondPassword = secondPassword;
	}
	public String getSecondPassword() {
		return secondPassword;
	}
	
	
	public void setStudentAllowedCount(int studentAllowedCount) {
		this.studentAllowedCount = studentAllowedCount;
	}
	public void setIpAllowedCount(int ipAllowedCount) {
		this.ipAllowedCount = ipAllowedCount;
	}
	public Administrator getAdmin() {
		return admin;
	}
	public void setAdmin(Administrator admin) {
		this.admin = admin;
	}
	public void setAdminManager(IAdministratorManager adminManager) {
		this.adminManager = adminManager;
	}
	public String login(){
		try {
			if(adminManager.exist(admin)){
				this.getSession().put("admin", admin);
				return SUCCESS;}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return INPUT;
	}
	
	public String changePassword(){
		try {	if(newPassword.equals(secondPassword)){
				adminManager.updatePassword(newPassword);
				return SUCCESS;}
		} catch (Exception e) {
				e.printStackTrace();
			}
		return ERROR;
	}
	
	public String logout(){
		try{
			this.session.remove("admin");
			return SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
		}	
		return INPUT;	
	}
	
	public String config(){
		System.out.println(this.studentAllowedCount+"##"+this.ipAllowedCount);
		this.servletContext.setAttribute("studentAllowedCount",studentAllowedCount);
		this.servletContext.setAttribute("ipAllowedCount",ipAllowedCount);
		return SUCCESS;
	}
	
}
