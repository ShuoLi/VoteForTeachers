/**
 * 
 */
package cn.neu.pioneer.vote.teacher.service;

import java.util.List;
import java.util.Map;

import cn.neu.pioneer.vote.teacher.dao.ITeacherDao;
import cn.neu.pioneer.vote.teacher.to.Teacher;

/**
 * @author changer
 *
 * Dec 10, 2009
 */
public class TeacherManagerImpl implements ITeacherManager {

	private ITeacherDao teacherDao;
	
	public ITeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(ITeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public void deleteTeacher(String id) throws Exception {
		teacherDao.deleteTeacher(id);
	}

	public Teacher getById(String id) throws Exception {
		return teacherDao.getById(id);
	}
	
	public Teacher getByName(String name) throws Exception {
		return teacherDao.getByName(name);
	}

	
	public int getCount() throws Exception {
		return teacherDao.getCount();
	}

	
	public List<Teacher> getPaginatedList(Map map) throws Exception {
		return teacherDao.getPaginatedList(map);
	}

	public void saveTeacher(Teacher teacher) throws Exception {
		teacherDao.saveTeacher(teacher);

	}

	public void updateTeacher(Teacher teacher) throws Exception {
		teacherDao.updateTeacher(teacher);
	}

	public List<Teacher> getBriefList(Map map) throws Exception {
		return teacherDao.getBriefList(map);
	}

}
