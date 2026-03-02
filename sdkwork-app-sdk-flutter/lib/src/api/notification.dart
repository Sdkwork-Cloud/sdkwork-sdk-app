import '../http/client.dart';
import '../models.dart';

class NotificationApi {
  final HttpClient _client;
  
  NotificationApi(this._client);

  /// 标记已读
  Future<PlusApiResultNotificationVO?> markAsRead(String notificationId) async {
    final response = await _client.put(ApiPaths.appPath('/notification/${notificationId}/read'));
    return response is PlusApiResultNotificationVO ? response : null;
  }

  /// 获取推送设置
  Future<PlusApiResultNotificationSettingsVO?> getNotificationSettings() async {
    final response = await _client.get(ApiPaths.appPath('/notification/settings'));
    return response is PlusApiResultNotificationSettingsVO ? response : null;
  }

  /// 更新推送设置
  Future<PlusApiResultNotificationSettingsVO?> updateNotificationSettings(NotificationSettingsUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/notification/settings'), body: body, contentType: 'application/json');
    return response is PlusApiResultNotificationSettingsVO ? response : null;
  }

  /// 更新类型推送设置
  Future<PlusApiResultVoid?> updateTypeSettings(String type, NotificationTypeSettingsForm body) async {
    final response = await _client.put(ApiPaths.appPath('/notification/settings/${type}'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 全部标记已读
  Future<PlusApiResultVoid?> markAllAsRead(Map<String, dynamic>? params) async {
    final response = await _client.put(ApiPaths.appPath('/notification/read/all'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 批量标记已读
  Future<PlusApiResultVoid?> batchMarkAsRead(NotificationBatchReadForm body) async {
    final response = await _client.put(ApiPaths.appPath('/notification/batch/read'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 发送测试消息
  Future<PlusApiResultVoid?> sendTest(TestNotificationForm body) async {
    final response = await _client.post(ApiPaths.appPath('/notification/test'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 订阅列表
  Future<PlusApiResultListString?> listSubscriptions() async {
    final response = await _client.get(ApiPaths.appPath('/notification/subscriptions'));
    return response is PlusApiResultListString ? response : null;
  }

  /// 订阅主题
  Future<PlusApiResultVoid?> subscribeTopic(TopicSubscribeForm body) async {
    final response = await _client.post(ApiPaths.appPath('/notification/subscriptions'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取设备列表
  Future<PlusApiResultListDeviceVO?> listDevices() async {
    final response = await _client.get(ApiPaths.appPath('/notification/devices'));
    return response is PlusApiResultListDeviceVO ? response : null;
  }

  /// 注册推送设备
  Future<PlusApiResultVoid?> registerDevice(DeviceRegisterForm body) async {
    final response = await _client.post(ApiPaths.appPath('/notification/devices'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// 获取消息列表
  Future<PlusApiResultPageNotificationVO?> listNotifications(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/notification'), params: params);
    return response is PlusApiResultPageNotificationVO ? response : null;
  }

  /// 获取消息详情
  Future<PlusApiResultNotificationDetailVO?> getNotificationDetail(String notificationId) async {
    final response = await _client.get(ApiPaths.appPath('/notification/${notificationId}'));
    return response is PlusApiResultNotificationDetailVO ? response : null;
  }

  /// 删除消息
  Future<PlusApiResultVoid?> deleteNotification(String notificationId) async {
    final response = await _client.delete(ApiPaths.appPath('/notification/${notificationId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 未读消息统计
  Future<PlusApiResultMapStringInteger?> getUnreadCount() async {
    final response = await _client.get(ApiPaths.appPath('/notification/unread/count'));
    return response is PlusApiResultMapStringInteger ? response : null;
  }

  /// 消息类型
  Future<PlusApiResultListNotificationTypeVO?> listNotificationTypes() async {
    final response = await _client.get(ApiPaths.appPath('/notification/types'));
    return response is PlusApiResultListNotificationTypeVO ? response : null;
  }

  /// 取消订阅
  Future<PlusApiResultVoid?> unsubscribeTopic(String topic) async {
    final response = await _client.delete(ApiPaths.appPath('/notification/subscriptions/${topic}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 注销推送设备
  Future<PlusApiResultVoid?> unregisterDevice(String deviceToken) async {
    final response = await _client.delete(ApiPaths.appPath('/notification/devices/${deviceToken}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 清空消息
  Future<PlusApiResultVoid?> clearAllNotifications(Map<String, dynamic>? params) async {
    final response = await _client.delete(ApiPaths.appPath('/notification/clear'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// 批量删除消息
  Future<PlusApiResultVoid?> batchDeleteNotifications() async {
    final response = await _client.delete(ApiPaths.appPath('/notification/batch'));
    return response is PlusApiResultVoid ? response : null;
  }
}
