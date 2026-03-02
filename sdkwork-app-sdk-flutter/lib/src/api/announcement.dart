import '../http/client.dart';
import '../models.dart';

class AnnouncementApi {
  final HttpClient _client;
  
  AnnouncementApi(this._client);

  /// 标记已读
  Future<PlusApiResultVoid?> markAsRead(String announcementId) async {
    final response = await _client.put(ApiPaths.appPath('/announcement/${announcementId}/read'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 全部已读
  Future<PlusApiResultVoid?> markAllAsRead() async {
    final response = await _client.put(ApiPaths.appPath('/announcement/read/all'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 确认公告
  Future<PlusApiResultVoid?> acknowledge(String announcementId) async {
    final response = await _client.post(ApiPaths.appPath('/announcement/${announcementId}/acknowledge'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 关闭弹窗
  Future<PlusApiResultVoid?> dismissPopup(String popupId, Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/announcement/popups/${popupId}/dismiss'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 完成引导
  Future<PlusApiResultVoid?> completeOnboarding(Map<String, dynamic>? params) async {
    final response = await _client.post(ApiPaths.appPath('/announcement/onboarding/complete'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 公告列表
  Future<PlusApiResultPageAnnouncementVO?> listAnnouncements(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/announcement'), params: params);
    return response is PlusApiResultPageAnnouncementVO ? response : null;
  }

  /// 公告详情
  Future<PlusApiResultAnnouncementDetailVO?> getAnnouncementDetail(String announcementId) async {
    final response = await _client.get(ApiPaths.appPath('/announcement/${announcementId}'));
    return response is PlusApiResultAnnouncementDetailVO ? response : null;
  }

  /// 检查更新
  Future<PlusApiResultUpdateCheckVO?> checkUpdate(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/announcement/update/check'), params: params);
    return response is PlusApiResultUpdateCheckVO ? response : null;
  }

  /// 更新日志
  Future<PlusApiResultListChangelogVO?> getChangelogs(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/announcement/update/changelog'), params: params);
    return response is PlusApiResultListChangelogVO ? response : null;
  }

  /// 未读公告
  Future<PlusApiResultListAnnouncementVO?> getUnreadAnnouncements() async {
    final response = await _client.get(ApiPaths.appPath('/announcement/unread'));
    return response is PlusApiResultListAnnouncementVO ? response : null;
  }

  /// 未读公告数
  Future<PlusApiResultInteger?> getUnreadAnnouncementCount() async {
    final response = await _client.get(ApiPaths.appPath('/announcement/unread/count'));
    return response is PlusApiResultInteger ? response : null;
  }

  /// 系统状态
  Future<PlusApiResultSystemStatusVO?> getSystemStatus() async {
    final response = await _client.get(ApiPaths.appPath('/announcement/system/status'));
    return response is PlusApiResultSystemStatusVO ? response : null;
  }

  /// 维护公告
  Future<PlusApiResultMaintenanceNoticeVO?> getMaintenanceNotice() async {
    final response = await _client.get(ApiPaths.appPath('/announcement/system/maintenance'));
    return response is PlusApiResultMaintenanceNoticeVO ? response : null;
  }

  /// 弹窗通知
  Future<PlusApiResultListPopupNotificationVO?> getPopupNotifications(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/announcement/popups'), params: params);
    return response is PlusApiResultListPopupNotificationVO ? response : null;
  }

  /// 置顶公告
  Future<PlusApiResultListAnnouncementVO?> getPinnedAnnouncements() async {
    final response = await _client.get(ApiPaths.appPath('/announcement/pinned'));
    return response is PlusApiResultListAnnouncementVO ? response : null;
  }

  /// 新用户引导
  Future<PlusApiResultListOnboardingPageVO?> getOnboardingPages(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/announcement/onboarding'), params: params);
    return response is PlusApiResultListOnboardingPageVO ? response : null;
  }

  /// 最新公告
  Future<PlusApiResultListAnnouncementVO?> getLatestAnnouncements(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/announcement/latest'), params: params);
    return response is PlusApiResultListAnnouncementVO ? response : null;
  }
}
