/**
 * 
 */
package cn.neu.pioneer.vote.message.service;

import java.util.List;
import java.util.Map;

import cn.neu.pioneer.vote.message.to.Message;

/**
 * @author changer
 *
 * Dec 11, 2009
 */
public interface IMessageManager {
	public void saveMessage(Message message)throws Exception;
	public void deleteMessage(int messageId)throws Exception;
	public List<Message> getPaginatedList(Map map)throws Exception;
	public int 	getCount(String teacherId)throws Exception;
}
