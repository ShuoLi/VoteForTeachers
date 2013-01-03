/**
 * 
 */
package cn.neu.pioneer.vote.vote.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import cn.neu.pioneer.vote.vote.to.Vote;

/**
 * @author changer
 *
 * Dec 11, 2009
 */
public class VoteDaoImpl extends SqlMapClientDaoSupport implements IVoteDao {

	public int getCount(String teacherId) throws Exception {
		return Integer.parseInt(
				  this.getSqlMapClientTemplate().queryForObject("vote.getCount",teacherId).toString());
	}
	
	public List<Vote> getPaginatedList(Map map) throws Exception {
		return this.getSqlMapClientTemplate().queryForList("vote.getList",map);
	}

	public List<Map> getStatisticsVote(Map map) throws Exception {
		List<Map> maps=this.getSqlMapClientTemplate().queryForList("vote.getStatistics",map);
		for(Map temp:maps){
			String teacherId=temp.get("teacherId").toString();
			temp.put("count", this.getCount(teacherId));
		}
		return maps;
	}

	public void saveVote(Vote vote) throws Exception {
		this.getSqlMapClientTemplate().insert("vote.insert",vote);

	}
	public int getTotalCount()throws Exception{
		return Integer.parseInt(this.getSqlMapClientTemplate().queryForObject("vote.getTotalCount").toString());
	}

	
	
	public List<Vote> getByIp(String ip) throws Exception {
		return this.getSqlMapClientTemplate().queryForList("vote.getByIp",ip);
	}

	public List<Vote> getByStudent(String studentId) throws Exception {
		return this.getSqlMapClientTemplate().queryForList("vote.getByStudent",studentId);
	}

	
	
}
