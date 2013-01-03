

package cn.neu.pioneer.vote.web;

/**
 * @author changer
 *
 * Dec 11, 2009
 */
public class PaginatedAction extends BaseAction{
	protected int  		page=0;  	//当前页数(从0开始)
	protected int		totalPage;	//总页数
	protected int		itemTotal;	//记录总数
	protected int		numPerPage; //每页记录数
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getItemTotal() {
		return itemTotal;
	}
	public void setItemTotal(int itemTotal) {
		this.itemTotal = itemTotal;
	}
	
}
