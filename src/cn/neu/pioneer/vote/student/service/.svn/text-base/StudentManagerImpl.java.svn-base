/**
 * 
 */
package cn.neu.pioneer.vote.student.service;

import cn.neu.pioneer.vote.student.dao.IStudentDao;
import cn.neu.pioneer.vote.student.to.Student;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public class StudentManagerImpl implements IStudentManager {

	private	IStudentDao studentDao;
	
	public void setStudentDao(IStudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public boolean exist(Student student)throws Exception{
		return studentDao.exist(student);
	}

}
