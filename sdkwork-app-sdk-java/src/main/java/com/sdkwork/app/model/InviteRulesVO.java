package com.sdkwork.app.model;

public class InviteRulesVO {
    private String title;
    private String description;
    private Integer inviterReward;
    private Integer inviteeReward;
    private List<String> rules;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getInviterReward() {
        return this.inviterReward;
    }
    
    public void setInviterReward(Integer inviterReward) {
        this.inviterReward = inviterReward;
    }

    public Integer getInviteeReward() {
        return this.inviteeReward;
    }
    
    public void setInviteeReward(Integer inviteeReward) {
        this.inviteeReward = inviteeReward;
    }

    public List<String> getRules() {
        return this.rules;
    }
    
    public void setRules(List<String> rules) {
        this.rules = rules;
    }
}
