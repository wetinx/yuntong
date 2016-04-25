/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.yuntong.action.actionform;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 04-08-2007
 * 
 * XDoclet definition:
 * @struts.form name="g_DriverInfoForm"
 */
public class G_DriverInfoForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** driverCardID property */
	private String driverCardID;

	/** driverRemarkInfo property */
	private String driverRemarkInfo;

	/** driverDriverCardID property */
	private String driverDriverCardID;

	/** driverPhoto property */
	private String driverPhoto;

	/** driverCompanyID property */
	private int driverCompanyID;

	/** driverName property */
	private String driverName;

	/** driverPhoneNum property */
	private String driverPhoneNum;

	/** driverAge property */
	private int driverAge;

	/** driverSex property */
	private int driverSex;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the driverCardID.
	 * @return String
	 */
	public String getDriverCardID() {
		return driverCardID;
	}

	/** 
	 * Set the driverCardID.
	 * @param driverCardID The driverCardID to set
	 */
	public void setDriverCardID(String driverCardID) {
		this.driverCardID = driverCardID;
	}

	/** 
	 * Returns the driverRemarkInfo.
	 * @return String
	 */
	public String getDriverRemarkInfo() {
		return driverRemarkInfo;
	}

	/** 
	 * Set the driverRemarkInfo.
	 * @param driverRemarkInfo The driverRemarkInfo to set
	 */
	public void setDriverRemarkInfo(String driverRemarkInfo) {
		this.driverRemarkInfo = driverRemarkInfo;
	}

	/** 
	 * Returns the driverDriverCardID.
	 * @return String
	 */
	public String getDriverDriverCardID() {
		return driverDriverCardID;
	}

	/** 
	 * Set the driverDriverCardID.
	 * @param driverDriverCardID The driverDriverCardID to set
	 */
	public void setDriverDriverCardID(String driverDriverCardID) {
		this.driverDriverCardID = driverDriverCardID;
	}

	/** 
	 * Returns the driverPhoto.
	 * @return String
	 */
	public String getDriverPhoto() {
		return driverPhoto;
	}

	/** 
	 * Set the driverPhoto.
	 * @param driverPhoto The driverPhoto to set
	 */
	public void setDriverPhoto(String driverPhoto) {
		this.driverPhoto = driverPhoto;
	}

	/** 
	 * Returns the driverCompanyID.
	 * @return int
	 */
	public int getDriverCompanyID() {
		return driverCompanyID;
	}

	/** 
	 * Set the driverCompanyID.
	 * @param driverCompanyID The driverCompanyID to set
	 */
	public void setDriverCompanyID(int driverCompanyID) {
		this.driverCompanyID = driverCompanyID;
	}

	/** 
	 * Returns the driverName.
	 * @return String
	 */
	public String getDriverName() {
		return driverName;
	}

	/** 
	 * Set the driverName.
	 * @param driverName The driverName to set
	 */
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	/** 
	 * Returns the driverPhoneNum.
	 * @return String
	 */
	public String getDriverPhoneNum() {
		return driverPhoneNum;
	}

	/** 
	 * Set the driverPhoneNum.
	 * @param driverPhoneNum The driverPhoneNum to set
	 */
	public void setDriverPhoneNum(String driverPhoneNum) {
		this.driverPhoneNum = driverPhoneNum;
	}

	/** 
	 * Returns the driverAge.
	 * @return int
	 */
	public int getDriverAge() {
		return driverAge;
	}

	/** 
	 * Set the driverAge.
	 * @param driverAge The driverAge to set
	 */
	public void setDriverAge(int driverAge) {
		this.driverAge = driverAge;
	}

	/** 
	 * Returns the driverSex.
	 * @return int
	 */
	public int getDriverSex() {
		return driverSex;
	}

	/** 
	 * Set the driverSex.
	 * @param driverSex The driverSex to set
	 */
	public void setDriverSex(int driverSex) {
		this.driverSex = driverSex;
	}
}