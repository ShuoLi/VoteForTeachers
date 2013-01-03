/**
 * 
 */
package cn.neu.pioneer.vote.admin.dao;

import cn.neu.pioneer.vote.admin.to.Administrator;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public interface IAdministratorDao {
	public boolean exist(Administrator admin) throws Exception;
	public void    updatePassword(String newPassword)throws Exception;
}
