package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class NotificationApi {
    private final HttpClient client;
    
    public NotificationApi(HttpClient client) {
        this.client = client;
    }

    /** Mark notification as unread */
    public PlusApiResultNotificationVO markAsUnread(String notificationId) throws Exception {
        return (PlusApiResultNotificationVO) client.put(ApiPaths.appPath("/notification/" + notificationId + "/unread"), null);
    }

    /** Mark notification as read */
    public PlusApiResultNotificationVO markAsRead(String notificationId) throws Exception {
        return (PlusApiResultNotificationVO) client.put(ApiPaths.appPath("/notification/" + notificationId + "/read"), null);
    }

    /** Get notification settings */
    public PlusApiResultNotificationSettingsVO getNotificationSettings() throws Exception {
        return (PlusApiResultNotificationSettingsVO) client.get(ApiPaths.appPath("/notification/settings"));
    }

    /** Update notification settings */
    public PlusApiResultNotificationSettingsVO updateNotificationSettings(NotificationSettingsUpdateForm body) throws Exception {
        return (PlusApiResultNotificationSettingsVO) client.put(ApiPaths.appPath("/notification/settings"), body);
    }

    /** Update type settings */
    public PlusApiResultVoid updateTypeSettings(String type, NotificationTypeSettingsForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/notification/settings/" + type + ""), body);
    }

    /** Mark all notifications as read */
    public PlusApiResultVoid markAllAsRead(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/notification/read/all"), null, params);
    }

    /** Update device status */
    public PlusApiResultDeviceVO updateDeviceStatus(String deviceId, DeviceStatusUpdateForm body) throws Exception {
        return (PlusApiResultDeviceVO) client.put(ApiPaths.appPath("/notification/devices/" + deviceId + "/status"), body);
    }

    /** Batch mark notifications as read */
    public PlusApiResultVoid batchMarkAsRead(NotificationBatchReadForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/notification/batch/read"), body);
    }

    /** Send test notification */
    public PlusApiResultVoid sendTest(TestNotificationForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/notification/test"), body);
    }

    /** List subscriptions */
    public PlusApiResultListString listSubscriptions() throws Exception {
        return (PlusApiResultListString) client.get(ApiPaths.appPath("/notification/subscriptions"));
    }

    /** Subscribe topic */
    public PlusApiResultVoid subscribeTopic(TopicSubscribeForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/notification/subscriptions"), body);
    }

    /** List devices */
    public PlusApiResultListDeviceVO listDevices() throws Exception {
        return (PlusApiResultListDeviceVO) client.get(ApiPaths.appPath("/notification/devices"));
    }

    /** Register device */
    public PlusApiResultDeviceVO registerDevice(DeviceRegisterForm body) throws Exception {
        return (PlusApiResultDeviceVO) client.post(ApiPaths.appPath("/notification/devices"), body);
    }

    /** List device messages */
    public PlusApiResultListDeviceMessageVO listDeviceMessages(String deviceId, Map<String, Object> params) throws Exception {
        return (PlusApiResultListDeviceMessageVO) client.get(ApiPaths.appPath("/notification/devices/" + deviceId + "/messages"), params);
    }

    /** Send device message */
    public PlusApiResultDeviceMessageVO sendDeviceMessage(String deviceId, DeviceMessageSendForm body) throws Exception {
        return (PlusApiResultDeviceMessageVO) client.post(ApiPaths.appPath("/notification/devices/" + deviceId + "/messages"), body);
    }

    /** Control device */
    public PlusApiResultBoolean controlDevice(String deviceId, DeviceControlForm body) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.appPath("/notification/devices/" + deviceId + "/control"), body);
    }

    /** List notifications */
    public PlusApiResultPageNotificationVO listNotifications(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageNotificationVO) client.get(ApiPaths.appPath("/notification"), params);
    }

    /** Get notification detail */
    public PlusApiResultNotificationDetailVO getNotificationDetail(String notificationId) throws Exception {
        return (PlusApiResultNotificationDetailVO) client.get(ApiPaths.appPath("/notification/" + notificationId + ""));
    }

    /** Delete notification */
    public PlusApiResultVoid deleteNotification(String notificationId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/notification/" + notificationId + ""));
    }

    /** Get unread notification count */
    public PlusApiResultMapStringInteger getUnreadCount() throws Exception {
        return (PlusApiResultMapStringInteger) client.get(ApiPaths.appPath("/notification/unread/count"));
    }

    /** List notification types */
    public PlusApiResultListNotificationTypeVO listNotificationTypes() throws Exception {
        return (PlusApiResultListNotificationTypeVO) client.get(ApiPaths.appPath("/notification/types"));
    }

    /** Unsubscribe topic */
    public PlusApiResultVoid unsubscribeTopic(String topic) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/notification/subscriptions/" + topic + ""));
    }

    /** Unregister device */
    public PlusApiResultVoid unregisterDevice(String deviceToken) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/notification/devices/" + deviceToken + ""));
    }

    /** Clear notifications */
    public PlusApiResultVoid clearAllNotifications(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/notification/clear"), params);
    }

    /** Batch delete notifications */
    public PlusApiResultVoid batchDeleteNotifications() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/notification/batch"));
    }
}
