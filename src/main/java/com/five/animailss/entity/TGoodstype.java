package com.five.animailss.entity;

public class TGoodstype {
    private Integer gtId;

    private String gtName;

    private Integer gtType;

    private Integer gtLevel;

    private Integer state;

    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public String getGtName() {
        return gtName;
    }

    public void setGtName(String gtName) {
        this.gtName = gtName == null ? null : gtName.trim();
    }

    public Integer getGtType() {
        return gtType;
    }

    public void setGtType(Integer gtType) {
        this.gtType = gtType;
    }

    public Integer getGtLevel() {
        return gtLevel;
    }

    public void setGtLevel(Integer gtLevel) {
        this.gtLevel = gtLevel;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}