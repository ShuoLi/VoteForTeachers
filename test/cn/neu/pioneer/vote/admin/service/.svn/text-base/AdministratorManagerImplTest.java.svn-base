/**
 * 
 */
package cn.neu.pioneer.vote.admin.service;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.neu.pioneer.vote.admin.dao.IAdministratorDao;
import cn.neu.pioneer.vote.admin.to.Administrator;
import cn.neu.pioneer.vote.test.BaseTestCase;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public class AdministratorManagerImplTest extends BaseTestCase{
	
	private IAdministratorDao adminDao;
	
	public void setAdminDao(IAdministratorDao adminDao) {
		this.adminDao = adminDao;
	}

	public void testExist() throws Exception {
		Administrator admin=new Administrator();
		admin.setAdminName("团委");
		admin.setPassword("123456");
		System.out.println(adminDao.exist(admin));
	}

	
	public void testUpdatePassword() throws Exception {
		adminDao.updatePassword("111111");
	}

}
