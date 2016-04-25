/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yuntong.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuntong.business.vo.Y_R2selectInfoVO;
import com.yuntong.business.vo.Y_splitInfoVO;
import com.yuntong.service.Y_ISplitRegister;
import com.yuntong.service.impl.Y_RegisterManagerService;

/** 
 * MyEclipse Struts
 * Creation date: 04-08-2007
 * 未估货票分页
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class Y_SplitWGHPAction extends Action {
	private Log log = LogFactory.getLog(Y_RegisterManagerService.class);
	private Y_ISplitRegister register;
	public Log getLog() {
		return log;
	}
	public void setLog(Log log) {
		this.log = log;
	}
	public Y_ISplitRegister getRegister() {
		return register;
	}
	public void setRegister(Y_ISplitRegister register) {
		this.register = register;
	}
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		String pageNum=request.getParameter("pageNum");
		log.info("分页标记："+pageNum);
		HttpSession session=request.getSession();
		//得到分页信息
		Y_splitInfoVO spInfo=(Y_splitInfoVO) session.getAttribute("Y_spInfo");
		
		//判断当前页
		if(pageNum.equals("A")){
			spInfo.setCurPage(1);
		}else if(pageNum.equals("B")){
			if(spInfo.getCurPage()<=1){
				spInfo.setCurPage(1);
			}else{
			spInfo.setCurPage(spInfo.getCurPage()-1);
			}
		}else if(pageNum.equals("C")){
			if(spInfo.getCurPage()>=spInfo.getPageNum()-1){
				spInfo.setCurPage(spInfo.getPageNum()-1);
			}else{
			spInfo.setCurPage(spInfo.getCurPage()+1);
			}
		}else if(pageNum.equals("D")){
			spInfo.setCurPage(spInfo.getPageNum()-1);
		}else{
			String strpage=request.getParameter("page");
			if(strpage==null||strpage.equals("")){
				return mapping.findForward("gowghp");
			}
			int page=Integer.parseInt(strpage);
			if(page<=1){
				spInfo.setCurPage(1);
			}else if(page>=spInfo.getPageNum()-1){
				spInfo.setCurPage(spInfo.getPageNum()-1);
			}else{
				spInfo.setCurPage(page);
			}
		}
		//得到高级分页信息
		Y_R2selectInfoVO rvo=new Y_R2selectInfoVO();
		List list=new ArrayList();
		if(session.getAttribute("Y_selectr2")!=null){
		 rvo=(Y_R2selectInfoVO) session.getAttribute("Y_selectr2");
//		得到页面信息		
			list=register.findSplitRegisterInfo(spInfo.getPageSize(), spInfo.getCurPage(),rvo.getClientID(),rvo.getFactroyID(),rvo.getFreightID(),rvo.getInsertDate());
		}else{
			list=register.findSplitRegisterInfo(spInfo.getPageSize(), spInfo.getCurPage());
		}
		//得到页面信息		
		
		//保存页面信息
		session.setAttribute("Y_pageinfo", list);
		//保存分页信息
		session.setAttribute("Y_spInfo", spInfo);
		//返回页面
		return mapping.findForward("gowghp");
	}
}