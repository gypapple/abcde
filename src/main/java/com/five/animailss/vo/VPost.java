package com.five.animailss.vo;

import org.springframework.format.annotation.DateTimeFormat;

public class VPost {
    private Integer pId;

    private String pPicture;

    private String pInfo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String pCreatetime;

    private Integer pCount;

    private Integer pType;

    private String name;

    private String picture;

    private Integer pState;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpPicture() {
        return pPicture;
    }

    public void setpPicture(String pPicture) {
        this.pPicture = pPicture;
    }

    public String getpInfo() {
        return pInfo;
    }

    public void setpInfo(String pInfo) {
        this.pInfo = pInfo;
    }

    public String getpCreatetime() {
        return pCreatetime;
    }

    public void setpCreatetime(String pCreatetime) {
        this.pCreatetime = pCreatetime;
    }

    public Integer getpCount() {
        return pCount;
    }

    public void setpCount(Integer pCount) {
        this.pCount = pCount;
    }

    public Integer getpType() {
        return pType;
    }

    public void setpType(Integer pType) {
        this.pType = pType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getpState() {
        return pState;
    }

    public void setpState(Integer pState) {
        this.pState = pState;
    }
}
