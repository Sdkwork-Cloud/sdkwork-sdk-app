package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class SocialApi {
    private final HttpClient client;
    
    public SocialApi(HttpClient client) {
        this.client = client;
    }

    /** 标记消息已读 */
    public PlusApiResultVoid markMessagesAsRead(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/social/messages/read"), null, params);
    }

    /** 发送私信 */
    public PlusApiResultPrivateMessageVO sendMessage(SendMessageForm body) throws Exception {
        return (PlusApiResultPrivateMessageVO) client.post(ApiPaths.appPath("/social/messages"), body);
    }

    /** 关注用户 */
    public PlusApiResultFollowVO followUser(String userId) throws Exception {
        return (PlusApiResultFollowVO) client.post(ApiPaths.appPath("/social/follow/" + userId + ""), null);
    }

    /** 取消关注 */
    public PlusApiResultVoid unfollowUser(String userId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/social/follow/" + userId + ""));
    }

    /** 批量检查关注状态 */
    public PlusApiResultListFollowCheckVO batchCheckFollowStatus(BatchFollowCheckForm body) throws Exception {
        return (PlusApiResultListFollowCheckVO) client.post(ApiPaths.appPath("/social/follow/check/batch"), body);
    }

    /** 拉黑用户 */
    public PlusApiResultVoid blockUser(String userId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/social/block/" + userId + ""), null);
    }

    /** 取消拉黑 */
    public PlusApiResultVoid unblockUser(String userId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/social/block/" + userId + ""));
    }

    /** 获取关注统计 */
    public PlusApiResultFollowStatsVO getFollowStats() throws Exception {
        return (PlusApiResultFollowStatsVO) client.get(ApiPaths.appPath("/social/stats"));
    }

    /** 获取未读消息数 */
    public PlusApiResultMessageUnreadCountVO getUnreadMessageCount() throws Exception {
        return (PlusApiResultMessageUnreadCountVO) client.get(ApiPaths.appPath("/social/messages/unread/count"));
    }

    /** 获取关注列表 */
    public PlusApiResultPageFollowUserVO getFollowingList(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageFollowUserVO) client.get(ApiPaths.appPath("/social/following"), params);
    }

    /** 获取粉丝列表 */
    public PlusApiResultPageFollowUserVO getFollowerList(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageFollowUserVO) client.get(ApiPaths.appPath("/social/followers"), params);
    }

    /** 检查关注状态 */
    public PlusApiResultFollowCheckVO checkFollowStatus(Map<String, Object> params) throws Exception {
        return (PlusApiResultFollowCheckVO) client.get(ApiPaths.appPath("/social/follow/check"), params);
    }

    /** 获取会话列表 */
    public PlusApiResultPageConversationVO getConversations(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageConversationVO) client.get(ApiPaths.appPath("/social/conversations"), params);
    }

    /** 获取会话消息 */
    public PlusApiResultPagePrivateMessageVO getConversationMessages(String userId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePrivateMessageVO) client.get(ApiPaths.appPath("/social/conversations/" + userId + "/messages"), params);
    }

    /** 获取黑名单 */
    public PlusApiResultPageBlockedUserVO getBlockedUsers(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageBlockedUserVO) client.get(ApiPaths.appPath("/social/blocks"), params);
    }

    /** 检查黑名单状态 */
    public PlusApiResultBlockCheckVO checkBlockStatus(Map<String, Object> params) throws Exception {
        return (PlusApiResultBlockCheckVO) client.get(ApiPaths.appPath("/social/block/check"), params);
    }

    /** 删除会话 */
    public PlusApiResultVoid deleteConversation(String userId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/social/conversations/" + userId + ""));
    }
}
