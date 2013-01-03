/**
 * 
 */
package cn.neu.pioneer.vote.teacher.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import cn.neu.pioneer.vote.teacher.to.TeachInfor;
import cn.neu.pioneer.vote.teacher.to.Teacher;
import cn.neu.pioneer.vote.test.BaseTestCase;

/**
 * @author changer
 *
 * Dec 10, 2009
 */
public class TeacherDaoImplTest extends BaseTestCase{
	private ITeacherDao teacherDao;
	
	public void setTeacherDao(ITeacherDao teacherDao){
		this.teacherDao=teacherDao;
	}
	
	/*public void testSaveTeacher() throws Exception{
		try {
			Teacher t = new Teacher();
			t.setTeacherId("D33");
			t.setTeacherName("test");
			List<TeachInfor> al = new ArrayList<TeachInfor>();
			TeachInfor infor = new TeachInfor();
			infor.setTeachInforId("111");
			infor.setPeriod("2009-1-1");
			infor.setContent("haha");
			al.add(infor);
			t.setInfors(al);
			teacherDao.saveTeacher(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	public void testUpdateTeacher() throws Exception{
		try {
			Teacher t = new Teacher();
			t.setTeacherId("AAA");
			t.setTeacherName("test111");
			List<TeachInfor> al = new ArrayList<TeachInfor>();
			TeachInfor infor = new TeachInfor();
			//infor.setTeachInforId("2");
			infor.setPeriod("2009-1-2");
			infor.setContent("hihi");
			al.add(infor);
			t.setInfors(al);
			teacherDao.updateTeacher(t);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*public void testGetById() throws Exception {
		Teacher t =teacherDao.getById("D33");
		System.out.println(t.getInfors().get(0).getTeachInforId());
	}
    public void testGetByName()throws Exception{
    	Teacher t = teacherDao.getByName("������");
    	//System.out.println(t.getDeeds());
    }
    public void testGetPaginatedList() throws Exception{
    	Map<String,Integer> map =new HashMap<String,Integer>();
    	map.put("start",0);
    	map.put("count",10);
    	List<Teacher> al =teacherDao.getBriefList(map); //teacherDao.getPaginatedList(map);
    	System.out.println(al.size());
    }
	
	public void testGetCount() {
		try{
			  //System.out.println(teacherDao==null);
			  System.out.println(teacherDao.getCount());
			}catch(Exception e){
				e.printStackTrace();
			}
		//fail("Not yet implemented");
	}*/
}
