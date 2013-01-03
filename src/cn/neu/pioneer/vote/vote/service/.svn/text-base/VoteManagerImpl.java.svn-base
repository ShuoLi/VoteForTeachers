/**
 * 
 */
package cn.neu.pioneer.vote.vote.service;

import java.util.List;
import java.util.Map;

import cn.neu.pioneer.vote.vote.dao.IVoteDao;
import cn.neu.pioneer.vote.vote.to.Vote;

/**
 * @author changer
 *
 * Dec 11, 2009
 */
public class VoteManagerImpl implements IVoteManager {

	private	IVoteDao voteDao;
	
	public void setVoteDao(IVoteDao voteDao) {
		this.voteDao = voteDao;
	}

	public int getCount(String teacherId) throws Exception {
		return voteDao.getCount(teacherId);
	}


	public List<Vote> getPaginatedList(Map map) throws Exception {
		return voteDao.getPaginatedList(map);
	}

	public List<Map> getStatisticsVote(Map map) throws Exception {
		return voteDao.getStatisticsVote(map);
	}

	public void saveVote(Vote vote) throws Exception {
		voteDao.saveVote(vote);
	}
	public int getTotalCount()throws Exception{
		return voteDao.getTotalCount();
	}

	public int getVoteCountByIp(String ip) throws Exception {
		if(voteDao.getByIp(ip)==null||voteDao.getByIp(ip).size()==0)
			return 0;
		return voteDao.getByIp(ip).size();
	}
	public int getVoteCountByStudent(String studentId) throws Exception {
		return voteDao.getByStudent(studentId).size();
	}
}
