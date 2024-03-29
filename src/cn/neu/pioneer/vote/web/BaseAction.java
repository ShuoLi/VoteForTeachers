/**
 * 
 */
package cn.neu.pioneer.vote.web;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author changer
 *
 * Dec 10, 2009
 */
public class BaseAction extends ActionSupport implements
ServletRequestAware, ServletResponseAware, ServletContextAware ,SessionAware{

	private static final long serialVersionUID = 1L;

	protected HttpServletRequest servletRequest;

	//ServletContextAware property
	protected ServletContext servletContext;
	
	//ServletResponseAware property
	protected HttpServletResponse servletResponse;

	//SessionAware property
	protected Map session;

	public HttpServletRequest getServletRequest() {
		return servletRequest;
	}

	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRequest = servletRequest;
	}

	public ServletContext getServletContext() {
		return servletContext;
	}

	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	public HttpServletResponse getServletResponse() {
		return servletResponse;
	}

	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}
	

}
