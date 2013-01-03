/**
 * 
 */
package cn.neu.pioneer.vote.message.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import cn.neu.pioneer.vote.message.to.Message;

/**
 * @author changer
 *
 * Dec 11, 2009
 */
public class MessageDaoImpl extends SqlMapClientDaoSupport implements IMessageDao {

	
	public void deleteMessage(int messageId) throws Exception {
		this.getSqlMapClientTemplate().delete("message.delete",messageId);
	}

	public int getCount(String teacherId) throws Exception {
		return Integer.parseInt(this.getSqlMapClientTemplate().queryForObject("message.getCount",teacherId).toString());
	}

	public List<Message> getPaginatedList(Map map) throws Exception {
		return this.getSqlMapClientTemplate().queryForList("message.getList",map);
	}
	
	public void saveMessage(Message message) throws Exception {
		this.getSqlMapClientTemplate().insert("message.insert",message);
	}

}
