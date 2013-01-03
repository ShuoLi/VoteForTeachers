/**
 * 
 */
package cn.neu.pioneer.vote.student.service;

import cn.neu.pioneer.vote.student.to.Student;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public interface IStudentManager {
	public boolean exist(Student student)throws Exception;
}
