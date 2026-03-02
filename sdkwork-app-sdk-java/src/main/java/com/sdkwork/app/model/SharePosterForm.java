package com.sdkwork.app.model;

public class SharePosterForm {
    private String shareType;
    private String shareId;
    private String template;
    private String backgroundColor;
    private String textColor;
    private Boolean includeQrCode;
    private String customText;

    public String getShareType() {
        return this.shareType;
    }
    
    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public String getShareId() {
        return this.shareId;
    }
    
    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getTemplate() {
        return this.template;
    }
    
    public void setTemplate(String template) {
        this.template = template;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }
    
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getTextColor() {
        return this.textColor;
    }
    
    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public Boolean getIncludeQrCode() {
        return this.includeQrCode;
    }
    
    public void setIncludeQrCode(Boolean includeQrCode) {
        this.includeQrCode = includeQrCode;
    }

    public String getCustomText() {
        return this.customText;
    }
    
    public void setCustomText(String customText) {
        this.customText = customText;
    }
}
