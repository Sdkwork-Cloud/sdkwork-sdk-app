import '../http/client.dart';
import '../models.dart';

class SocialApi {
  final HttpClient _client;
  
  SocialApi(this._client);

  /// 标记消息已读
  Future<PlusApiResultVoid?> markMessagesAsRead(Map<String, dynamic>? params) async {
    final response = await _client.put(ApiPaths.appPath('/social/messages/read'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 处理好友申请
  Future<PlusApiResultFriendRequestVO?> processFriendRequest(String requestId, FriendRequestProcessForm body) async {
    final response = await _client.put(ApiPaths.appPath('/social/friend-requests/${requestId}/process'), body: body, contentType: 'application/json');
    return response is PlusApiResultFriendRequestVO ? response : null;
  }

  /// 更新联系人分组
  Future<PlusApiResultContactGroupVO?> updateContactGroup(String groupId, ContactGroupUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/social/contact-groups/${groupId}'), body: body, contentType: 'application/json');
    return response is PlusApiResultContactGroupVO ? response : null;
  }

  /// 删除联系人分组
  Future<PlusApiResultVoid?> deleteContactGroup(String groupId) async {
    final response = await _client.delete(ApiPaths.appPath('/social/contact-groups/${groupId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 发送私信
  Future<PlusApiResultPrivateMessageVO?> sendMessage(SendMessageForm body) async {
    final response = await _client.post(ApiPaths.appPath('/social/messages'), body: body, contentType: 'application/json');
    return response is PlusApiResultPrivateMessageVO ? response : null;
  }

  /// 获取好友申请列表
  Future<PlusApiResultListFriendRequestVO?> listFriendRequests() async {
    final response = await _client.get(ApiPaths.appPath('/social/friend-requests'));
    return response is PlusApiResultListFriendRequestVO ? response : null;
  }

  /// 发送好友申请
  Future<PlusApiResultFriendRequestVO?> sendFriendRequest(FriendRequestCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/social/friend-requests'), body: body, contentType: 'application/json');
    return response is PlusApiResultFriendRequestVO ? response : null;
  }

  /// 关注用户
  Future<PlusApiResultFollowVO?> followUser(String userId) async {
    final response = await _client.post(ApiPaths.appPath('/social/follow/${userId}'));
    return response is PlusApiResultFollowVO ? response : null;
  }

  /// 取消关注
  Future<PlusApiResultVoid?> unfollowUser(String userId) async {
    final response = await _client.delete(ApiPaths.appPath('/social/follow/${userId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 批量检查关注状态
  Future<PlusApiResultListFollowCheckVO?> batchCheckFollowStatus(BatchFollowCheckForm body) async {
    final response = await _client.post(ApiPaths.appPath('/social/follow/check/batch'), body: body, contentType: 'application/json');
    return response is PlusApiResultListFollowCheckVO ? response : null;
  }

  /// 获取联系人分组
  Future<PlusApiResultListContactGroupVO?> listContactGroups() async {
    final response = await _client.get(ApiPaths.appPath('/social/contact-groups'));
    return response is PlusApiResultListContactGroupVO ? response : null;
  }

  /// 创建联系人分组
  Future<PlusApiResultContactGroupVO?> createContactGroup(ContactGroupCreateForm body) async {
    final response = await _client.post(ApiPaths.appPath('/social/contact-groups'), body: body, contentType: 'application/json');
    return response is PlusApiResultContactGroupVO ? response : null;
  }

  /// 拉黑用户
  Future<PlusApiResultVoid?> blockUser(String userId) async {
    final response = await _client.post(ApiPaths.appPath('/social/block/${userId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 取消拉黑
  Future<PlusApiResultVoid?> unblockUser(String userId) async {
    final response = await _client.delete(ApiPaths.appPath('/social/block/${userId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 更新好友备注
  Future<PlusApiResultVoid?> updateFriendRemark(String contactId, FriendRemarkUpdateForm body) async {
    final response = await _client.patch(ApiPaths.appPath('/social/contacts/${contactId}/remark'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取关注统计
  Future<PlusApiResultFollowStatsVO?> getFollowStats() async {
    final response = await _client.get(ApiPaths.appPath('/social/stats'));
    return response is PlusApiResultFollowStatsVO ? response : null;
  }

  /// 获取未读消息数
  Future<PlusApiResultMessageUnreadCountVO?> getUnreadMessageCount() async {
    final response = await _client.get(ApiPaths.appPath('/social/messages/unread/count'));
    return response is PlusApiResultMessageUnreadCountVO ? response : null;
  }

  /// 获取关注列表
  Future<PlusApiResultPageFollowUserVO?> getFollowingList(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/social/following'), params: params);
    return response is PlusApiResultPageFollowUserVO ? response : null;
  }

  /// 获取粉丝列表
  Future<PlusApiResultPageFollowUserVO?> getFollowerList(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/social/followers'), params: params);
    return response is PlusApiResultPageFollowUserVO ? response : null;
  }

  /// 检查关注状态
  Future<PlusApiResultFollowCheckVO?> checkFollowStatus(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/social/follow/check'), params: params);
    return response is PlusApiResultFollowCheckVO ? response : null;
  }

  /// 获取会话列表
  Future<PlusApiResultPageConversationVO?> getConversations(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/social/conversations'), params: params);
    return response is PlusApiResultPageConversationVO ? response : null;
  }

  /// 获取会话消息
  Future<PlusApiResultPagePrivateMessageVO?> getConversationMessages(String userId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/social/conversations/${userId}/messages'), params: params);
    return response is PlusApiResultPagePrivateMessageVO ? response : null;
  }

  /// 获取联系人列表
  Future<PlusApiResultListContactFriendVO?> listContacts(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/social/contacts'), params: params);
    return response is PlusApiResultListContactFriendVO ? response : null;
  }

  /// 获取联系人详情
  Future<PlusApiResultContactFriendVO?> getContactDetail(String contactId) async {
    final response = await _client.get(ApiPaths.appPath('/social/contacts/${contactId}'));
    return response is PlusApiResultContactFriendVO ? response : null;
  }

  /// 删除联系人
  Future<PlusApiResultVoid?> deleteContact(String contactId) async {
    final response = await _client.delete(ApiPaths.appPath('/social/contacts/${contactId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取联系人统计
  Future<PlusApiResultContactStatsVO?> getContactStats() async {
    final response = await _client.get(ApiPaths.appPath('/social/contacts/stats'));
    return response is PlusApiResultContactStatsVO ? response : null;
  }

  /// 获取黑名单
  Future<PlusApiResultPageBlockedUserVO?> getBlockedUsers(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/social/blocks'), params: params);
    return response is PlusApiResultPageBlockedUserVO ? response : null;
  }

  /// 检查黑名单状态
  Future<PlusApiResultBlockCheckVO?> checkBlockStatus(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/social/block/check'), params: params);
    return response is PlusApiResultBlockCheckVO ? response : null;
  }

  /// 删除会话
  Future<PlusApiResultVoid?> deleteConversation(String userId) async {
    final response = await _client.delete(ApiPaths.appPath('/social/conversations/${userId}'));
    return response is PlusApiResultVoid ? response : null;
  }
}
