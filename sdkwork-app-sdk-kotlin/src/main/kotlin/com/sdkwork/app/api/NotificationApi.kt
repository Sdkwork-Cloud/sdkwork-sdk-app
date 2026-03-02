package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class NotificationApi(private val client: HttpClient) {

    /** 标记已读 */
    suspend fun markAsRead(notificationId: String): PlusApiResultNotificationVO? {
        return client.put(ApiPaths.appPath("/notification/$notificationId/read"), null) as? PlusApiResultNotificationVO
    }

    /** 获取推送设置 */
    suspend fun getNotificationSettings(): PlusApiResultNotificationSettingsVO? {
        return client.get(ApiPaths.appPath("/notification/settings")) as? PlusApiResultNotificationSettingsVO
    }

    /** 更新推送设置 */
    suspend fun updateNotificationSettings(body: NotificationSettingsUpdateForm): PlusApiResultNotificationSettingsVO? {
        return client.put(ApiPaths.appPath("/notification/settings"), body) as? PlusApiResultNotificationSettingsVO
    }

    /** 更新类型推送设置 */
    suspend fun updateTypeSettings(type: String, body: NotificationTypeSettingsForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/notification/settings/$type"), body) as? PlusApiResultVoid
    }

    /** 全部标记已读 */
    suspend fun markAllAsRead(params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/notification/read/all"), null, params) as? PlusApiResultVoid
    }

    /** 批量标记已读 */
    suspend fun batchMarkAsRead(body: NotificationBatchReadForm): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/notification/batch/read"), body) as? PlusApiResultVoid
    }

    /** 发送测试消息 */
    suspend fun sendTest(body: TestNotificationForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/notification/test"), body) as? PlusApiResultVoid
    }

    /** 订阅列表 */
    suspend fun listSubscriptions(): PlusApiResultListString? {
        return client.get(ApiPaths.appPath("/notification/subscriptions")) as? PlusApiResultListString
    }

    /** 订阅主题 */
    suspend fun subscribeTopic(body: TopicSubscribeForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/notification/subscriptions"), body) as? PlusApiResultVoid
    }

    /** 获取设备列表 */
    suspend fun listDevices(): PlusApiResultListDeviceVO? {
        return client.get(ApiPaths.appPath("/notification/devices")) as? PlusApiResultListDeviceVO
    }

    /** 注册推送设备 */
    suspend fun registerDevice(body: DeviceRegisterForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/notification/devices"), body) as? PlusApiResultVoid
    }

    /** 获取消息列表 */
    suspend fun listNotifications(params: Map<String, Any>? = null): PlusApiResultPageNotificationVO? {
        return client.get(ApiPaths.appPath("/notification"), params) as? PlusApiResultPageNotificationVO
    }

    /** 获取消息详情 */
    suspend fun getNotificationDetail(notificationId: String): PlusApiResultNotificationDetailVO? {
        return client.get(ApiPaths.appPath("/notification/$notificationId")) as? PlusApiResultNotificationDetailVO
    }

    /** 删除消息 */
    suspend fun deleteNotification(notificationId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/notification/$notificationId")) as? PlusApiResultVoid
    }

    /** 未读消息统计 */
    suspend fun getUnreadCount(): PlusApiResultMapStringInteger? {
        return client.get(ApiPaths.appPath("/notification/unread/count")) as? PlusApiResultMapStringInteger
    }

    /** 消息类型 */
    suspend fun listNotificationTypes(): PlusApiResultListNotificationTypeVO? {
        return client.get(ApiPaths.appPath("/notification/types")) as? PlusApiResultListNotificationTypeVO
    }

    /** 取消订阅 */
    suspend fun unsubscribeTopic(topic: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/notification/subscriptions/$topic")) as? PlusApiResultVoid
    }

    /** 注销推送设备 */
    suspend fun unregisterDevice(deviceToken: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/notification/devices/$deviceToken")) as? PlusApiResultVoid
    }

    /** 清空消息 */
    suspend fun clearAllNotifications(params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/notification/clear"), params) as? PlusApiResultVoid
    }

    /** 批量删除消息 */
    suspend fun batchDeleteNotifications(): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/notification/batch")) as? PlusApiResultVoid
    }
}
