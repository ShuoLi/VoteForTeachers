/**
 * 
 */
package cn.neu.pioneer.vote.admin.service;

import cn.neu.pioneer.vote.admin.to.Administrator;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public interface IAdministratorManager {
	public boolean exist(Administrator admin) throws Exception;
	public void    updatePassword(String newPassword)throws Exception;
}
