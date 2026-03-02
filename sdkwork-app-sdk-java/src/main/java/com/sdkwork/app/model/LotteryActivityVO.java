package com.sdkwork.app.model;

public class LotteryActivityVO {
    private String createdAt;
    private String updatedAt;
    private String id;
    private String title;
    private String coverImage;
    private String startTime;
    private String endTime;
    private Integer freeDrawCount;
    private Integer pointsCost;
    private List<PrizePreview> prizePreview;
    private Boolean canDraw;

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

    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverImage() {
        return this.coverImage;
    }
    
    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
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

    public Integer getFreeDrawCount() {
        return this.freeDrawCount;
    }
    
    public void setFreeDrawCount(Integer freeDrawCount) {
        this.freeDrawCount = freeDrawCount;
    }

    public Integer getPointsCost() {
        return this.pointsCost;
    }
    
    public void setPointsCost(Integer pointsCost) {
        this.pointsCost = pointsCost;
    }

    public List<PrizePreview> getPrizePreview() {
        return this.prizePreview;
    }
    
    public void setPrizePreview(List<PrizePreview> prizePreview) {
        this.prizePreview = prizePreview;
    }

    public Boolean getCanDraw() {
        return this.canDraw;
    }
    
    public void setCanDraw(Boolean canDraw) {
        this.canDraw = canDraw;
    }
}
