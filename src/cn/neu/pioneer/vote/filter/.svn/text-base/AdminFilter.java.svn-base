package cn.neu.pioneer.vote.filter;

import java.io.IOException;
import java.net.InetAddress;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.neu.pioneer.vote.admin.to.Administrator;

/**
 * Servlet Filter implementation class AdminFilter
 */
public class AdminFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AdminFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession s =(HttpSession) req.getSession();
		Administrator admin=null;
		
		//将当前admin传递给自身
		try{
		admin = (Administrator)s.getAttribute("admin");}catch(Exception e){e.printStackTrace();}
		
		if(req.getRequestURI().indexOf("login.jsp")>=0||req.getRequestURI().indexOf("login.action")>=0
				||req.getRequestURI().indexOf("static")>=0||req.getRequestURI().indexOf("imageUpload.action")>=0){
			chain.doFilter(request, response);
		}else{
		if(admin==null){
			//System.out.println("filter on working:"+req.getHeader("Host")+"/vote/admin/login.jsp");
			res.sendRedirect("http://"+req.getHeader("Host")+"/vote/admin/login.jsp");
			chain.doFilter(request, response);
		}else
		{
			chain.doFilter(request, response);
		}//#else
	}//#else
}//#doFilter
		

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
