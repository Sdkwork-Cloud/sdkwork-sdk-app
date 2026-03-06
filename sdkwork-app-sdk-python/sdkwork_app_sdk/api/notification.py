from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import DeviceControlForm, DeviceMessageSendForm, DeviceRegisterForm, DeviceStatusUpdateForm, NotificationBatchReadForm, NotificationSettingsUpdateForm, NotificationTypeSettingsForm, PlusApiResultBoolean, PlusApiResultDeviceMessageVO, PlusApiResultDeviceVO, PlusApiResultListDeviceMessageVO, PlusApiResultListDeviceVO, PlusApiResultListNotificationTypeVO, PlusApiResultListString, PlusApiResultMapStringInteger, PlusApiResultNotificationDetailVO, PlusApiResultNotificationSettingsVO, PlusApiResultNotificationVO, PlusApiResultPageNotificationVO, PlusApiResultVoid, TestNotificationForm, TopicSubscribeForm

class NotificationApi:
    """notification API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def mark_as_unread(self, notificationId: str) -> PlusApiResultNotificationVO:
        """Mark notification as unread"""
        return self._client.put(f"/app/v3/api/notification/{notificationId}/unread")

    def mark_as_read(self, notificationId: str) -> PlusApiResultNotificationVO:
        """Mark notification as read"""
        return self._client.put(f"/app/v3/api/notification/{notificationId}/read")

    def get_notification_settings(self) -> PlusApiResultNotificationSettingsVO:
        """Get notification settings"""
        return self._client.get(f"/app/v3/api/notification/settings")

    def update_notification_settings(self, body: NotificationSettingsUpdateForm) -> PlusApiResultNotificationSettingsVO:
        """Update notification settings"""
        return self._client.put(f"/app/v3/api/notification/settings", json=body)

    def update_type_settings(self, type: str, body: NotificationTypeSettingsForm) -> PlusApiResultVoid:
        """Update type settings"""
        return self._client.put(f"/app/v3/api/notification/settings/{type}", json=body)

    def mark_all_as_read(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """Mark all notifications as read"""
        return self._client.put(f"/app/v3/api/notification/read/all", params=params)

    def update_device_status(self, deviceId: str, body: DeviceStatusUpdateForm) -> PlusApiResultDeviceVO:
        """Update device status"""
        return self._client.put(f"/app/v3/api/notification/devices/{deviceId}/status", json=body)

    def batch_mark_as_read(self, body: NotificationBatchReadForm) -> PlusApiResultVoid:
        """Batch mark notifications as read"""
        return self._client.put(f"/app/v3/api/notification/batch/read", json=body)

    def send_test(self, body: TestNotificationForm) -> PlusApiResultVoid:
        """Send test notification"""
        return self._client.post(f"/app/v3/api/notification/test", json=body)

    def list_subscriptions(self) -> PlusApiResultListString:
        """List subscriptions"""
        return self._client.get(f"/app/v3/api/notification/subscriptions")

    def subscribe_topic(self, body: TopicSubscribeForm) -> PlusApiResultVoid:
        """Subscribe topic"""
        return self._client.post(f"/app/v3/api/notification/subscriptions", json=body)

    def list_devices(self) -> PlusApiResultListDeviceVO:
        """List devices"""
        return self._client.get(f"/app/v3/api/notification/devices")

    def register_device(self, body: DeviceRegisterForm) -> PlusApiResultDeviceVO:
        """Register device"""
        return self._client.post(f"/app/v3/api/notification/devices", json=body)

    def list_device_messages(self, deviceId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListDeviceMessageVO:
        """List device messages"""
        return self._client.get(f"/app/v3/api/notification/devices/{deviceId}/messages", params=params)

    def send_device_message(self, deviceId: str, body: DeviceMessageSendForm) -> PlusApiResultDeviceMessageVO:
        """Send device message"""
        return self._client.post(f"/app/v3/api/notification/devices/{deviceId}/messages", json=body)

    def control_device(self, deviceId: str, body: DeviceControlForm) -> PlusApiResultBoolean:
        """Control device"""
        return self._client.post(f"/app/v3/api/notification/devices/{deviceId}/control", json=body)

    def list_notifications(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageNotificationVO:
        """List notifications"""
        return self._client.get(f"/app/v3/api/notification", params=params)

    def get_notification_detail(self, notificationId: str) -> PlusApiResultNotificationDetailVO:
        """Get notification detail"""
        return self._client.get(f"/app/v3/api/notification/{notificationId}")

    def delete_notification(self, notificationId: str) -> PlusApiResultVoid:
        """Delete notification"""
        return self._client.delete(f"/app/v3/api/notification/{notificationId}")

    def get_unread_count(self) -> PlusApiResultMapStringInteger:
        """Get unread notification count"""
        return self._client.get(f"/app/v3/api/notification/unread/count")

    def list_notification_types(self) -> PlusApiResultListNotificationTypeVO:
        """List notification types"""
        return self._client.get(f"/app/v3/api/notification/types")

    def unsubscribe_topic(self, topic: str) -> PlusApiResultVoid:
        """Unsubscribe topic"""
        return self._client.delete(f"/app/v3/api/notification/subscriptions/{topic}")

    def unregister_device(self, deviceToken: str) -> PlusApiResultVoid:
        """Unregister device"""
        return self._client.delete(f"/app/v3/api/notification/devices/{deviceToken}")

    def clear_all_notifications(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """Clear notifications"""
        return self._client.delete(f"/app/v3/api/notification/clear", params=params)

    def batch_delete_notifications(self) -> PlusApiResultVoid:
        """Batch delete notifications"""
        return self._client.delete(f"/app/v3/api/notification/batch")
