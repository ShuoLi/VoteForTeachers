/**
 * 
 */
package cn.neu.pioneer.vote.teacher.dao;

import java.util.List;
import java.util.Map;

import cn.neu.pioneer.vote.teacher.to.Teacher;

/**
 * @author changer
 *
 * Dec 10, 2009
 */
public interface ITeacherDao {
	public void saveTeacher(Teacher teacher)throws Exception;
	public void deleteTeacher(String id)throws Exception;
	public void updateTeacher(Teacher teacher)throws Exception;
	public Teacher getById(String id)throws Exception;
	public Teacher getByName(String name)throws Exception;
	public List<Teacher> getPaginatedList(Map map) throws Exception;
	public int getCount() throws Exception;
	public List<Teacher> getBriefList(Map map)throws Exception;
}
