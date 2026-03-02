package com.sdkwork.app.model;

public class TwoFactorSetupVO {
    private String createdAt;
    private String updatedAt;
    private Boolean enabled;
    private String method;
    private String qrCodeData;
    private String secretKey;
    private String verificationCode;
    private List<String> recoveryCodes;

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

    public Boolean getEnabled() {
        return this.enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getMethod() {
        return this.method;
    }
    
    public void setMethod(String method) {
        this.method = method;
    }

    public String getQrCodeData() {
        return this.qrCodeData;
    }
    
    public void setQrCodeData(String qrCodeData) {
        this.qrCodeData = qrCodeData;
    }

    public String getSecretKey() {
        return this.secretKey;
    }
    
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getVerificationCode() {
        return this.verificationCode;
    }
    
    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public List<String> getRecoveryCodes() {
        return this.recoveryCodes;
    }
    
    public void setRecoveryCodes(List<String> recoveryCodes) {
        this.recoveryCodes = recoveryCodes;
    }
}
