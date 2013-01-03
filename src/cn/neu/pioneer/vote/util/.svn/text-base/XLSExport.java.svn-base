/**
 * 
 */
package cn.neu.pioneer.vote.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jxl.Workbook;
import java.io.File;

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 * @author changer
 *
 * Dec 13, 2009
 */
public class XLSExport {
	public static Map<String,String> tableHeader=new HashMap<String,String>();
	static{
		tableHeader.put("teacherId","编号");
		tableHeader.put("teacherName","姓名");
		tableHeader.put("teacherGender","性别");
		tableHeader.put("teacherBirth","出身年月");
		tableHeader.put("politicalStatus","政治面貌");
		tableHeader.put("position","职位");
		tableHeader.put("title","职称");
		tableHeader.put("unit","所属单位");
		tableHeader.put("recommendUnit","推荐单位");
		tableHeader.put("teacherType","评选类型");
		tableHeader.put("count","所得票数");
	}
	public static void  export(List<Map> list,String[] exportInfors,String fileName)throws Exception{
		try {
			WritableWorkbook book= Workbook.createWorkbook(new File(fileName));
			WritableSheet sheet=book.createSheet("第一页",0);
			Label[] label =new Label[exportInfors.length];
			for(int i=0;i<exportInfors.length;i++){
				label[i] =new Label(i,0,tableHeader.get(exportInfors[i]));
				sheet.addCell(label[i]);
			}
			String s="";
			for(int j=0;j<list.size();j++){
				Map map=list.get(j);
				for(int k=0;k<exportInfors.length;k++){
					try{
						s=map.get(exportInfors[k]).toString();
					}catch(Exception e){
	
					}
					label[k] =new Label(k,j+1,s);
					sheet.addCell(label[k]);
				}
			}
			book.write(); 
			book.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
