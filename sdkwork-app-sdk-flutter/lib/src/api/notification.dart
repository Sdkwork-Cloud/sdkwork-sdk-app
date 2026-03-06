import '../http/client.dart';
import '../models.dart';

class NotificationApi {
  final HttpClient _client;
  
  NotificationApi(this._client);

  /// Mark notification as unread
  Future<PlusApiResultNotificationVO?> markAsUnread(String notificationId) async {
    final response = await _client.put(ApiPaths.appPath('/notification/${notificationId}/unread'));
    return response is PlusApiResultNotificationVO ? response : null;
  }

  /// Mark notification as read
  Future<PlusApiResultNotificationVO?> markAsRead(String notificationId) async {
    final response = await _client.put(ApiPaths.appPath('/notification/${notificationId}/read'));
    return response is PlusApiResultNotificationVO ? response : null;
  }

  /// Get notification settings
  Future<PlusApiResultNotificationSettingsVO?> getNotificationSettings() async {
    final response = await _client.get(ApiPaths.appPath('/notification/settings'));
    return response is PlusApiResultNotificationSettingsVO ? response : null;
  }

  /// Update notification settings
  Future<PlusApiResultNotificationSettingsVO?> updateNotificationSettings(NotificationSettingsUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/notification/settings'), body: body, contentType: 'application/json');
    return response is PlusApiResultNotificationSettingsVO ? response : null;
  }

  /// Update type settings
  Future<PlusApiResultVoid?> updateTypeSettings(String type, NotificationTypeSettingsForm body) async {
    final response = await _client.put(ApiPaths.appPath('/notification/settings/${type}'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// Mark all notifications as read
  Future<PlusApiResultVoid?> markAllAsRead(Map<String, dynamic>? params) async {
    final response = await _client.put(ApiPaths.appPath('/notification/read/all'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// Update device status
  Future<PlusApiResultDeviceVO?> updateDeviceStatus(String deviceId, DeviceStatusUpdateForm body) async {
    final response = await _client.put(ApiPaths.appPath('/notification/devices/${deviceId}/status'), body: body, contentType: 'application/json');
    return response is PlusApiResultDeviceVO ? response : null;
  }

  /// Batch mark notifications as read
  Future<PlusApiResultVoid?> batchMarkAsRead(NotificationBatchReadForm body) async {
    final response = await _client.put(ApiPaths.appPath('/notification/batch/read'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// Send test notification
  Future<PlusApiResultVoid?> sendTest(TestNotificationForm body) async {
    final response = await _client.post(ApiPaths.appPath('/notification/test'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// List subscriptions
  Future<PlusApiResultListString?> listSubscriptions() async {
    final response = await _client.get(ApiPaths.appPath('/notification/subscriptions'));
    return response is PlusApiResultListString ? response : null;
  }

  /// Subscribe topic
  Future<PlusApiResultVoid?> subscribeTopic(TopicSubscribeForm body) async {
    final response = await _client.post(ApiPaths.appPath('/notification/subscriptions'), body: body, contentType: 'application/json');
    return response is PlusApiResultVoid ? response : null;
  }

  /// List devices
  Future<PlusApiResultListDeviceVO?> listDevices() async {
    final response = await _client.get(ApiPaths.appPath('/notification/devices'));
    return response is PlusApiResultListDeviceVO ? response : null;
  }

  /// Register device
  Future<PlusApiResultDeviceVO?> registerDevice(DeviceRegisterForm body) async {
    final response = await _client.post(ApiPaths.appPath('/notification/devices'), body: body, contentType: 'application/json');
    return response is PlusApiResultDeviceVO ? response : null;
  }

  /// List device messages
  Future<PlusApiResultListDeviceMessageVO?> listDeviceMessages(String deviceId, Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/notification/devices/${deviceId}/messages'), params: params);
    return response is PlusApiResultListDeviceMessageVO ? response : null;
  }

  /// Send device message
  Future<PlusApiResultDeviceMessageVO?> sendDeviceMessage(String deviceId, DeviceMessageSendForm body) async {
    final response = await _client.post(ApiPaths.appPath('/notification/devices/${deviceId}/messages'), body: body, contentType: 'application/json');
    return response is PlusApiResultDeviceMessageVO ? response : null;
  }

  /// Control device
  Future<PlusApiResultBoolean?> controlDevice(String deviceId, DeviceControlForm body) async {
    final response = await _client.post(ApiPaths.appPath('/notification/devices/${deviceId}/control'), body: body, contentType: 'application/json');
    return response is PlusApiResultBoolean ? response : null;
  }

  /// List notifications
  Future<PlusApiResultPageNotificationVO?> listNotifications(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/notification'), params: params);
    return response is PlusApiResultPageNotificationVO ? response : null;
  }

  /// Get notification detail
  Future<PlusApiResultNotificationDetailVO?> getNotificationDetail(String notificationId) async {
    final response = await _client.get(ApiPaths.appPath('/notification/${notificationId}'));
    return response is PlusApiResultNotificationDetailVO ? response : null;
  }

  /// Delete notification
  Future<PlusApiResultVoid?> deleteNotification(String notificationId) async {
    final response = await _client.delete(ApiPaths.appPath('/notification/${notificationId}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// Get unread notification count
  Future<PlusApiResultMapStringInteger?> getUnreadCount() async {
    final response = await _client.get(ApiPaths.appPath('/notification/unread/count'));
    return response is PlusApiResultMapStringInteger ? response : null;
  }

  /// List notification types
  Future<PlusApiResultListNotificationTypeVO?> listNotificationTypes() async {
    final response = await _client.get(ApiPaths.appPath('/notification/types'));
    return response is PlusApiResultListNotificationTypeVO ? response : null;
  }

  /// Unsubscribe topic
  Future<PlusApiResultVoid?> unsubscribeTopic(String topic) async {
    final response = await _client.delete(ApiPaths.appPath('/notification/subscriptions/${topic}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// Unregister device
  Future<PlusApiResultVoid?> unregisterDevice(String deviceToken) async {
    final response = await _client.delete(ApiPaths.appPath('/notification/devices/${deviceToken}'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// Clear notifications
  Future<PlusApiResultVoid?> clearAllNotifications(Map<String, dynamic>? params) async {
    final response = await _client.delete(ApiPaths.appPath('/notification/clear'), params: params);
    return response is PlusApiResultVoid ? response : null;
  }

  /// Batch delete notifications
  Future<PlusApiResultVoid?> batchDeleteNotifications() async {
    final response = await _client.delete(ApiPaths.appPath('/notification/batch'));
    return response is PlusApiResultVoid ? response : null;
  }
}
