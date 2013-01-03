/**
 * 
 */
package cn.neu.pioneer.vote.message.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.neu.pioneer.vote.message.service.IMessageManager;
import cn.neu.pioneer.vote.message.to.Message;
import cn.neu.pioneer.vote.web.PaginatedAction;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public class MessageAction extends PaginatedAction {
	private IMessageManager messageManager;
	
	private List<Message>	messages;
	private Message			message;
	private String			teacherId;
	
	
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public int getTotalPage(){
		return this.totalPage;
	}
	public void setMessageManager(IMessageManager messageManager) {
		this.messageManager = messageManager;
	}
	public String add(){
		try{
			message.setIp(this.servletRequest.getRemoteAddr());
			this.itemTotal=messageManager.getCount(message.getTeacherId());
			this.totalPage=(5+itemTotal-1)/5;
			Map map =new HashMap();
			page=0;
			map.put("start", page);
			map.put("count", 5);
			map.put("teacherId",message.getTeacherId());
			messageManager.saveMessage(message);
			messages=messageManager.getPaginatedList(map);
			System.out.println("totalPage"+this.totalPage);
		}catch(Exception e){
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String list(){
		try{
			Map map =new HashMap();
			this.itemTotal=messageManager.getCount(teacherId);
			this.totalPage=(5+itemTotal-1)/5;
			map.put("start", page*5);
			map.put("count", 5);
			map.put("teacherId",teacherId);
			messages=messageManager.getPaginatedList(map);
			System.out.println("totalPage"+this.totalPage);
		}catch(Exception e){
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	
}
