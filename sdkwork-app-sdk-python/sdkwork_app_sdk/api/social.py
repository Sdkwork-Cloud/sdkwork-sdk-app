from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import BatchFollowCheckForm, ContactGroupCreateForm, ContactGroupUpdateForm, FriendRemarkUpdateForm, FriendRequestCreateForm, FriendRequestProcessForm, PlusApiResultBlockCheckVO, PlusApiResultContactFriendVO, PlusApiResultContactGroupVO, PlusApiResultContactStatsVO, PlusApiResultFollowCheckVO, PlusApiResultFollowStatsVO, PlusApiResultFollowVO, PlusApiResultFriendRequestVO, PlusApiResultListContactFriendVO, PlusApiResultListContactGroupVO, PlusApiResultListFollowCheckVO, PlusApiResultListFriendRequestVO, PlusApiResultMessageUnreadCountVO, PlusApiResultPageBlockedUserVO, PlusApiResultPageConversationVO, PlusApiResultPageFollowUserVO, PlusApiResultPagePrivateMessageVO, PlusApiResultPrivateMessageVO, PlusApiResultVoid, SendMessageForm

class SocialApi:
    """social API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def mark_messages_as_read(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """标记消息已读"""
        return self._client.put(f"/app/v3/api/social/messages/read", params=params)

    def process_friend_request(self, requestId: str, body: FriendRequestProcessForm) -> PlusApiResultFriendRequestVO:
        """处理好友申请"""
        return self._client.put(f"/app/v3/api/social/friend-requests/{requestId}/process", json=body)

    def update_contact_group(self, groupId: str, body: ContactGroupUpdateForm) -> PlusApiResultContactGroupVO:
        """更新联系人分组"""
        return self._client.put(f"/app/v3/api/social/contact-groups/{groupId}", json=body)

    def delete_contact_group(self, groupId: str) -> PlusApiResultVoid:
        """删除联系人分组"""
        return self._client.delete(f"/app/v3/api/social/contact-groups/{groupId}")

    def send_message(self, body: SendMessageForm) -> PlusApiResultPrivateMessageVO:
        """发送私信"""
        return self._client.post(f"/app/v3/api/social/messages", json=body)

    def list_friend_requests(self) -> PlusApiResultListFriendRequestVO:
        """获取好友申请列表"""
        return self._client.get(f"/app/v3/api/social/friend-requests")

    def send_friend_request(self, body: FriendRequestCreateForm) -> PlusApiResultFriendRequestVO:
        """发送好友申请"""
        return self._client.post(f"/app/v3/api/social/friend-requests", json=body)

    def follow_user(self, userId: str) -> PlusApiResultFollowVO:
        """关注用户"""
        return self._client.post(f"/app/v3/api/social/follow/{userId}")

    def unfollow_user(self, userId: str) -> PlusApiResultVoid:
        """取消关注"""
        return self._client.delete(f"/app/v3/api/social/follow/{userId}")

    def batch_check_follow_status(self, body: BatchFollowCheckForm) -> PlusApiResultListFollowCheckVO:
        """批量检查关注状态"""
        return self._client.post(f"/app/v3/api/social/follow/check/batch", json=body)

    def list_contact_groups(self) -> PlusApiResultListContactGroupVO:
        """获取联系人分组"""
        return self._client.get(f"/app/v3/api/social/contact-groups")

    def create_contact_group(self, body: ContactGroupCreateForm) -> PlusApiResultContactGroupVO:
        """创建联系人分组"""
        return self._client.post(f"/app/v3/api/social/contact-groups", json=body)

    def block_user(self, userId: str) -> PlusApiResultVoid:
        """拉黑用户"""
        return self._client.post(f"/app/v3/api/social/block/{userId}")

    def unblock_user(self, userId: str) -> PlusApiResultVoid:
        """取消拉黑"""
        return self._client.delete(f"/app/v3/api/social/block/{userId}")

    def update_friend_remark(self, contactId: str, body: FriendRemarkUpdateForm) -> PlusApiResultVoid:
        """更新好友备注"""
        return self._client.patch(f"/app/v3/api/social/contacts/{contactId}/remark", json=body)

    def get_follow_stats(self) -> PlusApiResultFollowStatsVO:
        """获取关注统计"""
        return self._client.get(f"/app/v3/api/social/stats")

    def get_unread_message_count(self) -> PlusApiResultMessageUnreadCountVO:
        """获取未读消息数"""
        return self._client.get(f"/app/v3/api/social/messages/unread/count")

    def get_following_list(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageFollowUserVO:
        """获取关注列表"""
        return self._client.get(f"/app/v3/api/social/following", params=params)

    def get_follower_list(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageFollowUserVO:
        """获取粉丝列表"""
        return self._client.get(f"/app/v3/api/social/followers", params=params)

    def check_follow_status(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFollowCheckVO:
        """检查关注状态"""
        return self._client.get(f"/app/v3/api/social/follow/check", params=params)

    def get_conversations(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageConversationVO:
        """获取会话列表"""
        return self._client.get(f"/app/v3/api/social/conversations", params=params)

    def get_conversation_messages(self, userId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPagePrivateMessageVO:
        """获取会话消息"""
        return self._client.get(f"/app/v3/api/social/conversations/{userId}/messages", params=params)

    def list_contacts(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListContactFriendVO:
        """获取联系人列表"""
        return self._client.get(f"/app/v3/api/social/contacts", params=params)

    def get_contact_detail(self, contactId: str) -> PlusApiResultContactFriendVO:
        """获取联系人详情"""
        return self._client.get(f"/app/v3/api/social/contacts/{contactId}")

    def delete_contact(self, contactId: str) -> PlusApiResultVoid:
        """删除联系人"""
        return self._client.delete(f"/app/v3/api/social/contacts/{contactId}")

    def get_contact_stats(self) -> PlusApiResultContactStatsVO:
        """获取联系人统计"""
        return self._client.get(f"/app/v3/api/social/contacts/stats")

    def get_blocked_users(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageBlockedUserVO:
        """获取黑名单"""
        return self._client.get(f"/app/v3/api/social/blocks", params=params)

    def check_block_status(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultBlockCheckVO:
        """检查黑名单状态"""
        return self._client.get(f"/app/v3/api/social/block/check", params=params)

    def delete_conversation(self, userId: str) -> PlusApiResultVoid:
        """删除会话"""
        return self._client.delete(f"/app/v3/api/social/conversations/{userId}")
