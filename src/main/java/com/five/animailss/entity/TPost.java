package com.five.animailss.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

public class TPost {
    private Integer pId;

    private String pPicture;

    private String pInfo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String pCreatetime;

    private Integer pCount;

    private Integer pType;

    private Integer pUid;

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
        this.pPicture = pPicture == null ? null : pPicture.trim();
    }

    public String getpInfo() {
        return pInfo;
    }

    public void setpInfo(String pInfo) {
        this.pInfo = pInfo == null ? null : pInfo.trim();
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

    public Integer getpUid() {
        return pUid;
    }

    public void setpUid(Integer pUid) {
        this.pUid = pUid;
    }

    public Integer getpState() {
        return pState;
    }

    public void setpState(Integer pState) {
        this.pState = pState;
    }
}
