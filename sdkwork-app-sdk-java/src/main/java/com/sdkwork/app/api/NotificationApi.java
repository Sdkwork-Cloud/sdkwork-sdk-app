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

    /** 标记已读 */
    public PlusApiResultNotificationVO markAsRead(String notificationId) throws Exception {
        return (PlusApiResultNotificationVO) client.put(ApiPaths.appPath("/notification/" + notificationId + "/read"), null);
    }

    /** 获取推送设置 */
    public PlusApiResultNotificationSettingsVO getNotificationSettings() throws Exception {
        return (PlusApiResultNotificationSettingsVO) client.get(ApiPaths.appPath("/notification/settings"));
    }

    /** 更新推送设置 */
    public PlusApiResultNotificationSettingsVO updateNotificationSettings(NotificationSettingsUpdateForm body) throws Exception {
        return (PlusApiResultNotificationSettingsVO) client.put(ApiPaths.appPath("/notification/settings"), body);
    }

    /** 更新类型推送设置 */
    public PlusApiResultVoid updateTypeSettings(String type, NotificationTypeSettingsForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/notification/settings/" + type + ""), body);
    }

    /** 全部标记已读 */
    public PlusApiResultVoid markAllAsRead(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/notification/read/all"), null, params);
    }

    /** 批量标记已读 */
    public PlusApiResultVoid batchMarkAsRead(NotificationBatchReadForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/notification/batch/read"), body);
    }

    /** 发送测试消息 */
    public PlusApiResultVoid sendTest(TestNotificationForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/notification/test"), body);
    }

    /** 订阅列表 */
    public PlusApiResultListString listSubscriptions() throws Exception {
        return (PlusApiResultListString) client.get(ApiPaths.appPath("/notification/subscriptions"));
    }

    /** 订阅主题 */
    public PlusApiResultVoid subscribeTopic(TopicSubscribeForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/notification/subscriptions"), body);
    }

    /** 获取设备列表 */
    public PlusApiResultListDeviceVO listDevices() throws Exception {
        return (PlusApiResultListDeviceVO) client.get(ApiPaths.appPath("/notification/devices"));
    }

    /** 注册推送设备 */
    public PlusApiResultVoid registerDevice(DeviceRegisterForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/notification/devices"), body);
    }

    /** 获取消息列表 */
    public PlusApiResultPageNotificationVO listNotifications(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageNotificationVO) client.get(ApiPaths.appPath("/notification"), params);
    }

    /** 获取消息详情 */
    public PlusApiResultNotificationDetailVO getNotificationDetail(String notificationId) throws Exception {
        return (PlusApiResultNotificationDetailVO) client.get(ApiPaths.appPath("/notification/" + notificationId + ""));
    }

    /** 删除消息 */
    public PlusApiResultVoid deleteNotification(String notificationId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/notification/" + notificationId + ""));
    }

    /** 未读消息统计 */
    public PlusApiResultMapStringInteger getUnreadCount() throws Exception {
        return (PlusApiResultMapStringInteger) client.get(ApiPaths.appPath("/notification/unread/count"));
    }

    /** 消息类型 */
    public PlusApiResultListNotificationTypeVO listNotificationTypes() throws Exception {
        return (PlusApiResultListNotificationTypeVO) client.get(ApiPaths.appPath("/notification/types"));
    }

    /** 取消订阅 */
    public PlusApiResultVoid unsubscribeTopic(String topic) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/notification/subscriptions/" + topic + ""));
    }

    /** 注销推送设备 */
    public PlusApiResultVoid unregisterDevice(String deviceToken) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/notification/devices/" + deviceToken + ""));
    }

    /** 清空消息 */
    public PlusApiResultVoid clearAllNotifications(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/notification/clear"), params);
    }

    /** 批量删除消息 */
    public PlusApiResultVoid batchDeleteNotifications() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/notification/batch"));
    }
}
