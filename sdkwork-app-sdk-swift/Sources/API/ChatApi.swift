import Foundation

public class ChatApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取会话详情
    public func getSessionDetail(sessionId: String) async throws -> PlusApiResultChatSessionDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/chat/sessions/\(sessionId)"))
        return response as? PlusApiResultChatSessionDetailVO
    }

    /// 更新会话
    public func updateSession(sessionId: String, body: ChatSessionUpdateForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/chat/sessions/\(sessionId)"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 删除会话
    public func deleteSession(sessionId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/chat/sessions/\(sessionId)"))
        return response as? PlusApiResultVoid
    }

    /// 获取会话列表
    public func listSessions(params: [String: Any]? = nil) async throws -> PlusApiResultPageChatSessionVO? {
        let response = try await client.get(ApiPaths.appPath("/chat/sessions"), params: params)
        return response as? PlusApiResultPageChatSessionVO
    }

    /// 创建对话会话
    public func createSession(body: ChatSessionCreateForm) async throws -> PlusApiResultChatSessionVO? {
        let response = try await client.post(ApiPaths.appPath("/chat/sessions"), body: body)
        return response as? PlusApiResultChatSessionVO
    }

    /// 停止生成
    public func stopGeneration(sessionId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/chat/sessions/\(sessionId)/stop"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 获取消息历史
    public func getMessageHistory(sessionId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPageChatMessageVO? {
        let response = try await client.get(ApiPaths.appPath("/chat/sessions/\(sessionId)/messages"), params: params)
        return response as? PlusApiResultPageChatMessageVO
    }

    /// 发送消息
    public func sendMessage(sessionId: String, body: ChatMessageSendForm) async throws -> PlusApiResultChatMessageVO? {
        let response = try await client.post(ApiPaths.appPath("/chat/sessions/\(sessionId)/messages"), body: body)
        return response as? PlusApiResultChatMessageVO
    }

    /// 重新生成
    public func regenerateMessage(sessionId: String, messageId: String) async throws -> PlusApiResultChatMessageVO? {
        let response = try await client.post(ApiPaths.appPath("/chat/sessions/\(sessionId)/messages/\(messageId)/regenerate"), body: nil)
        return response as? PlusApiResultChatMessageVO
    }

    /// 收藏消息
    public func favoriteMessage(sessionId: String, messageId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/chat/sessions/\(sessionId)/messages/\(messageId)/favorite"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消收藏消息
    public func unfavoriteMessage(sessionId: String, messageId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/chat/sessions/\(sessionId)/messages/\(messageId)/favorite"))
        return response as? PlusApiResultVoid
    }

    /// 流式发送消息
    public func sendMessageStream(sessionId: String, body: ChatMessageSendForm) async throws -> Void {
        _ = try await client.post(ApiPaths.appPath("/chat/sessions/\(sessionId)/messages/stream"), body: body)
    }

    /// 导出对话
    public func exportConversation(sessionId: String, body: ChatExportForm) async throws -> PlusApiResultExportVO? {
        let response = try await client.post(ApiPaths.appPath("/chat/sessions/\(sessionId)/export"), body: body)
        return response as? PlusApiResultExportVO
    }

    /// 复制对话
    public func copySession(sessionId: String) async throws -> PlusApiResultChatSessionVO? {
        let response = try await client.post(ApiPaths.appPath("/chat/sessions/\(sessionId)/copy"), body: nil)
        return response as? PlusApiResultChatSessionVO
    }
}
