/**
 * 
 */
package cn.neu.pioneer.vote.student.dao;

import cn.neu.pioneer.vote.student.to.Student;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public interface IStudentDao {
	public boolean exist(Student student)throws Exception;
}
