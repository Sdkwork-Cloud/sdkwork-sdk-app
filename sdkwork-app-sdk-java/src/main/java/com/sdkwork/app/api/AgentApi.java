package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AgentApi {
    private final HttpClient client;
    
    public AgentApi(HttpClient client) {
        this.client = client;
    }

    /** Get agent */
    public PlusApiResultMapStringObject get(String agentId) throws Exception {
        return (PlusApiResultMapStringObject) client.get(ApiPaths.appPath("/agents/" + agentId + ""));
    }

    /** Update agent */
    public PlusApiResultMapStringObject update(String agentId, UpdateRequest body) throws Exception {
        return (PlusApiResultMapStringObject) client.put(ApiPaths.appPath("/agents/" + agentId + ""), body);
    }

    /** Delete agent */
    public PlusApiResultVoid delete(String agentId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/agents/" + agentId + ""));
    }

    /** List agents */
    public PlusApiResultMapStringObject list(Map<String, Object> params) throws Exception {
        return (PlusApiResultMapStringObject) client.get(ApiPaths.appPath("/agents"), params);
    }

    /** Create agent */
    public PlusApiResultMapStringObject create(CreateRequest body) throws Exception {
        return (PlusApiResultMapStringObject) client.post(ApiPaths.appPath("/agents"), body);
    }

    /** List sessions */
    public PlusApiResultListMapStringObject listSessions(String agentId) throws Exception {
        return (PlusApiResultListMapStringObject) client.get(ApiPaths.appPath("/agents/" + agentId + "/sessions"));
    }

    /** Create session */
    public PlusApiResultMapStringObject createSession(String agentId, CreateSessionRequest body) throws Exception {
        return (PlusApiResultMapStringObject) client.post(ApiPaths.appPath("/agents/" + agentId + "/sessions"), body);
    }

    /** Reset agent */
    public PlusApiResultVoid reset(String agentId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/agents/" + agentId + "/reset"), null);
    }

    /** List session messages */
    public PlusApiResultListMapStringObject listSessionMessages(String sessionId) throws Exception {
        return (PlusApiResultListMapStringObject) client.get(ApiPaths.appPath("/agents/sessions/" + sessionId + "/messages"));
    }

    /** Send session message */
    public PlusApiResultMapStringObject sendSessionMessage(String sessionId, SendSessionMessageRequest body) throws Exception {
        return (PlusApiResultMapStringObject) client.post(ApiPaths.appPath("/agents/sessions/" + sessionId + "/messages"), body);
    }

    /** Clear session */
    public PlusApiResultVoid clearSession(String sessionId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/agents/sessions/" + sessionId + "/clear"), null);
    }

    /** Agent stats */
    public PlusApiResultMapStringObject stats(String agentId) throws Exception {
        return (PlusApiResultMapStringObject) client.get(ApiPaths.appPath("/agents/" + agentId + "/stats"));
    }

    /** Delete session */
    public PlusApiResultVoid deleteSession(String sessionId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/agents/sessions/" + sessionId + ""));
    }
}
