package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type SocialApi struct {
    client *sdkhttp.Client
}

func NewSocialApi(client *sdkhttp.Client) *SocialApi {
    return &SocialApi{client: client}
}

// 标记消息已读
func (a *SocialApi) MarkMessagesAsRead(query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/social/messages/read"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 处理好友申请
func (a *SocialApi) ProcessFriendRequest(requestId string, body sdktypes.FriendRequestProcessForm) (sdktypes.PlusApiResultFriendRequestVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/social/friend-requests/%s/process", requestId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFriendRequestVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFriendRequestVO](raw)
}

// 更新联系人分组
func (a *SocialApi) UpdateContactGroup(groupId string, body sdktypes.ContactGroupUpdateForm) (sdktypes.PlusApiResultContactGroupVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/social/contact-groups/%s", groupId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultContactGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultContactGroupVO](raw)
}

// 删除联系人分组
func (a *SocialApi) DeleteContactGroup(groupId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/social/contact-groups/%s", groupId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 发送私信
func (a *SocialApi) SendMessage(body sdktypes.SendMessageForm) (sdktypes.PlusApiResultPrivateMessageVO, error) {
    raw, err := a.client.Post(AppApiPath("/social/messages"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultPrivateMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPrivateMessageVO](raw)
}

// 获取好友申请列表
func (a *SocialApi) ListFriendRequests() (sdktypes.PlusApiResultListFriendRequestVO, error) {
    raw, err := a.client.Get(AppApiPath("/social/friend-requests"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFriendRequestVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFriendRequestVO](raw)
}

// 发送好友申请
func (a *SocialApi) SendFriendRequest(body sdktypes.FriendRequestCreateForm) (sdktypes.PlusApiResultFriendRequestVO, error) {
    raw, err := a.client.Post(AppApiPath("/social/friend-requests"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFriendRequestVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFriendRequestVO](raw)
}

// 关注用户
func (a *SocialApi) FollowUser(userId string) (sdktypes.PlusApiResultFollowVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/social/follow/%s", userId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFollowVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFollowVO](raw)
}

// 取消关注
func (a *SocialApi) UnfollowUser(userId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/social/follow/%s", userId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 批量检查关注状态
func (a *SocialApi) BatchCheckFollowStatus(body sdktypes.BatchFollowCheckForm) (sdktypes.PlusApiResultListFollowCheckVO, error) {
    raw, err := a.client.Post(AppApiPath("/social/follow/check/batch"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultListFollowCheckVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFollowCheckVO](raw)
}

// 获取联系人分组
func (a *SocialApi) ListContactGroups() (sdktypes.PlusApiResultListContactGroupVO, error) {
    raw, err := a.client.Get(AppApiPath("/social/contact-groups"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListContactGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListContactGroupVO](raw)
}

// 创建联系人分组
func (a *SocialApi) CreateContactGroup(body sdktypes.ContactGroupCreateForm) (sdktypes.PlusApiResultContactGroupVO, error) {
    raw, err := a.client.Post(AppApiPath("/social/contact-groups"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultContactGroupVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultContactGroupVO](raw)
}

// 拉黑用户
func (a *SocialApi) BlockUser(userId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/social/block/%s", userId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 取消拉黑
func (a *SocialApi) UnblockUser(userId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/social/block/%s", userId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 更新好友备注
func (a *SocialApi) UpdateFriendRemark(contactId string, body sdktypes.FriendRemarkUpdateForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Patch(AppApiPath(fmt.Sprintf("/social/contacts/%s/remark", contactId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取关注统计
func (a *SocialApi) GetFollowStats() (sdktypes.PlusApiResultFollowStatsVO, error) {
    raw, err := a.client.Get(AppApiPath("/social/stats"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFollowStatsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFollowStatsVO](raw)
}

// 获取未读消息数
func (a *SocialApi) GetUnreadMessageCount() (sdktypes.PlusApiResultMessageUnreadCountVO, error) {
    raw, err := a.client.Get(AppApiPath("/social/messages/unread/count"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMessageUnreadCountVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMessageUnreadCountVO](raw)
}

// 获取关注列表
func (a *SocialApi) GetFollowingList(query map[string]interface{}) (sdktypes.PlusApiResultPageFollowUserVO, error) {
    raw, err := a.client.Get(AppApiPath("/social/following"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageFollowUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageFollowUserVO](raw)
}

// 获取粉丝列表
func (a *SocialApi) GetFollowerList(query map[string]interface{}) (sdktypes.PlusApiResultPageFollowUserVO, error) {
    raw, err := a.client.Get(AppApiPath("/social/followers"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageFollowUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageFollowUserVO](raw)
}

// 检查关注状态
func (a *SocialApi) CheckFollowStatus(query map[string]interface{}) (sdktypes.PlusApiResultFollowCheckVO, error) {
    raw, err := a.client.Get(AppApiPath("/social/follow/check"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFollowCheckVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFollowCheckVO](raw)
}

// 获取会话列表
func (a *SocialApi) GetConversations(query map[string]interface{}) (sdktypes.PlusApiResultPageConversationVO, error) {
    raw, err := a.client.Get(AppApiPath("/social/conversations"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageConversationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageConversationVO](raw)
}

// 获取会话消息
func (a *SocialApi) GetConversationMessages(userId string, query map[string]interface{}) (sdktypes.PlusApiResultPagePrivateMessageVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/social/conversations/%s/messages", userId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPagePrivateMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPagePrivateMessageVO](raw)
}

// 获取联系人列表
func (a *SocialApi) ListContacts(query map[string]interface{}) (sdktypes.PlusApiResultListContactFriendVO, error) {
    raw, err := a.client.Get(AppApiPath("/social/contacts"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListContactFriendVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListContactFriendVO](raw)
}

// 获取联系人详情
func (a *SocialApi) GetContactDetail(contactId string) (sdktypes.PlusApiResultContactFriendVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/social/contacts/%s", contactId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultContactFriendVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultContactFriendVO](raw)
}

// 删除联系人
func (a *SocialApi) DeleteContact(contactId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/social/contacts/%s", contactId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取联系人统计
func (a *SocialApi) GetContactStats() (sdktypes.PlusApiResultContactStatsVO, error) {
    raw, err := a.client.Get(AppApiPath("/social/contacts/stats"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultContactStatsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultContactStatsVO](raw)
}

// 获取黑名单
func (a *SocialApi) GetBlockedUsers(query map[string]interface{}) (sdktypes.PlusApiResultPageBlockedUserVO, error) {
    raw, err := a.client.Get(AppApiPath("/social/blocks"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageBlockedUserVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageBlockedUserVO](raw)
}

// 检查黑名单状态
func (a *SocialApi) CheckBlockStatus(query map[string]interface{}) (sdktypes.PlusApiResultBlockCheckVO, error) {
    raw, err := a.client.Get(AppApiPath("/social/block/check"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultBlockCheckVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBlockCheckVO](raw)
}

// 删除会话
func (a *SocialApi) DeleteConversation(userId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/social/conversations/%s", userId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
