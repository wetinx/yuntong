package com.yuntong.hibernate.database.po;

import java.util.HashSet;
import java.util.Set;


/**
 * TAreaInfo generated by MyEclipse - Hibernate Tools
 */

public class TAreaInfo  implements java.io.Serializable {


    // Fields    

     private Integer areaInfoId;
     private String areaProvince;
     private String areaCity;
     private Integer areaFilialeType;
     private Set TFilialeInfos = new HashSet(0);
     private Set TAreaFreightInfosForAfrerghtEnd = new HashSet(0);
     private Set TFactoryInfos = new HashSet(0);
     private Set TAreaFreightInfosForAfrerghtBegin = new HashSet(0);
     private Set TMarketInfos = new HashSet(0);


    // Constructors

    /** default constructor */
    public TAreaInfo() {
    }

	/** minimal constructor */
    public TAreaInfo(Integer areaInfoId) {
        this.areaInfoId = areaInfoId;
    }
    
    /** full constructor */
    public TAreaInfo(Integer areaInfoId, String areaProvince, String areaCity, Integer areaFilialeType, Set TFilialeInfos, Set TAreaFreightInfosForAfrerghtEnd, Set TFactoryInfos, Set TAreaFreightInfosForAfrerghtBegin, Set TMarketInfos) {
        this.areaInfoId = areaInfoId;
        this.areaProvince = areaProvince;
        this.areaCity = areaCity;
        this.areaFilialeType = areaFilialeType;
        this.TFilialeInfos = TFilialeInfos;
        this.TAreaFreightInfosForAfrerghtEnd = TAreaFreightInfosForAfrerghtEnd;
        this.TFactoryInfos = TFactoryInfos;
        this.TAreaFreightInfosForAfrerghtBegin = TAreaFreightInfosForAfrerghtBegin;
        this.TMarketInfos = TMarketInfos;
    }

   
    // Property accessors

    public Integer getAreaInfoId() {
        return this.areaInfoId;
    }
    
    public void setAreaInfoId(Integer areaInfoId) {
        this.areaInfoId = areaInfoId;
    }

    public String getAreaProvince() {
        return this.areaProvince;
    }
    
    public void setAreaProvince(String areaProvince) {
        this.areaProvince = areaProvince;
    }

    public String getAreaCity() {
        return this.areaCity;
    }
    
    public void setAreaCity(String areaCity) {
        this.areaCity = areaCity;
    }

    public Integer getAreaFilialeType() {
        return this.areaFilialeType;
    }
    
    public void setAreaFilialeType(Integer areaFilialeType) {
        this.areaFilialeType = areaFilialeType;
    }

    public Set getTFilialeInfos() {
        return this.TFilialeInfos;
    }
    
    public void setTFilialeInfos(Set TFilialeInfos) {
        this.TFilialeInfos = TFilialeInfos;
    }

    public Set getTAreaFreightInfosForAfrerghtEnd() {
        return this.TAreaFreightInfosForAfrerghtEnd;
    }
    
    public void setTAreaFreightInfosForAfrerghtEnd(Set TAreaFreightInfosForAfrerghtEnd) {
        this.TAreaFreightInfosForAfrerghtEnd = TAreaFreightInfosForAfrerghtEnd;
    }

    public Set getTFactoryInfos() {
        return this.TFactoryInfos;
    }
    
    public void setTFactoryInfos(Set TFactoryInfos) {
        this.TFactoryInfos = TFactoryInfos;
    }

    public Set getTAreaFreightInfosForAfrerghtBegin() {
        return this.TAreaFreightInfosForAfrerghtBegin;
    }
    
    public void setTAreaFreightInfosForAfrerghtBegin(Set TAreaFreightInfosForAfrerghtBegin) {
        this.TAreaFreightInfosForAfrerghtBegin = TAreaFreightInfosForAfrerghtBegin;
    }

    public Set getTMarketInfos() {
        return this.TMarketInfos;
    }
    
    public void setTMarketInfos(Set TMarketInfos) {
        this.TMarketInfos = TMarketInfos;
    }
   








}