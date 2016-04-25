/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yuntong.action.ajaxaction;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuntong.service.M_IRegisterManagerService;

/** 
 * MyEclipse Struts
 * Creation date: 04-12-2007
 * 
 * XDoclet definition:
 * @struts.action
 */
public class M_updataAjaxActionAction extends Action {
	private M_IRegisterManagerService managerService;
	/*
	 * Generated Methods
	 */

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
		PrintWriter out = response.getWriter();
        try {
            int rid=Integer.parseInt(request.getParameter("id"));
            
            managerService.updateRegisterType(rid,8);
            out.print("�޸ĳɹ�");

        } catch (Exception ex) {
        	out.print("�޸�ʧ��");
            ex.printStackTrace();
        }
        return null;
	}

	public M_IRegisterManagerService getManagerService() {
		return managerService;
	}

	public void setManagerService(M_IRegisterManagerService managerService) {
		this.managerService = managerService;
	}
}