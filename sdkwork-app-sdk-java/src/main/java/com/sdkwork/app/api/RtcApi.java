package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class RtcApi {
    private final HttpClient client;
    
    public RtcApi(HttpClient client) {
        this.client = client;
    }

    /** Create RTC room */
    public PlusApiResultMapStringObject createRoom(CreateRoomRequest body) throws Exception {
        return (PlusApiResultMapStringObject) client.post(ApiPaths.appPath("/rtc/rooms"), body);
    }

    /** Create RTC room token */
    public PlusApiResultMapStringObject createRoomToken(String roomId) throws Exception {
        return (PlusApiResultMapStringObject) client.post(ApiPaths.appPath("/rtc/rooms/" + roomId + "/token"), null);
    }

    /** End RTC room */
    public PlusApiResultVoid endRoom(String roomId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/rtc/rooms/" + roomId + "/end"), null);
    }

    /** Get RTC room */
    public PlusApiResultMapStringObject getRoom(String roomId) throws Exception {
        return (PlusApiResultMapStringObject) client.get(ApiPaths.appPath("/rtc/rooms/" + roomId + ""));
    }

    /** List RTC records */
    public PlusApiResultListMapStringObject listRecords(Map<String, Object> params) throws Exception {
        return (PlusApiResultListMapStringObject) client.get(ApiPaths.appPath("/rtc/records"), params);
    }
}
