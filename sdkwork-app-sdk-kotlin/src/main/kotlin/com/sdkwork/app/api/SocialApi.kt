package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class SocialApi(private val client: HttpClient) {

    /** 标记消息已读 */
    suspend fun markMessagesAsRead(params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/social/messages/read"), null, params) as? PlusApiResultVoid
    }

    /** 处理好友申请 */
    suspend fun processFriendRequest(requestId: String, body: FriendRequestProcessForm): PlusApiResultFriendRequestVO? {
        return client.put(ApiPaths.appPath("/social/friend-requests/$requestId/process"), body) as? PlusApiResultFriendRequestVO
    }

    /** 更新联系人分组 */
    suspend fun updateContactGroup(groupId: String, body: ContactGroupUpdateForm): PlusApiResultContactGroupVO? {
        return client.put(ApiPaths.appPath("/social/contact-groups/$groupId"), body) as? PlusApiResultContactGroupVO
    }

    /** 删除联系人分组 */
    suspend fun deleteContactGroup(groupId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/social/contact-groups/$groupId")) as? PlusApiResultVoid
    }

    /** 发送私信 */
    suspend fun sendMessage(body: SendMessageForm): PlusApiResultPrivateMessageVO? {
        return client.post(ApiPaths.appPath("/social/messages"), body) as? PlusApiResultPrivateMessageVO
    }

    /** 获取好友申请列表 */
    suspend fun listFriendRequests(): PlusApiResultListFriendRequestVO? {
        return client.get(ApiPaths.appPath("/social/friend-requests")) as? PlusApiResultListFriendRequestVO
    }

    /** 发送好友申请 */
    suspend fun sendFriendRequest(body: FriendRequestCreateForm): PlusApiResultFriendRequestVO? {
        return client.post(ApiPaths.appPath("/social/friend-requests"), body) as? PlusApiResultFriendRequestVO
    }

    /** 关注用户 */
    suspend fun followUser(userId: String): PlusApiResultFollowVO? {
        return client.post(ApiPaths.appPath("/social/follow/$userId"), null) as? PlusApiResultFollowVO
    }

    /** 取消关注 */
    suspend fun unfollowUser(userId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/social/follow/$userId")) as? PlusApiResultVoid
    }

    /** 批量检查关注状态 */
    suspend fun batchCheckFollowStatus(body: BatchFollowCheckForm): PlusApiResultListFollowCheckVO? {
        return client.post(ApiPaths.appPath("/social/follow/check/batch"), body) as? PlusApiResultListFollowCheckVO
    }

    /** 获取联系人分组 */
    suspend fun listContactGroups(): PlusApiResultListContactGroupVO? {
        return client.get(ApiPaths.appPath("/social/contact-groups")) as? PlusApiResultListContactGroupVO
    }

    /** 创建联系人分组 */
    suspend fun createContactGroup(body: ContactGroupCreateForm): PlusApiResultContactGroupVO? {
        return client.post(ApiPaths.appPath("/social/contact-groups"), body) as? PlusApiResultContactGroupVO
    }

    /** 拉黑用户 */
    suspend fun blockUser(userId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/social/block/$userId"), null) as? PlusApiResultVoid
    }

    /** 取消拉黑 */
    suspend fun unblockUser(userId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/social/block/$userId")) as? PlusApiResultVoid
    }

    /** 更新好友备注 */
    suspend fun updateFriendRemark(contactId: String, body: FriendRemarkUpdateForm): PlusApiResultVoid? {
        return client.patch(ApiPaths.appPath("/social/contacts/$contactId/remark"), body) as? PlusApiResultVoid
    }

    /** 获取关注统计 */
    suspend fun getFollowStats(): PlusApiResultFollowStatsVO? {
        return client.get(ApiPaths.appPath("/social/stats")) as? PlusApiResultFollowStatsVO
    }

    /** 获取未读消息数 */
    suspend fun getUnreadMessageCount(): PlusApiResultMessageUnreadCountVO? {
        return client.get(ApiPaths.appPath("/social/messages/unread/count")) as? PlusApiResultMessageUnreadCountVO
    }

    /** 获取关注列表 */
    suspend fun getFollowingList(params: Map<String, Any>? = null): PlusApiResultPageFollowUserVO? {
        return client.get(ApiPaths.appPath("/social/following"), params) as? PlusApiResultPageFollowUserVO
    }

    /** 获取粉丝列表 */
    suspend fun getFollowerList(params: Map<String, Any>? = null): PlusApiResultPageFollowUserVO? {
        return client.get(ApiPaths.appPath("/social/followers"), params) as? PlusApiResultPageFollowUserVO
    }

    /** 检查关注状态 */
    suspend fun checkFollowStatus(params: Map<String, Any>? = null): PlusApiResultFollowCheckVO? {
        return client.get(ApiPaths.appPath("/social/follow/check"), params) as? PlusApiResultFollowCheckVO
    }

    /** 获取会话列表 */
    suspend fun getConversations(params: Map<String, Any>? = null): PlusApiResultPageConversationVO? {
        return client.get(ApiPaths.appPath("/social/conversations"), params) as? PlusApiResultPageConversationVO
    }

    /** 获取会话消息 */
    suspend fun getConversationMessages(userId: String, params: Map<String, Any>? = null): PlusApiResultPagePrivateMessageVO? {
        return client.get(ApiPaths.appPath("/social/conversations/$userId/messages"), params) as? PlusApiResultPagePrivateMessageVO
    }

    /** 获取联系人列表 */
    suspend fun listContacts(params: Map<String, Any>? = null): PlusApiResultListContactFriendVO? {
        return client.get(ApiPaths.appPath("/social/contacts"), params) as? PlusApiResultListContactFriendVO
    }

    /** 获取联系人详情 */
    suspend fun getContactDetail(contactId: String): PlusApiResultContactFriendVO? {
        return client.get(ApiPaths.appPath("/social/contacts/$contactId")) as? PlusApiResultContactFriendVO
    }

    /** 删除联系人 */
    suspend fun deleteContact(contactId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/social/contacts/$contactId")) as? PlusApiResultVoid
    }

    /** 获取联系人统计 */
    suspend fun getContactStats(): PlusApiResultContactStatsVO? {
        return client.get(ApiPaths.appPath("/social/contacts/stats")) as? PlusApiResultContactStatsVO
    }

    /** 获取黑名单 */
    suspend fun getBlockedUsers(params: Map<String, Any>? = null): PlusApiResultPageBlockedUserVO? {
        return client.get(ApiPaths.appPath("/social/blocks"), params) as? PlusApiResultPageBlockedUserVO
    }

    /** 检查黑名单状态 */
    suspend fun checkBlockStatus(params: Map<String, Any>? = null): PlusApiResultBlockCheckVO? {
        return client.get(ApiPaths.appPath("/social/block/check"), params) as? PlusApiResultBlockCheckVO
    }

    /** 删除会话 */
    suspend fun deleteConversation(userId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/social/conversations/$userId")) as? PlusApiResultVoid
    }
}
