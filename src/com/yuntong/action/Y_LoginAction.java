/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yuntong.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.yuntong.action.actionform.Y_LoginForm;
import com.yuntong.business.vo.AfficheInfoVO;
import com.yuntong.business.vo.Y_CueInfoVO;
import com.yuntong.business.vo.Y_UserInfoVO;
import com.yuntong.encrypt.MD5;
import com.yuntong.hibernate.database.po.TAffiche;
import com.yuntong.hibernate.database.po.TCue;
import com.yuntong.service.Y_IUserManagerService;

/** 
 * MyEclipse Struts
 * Creation date: 03-24-2007
 * 用户登陆初市化信息
 * XDoclet definition:
 * @struts.action path="/y_Login" name="y_LoginForm" scope="request" validate="true"
 * @struts.action-forward name="ok" path="/Y_Index.jsp"
 * @struts.action-forward name="error" path="/Y_Error.jsp"
 */
public class Y_LoginAction extends Action {
	private Y_IUserManagerService service;
	
	public Y_IUserManagerService getService() {
		return service;
	}

	public void setService(Y_IUserManagerService service) {
		this.service = service;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		Y_LoginForm y_LoginForm = (Y_LoginForm) form;// TODO Auto-generated method stub
		String userName=y_LoginForm.getUserName();
		String userPwd=MD5.MD5Encrypt(y_LoginForm.getUserPwd());
		String checkNum=y_LoginForm.getCheckNum();
		
		HttpSession session=request.getSession();
		String ck1=(String) session.getAttribute("num1");
		String ck2=(String) session.getAttribute("num2");
		String ck3=(String) session.getAttribute("num3");
		String ck4=(String) session.getAttribute("num4");
		//验证码错误
		if(!checkNum.equals(ck1+ck2+ck3+ck4)){
			request.setAttribute("ckerror", "验证码输入错误！！");
			return mapping.getInputForward();
		}
		//得到业务类实例
		boolean tlag=service.checkLogin(userName, userPwd);
		//判断登陆
		if(tlag){
			//成功											
			//保存用户信息
			Y_UserInfoVO infoVO=new Y_UserInfoVO();
			infoVO=service.findUserInfoByName(userName);
			//修改登陆次数，登陆时间
			service.updataUserLoginTime(infoVO.getUserId());
			infoVO.setUserLoginNum(infoVO.getUserLoginNum()+1);
			session.setAttribute("userLoginInfo", infoVO);
			//初始化公告信息
			AfficheInfoVO af= service.findTopDate();
			session.setAttribute("Y_gonggao", af);
			//初试化鼠标提示			
			List list=service.findAllCue();
			session.setAttribute("Y_shubiaotishi", list);
			
			return mapping.findForward("ok");
		}					
		//失败
		request.setAttribute("ckerror", "用户名或密码输入错误！！");
		return mapping.getInputForward();
	}
	
}