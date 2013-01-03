/**
 * 
 */
package cn.neu.pioneer.vote.teacher.dao;

import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import cn.neu.pioneer.vote.teacher.to.TeachInfor;
import cn.neu.pioneer.vote.teacher.to.Teacher;

/**
 * @author changer
 *
 * Dec 10, 2009
 */
public class TeacherDaoImpl extends SqlMapClientDaoSupport implements ITeacherDao {

	public void deleteTeacher(String id) throws Exception {
		this.getSqlMapClientTemplate().delete("teacher.delete",id);

	}

	public Teacher getById(String id) throws Exception {
		return (Teacher)this.getSqlMapClientTemplate().queryForObject("teacher.getById",id);
	}

	public Teacher getByName(String name) throws Exception {
		return (Teacher)this.getSqlMapClientTemplate().queryForObject("teacher.getByName",name);
	}

	public int getCount() throws Exception {
		return Integer.parseInt(this.getSqlMapClientTemplate().queryForObject("teacher.getCount").toString());
	}

	public List<Teacher> getPaginatedList(Map map) throws Exception {
		return this.getSqlMapClientTemplate().queryForList("teacher.getList",map);
	}

	public void saveTeacher(Teacher teacher) throws Exception {
		this.getSqlMapClientTemplate().insert("teacher.insert",teacher);
		List<TeachInfor> infors = teacher.getInfors();
		for(TeachInfor infor:infors){
			infor.setTeacherId(teacher.getTeacherId());
			this.getSqlMapClientTemplate().insert("teacher.insertInfor",infor);
		}
	}

	public void updateTeacher(Teacher teacher) throws Exception {
		this.getSqlMapClientTemplate().update("teacher.update",teacher);
		List<TeachInfor> infors = teacher.getInfors();
		for(TeachInfor infor:infors){
			if(infor.getTeachInforId()==null){
				infor.setTeacherId(teacher.getTeacherId());
				this.getSqlMapClientTemplate().insert("teacher.insertInfor",infor);
			}else{
			   this.getSqlMapClientTemplate().update("teacher.updateInfor",infor);
			}
		}
	}

	public List<Teacher> getBriefList(Map map) throws Exception {
		return this.getSqlMapClientTemplate().queryForList("teacher.getBriefList",map);
	}

}
