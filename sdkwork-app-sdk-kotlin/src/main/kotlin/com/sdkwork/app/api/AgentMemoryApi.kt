package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AgentMemoryApi(private val client: HttpClient) {

    /** List memories */
    suspend fun list(agentId: String, params: Map<String, Any>? = null): PlusApiResultListMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/$agentId/memory"), params) as? PlusApiResultListMapStringObject
    }

    /** Create memory */
    suspend fun create(agentId: String, body: CreatePostRequest? = null): PlusApiResultMapStringObject? {
        return client.post(ApiPaths.appPath("/agents/$agentId/memory"), body) as? PlusApiResultMapStringObject
    }

    /** Summarize session */
    suspend fun summarizeSession(agentId: String, sessionId: String): PlusApiResultMapStringObject? {
        return client.post(ApiPaths.appPath("/agents/$agentId/memory/sessions/$sessionId/summarize"), null) as? PlusApiResultMapStringObject
    }

    /** List knowledge */
    suspend fun listKnowledge(agentId: String): PlusApiResultListMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/$agentId/memory/knowledge")) as? PlusApiResultListMapStringObject
    }

    /** Create knowledge */
    suspend fun createKnowledge(agentId: String, body: CreateKnowledgeRequest? = null): PlusApiResultMapStringObject? {
        return client.post(ApiPaths.appPath("/agents/$agentId/memory/knowledge"), body) as? PlusApiResultMapStringObject
    }

    /** Consolidate memories */
    suspend fun consolidate(agentId: String): PlusApiResultMapStringObject? {
        return client.post(ApiPaths.appPath("/agents/$agentId/memory/consolidate"), null) as? PlusApiResultMapStringObject
    }

    /** Memory stats */
    suspend fun stats(agentId: String): PlusApiResultMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/$agentId/memory/stats")) as? PlusApiResultMapStringObject
    }

    /** List session history */
    suspend fun listSessionHistory(agentId: String, sessionId: String, params: Map<String, Any>? = null): PlusApiResultListMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/$agentId/memory/sessions/$sessionId/history"), params) as? PlusApiResultListMapStringObject
    }

    /** Search memories */
    suspend fun search(agentId: String, params: Map<String, Any>? = null): PlusApiResultListMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/$agentId/memory/search"), params) as? PlusApiResultListMapStringObject
    }

    /** Get knowledge */
    suspend fun getKnowledge(agentId: String, documentId: String): PlusApiResultMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/$agentId/memory/knowledge/$documentId")) as? PlusApiResultMapStringObject
    }

    /** Delete knowledge */
    suspend fun deleteKnowledge(agentId: String, documentId: String): PlusApiResultMapStringObject? {
        return client.delete(ApiPaths.appPath("/agents/$agentId/memory/knowledge/$documentId")) as? PlusApiResultMapStringObject
    }

    /** List knowledge chunks */
    suspend fun listKnowledgeChunks(agentId: String, documentId: String): PlusApiResultListMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/$agentId/memory/knowledge/$documentId/chunks")) as? PlusApiResultListMapStringObject
    }

    /** Knowledge stats */
    suspend fun knowledgeStats(agentId: String): PlusApiResultMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/$agentId/memory/knowledge/stats")) as? PlusApiResultMapStringObject
    }

    /** Search knowledge */
    suspend fun searchKnowledge(agentId: String, params: Map<String, Any>? = null): PlusApiResultListMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/$agentId/memory/knowledge/search"), params) as? PlusApiResultListMapStringObject
    }

    /** Delete memory */
    suspend fun delete(agentId: String, memoryId: String): PlusApiResultMapStringObject? {
        return client.delete(ApiPaths.appPath("/agents/$agentId/memory/$memoryId")) as? PlusApiResultMapStringObject
    }

    /** Clear session memories */
    suspend fun clearSession(agentId: String, sessionId: String): PlusApiResultMapStringObject? {
        return client.delete(ApiPaths.appPath("/agents/$agentId/memory/sessions/$sessionId")) as? PlusApiResultMapStringObject
    }
}
