package com.five.animailss.vo;

import org.springframework.format.annotation.DateTimeFormat;

public class VComment {

    private Integer cId;
    private String cInfo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String cCreatetime;
    private String name;
    private String picture;
    private Integer cPid;
    private Integer cCount;

    public Integer getcCount() {
        return cCount;
    }

    public void setcCount(Integer cCount) {
        this.cCount = cCount;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcInfo() {
        return cInfo;
    }

    public void setcInfo(String cInfo) {
        this.cInfo = cInfo;
    }

    public String getcCreatetime() {
        return cCreatetime;
    }

    public void setcCreatetime(String cCreatetime) {
        this.cCreatetime = cCreatetime;
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

    public Integer getcPid() {
        return cPid;
    }

    public void setcPid(Integer cPid) {
        this.cPid = cPid;
    }
}
