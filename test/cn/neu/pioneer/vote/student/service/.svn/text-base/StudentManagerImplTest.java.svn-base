/**
 * 
 */
package cn.neu.pioneer.vote.student.service;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.neu.pioneer.vote.student.to.Student;
import cn.neu.pioneer.vote.test.BaseTestCase;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public class StudentManagerImplTest extends BaseTestCase{

	private IStudentManager studentManager;
	
	public void setStudentManager(IStudentManager studentManager) {
		this.studentManager = studentManager;
	}

	public void testExist() throws Exception {
		Student s = new Student();
		s.setStudentId("20073301");
		s.setStudentName("ÄôêÆ");
		System.out.println(studentManager.exist(s));
	}
}
