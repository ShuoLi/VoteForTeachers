/**
 * 
 */
package cn.neu.pioneer.vote.admin.service;

import cn.neu.pioneer.vote.admin.dao.IAdministratorDao;
import cn.neu.pioneer.vote.admin.to.Administrator;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public class AdministratorManagerImpl implements IAdministratorManager {

	private IAdministratorDao adminDao;
	
	public void setAdminDao(IAdministratorDao adminDao) {
		this.adminDao = adminDao;
	}

	public boolean exist(Administrator admin) throws Exception {
		return adminDao.exist(admin);
	}

	public void updatePassword(String newPassword) throws Exception {
		 adminDao.updatePassword(newPassword);
	}

}
