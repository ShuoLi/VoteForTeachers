/**
 * 
 */
package cn.neu.pioneer.vote.teacher.to;

/**
 * @author changer
 *
 * Dec 9, 2009
 */
public class TeachInfor {
	private String	teachInforId;
	private String 	period;
	private String 	content;
	private String  teacherId;
	
	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeachInforId() {
		return teachInforId;
	}

	public void setTeachInforId(String teachInforId) {
		this.teachInforId = teachInforId;
	}

	
	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
