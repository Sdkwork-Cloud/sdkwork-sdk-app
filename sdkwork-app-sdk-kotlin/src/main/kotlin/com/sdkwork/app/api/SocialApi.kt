package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class SocialApi(private val client: HttpClient) {

    /** 标记消息已读 */
    suspend fun markMessagesAsRead(params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/social/messages/read"), null, params) as? PlusApiResultVoid
    }

    /** 发送私信 */
    suspend fun sendMessage(body: SendMessageForm): PlusApiResultPrivateMessageVO? {
        return client.post(ApiPaths.appPath("/social/messages"), body) as? PlusApiResultPrivateMessageVO
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

    /** 拉黑用户 */
    suspend fun blockUser(userId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/social/block/$userId"), null) as? PlusApiResultVoid
    }

    /** 取消拉黑 */
    suspend fun unblockUser(userId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/social/block/$userId")) as? PlusApiResultVoid
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
