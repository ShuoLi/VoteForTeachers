/**
 * 
 */
package cn.neu.pioneer.vote.teacher.web;

import java.io.File;

import cn.neu.pioneer.vote.web.BaseAction;

/**
 * @author changer
 *
 * Dec 12, 2009
 */
public class UploadAction extends BaseAction{
	private File		attachment;
	private String 		attachmentFileName;
	private String		attachmentContentType;
	
	
	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}
	
	public String getAttachmentFileName() {
		return attachmentFileName;
	}
	public void setAttachmentFileName(String attachmentFileName) {
		this.attachmentFileName = attachmentFileName;
	}

	public void setAttachmentContentType(String attachmentContentType) {
		this.attachmentContentType = attachmentContentType;
	}
	public String upload()throws Exception{
		System.out.println("uploading...");
		if(attachment!=null){
			
			String dir=this.servletContext.getRealPath("/upload");
			attachmentFileName=System.currentTimeMillis()+
			                   attachmentFileName.substring(attachmentFileName.indexOf("."));
			System.out.println(dir+attachmentFileName);
			File savedFile = new File(dir,attachmentFileName);
			attachment.renameTo(savedFile);
		}
		//return null;
	return SUCCESS;
	}
}
