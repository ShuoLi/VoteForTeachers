/**
 * 
 */
package cn.neu.pioneer.vote.message.service;

import java.util.List;
import java.util.Map;

import cn.neu.pioneer.vote.message.dao.IMessageDao;
import cn.neu.pioneer.vote.message.to.Message;

/**
 * @author changer
 *
 * Dec 11, 2009
 */
public class MessageManagerImpl implements IMessageManager {
	
	private IMessageDao messageDao;
	
	public void setMessageDao(IMessageDao messageDao) {
		this.messageDao = messageDao;
	}

	public void deleteMessage(int messageId) throws Exception {
		messageDao.deleteMessage(messageId);
	}

	public int getCount(String teacherId) throws Exception {
		return messageDao.getCount(teacherId);
	}

	public List<Message> getPaginatedList(Map map) throws Exception {
		return messageDao.getPaginatedList(map);
	}

	public void saveMessage(Message message) throws Exception {
		messageDao.saveMessage(message);

	}

}
