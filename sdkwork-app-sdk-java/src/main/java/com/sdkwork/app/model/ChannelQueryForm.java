package com.sdkwork.app.model;

public class ChannelQueryForm {
    private String startDate;
    private String endDate;
    private String channelType;
    private String deviceType;
    private Integer pageSize;
    private Integer pageNum;

    public String getStartDate() {
        return this.startDate;
    }
    
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getChannelType() {
        return this.channelType;
    }
    
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getDeviceType() {
        return this.deviceType;
    }
    
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }
    
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }
    
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
