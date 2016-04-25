package com.yuntong.hibernate.database.po;

import java.util.HashSet;
import java.util.Set;


/**
 * TRoleInfo generated by MyEclipse - Hibernate Tools
 */

public class TRoleInfo  implements java.io.Serializable {


    // Fields    

     private Integer roleId;
     private String roleName;
     private Integer roleSHGL;          //收货管理
     private Integer rolePWGL;			//票物管理
     private Integer rolePSGL;			//	配送管理
     private Integer roleCWGL;			//财务管理
     private Integer roleSCGL;			//市场管理
     private Integer roleTJCX ;			//统计查询
     private Integer roleJBZL;			//基本资料
     
     private Set TUserInfos = new HashSet(0);
    

    // Constructors

    /** default constructor */
    public TRoleInfo() {
    }

	/** minimal constructor */
    public TRoleInfo(Integer roleId) {
        this.roleId = roleId;
    }
    
    /** full constructor */
    public TRoleInfo(Integer roleId, String roleName, Integer roleSHGL, Integer rolePWGL, Integer rolePSGL, Integer roleCWGL, Integer roleSCGL, Integer roleTJCX,Integer roleJBZL ,Set TUserInfos) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleSHGL = roleSHGL;
        this.rolePWGL = rolePWGL;
        this.rolePSGL = rolePSGL;
        this.roleCWGL = roleCWGL;
        this.roleSCGL = roleSCGL;
        this.roleTJCX = roleTJCX;
        this.roleJBZL = roleJBZL;       
        this.TUserInfos = TUserInfos;
    }

   
    // Property accessors

    public Integer getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }
    
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    

    public Set getTUserInfos() {
        return this.TUserInfos;
    }
    
    public void setTUserInfos(Set TUserInfos) {
        this.TUserInfos = TUserInfos;
    }

	public Integer getRoleCWGL() {
		return roleCWGL;
	}

	public void setRoleCWGL(Integer roleCWGL) {
		this.roleCWGL = roleCWGL;
	}

	public Integer getRoleJBZL() {
		return roleJBZL;
	}

	public void setRoleJBZL(Integer roleJBZL) {
		this.roleJBZL = roleJBZL;
	}

	public Integer getRolePSGL() {
		return rolePSGL;
	}

	public void setRolePSGL(Integer rolePSGL) {
		this.rolePSGL = rolePSGL;
	}

	public Integer getRolePWGL() {
		return rolePWGL;
	}

	public void setRolePWGL(Integer rolePWGL) {
		this.rolePWGL = rolePWGL;
	}

	public Integer getRoleSCGL() {
		return roleSCGL;
	}

	public void setRoleSCGL(Integer roleSCGL) {
		this.roleSCGL = roleSCGL;
	}

	public Integer getRoleSHGL() {
		return roleSHGL;
	}

	public void setRoleSHGL(Integer roleSHGL) {
		this.roleSHGL = roleSHGL;
	}

	public Integer getRoleTJCX() {
		return roleTJCX;
	}

	public void setRoleTJCX(Integer roleTJCX) {
		this.roleTJCX = roleTJCX;
	}
   








}