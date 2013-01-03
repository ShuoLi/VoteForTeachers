/**
 * 
 */
package cn.neu.pioneer.vote.vote.web;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.neu.pioneer.vote.student.to.Student;
import cn.neu.pioneer.vote.teacher.service.ITeacherManager;
import cn.neu.pioneer.vote.util.XLSExport;
import cn.neu.pioneer.vote.vote.service.IVoteManager;
import cn.neu.pioneer.vote.vote.to.Vote;
import cn.neu.pioneer.vote.web.PaginatedAction;

/**
 * @author changer
 *
 * Dec 12, 2009
 */
public class VoteAction extends PaginatedAction {
	private IVoteManager	voteManager;
	private ITeacherManager teacherManager;
	
	private String			teacherId;
	private List<Vote>		votes;
	private List<Map>		voteStatistics;
	private String[]		exportInfor;
	private String			fileName;
	private String[]		id;
	private String 			msg;
	private int				totalVotes;
	
	public void setId(String[] id){
		this.id=id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setVoteManager(IVoteManager voteManager) {
		this.voteManager = voteManager;
	}
	public void setTeacherManager(ITeacherManager teacherManager) {
		this.teacherManager = teacherManager;
	}

	
	public String getMsg() {
		return msg;
	}
	public String[] getExportInfor() {
		return exportInfor;
	}
	public void setExportInfor(String[] exportInfor) {
		this.exportInfor = exportInfor;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public List<Vote> getVotes() {
		return votes;
	}
	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}
	public List<Map> getVoteStatistics() {
		return voteStatistics;
	}
	public void setVoteStatistics(List<Map> voteStatistics) {
		this.voteStatistics = voteStatistics;
	}
	
	public String show(){
		Map map = new HashMap();
		try {
			this.itemTotal=voteManager.getCount(teacherId);
			map.put("teacherId", teacherId);
			map.put("start",page);
			map.put("count",itemTotal);
			votes=voteManager.getPaginatedList(map);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String statistics(){
		Map map=new HashMap();
		
		try {
			this.itemTotal=teacherManager.getCount();
			map.put("start",page);
			map.put("count",itemTotal);
			voteStatistics=voteManager.getStatisticsVote(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String export(){
		try{
			Map map=new HashMap();
			map.put("start",0);
			map.put("count", teacherManager.getCount());
			voteStatistics=voteManager.getStatisticsVote(map);
			String dir=this.servletContext.getRealPath("/export");
			this.fileName=System.currentTimeMillis()+".xls";
			String exportPath=dir+File.separator+fileName;
			XLSExport.export(voteStatistics, exportInfor, exportPath);
		}catch(Exception e){
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String add() throws Exception{
		//System.out.println("add vote....");
		String studentId="";
		Student objStu=(Student)this.session.get("student");
		if(objStu!=null){
		  studentId=objStu.getStudentId();
		  System.out.println(studentId);
		}
		if(studentId.equals("")){
			msg="请您先登录";
			return SUCCESS;
		}
		String ip=this.servletRequest.getLocalAddr();
		int ipVotedCount=voteManager.getVoteCountByIp(ip);
		int studentVotedCount=voteManager.getVoteCountByStudent(studentId);
		int ipAllowedCount = 10;
		int studentAllowedCount=10;
		Object ipObj=this.servletContext.getAttribute("ipAllowedCount");
		Object sObj=this.servletContext.getAttribute("studentAllowedCount");
		
		if(sObj!=null){
			studentAllowedCount=Integer.parseInt(sObj.toString());
		}
		if(ipObj!=null){
			ipAllowedCount=Integer.parseInt(ipObj.toString());
		}
	  
		try{
			//System.out.println(id==null);
			int length=id.length;
			int left=studentAllowedCount-studentVotedCount;
			if(left<=0){
				msg="您的已经投完 "+studentAllowedCount+"票，不能再投啦!";
				return SUCCESS;
			}
			if(length>left){
				msg="您已经投了"+studentVotedCount+"票,只剩下"+left+"票，请调整投票数量!";
				return SUCCESS;
			}
			int ipLeft=ipAllowedCount-ipVotedCount;
			if(ipLeft<=0){
				msg="本机IP所允许的票数已经投完，不能再投啦!";
				return SUCCESS;
			}
			if(length>ipLeft){
				msg="本机IP只剩下"+ipLeft+"票，请调整投票数量!";
				return SUCCESS;
			}
			for(int i=0;i<length;i++){
				Vote v=new Vote();
				v.setTeacherId(id[i]);
				v.setStudentId(studentId);
				v.setIp(ip);
			    voteManager.saveVote(v);
			}
		    this.session.put("leftVoteCount",left);
		    System.out.println(left+""+this.session.get("leftVoteCount"));
			this.totalVotes=voteManager.getTotalCount();
		}catch(Exception e){
			e.printStackTrace();
			msg="出错啦!";
			return SUCCESS;
		}
		msg="感谢您的参与，投票成功！";
		return SUCCESS;
	}
	public int getTotalVotes() {
		return totalVotes;
	}	
}
