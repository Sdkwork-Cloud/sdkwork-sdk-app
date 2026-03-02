package com.sdkwork.app.model;

public class DataExportForm {
    private String format;
    private String dataType;
    private Boolean includeMedia;
    private String startTime;
    private String endTime;
    private String email;

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public String getDataType() {
        return this.dataType;
    }
    
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Boolean getIncludeMedia() {
        return this.includeMedia;
    }
    
    public void setIncludeMedia(Boolean includeMedia) {
        this.includeMedia = includeMedia;
    }

    public String getStartTime() {
        return this.startTime;
    }
    
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }
    
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}
