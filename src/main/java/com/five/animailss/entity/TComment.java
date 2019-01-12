package com.five.animailss.entity;

import org.springframework.format.annotation.DateTimeFormat;

public class TComment {

    private Integer cId;
    private String cInfo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String cCreatetime;
    private Integer cUfid;
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

    public Integer getcUfid() {
        return cUfid;
    }

    public void setcUfid(Integer cUfid) {
        this.cUfid = cUfid;
    }

    public Integer getcPid() {
        return cPid;
    }

    public void setcPid(Integer cPid) {
        this.cPid = cPid;
    }
}
