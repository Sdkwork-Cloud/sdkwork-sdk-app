package com.sdkwork.app.model;

public class ExperimentFeedbackForm {
    private String experimentKey;
    private String feedbackType;
    private String feedbackContent;
    private Integer rating;

    public String getExperimentKey() {
        return this.experimentKey;
    }
    
    public void setExperimentKey(String experimentKey) {
        this.experimentKey = experimentKey;
    }

    public String getFeedbackType() {
        return this.feedbackType;
    }
    
    public void setFeedbackType(String feedbackType) {
        this.feedbackType = feedbackType;
    }

    public String getFeedbackContent() {
        return this.feedbackContent;
    }
    
    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent;
    }

    public Integer getRating() {
        return this.rating;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
