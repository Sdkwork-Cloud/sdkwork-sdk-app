package com.sdkwork.app.model;

public class ExperimentEventForm {
    private String experimentKey;
    private String eventType;
    private Object eventData;

    public String getExperimentKey() {
        return this.experimentKey;
    }
    
    public void setExperimentKey(String experimentKey) {
        this.experimentKey = experimentKey;
    }

    public String getEventType() {
        return this.eventType;
    }
    
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Object getEventData() {
        return this.eventData;
    }
    
    public void setEventData(Object eventData) {
        this.eventData = eventData;
    }
}
