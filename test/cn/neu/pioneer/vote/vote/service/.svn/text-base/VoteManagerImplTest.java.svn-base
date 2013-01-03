/**
 * 
 */
package cn.neu.pioneer.vote.vote.service;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import cn.neu.pioneer.vote.test.BaseTestCase;
import cn.neu.pioneer.vote.util.XLSExport;
import cn.neu.pioneer.vote.vote.to.Vote;

/**
 * @author changer
 *
 * Dec 11, 2009
 */
public class VoteManagerImplTest extends BaseTestCase{

	private IVoteManager voteManager;
	
	public void setVoteManager(IVoteManager voteManager) {
		this.voteManager = voteManager;
	}

	public void testGetCount() throws Exception {
		System.out.println(voteManager.getCount("F01"));
	}
	public void testGetByIp()throws Exception{
		//System.out.println(voteManager.getVoteByIp("58.154.185.233"));
	}
	public void testGetPaginatedList() throws Exception {
		try {
			Map map = new HashMap();
			map.put("teacherId", "F01");
			map.put("start", 0);
			map.put("count", 10);
			List<Vote> list = voteManager.getPaginatedList(map);
			System.out.println(list.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**/
	
/*	public void testGetStatisticsVote() throws Exception {
		try {
			Map map = new HashMap();
			map.put("start",0);
			map.put("count", 10);
			List<Map> maps = voteManager.getStatisticsVote(map);
			String fileName="D://a.xls";
			String[] exportInfors={"teacherId","teacherName","count","teacherGender","teacherBirth",
					               "politicalStatus","position","title","unit","recommendUnit","teacherType"};
			XLSExport.export(maps, exportInfors, fileName);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	
	public void testSaveVote() throws Exception {
		/*Vote vote=new Vote();
		vote.setIp("11111");
		vote.setStudentId("20073301");
		vote.setTeacherId("G03");
		voteManager.saveVote(vote);*/
	}

}
