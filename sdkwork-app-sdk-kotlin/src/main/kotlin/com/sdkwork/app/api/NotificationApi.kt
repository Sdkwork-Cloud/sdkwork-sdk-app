package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class NotificationApi(private val client: HttpClient) {

    /** Mark notification as unread */
    suspend fun markAsUnread(notificationId: String): PlusApiResultNotificationVO? {
        return client.put(ApiPaths.appPath("/notification/$notificationId/unread"), null) as? PlusApiResultNotificationVO
    }

    /** Mark notification as read */
    suspend fun markAsRead(notificationId: String): PlusApiResultNotificationVO? {
        return client.put(ApiPaths.appPath("/notification/$notificationId/read"), null) as? PlusApiResultNotificationVO
    }

    /** Get notification settings */
    suspend fun getNotificationSettings(): PlusApiResultNotificationSettingsVO? {
        return client.get(ApiPaths.appPath("/notification/settings")) as? PlusApiResultNotificationSettingsVO
    }

    /** Update notification settings */
    suspend fun updateNotificationSettings(body: NotificationSettingsUpdateForm): PlusApiResultNotificationSettingsVO? {
        return client.put(ApiPaths.appPath("/notification/settings"), body) as? PlusApiResultNotificationSettingsVO
    }

    /** Update type settings */
    suspend fun updateTypeSettings(type: String, body: NotificationTypeSettingsForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/notification/settings/$type"), body) as? PlusApiResultVoid
    }

    /** Mark all notifications as read */
    suspend fun markAllAsRead(params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/notification/read/all"), null, params) as? PlusApiResultVoid
    }

    /** Update device status */
    suspend fun updateDeviceStatus(deviceId: String, body: DeviceStatusUpdateForm): PlusApiResultDeviceVO? {
        return client.put(ApiPaths.appPath("/notification/devices/$deviceId/status"), body) as? PlusApiResultDeviceVO
    }

    /** Batch mark notifications as read */
    suspend fun batchMarkAsRead(body: NotificationBatchReadForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/notification/batch/read"), body) as? PlusApiResultVoid
    }

    /** Send test notification */
    suspend fun sendTest(body: TestNotificationForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/notification/test"), body) as? PlusApiResultVoid
    }

    /** List subscriptions */
    suspend fun listSubscriptions(): PlusApiResultListString? {
        return client.get(ApiPaths.appPath("/notification/subscriptions")) as? PlusApiResultListString
    }

    /** Subscribe topic */
    suspend fun subscribeTopic(body: TopicSubscribeForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/notification/subscriptions"), body) as? PlusApiResultVoid
    }

    /** List devices */
    suspend fun listDevices(): PlusApiResultListDeviceVO? {
        return client.get(ApiPaths.appPath("/notification/devices")) as? PlusApiResultListDeviceVO
    }

    /** Register device */
    suspend fun registerDevice(body: DeviceRegisterForm): PlusApiResultDeviceVO? {
        return client.post(ApiPaths.appPath("/notification/devices"), body) as? PlusApiResultDeviceVO
    }

    /** List device messages */
    suspend fun listDeviceMessages(deviceId: String, params: Map<String, Any>? = null): PlusApiResultListDeviceMessageVO? {
        return client.get(ApiPaths.appPath("/notification/devices/$deviceId/messages"), params) as? PlusApiResultListDeviceMessageVO
    }

    /** Send device message */
    suspend fun sendDeviceMessage(deviceId: String, body: DeviceMessageSendForm): PlusApiResultDeviceMessageVO? {
        return client.post(ApiPaths.appPath("/notification/devices/$deviceId/messages"), body) as? PlusApiResultDeviceMessageVO
    }

    /** Control device */
    suspend fun controlDevice(deviceId: String, body: DeviceControlForm): PlusApiResultBoolean? {
        return client.post(ApiPaths.appPath("/notification/devices/$deviceId/control"), body) as? PlusApiResultBoolean
    }

    /** List notifications */
    suspend fun listNotifications(params: Map<String, Any>? = null): PlusApiResultPageNotificationVO? {
        return client.get(ApiPaths.appPath("/notification"), params) as? PlusApiResultPageNotificationVO
    }

    /** Get notification detail */
    suspend fun getNotificationDetail(notificationId: String): PlusApiResultNotificationDetailVO? {
        return client.get(ApiPaths.appPath("/notification/$notificationId")) as? PlusApiResultNotificationDetailVO
    }

    /** Delete notification */
    suspend fun deleteNotification(notificationId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/notification/$notificationId")) as? PlusApiResultVoid
    }

    /** Get unread notification count */
    suspend fun getUnreadCount(): PlusApiResultMapStringInteger? {
        return client.get(ApiPaths.appPath("/notification/unread/count")) as? PlusApiResultMapStringInteger
    }

    /** List notification types */
    suspend fun listNotificationTypes(): PlusApiResultListNotificationTypeVO? {
        return client.get(ApiPaths.appPath("/notification/types")) as? PlusApiResultListNotificationTypeVO
    }

    /** Unsubscribe topic */
    suspend fun unsubscribeTopic(topic: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/notification/subscriptions/$topic")) as? PlusApiResultVoid
    }

    /** Unregister device */
    suspend fun unregisterDevice(deviceToken: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/notification/devices/$deviceToken")) as? PlusApiResultVoid
    }

    /** Clear notifications */
    suspend fun clearAllNotifications(params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/notification/clear"), params) as? PlusApiResultVoid
    }

    /** Batch delete notifications */
    suspend fun batchDeleteNotifications(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/notification/batch")) as? PlusApiResultVoid
    }
}
