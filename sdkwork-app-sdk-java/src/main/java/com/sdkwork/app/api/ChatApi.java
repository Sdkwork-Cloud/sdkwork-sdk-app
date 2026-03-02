package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ChatApi {
    private final HttpClient client;
    
    public ChatApi(HttpClient client) {
        this.client = client;
    }

    /** 获取会话详情 */
    public PlusApiResultChatSessionDetailVO getSessionDetail(String sessionId) throws Exception {
        return (PlusApiResultChatSessionDetailVO) client.get(ApiPaths.appPath("/chat/sessions/" + sessionId + ""));
    }

    /** 更新会话 */
    public PlusApiResultVoid updateSession(String sessionId, ChatSessionUpdateForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/chat/sessions/" + sessionId + ""), body);
    }

    /** 删除会话 */
    public PlusApiResultVoid deleteSession(String sessionId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/chat/sessions/" + sessionId + ""));
    }

    /** 获取会话列表 */
    public PlusApiResultPageChatSessionVO listSessions(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageChatSessionVO) client.get(ApiPaths.appPath("/chat/sessions"), params);
    }

    /** 创建对话会话 */
    public PlusApiResultChatSessionVO createSession(ChatSessionCreateForm body) throws Exception {
        return (PlusApiResultChatSessionVO) client.post(ApiPaths.appPath("/chat/sessions"), body);
    }

    /** 停止生成 */
    public PlusApiResultVoid stopGeneration(String sessionId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/chat/sessions/" + sessionId + "/stop"), null);
    }

    /** 获取消息历史 */
    public PlusApiResultPageChatMessageVO getMessageHistory(String sessionId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageChatMessageVO) client.get(ApiPaths.appPath("/chat/sessions/" + sessionId + "/messages"), params);
    }

    /** 发送消息 */
    public PlusApiResultChatMessageVO sendMessage(String sessionId, ChatMessageSendForm body) throws Exception {
        return (PlusApiResultChatMessageVO) client.post(ApiPaths.appPath("/chat/sessions/" + sessionId + "/messages"), body);
    }

    /** 重新生成 */
    public PlusApiResultChatMessageVO regenerateMessage(String sessionId, String messageId) throws Exception {
        return (PlusApiResultChatMessageVO) client.post(ApiPaths.appPath("/chat/sessions/" + sessionId + "/messages/" + messageId + "/regenerate"), null);
    }

    /** 收藏消息 */
    public PlusApiResultVoid favoriteMessage(String sessionId, String messageId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/chat/sessions/" + sessionId + "/messages/" + messageId + "/favorite"), null);
    }

    /** 取消收藏消息 */
    public PlusApiResultVoid unfavoriteMessage(String sessionId, String messageId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/chat/sessions/" + sessionId + "/messages/" + messageId + "/favorite"));
    }

    /** 流式发送消息 */
    public Void sendMessageStream(String sessionId, ChatMessageSendForm body) throws Exception {
        client.post(ApiPaths.appPath("/chat/sessions/" + sessionId + "/messages/stream"), body);
        return null;
    }

    /** 导出对话 */
    public PlusApiResultExportVO exportConversation(String sessionId, ChatExportForm body) throws Exception {
        return (PlusApiResultExportVO) client.post(ApiPaths.appPath("/chat/sessions/" + sessionId + "/export"), body);
    }

    /** 复制对话 */
    public PlusApiResultChatSessionVO copySession(String sessionId) throws Exception {
        return (PlusApiResultChatSessionVO) client.post(ApiPaths.appPath("/chat/sessions/" + sessionId + "/copy"), null);
    }
}
