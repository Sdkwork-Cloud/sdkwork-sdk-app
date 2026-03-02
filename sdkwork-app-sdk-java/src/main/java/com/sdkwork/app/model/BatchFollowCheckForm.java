package com.sdkwork.app.model;

public class BatchFollowCheckForm {
    private List<String> userIds;
    private String checkType;

    public List<String> getUserIds() {
        return this.userIds;
    }
    
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public String getCheckType() {
        return this.checkType;
    }
    
    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }
}
