from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import DeviceRegisterForm, NotificationBatchReadForm, NotificationSettingsUpdateForm, NotificationTypeSettingsForm, PlusApiResultListDeviceVO, PlusApiResultListNotificationTypeVO, PlusApiResultListString, PlusApiResultMapStringInteger, PlusApiResultNotificationDetailVO, PlusApiResultNotificationSettingsVO, PlusApiResultNotificationVO, PlusApiResultPageNotificationVO, PlusApiResultVoid, TestNotificationForm, TopicSubscribeForm

class NotificationApi:
    """notification API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def mark_as_read(self, notificationId: str) -> PlusApiResultNotificationVO:
        """标记已读"""
        return self._client.put(f"/app/v3/api/notification/{notificationId}/read")

    def get_notification_settings(self) -> PlusApiResultNotificationSettingsVO:
        """获取推送设置"""
        return self._client.get(f"/app/v3/api/notification/settings")

    def update_notification_settings(self, body: NotificationSettingsUpdateForm) -> PlusApiResultNotificationSettingsVO:
        """更新推送设置"""
        return self._client.put(f"/app/v3/api/notification/settings", json=body)

    def update_type_settings(self, type: str, body: NotificationTypeSettingsForm) -> PlusApiResultVoid:
        """更新类型推送设置"""
        return self._client.put(f"/app/v3/api/notification/settings/{type}", json=body)

    def mark_all_as_read(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """全部标记已读"""
        return self._client.put(f"/app/v3/api/notification/read/all", params=params)

    def batch_mark_as_read(self, body: NotificationBatchReadForm) -> PlusApiResultVoid:
        """批量标记已读"""
        return self._client.put(f"/app/v3/api/notification/batch/read", json=body)

    def send_test(self, body: TestNotificationForm) -> PlusApiResultVoid:
        """发送测试消息"""
        return self._client.post(f"/app/v3/api/notification/test", json=body)

    def list_subscriptions(self) -> PlusApiResultListString:
        """订阅列表"""
        return self._client.get(f"/app/v3/api/notification/subscriptions")

    def subscribe_topic(self, body: TopicSubscribeForm) -> PlusApiResultVoid:
        """订阅主题"""
        return self._client.post(f"/app/v3/api/notification/subscriptions", json=body)

    def list_devices(self) -> PlusApiResultListDeviceVO:
        """获取设备列表"""
        return self._client.get(f"/app/v3/api/notification/devices")

    def register_device(self, body: DeviceRegisterForm) -> PlusApiResultVoid:
        """注册推送设备"""
        return self._client.post(f"/app/v3/api/notification/devices", json=body)

    def list_notifications(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageNotificationVO:
        """获取消息列表"""
        return self._client.get(f"/app/v3/api/notification", params=params)

    def get_notification_detail(self, notificationId: str) -> PlusApiResultNotificationDetailVO:
        """获取消息详情"""
        return self._client.get(f"/app/v3/api/notification/{notificationId}")

    def delete_notification(self, notificationId: str) -> PlusApiResultVoid:
        """删除消息"""
        return self._client.delete(f"/app/v3/api/notification/{notificationId}")

    def get_unread_count(self) -> PlusApiResultMapStringInteger:
        """未读消息统计"""
        return self._client.get(f"/app/v3/api/notification/unread/count")

    def list_notification_types(self) -> PlusApiResultListNotificationTypeVO:
        """消息类型"""
        return self._client.get(f"/app/v3/api/notification/types")

    def unsubscribe_topic(self, topic: str) -> PlusApiResultVoid:
        """取消订阅"""
        return self._client.delete(f"/app/v3/api/notification/subscriptions/{topic}")

    def unregister_device(self, deviceToken: str) -> PlusApiResultVoid:
        """注销推送设备"""
        return self._client.delete(f"/app/v3/api/notification/devices/{deviceToken}")

    def clear_all_notifications(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """清空消息"""
        return self._client.delete(f"/app/v3/api/notification/clear", params=params)

    def batch_delete_notifications(self) -> PlusApiResultVoid:
        """批量删除消息"""
        return self._client.delete(f"/app/v3/api/notification/batch")
