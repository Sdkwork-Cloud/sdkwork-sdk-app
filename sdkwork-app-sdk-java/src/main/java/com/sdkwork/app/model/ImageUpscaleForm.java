package com.sdkwork.app.model;

public class ImageUpscaleForm {
    private String title;
    private String prompt;
    private String negativePrompt;
    private String model;
    private String channel;
    private List<AssetMediaResource> referenceAssets;
    private Integer n;
    private Integer seed;
    private Boolean async;
    private String callbackUrl;
    private Map<String, Object> extraParams;
    private String bizScene;
    private Integer bizId;
    private Integer conversationId;
    private Integer messageId;
    private Integer scale;
    private Integer targetWidth;
    private Integer targetHeight;
    private String format;
    private String type;
    private Integer referenceAssetCount;

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrompt() {
        return this.prompt;
    }
    
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getNegativePrompt() {
        return this.negativePrompt;
    }
    
    public void setNegativePrompt(String negativePrompt) {
        this.negativePrompt = negativePrompt;
    }

    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }

    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String channel) {
        this.channel = channel;
    }

    public List<AssetMediaResource> getReferenceAssets() {
        return this.referenceAssets;
    }
    
    public void setReferenceAssets(List<AssetMediaResource> referenceAssets) {
        this.referenceAssets = referenceAssets;
    }

    public Integer getN() {
        return this.n;
    }
    
    public void setN(Integer n) {
        this.n = n;
    }

    public Integer getSeed() {
        return this.seed;
    }
    
    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public Boolean getAsync() {
        return this.async;
    }
    
    public void setAsync(Boolean async) {
        this.async = async;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public Map<String, Object> getExtraParams() {
        return this.extraParams;
    }
    
    public void setExtraParams(Map<String, Object> extraParams) {
        this.extraParams = extraParams;
    }

    public String getBizScene() {
        return this.bizScene;
    }
    
    public void setBizScene(String bizScene) {
        this.bizScene = bizScene;
    }

    public Integer getBizId() {
        return this.bizId;
    }
    
    public void setBizId(Integer bizId) {
        this.bizId = bizId;
    }

    public Integer getConversationId() {
        return this.conversationId;
    }
    
    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public Integer getMessageId() {
        return this.messageId;
    }
    
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getScale() {
        return this.scale;
    }
    
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Integer getTargetWidth() {
        return this.targetWidth;
    }
    
    public void setTargetWidth(Integer targetWidth) {
        this.targetWidth = targetWidth;
    }

    public Integer getTargetHeight() {
        return this.targetHeight;
    }
    
    public void setTargetHeight(Integer targetHeight) {
        this.targetHeight = targetHeight;
    }

    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public Integer getReferenceAssetCount() {
        return this.referenceAssetCount;
    }
    
    public void setReferenceAssetCount(Integer referenceAssetCount) {
        this.referenceAssetCount = referenceAssetCount;
    }
}
