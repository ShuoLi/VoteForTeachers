/**
 * 
 */
package cn.neu.pioneer.vote.student.dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import cn.neu.pioneer.vote.student.to.Student;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public class StudentDaoImpl extends SqlMapClientDaoSupport implements IStudentDao {
	
	public boolean exist(Student student) throws Exception {
		Student result = (Student) this.getSqlMapClientTemplate().queryForObject("student.getStudent",student);
		if(result==null)
			return false;
		else
			return true;
	}

}
