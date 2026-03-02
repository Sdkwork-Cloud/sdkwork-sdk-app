package com.sdkwork.app.model;

public class RealtimeAuditForm {
    private String streamId;
    private String streamUrl;
    private String streamType;
    private String roomId;
    private String publisherId;
    private List<String> checkTypes;
    private String callbackUrl;
    private Boolean checkAudio;
    private Boolean checkVideo;

    public String getStreamId() {
        return this.streamId;
    }
    
    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public String getStreamUrl() {
        return this.streamUrl;
    }
    
    public void setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    public String getStreamType() {
        return this.streamType;
    }
    
    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    public String getRoomId() {
        return this.roomId;
    }
    
    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getPublisherId() {
        return this.publisherId;
    }
    
    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public List<String> getCheckTypes() {
        return this.checkTypes;
    }
    
    public void setCheckTypes(List<String> checkTypes) {
        this.checkTypes = checkTypes;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public Boolean getCheckAudio() {
        return this.checkAudio;
    }
    
    public void setCheckAudio(Boolean checkAudio) {
        this.checkAudio = checkAudio;
    }

    public Boolean getCheckVideo() {
        return this.checkVideo;
    }
    
    public void setCheckVideo(Boolean checkVideo) {
        this.checkVideo = checkVideo;
    }
}
