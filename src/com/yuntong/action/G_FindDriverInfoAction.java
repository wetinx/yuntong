/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yuntong.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuntong.business.vo.G_DriverInfoVO;
import com.yuntong.business.vo.G_TruckInfoVO;
import com.yuntong.service.G_IDriverInfoService;

/** 
 * MyEclipse Struts
 * Creation date: 04-10-2007
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class G_FindDriverInfoAction extends Action {
	private G_IDriverInfoService driverInfoService;
	/*
	 * Generated Methods
	 */
	public G_IDriverInfoService getDriverInfoService() {
		return driverInfoService;
	}

	public void setDriverInfoService(G_IDriverInfoService driverInfoService) {
		this.driverInfoService = driverInfoService;
	}
	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 * @throws IOException 
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/xml; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String str=request.getParameter("driverName");
		String driverName=new String(str.getBytes("ISO-8859-1"),"UTF-8");
		G_DriverInfoVO vo=driverInfoService.getDriverInfoByName(driverName);
		out.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		out.print("<info>");
		//˾������
		out.print("<driverName value='"+vo.getDriverName()+"'>");
		out.print(vo.getDriverName());
		out.print("</driverName>");
		//��    ��
		out.print("<driverAge value='"+vo.getDriverAge()+"'>");
		out.print(vo.getDriverAge());
		out.print("</driverAge>");
		//��    ��
		out.print("<driverSex value='"+vo.getDriverSex()+"'>");
		out.print(vo.getDriverSex());
		out.print("</driverSex>");
		//�ϴ���Ƭ
		out.print("<driverPhoto value='"+vo.getDriverPhoto()+"'>");
		out.print(vo.getDriverPhoto());
		out.print("</driverPhoto>");
		//��ʻ֤��
		out.print("<driverDriverCardID value='"+vo.getDriverDriverCardID()+"'>");
		out.print(vo.getDriverDriverCardID());
		out.print("</driverDriverCardID>");
		//����֤��
		out.print("<driverCardID value='"+vo.getDriverCardID()+"'>");
		out.print(vo.getDriverCardID());
		out.print("</driverCardID>");
		//��ϵ�绰
		out.print("<driverPhoneNum value='"+vo.getDriverPhoneNum()+"'>");
		out.print(vo.getDriverPhoneNum());
		out.print("</driverPhoneNum>");
		//�����ֹ�˾���
		out.print("<driverCompanyID value='"+vo.getDriverCompanyID()+"'>");
		out.print(vo.getDriverCompanyID());
		out.print("</driverCompanyID>");
		//��    ע
		out.print("<driverRemarkInfo value='"+vo.getDriverRemarkInfo()+"'>");
		out.print(vo.getDriverRemarkInfo());
		out.print("</driverRemarkInfo>");
		out.print("</info>");
		out.close();
		return null;
	}

	
}