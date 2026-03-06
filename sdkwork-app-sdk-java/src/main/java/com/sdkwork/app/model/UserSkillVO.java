package com.sdkwork.app.model;

public class UserSkillVO {
    private String createdAt;
    private String updatedAt;
    private Integer userSkillId;
    private Integer skillId;
    private Boolean enabled;
    private Map<String, Object> config;
    private String installedAt;
    private String lastEnabledAt;
    private String lastUsedAt;
    private Integer usedCount;
    private SkillVO skill;

    public String getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUserSkillId() {
        return this.userSkillId;
    }
    
    public void setUserSkillId(Integer userSkillId) {
        this.userSkillId = userSkillId;
    }

    public Integer getSkillId() {
        return this.skillId;
    }
    
    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Map<String, Object> getConfig() {
        return this.config;
    }
    
    public void setConfig(Map<String, Object> config) {
        this.config = config;
    }

    public String getInstalledAt() {
        return this.installedAt;
    }
    
    public void setInstalledAt(String installedAt) {
        this.installedAt = installedAt;
    }

    public String getLastEnabledAt() {
        return this.lastEnabledAt;
    }
    
    public void setLastEnabledAt(String lastEnabledAt) {
        this.lastEnabledAt = lastEnabledAt;
    }

    public String getLastUsedAt() {
        return this.lastUsedAt;
    }
    
    public void setLastUsedAt(String lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    public Integer getUsedCount() {
        return this.usedCount;
    }
    
    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

    public SkillVO getSkill() {
        return this.skill;
    }
    
    public void setSkill(SkillVO skill) {
        this.skill = skill;
    }
}
