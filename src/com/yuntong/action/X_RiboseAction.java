/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yuntong.action;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.yuntong.hibernate.database.po.TAgioInfo;
import com.yuntong.hibernate.database.po.TDisrepareInfo;
import com.yuntong.hibernate.database.po.TRegisterInfo;
import com.yuntong.myexception.Y_MyNullResultException;
import com.yuntong.service.X_IfinancialManageService;

/** 
 * MyEclipse Struts
 * Creation date: 04-07-2007
 * 
 * XDoclet definition:
 * @struts.action parameter="ribose" validate="true"
 * @struts.action-forward name="var" path="/riboseVar.jsp"
 */
public class X_RiboseAction extends DispatchAction {
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
	 */
	
	
	private X_IfinancialManageService service;
	
	public X_IfinancialManageService getService() {
		return service;
	}

	public void setService(X_IfinancialManageService service) {
		this.service = service;
	}
	private static final int PAGE_SiZE=4;
	public void fenye(List list ,HttpServletRequest request){
		int totalpage=(list.size()-1)/PAGE_SiZE+1;
		//currentPage设置当前
		int currentPage=1; 
		try
		{
		 currentPage=Integer.parseInt(request.getParameter("currentPage"));
		}catch(NumberFormatException ex)
		{	
		  ex.printStackTrace();
		}
		if(currentPage<1)
		{
			currentPage=1;
		}
		if(currentPage>=totalpage)
		{
			currentPage=totalpage;
		}
		//保存分页信息
		request.setAttribute("currentPage",currentPage+"");
		request.setAttribute("totalpage", totalpage+"");
		request.setAttribute("PageSixze", PAGE_SiZE+"");
		request.setAttribute("offset", ((currentPage-1)*PAGE_SiZE)+""); //offset为本页第一条记录在集合中的位置
		
	}
	
	public ActionForward showPer(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
	
			this.getLoseFew(request);
			getManage(request,1,"收讫未付款", "收讫已付款");
			request.getSession().setAttribute("Perhave", request.getAttribute("have"));
			request.getSession().setAttribute("Pernothave", request.getAttribute("nothave"));
		
		
		return mapping.findForward("var");
	}
	
	
	public ActionForward showPick(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
			this.getLoseFew(request);
		
			getManage(request,2,"提付未付款", "提付已付款");
			
			request.getSession().setAttribute("Pickhave", request.getAttribute("have"));
			request.getSession().setAttribute("Picknothave", request.getAttribute("nothave"));
		
		
		return mapping.findForward("var");
	} 
	
	public void getLoseFew(HttpServletRequest request){
		try {
			List list=service.findAllAgio();//少收款
			List list2=service.findByAllObject();//损失额
			int totalLose=0;
			int totalFew=0;
			
			for(int i=0;i<list.size();i++){
				TAgioInfo agioInfo=(TAgioInfo) list.get(i);	
				String date=agioInfo.getTRegisterInfo().getRegisterDate().toString().substring(0,10);
				if(date.equals(this.getDate())){
					totalFew+=agioInfo.getAgioMoney();
				}
			}
			
			for(int j=0;j<list2.size();j++){
				TDisrepareInfo disrepareInfo=(TDisrepareInfo) list2.get(j);
				String date=disrepareInfo.getTRegisterInfo().getRegisterDate().toString().substring(0,10);
				if(date.equals(this.getDate())){
					totalLose+=disrepareInfo.getDisrepareMoney();
				}
			}
			request.getSession().setAttribute("lose", totalLose);
			request.getSession().setAttribute("few", totalFew);
		} catch (Y_MyNullResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void getManage(HttpServletRequest request,int style,String state1,String state2){
		List list=new ArrayList();
		List listall;
		int totalMoney=0;
		int rate=0;
		int nothaveMoney=0;
		try {
			listall = service.findByProperty("TFreightStyle",style);
			for(int i=0;i<listall.size();i++){
				TRegisterInfo registerInfo=(TRegisterInfo) listall.get(i);
				String date2=registerInfo.getRegisterDate().toString().substring(0,10);
				if(date2.equals(this.getDate())){
					if(registerInfo.getTRegisterState().getRstateName().equals(state1) || registerInfo.getTRegisterState().getRstateName().equals(state2)){
						totalMoney+=registerInfo.getTGoodsInfo().getGoodsValue();
						list.add(registerInfo);
						if(registerInfo.getTRegisterState().getRstateName().equals(state1)){
							nothaveMoney+=registerInfo.getTGoodsInfo().getGoodsValue();
						}
					}
				}
			}
			int haveMoney=totalMoney-nothaveMoney;
			this.fenye(list, request);
			if(list.size()>4){
				request.setAttribute("fenye", "fenye");
			}
			if(totalMoney==0){
				
				rate=0;
			}else{
				rate=haveMoney*100/totalMoney;
			}
			
			
			String r=rate+"%";
			
			request.setAttribute("have", haveMoney);
			request.setAttribute("nothave", nothaveMoney);
			request.setAttribute("rate", r);
			
			request.setAttribute("listall", list);
		} catch (Y_MyNullResultException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("show", "show");
		
	}
	
	public String getDate(){
		Date date=new Date();
		DateFormat df=DateFormat.getDateInstance();
		int year=date.getYear()+1900;
		int month=date.getMonth()+1;
		
		String datetime=year+"-";				
		if(month<10){
			datetime+="0"+month+"-";
		}else{
			datetime+=month+"-";
		}
		if(date.getDate()<10){
			datetime+="0"+date.getDate();
		}else{
			datetime+=date.getDate();
		}
		return datetime;
	}
	
}