package com.sdkwork.app.model;

public class SecuritySettingsVO {
    private String createdAt;
    private String updatedAt;
    private Boolean twoFactorEnabled;
    private Boolean biometricEnabled;
    private Boolean autoLockEnabled;
    private Integer autoLockMinutes;
    private Boolean loginNotificationsEnabled;
    private Boolean ipRestrictionEnabled;
    private List<String> allowedIps;
    private Boolean passwordStrengthCheckEnabled;
    private Integer passwordExpiryDays;
    private String lastPasswordChangeTime;

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

    public Boolean getTwoFactorEnabled() {
        return this.twoFactorEnabled;
    }
    
    public void setTwoFactorEnabled(Boolean twoFactorEnabled) {
        this.twoFactorEnabled = twoFactorEnabled;
    }

    public Boolean getBiometricEnabled() {
        return this.biometricEnabled;
    }
    
    public void setBiometricEnabled(Boolean biometricEnabled) {
        this.biometricEnabled = biometricEnabled;
    }

    public Boolean getAutoLockEnabled() {
        return this.autoLockEnabled;
    }
    
    public void setAutoLockEnabled(Boolean autoLockEnabled) {
        this.autoLockEnabled = autoLockEnabled;
    }

    public Integer getAutoLockMinutes() {
        return this.autoLockMinutes;
    }
    
    public void setAutoLockMinutes(Integer autoLockMinutes) {
        this.autoLockMinutes = autoLockMinutes;
    }

    public Boolean getLoginNotificationsEnabled() {
        return this.loginNotificationsEnabled;
    }
    
    public void setLoginNotificationsEnabled(Boolean loginNotificationsEnabled) {
        this.loginNotificationsEnabled = loginNotificationsEnabled;
    }

    public Boolean getIpRestrictionEnabled() {
        return this.ipRestrictionEnabled;
    }
    
    public void setIpRestrictionEnabled(Boolean ipRestrictionEnabled) {
        this.ipRestrictionEnabled = ipRestrictionEnabled;
    }

    public List<String> getAllowedIps() {
        return this.allowedIps;
    }
    
    public void setAllowedIps(List<String> allowedIps) {
        this.allowedIps = allowedIps;
    }

    public Boolean getPasswordStrengthCheckEnabled() {
        return this.passwordStrengthCheckEnabled;
    }
    
    public void setPasswordStrengthCheckEnabled(Boolean passwordStrengthCheckEnabled) {
        this.passwordStrengthCheckEnabled = passwordStrengthCheckEnabled;
    }

    public Integer getPasswordExpiryDays() {
        return this.passwordExpiryDays;
    }
    
    public void setPasswordExpiryDays(Integer passwordExpiryDays) {
        this.passwordExpiryDays = passwordExpiryDays;
    }

    public String getLastPasswordChangeTime() {
        return this.lastPasswordChangeTime;
    }
    
    public void setLastPasswordChangeTime(String lastPasswordChangeTime) {
        this.lastPasswordChangeTime = lastPasswordChangeTime;
    }
}
