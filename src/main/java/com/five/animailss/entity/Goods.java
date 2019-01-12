package com.five.animailss.entity;

import java.math.BigDecimal;

public class Goods {
    private Integer gId;

    private String gName;

    private String gPicture;

    private BigDecimal gPrice;

    private String gInfo;

    private Integer gType;

    private String gColor;

    private Integer gTotal;

    private Integer gReper;

    private String gGtid;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public String getgPicture() {
        return gPicture;
    }

    public void setgPicture(String gPicture) {
        this.gPicture = gPicture == null ? null : gPicture.trim();
    }

    public BigDecimal getgPrice() {
        return gPrice;
    }

    public void setgPrice(BigDecimal gPrice) {
        this.gPrice = gPrice;
    }

    public String getgInfo() {
        return gInfo;
    }

    public void setgInfo(String gInfo) {
        this.gInfo = gInfo == null ? null : gInfo.trim();
    }

    public Integer getgType() {
        return gType;
    }

    public void setgType(Integer gType) {
        this.gType = gType;
    }

    public String getgColor() {
        return gColor;
    }

    public void setgColor(String gColor) {
        this.gColor = gColor == null ? null : gColor.trim();
    }

    public Integer getgTotal() {
        return gTotal;
    }

    public void setgTotal(Integer gTotal) {
        this.gTotal = gTotal;
    }

    public Integer getgReper() {
        return gReper;
    }

    public void setgReper(Integer gReper) {
        this.gReper = gReper;
    }

    public String getgGtid() {
        return gGtid;
    }

    public void setgGtid(String gGtid) {
        this.gGtid = gGtid == null ? null : gGtid.trim();
    }
}