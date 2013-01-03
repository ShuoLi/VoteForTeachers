/**
 * 
 */
package cn.neu.pioneer.vote.vote.service;

import java.util.List;
import java.util.Map;

import cn.neu.pioneer.vote.vote.to.Vote;

/**
 * @author changer
 *
 * Dec 11, 2009
 */
public interface IVoteManager {
	public void saveVote(Vote vote)throws Exception;
	public List<Vote> getPaginatedList(Map map)throws Exception;
	public int getCount(String teacherId)throws Exception;
	public List<Map> getStatisticsVote(Map map)throws Exception;
	public int getTotalCount()throws Exception;
	public int getVoteCountByIp(String ip) throws Exception;
	public int getVoteCountByStudent(String studentId)throws Exception;
}
