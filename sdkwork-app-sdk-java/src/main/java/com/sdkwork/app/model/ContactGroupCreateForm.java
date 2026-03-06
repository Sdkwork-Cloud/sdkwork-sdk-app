package com.sdkwork.app.model;

public class ContactGroupCreateForm {
    private String name;
    private List<String> memberIds;

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMemberIds() {
        return this.memberIds;
    }
    
    public void setMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
    }
}
