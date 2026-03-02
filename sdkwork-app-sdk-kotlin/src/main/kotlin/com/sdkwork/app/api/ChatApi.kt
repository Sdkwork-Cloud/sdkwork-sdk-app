package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ChatApi(private val client: HttpClient) {

    /** 获取会话详情 */
    suspend fun getSessionDetail(sessionId: String): PlusApiResultChatSessionDetailVO? {
        return client.get(ApiPaths.appPath("/chat/sessions/$sessionId")) as? PlusApiResultChatSessionDetailVO
    }

    /** 更新会话 */
    suspend fun updateSession(sessionId: String, body: ChatSessionUpdateForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/chat/sessions/$sessionId"), body) as? PlusApiResultVoid
    }

    /** 删除会话 */
    suspend fun deleteSession(sessionId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/chat/sessions/$sessionId")) as? PlusApiResultVoid
    }

    /** 获取会话列表 */
    suspend fun listSessions(params: Map<String, Any>? = null): PlusApiResultPageChatSessionVO? {
        return client.get(ApiPaths.appPath("/chat/sessions"), params) as? PlusApiResultPageChatSessionVO
    }

    /** 创建对话会话 */
    suspend fun createSession(body: ChatSessionCreateForm): PlusApiResultChatSessionVO? {
        return client.post(ApiPaths.appPath("/chat/sessions"), body) as? PlusApiResultChatSessionVO
    }

    /** 停止生成 */
    suspend fun stopGeneration(sessionId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/chat/sessions/$sessionId/stop"), null) as? PlusApiResultVoid
    }

    /** 获取消息历史 */
    suspend fun getMessageHistory(sessionId: String, params: Map<String, Any>? = null): PlusApiResultPageChatMessageVO? {
        return client.get(ApiPaths.appPath("/chat/sessions/$sessionId/messages"), params) as? PlusApiResultPageChatMessageVO
    }

    /** 发送消息 */
    suspend fun sendMessage(sessionId: String, body: ChatMessageSendForm): PlusApiResultChatMessageVO? {
        return client.post(ApiPaths.appPath("/chat/sessions/$sessionId/messages"), body) as? PlusApiResultChatMessageVO
    }

    /** 重新生成 */
    suspend fun regenerateMessage(sessionId: String, messageId: String): PlusApiResultChatMessageVO? {
        return client.post(ApiPaths.appPath("/chat/sessions/$sessionId/messages/$messageId/regenerate"), null) as? PlusApiResultChatMessageVO
    }

    /** 收藏消息 */
    suspend fun favoriteMessage(sessionId: String, messageId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/chat/sessions/$sessionId/messages/$messageId/favorite"), null) as? PlusApiResultVoid
    }

    /** 取消收藏消息 */
    suspend fun unfavoriteMessage(sessionId: String, messageId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/chat/sessions/$sessionId/messages/$messageId/favorite")) as? PlusApiResultVoid
    }

    /** 流式发送消息 */
    suspend fun sendMessageStream(sessionId: String, body: ChatMessageSendForm): Unit {
        client.post(ApiPaths.appPath("/chat/sessions/$sessionId/messages/stream"), body)
    }

    /** 导出对话 */
    suspend fun exportConversation(sessionId: String, body: ChatExportForm): PlusApiResultExportVO? {
        return client.post(ApiPaths.appPath("/chat/sessions/$sessionId/export"), body) as? PlusApiResultExportVO
    }

    /** 复制对话 */
    suspend fun copySession(sessionId: String): PlusApiResultChatSessionVO? {
        return client.post(ApiPaths.appPath("/chat/sessions/$sessionId/copy"), null) as? PlusApiResultChatSessionVO
    }
}
