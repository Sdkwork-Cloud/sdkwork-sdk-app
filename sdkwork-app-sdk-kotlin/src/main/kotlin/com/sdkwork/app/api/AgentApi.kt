package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AgentApi(private val client: HttpClient) {

    /** Get agent */
    suspend fun get(agentId: String): PlusApiResultMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/$agentId")) as? PlusApiResultMapStringObject
    }

    /** Update agent */
    suspend fun update(agentId: String, body: UpdateRequest? = null): PlusApiResultMapStringObject? {
        return client.put(ApiPaths.appPath("/agents/$agentId"), body) as? PlusApiResultMapStringObject
    }

    /** Delete agent */
    suspend fun delete(agentId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/agents/$agentId")) as? PlusApiResultVoid
    }

    /** List agents */
    suspend fun list(params: Map<String, Any>? = null): PlusApiResultMapStringObject? {
        return client.get(ApiPaths.appPath("/agents"), params) as? PlusApiResultMapStringObject
    }

    /** Create agent */
    suspend fun create(body: CreateRequest? = null): PlusApiResultMapStringObject? {
        return client.post(ApiPaths.appPath("/agents"), body) as? PlusApiResultMapStringObject
    }

    /** List sessions */
    suspend fun listSessions(agentId: String): PlusApiResultListMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/$agentId/sessions")) as? PlusApiResultListMapStringObject
    }

    /** Create session */
    suspend fun createSession(agentId: String, body: CreateSessionRequest? = null): PlusApiResultMapStringObject? {
        return client.post(ApiPaths.appPath("/agents/$agentId/sessions"), body) as? PlusApiResultMapStringObject
    }

    /** Reset agent */
    suspend fun reset(agentId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/agents/$agentId/reset"), null) as? PlusApiResultVoid
    }

    /** List session messages */
    suspend fun listSessionMessages(sessionId: String): PlusApiResultListMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/sessions/$sessionId/messages")) as? PlusApiResultListMapStringObject
    }

    /** Send session message */
    suspend fun sendSessionMessage(sessionId: String, body: SendSessionMessageRequest? = null): PlusApiResultMapStringObject? {
        return client.post(ApiPaths.appPath("/agents/sessions/$sessionId/messages"), body) as? PlusApiResultMapStringObject
    }

    /** Clear session */
    suspend fun clearSession(sessionId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/agents/sessions/$sessionId/clear"), null) as? PlusApiResultVoid
    }

    /** Agent stats */
    suspend fun stats(agentId: String): PlusApiResultMapStringObject? {
        return client.get(ApiPaths.appPath("/agents/$agentId/stats")) as? PlusApiResultMapStringObject
    }

    /** Delete session */
    suspend fun deleteSession(sessionId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/agents/sessions/$sessionId")) as? PlusApiResultVoid
    }
}
