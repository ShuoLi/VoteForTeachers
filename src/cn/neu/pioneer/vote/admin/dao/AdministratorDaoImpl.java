/**
 * 
 */
package cn.neu.pioneer.vote.admin.dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import cn.neu.pioneer.vote.admin.to.Administrator;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public class AdministratorDaoImpl extends SqlMapClientDaoSupport implements IAdministratorDao {

	
	public boolean exist(Administrator admin) throws Exception {
		Administrator temp=(Administrator) this.getSqlMapClientTemplate().queryForObject("admin.getAdmin",admin);
		return temp==null ? false : true;
	}

	public void updatePassword(String newPassword) throws Exception {
		this.getSqlMapClientTemplate().update("admin.update",newPassword);
	}

}
