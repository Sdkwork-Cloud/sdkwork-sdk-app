package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AgentMemoryApi {
    private final HttpClient client;
    
    public AgentMemoryApi(HttpClient client) {
        this.client = client;
    }

    /** List memories */
    public PlusApiResultListMapStringObject list(String agentId, Map<String, Object> params) throws Exception {
        return (PlusApiResultListMapStringObject) client.get(ApiPaths.appPath("/agents/" + agentId + "/memory"), params);
    }

    /** Create memory */
    public PlusApiResultMapStringObject create(String agentId, CreatePostRequest body) throws Exception {
        return (PlusApiResultMapStringObject) client.post(ApiPaths.appPath("/agents/" + agentId + "/memory"), body);
    }

    /** Summarize session */
    public PlusApiResultMapStringObject summarizeSession(String agentId, String sessionId) throws Exception {
        return (PlusApiResultMapStringObject) client.post(ApiPaths.appPath("/agents/" + agentId + "/memory/sessions/" + sessionId + "/summarize"), null);
    }

    /** List knowledge */
    public PlusApiResultListMapStringObject listKnowledge(String agentId) throws Exception {
        return (PlusApiResultListMapStringObject) client.get(ApiPaths.appPath("/agents/" + agentId + "/memory/knowledge"));
    }

    /** Create knowledge */
    public PlusApiResultMapStringObject createKnowledge(String agentId, CreateKnowledgeRequest body) throws Exception {
        return (PlusApiResultMapStringObject) client.post(ApiPaths.appPath("/agents/" + agentId + "/memory/knowledge"), body);
    }

    /** Consolidate memories */
    public PlusApiResultMapStringObject consolidate(String agentId) throws Exception {
        return (PlusApiResultMapStringObject) client.post(ApiPaths.appPath("/agents/" + agentId + "/memory/consolidate"), null);
    }

    /** Memory stats */
    public PlusApiResultMapStringObject stats(String agentId) throws Exception {
        return (PlusApiResultMapStringObject) client.get(ApiPaths.appPath("/agents/" + agentId + "/memory/stats"));
    }

    /** List session history */
    public PlusApiResultListMapStringObject listSessionHistory(String agentId, String sessionId, Map<String, Object> params) throws Exception {
        return (PlusApiResultListMapStringObject) client.get(ApiPaths.appPath("/agents/" + agentId + "/memory/sessions/" + sessionId + "/history"), params);
    }

    /** Search memories */
    public PlusApiResultListMapStringObject search(String agentId, Map<String, Object> params) throws Exception {
        return (PlusApiResultListMapStringObject) client.get(ApiPaths.appPath("/agents/" + agentId + "/memory/search"), params);
    }

    /** Get knowledge */
    public PlusApiResultMapStringObject getKnowledge(String agentId, String documentId) throws Exception {
        return (PlusApiResultMapStringObject) client.get(ApiPaths.appPath("/agents/" + agentId + "/memory/knowledge/" + documentId + ""));
    }

    /** Delete knowledge */
    public PlusApiResultMapStringObject deleteKnowledge(String agentId, String documentId) throws Exception {
        return (PlusApiResultMapStringObject) client.delete(ApiPaths.appPath("/agents/" + agentId + "/memory/knowledge/" + documentId + ""));
    }

    /** List knowledge chunks */
    public PlusApiResultListMapStringObject listKnowledgeChunks(String agentId, String documentId) throws Exception {
        return (PlusApiResultListMapStringObject) client.get(ApiPaths.appPath("/agents/" + agentId + "/memory/knowledge/" + documentId + "/chunks"));
    }

    /** Knowledge stats */
    public PlusApiResultMapStringObject knowledgeStats(String agentId) throws Exception {
        return (PlusApiResultMapStringObject) client.get(ApiPaths.appPath("/agents/" + agentId + "/memory/knowledge/stats"));
    }

    /** Search knowledge */
    public PlusApiResultListMapStringObject searchKnowledge(String agentId, Map<String, Object> params) throws Exception {
        return (PlusApiResultListMapStringObject) client.get(ApiPaths.appPath("/agents/" + agentId + "/memory/knowledge/search"), params);
    }

    /** Delete memory */
    public PlusApiResultMapStringObject delete(String agentId, String memoryId) throws Exception {
        return (PlusApiResultMapStringObject) client.delete(ApiPaths.appPath("/agents/" + agentId + "/memory/" + memoryId + ""));
    }

    /** Clear session memories */
    public PlusApiResultMapStringObject clearSession(String agentId, String sessionId) throws Exception {
        return (PlusApiResultMapStringObject) client.delete(ApiPaths.appPath("/agents/" + agentId + "/memory/sessions/" + sessionId + ""));
    }
}
