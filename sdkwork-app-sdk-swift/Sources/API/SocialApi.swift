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

    /// 处理好友申请
    public func processFriendRequest(requestId: String, body: FriendRequestProcessForm) async throws -> PlusApiResultFriendRequestVO? {
        let response = try await client.put(ApiPaths.appPath("/social/friend-requests/\(requestId)/process"), body: body)
        return response as? PlusApiResultFriendRequestVO
    }

    /// 更新联系人分组
    public func updateContactGroup(groupId: String, body: ContactGroupUpdateForm) async throws -> PlusApiResultContactGroupVO? {
        let response = try await client.put(ApiPaths.appPath("/social/contact-groups/\(groupId)"), body: body)
        return response as? PlusApiResultContactGroupVO
    }

    /// 删除联系人分组
    public func deleteContactGroup(groupId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/social/contact-groups/\(groupId)"))
        return response as? PlusApiResultVoid
    }

    /// 发送私信
    public func sendMessage(body: SendMessageForm) async throws -> PlusApiResultPrivateMessageVO? {
        let response = try await client.post(ApiPaths.appPath("/social/messages"), body: body)
        return response as? PlusApiResultPrivateMessageVO
    }

    /// 获取好友申请列表
    public func listFriendRequests() async throws -> PlusApiResultListFriendRequestVO? {
        let response = try await client.get(ApiPaths.appPath("/social/friend-requests"))
        return response as? PlusApiResultListFriendRequestVO
    }

    /// 发送好友申请
    public func sendFriendRequest(body: FriendRequestCreateForm) async throws -> PlusApiResultFriendRequestVO? {
        let response = try await client.post(ApiPaths.appPath("/social/friend-requests"), body: body)
        return response as? PlusApiResultFriendRequestVO
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

    /// 获取联系人分组
    public func listContactGroups() async throws -> PlusApiResultListContactGroupVO? {
        let response = try await client.get(ApiPaths.appPath("/social/contact-groups"))
        return response as? PlusApiResultListContactGroupVO
    }

    /// 创建联系人分组
    public func createContactGroup(body: ContactGroupCreateForm) async throws -> PlusApiResultContactGroupVO? {
        let response = try await client.post(ApiPaths.appPath("/social/contact-groups"), body: body)
        return response as? PlusApiResultContactGroupVO
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

    /// 更新好友备注
    public func updateFriendRemark(contactId: String, body: FriendRemarkUpdateForm) async throws -> PlusApiResultVoid? {
        let response = try await client.patch(ApiPaths.appPath("/social/contacts/\(contactId)/remark"), body: body)
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

    /// 获取联系人列表
    public func listContacts(params: [String: Any]? = nil) async throws -> PlusApiResultListContactFriendVO? {
        let response = try await client.get(ApiPaths.appPath("/social/contacts"), params: params)
        return response as? PlusApiResultListContactFriendVO
    }

    /// 获取联系人详情
    public func getContactDetail(contactId: String) async throws -> PlusApiResultContactFriendVO? {
        let response = try await client.get(ApiPaths.appPath("/social/contacts/\(contactId)"))
        return response as? PlusApiResultContactFriendVO
    }

    /// 删除联系人
    public func deleteContact(contactId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/social/contacts/\(contactId)"))
        return response as? PlusApiResultVoid
    }

    /// 获取联系人统计
    public func getContactStats() async throws -> PlusApiResultContactStatsVO? {
        let response = try await client.get(ApiPaths.appPath("/social/contacts/stats"))
        return response as? PlusApiResultContactStatsVO
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
