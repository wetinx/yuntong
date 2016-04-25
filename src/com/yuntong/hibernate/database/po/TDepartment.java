package com.yuntong.hibernate.database.po;

import java.util.HashSet;
import java.util.Set;


/**
 * TDepartment generated by MyEclipse - Hibernate Tools
 */

public class TDepartment  implements java.io.Serializable {


    // Fields    

     private Integer departmentId;
     private String departmantName;
     private Set TUserInfos = new HashSet(0);


    // Constructors

    /** default constructor */
    public TDepartment() {
    }

	/** minimal constructor */
    public TDepartment(Integer departmentId) {
        this.departmentId = departmentId;
    }
    
    /** full constructor */
    public TDepartment(Integer departmentId, String departmantName, Set TUserInfos) {
        this.departmentId = departmentId;
        this.departmantName = departmantName;
        this.TUserInfos = TUserInfos;
    }

   
    // Property accessors

    public Integer getDepartmentId() {
        return this.departmentId;
    }
    
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmantName() {
        return this.departmantName;
    }
    
    public void setDepartmantName(String departmantName) {
        this.departmantName = departmantName;
    }

    public Set getTUserInfos() {
        return this.TUserInfos;
    }
    
    public void setTUserInfos(Set TUserInfos) {
        this.TUserInfos = TUserInfos;
    }
   








}