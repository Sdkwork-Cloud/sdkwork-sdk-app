import Foundation

public class SocialApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 标记消息已读
    public func markMessagesAsRead(params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/social/messages/read"), body: nil, params: params)
        return response as? PlusApiResultVoid
    }

    /// 发送私信
    public func sendMessage(body: SendMessageForm) async throws -> PlusApiResultPrivateMessageVO? {
        let response = try await client.post(ApiPaths.appPath("/social/messages"), body: body)
        return response as? PlusApiResultPrivateMessageVO
    }

    /// 关注用户
    public func followUser(userId: String) async throws -> PlusApiResultFollowVO? {
        let response = try await client.post(ApiPaths.appPath("/social/follow/\(userId)"), body: nil)
        return response as? PlusApiResultFollowVO
    }

    /// 取消关注
    public func unfollowUser(userId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/social/follow/\(userId)"))
        return response as? PlusApiResultVoid
    }

    /// 批量检查关注状态
    public func batchCheckFollowStatus(body: BatchFollowCheckForm) async throws -> PlusApiResultListFollowCheckVO? {
        let response = try await client.post(ApiPaths.appPath("/social/follow/check/batch"), body: body)
        return response as? PlusApiResultListFollowCheckVO
    }

    /// 拉黑用户
    public func blockUser(userId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/social/block/\(userId)"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 取消拉黑
    public func unblockUser(userId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/social/block/\(userId)"))
        return response as? PlusApiResultVoid
    }

    /// 获取关注统计
    public func getFollowStats() async throws -> PlusApiResultFollowStatsVO? {
        let response = try await client.get(ApiPaths.appPath("/social/stats"))
        return response as? PlusApiResultFollowStatsVO
    }

    /// 获取未读消息数
    public func getUnreadMessageCount() async throws -> PlusApiResultMessageUnreadCountVO? {
        let response = try await client.get(ApiPaths.appPath("/social/messages/unread/count"))
        return response as? PlusApiResultMessageUnreadCountVO
    }

    /// 获取关注列表
    public func getFollowingList(params: [String: Any]? = nil) async throws -> PlusApiResultPageFollowUserVO? {
        let response = try await client.get(ApiPaths.appPath("/social/following"), params: params)
        return response as? PlusApiResultPageFollowUserVO
    }

    /// 获取粉丝列表
    public func getFollowerList(params: [String: Any]? = nil) async throws -> PlusApiResultPageFollowUserVO? {
        let response = try await client.get(ApiPaths.appPath("/social/followers"), params: params)
        return response as? PlusApiResultPageFollowUserVO
    }

    /// 检查关注状态
    public func checkFollowStatus(params: [String: Any]? = nil) async throws -> PlusApiResultFollowCheckVO? {
        let response = try await client.get(ApiPaths.appPath("/social/follow/check"), params: params)
        return response as? PlusApiResultFollowCheckVO
    }

    /// 获取会话列表
    public func getConversations(params: [String: Any]? = nil) async throws -> PlusApiResultPageConversationVO? {
        let response = try await client.get(ApiPaths.appPath("/social/conversations"), params: params)
        return response as? PlusApiResultPageConversationVO
    }

    /// 获取会话消息
    public func getConversationMessages(userId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPagePrivateMessageVO? {
        let response = try await client.get(ApiPaths.appPath("/social/conversations/\(userId)/messages"), params: params)
        return response as? PlusApiResultPagePrivateMessageVO
    }

    /// 获取黑名单
    public func getBlockedUsers(params: [String: Any]? = nil) async throws -> PlusApiResultPageBlockedUserVO? {
        let response = try await client.get(ApiPaths.appPath("/social/blocks"), params: params)
        return response as? PlusApiResultPageBlockedUserVO
    }

    /// 检查黑名单状态
    public func checkBlockStatus(params: [String: Any]? = nil) async throws -> PlusApiResultBlockCheckVO? {
        let response = try await client.get(ApiPaths.appPath("/social/block/check"), params: params)
        return response as? PlusApiResultBlockCheckVO
    }

    /// 删除会话
    public func deleteConversation(userId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/social/conversations/\(userId)"))
        return response as? PlusApiResultVoid
    }
}
