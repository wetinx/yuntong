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
 * Creation date: 04-01-2007
 * 
 * XDoclet definition:
 * @struts.form name="y_SHDJClientForm"
 */
public class Y_SHDJClientForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** marketvalue property */
	private String marketvalue;

	/** areavalue property */
	private String areavalue;

	/** caddress property */
	private String caddress;

	/** cpostid property */
	private String cpostid;

	/** cemail property */
	private String cemail;

	/** cphone property */
	private String cphone;

	/** cman property */
	private String cman;

	/** mycid property */
	private String mycid;

	/** cname property */
	private String cname;

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
	 * Returns the marketvalue.
	 * @return String
	 */
	public String getMarketvalue() {
		return marketvalue;
	}

	/** 
	 * Set the marketvalue.
	 * @param marketvalue The marketvalue to set
	 */
	public void setMarketvalue(String marketvalue) {
		this.marketvalue = marketvalue;
	}

	/** 
	 * Returns the areavalue.
	 * @return String
	 */
	public String getAreavalue() {
		return areavalue;
	}

	/** 
	 * Set the areavalue.
	 * @param areavalue The areavalue to set
	 */
	public void setAreavalue(String areavalue) {
		this.areavalue = areavalue;
	}

	/** 
	 * Returns the caddress.
	 * @return String
	 */
	public String getCaddress() {
		return caddress;
	}

	/** 
	 * Set the caddress.
	 * @param caddress The caddress to set
	 */
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	/** 
	 * Returns the cpostid.
	 * @return String
	 */
	public String getCpostid() {
		return cpostid;
	}

	/** 
	 * Set the cpostid.
	 * @param cpostid The cpostid to set
	 */
	public void setCpostid(String cpostid) {
		this.cpostid = cpostid;
	}

	/** 
	 * Returns the cemail.
	 * @return String
	 */
	public String getCemail() {
		return cemail;
	}

	/** 
	 * Set the cemail.
	 * @param cemail The cemail to set
	 */
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	/** 
	 * Returns the cphone.
	 * @return String
	 */
	public String getCphone() {
		return cphone;
	}

	/** 
	 * Set the cphone.
	 * @param cphone The cphone to set
	 */
	public void setCphone(String cphone) {
		this.cphone = cphone;
	}

	/** 
	 * Returns the cman.
	 * @return String
	 */
	public String getCman() {
		return cman;
	}

	/** 
	 * Set the cman.
	 * @param cman The cman to set
	 */
	public void setCman(String cman) {
		this.cman = cman;
	}

	/** 
	 * Returns the mycid.
	 * @return String
	 */
	public String getMycid() {
		return mycid;
	}

	/** 
	 * Set the mycid.
	 * @param mycid The mycid to set
	 */
	public void setMycid(String mycid) {
		this.mycid = mycid;
	}

	/** 
	 * Returns the cname.
	 * @return String
	 */
	public String getCname() {
		return cname;
	}

	/** 
	 * Set the cname.
	 * @param cname The cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
}