/**
 * 
 */
package cn.neu.pioneer.vote.message.service;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import cn.neu.pioneer.vote.message.to.Message;
import cn.neu.pioneer.vote.test.BaseTestCase;

/**
 * @author changer
 *
 * Dec 11, 2009
 */
public class MessageManagerImplTest extends BaseTestCase{

	private IMessageManager messageManager;
	
	
	public void setMessageManager(IMessageManager messageManager) {
		this.messageManager = messageManager;
	}

	public void testDeleteMessage() throws Exception {
		/**/messageManager.deleteMessage(1);
	}

	
	public void testGetCount() throws Exception{
		System.out.println(messageManager.getCount("F01"));
	}

	
	public void testGetPaginatedList() throws Exception {
		Map map=new HashMap();
		map.put("teacherId", "G08");
		map.put("start",0);
		map.put("count",5);
		List<Message> messages = messageManager.getPaginatedList(map);  
		System.out.println(messages.size());
	}

	
	public void testSaveMessage() throws Exception {
		/*Message m =new Message();
		m.setTeacherId("F02");
		m.setStudentId("20073301");
		m.setMessage("Helle");
		m.setIp("58.154.183.50");
		messageManager.saveMessage(m);*/
	}

}
