/**
 * 
 */
package cn.neu.pioneer.vote.message.to;

import java.util.Date;

/**
 * @author changer
 *
 * Dec 9, 2009 d
 */
public class Message {
    private Date 	time;
    private int 	messageId;
    private String 	studentId;
    private String 	teacherId;
    private String 	message;
    private String 	ip;
    
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
    
    
}
