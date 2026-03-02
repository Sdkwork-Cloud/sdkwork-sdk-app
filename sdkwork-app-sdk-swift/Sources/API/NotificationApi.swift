import Foundation

public class NotificationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 标记已读
    public func markAsRead(notificationId: String) async throws -> PlusApiResultNotificationVO? {
        let response = try await client.put(ApiPaths.appPath("/notification/\(notificationId)/read"), body: nil)
        return response as? PlusApiResultNotificationVO
    }

    /// 获取推送设置
    public func getNotificationSettings() async throws -> PlusApiResultNotificationSettingsVO? {
        let response = try await client.get(ApiPaths.appPath("/notification/settings"))
        return response as? PlusApiResultNotificationSettingsVO
    }

    /// 更新推送设置
    public func updateNotificationSettings(body: NotificationSettingsUpdateForm) async throws -> PlusApiResultNotificationSettingsVO? {
        let response = try await client.put(ApiPaths.appPath("/notification/settings"), body: body)
        return response as? PlusApiResultNotificationSettingsVO
    }

    /// 更新类型推送设置
    public func updateTypeSettings(type: String, body: NotificationTypeSettingsForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/notification/settings/\(type)"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 全部标记已读
    public func markAllAsRead(params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/notification/read/all"), body: nil, params: params)
        return response as? PlusApiResultVoid
    }

    /// 批量标记已读
    public func batchMarkAsRead(body: NotificationBatchReadForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/notification/batch/read"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 发送测试消息
    public func sendTest(body: TestNotificationForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/notification/test"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 订阅列表
    public func listSubscriptions() async throws -> PlusApiResultListString? {
        let response = try await client.get(ApiPaths.appPath("/notification/subscriptions"))
        return response as? PlusApiResultListString
    }

    /// 订阅主题
    public func subscribeTopic(body: TopicSubscribeForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/notification/subscriptions"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 获取设备列表
    public func listDevices() async throws -> PlusApiResultListDeviceVO? {
        let response = try await client.get(ApiPaths.appPath("/notification/devices"))
        return response as? PlusApiResultListDeviceVO
    }

    /// 注册推送设备
    public func registerDevice(body: DeviceRegisterForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/notification/devices"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 获取消息列表
    public func listNotifications(params: [String: Any]? = nil) async throws -> PlusApiResultPageNotificationVO? {
        let response = try await client.get(ApiPaths.appPath("/notification"), params: params)
        return response as? PlusApiResultPageNotificationVO
    }

    /// 获取消息详情
    public func getNotificationDetail(notificationId: String) async throws -> PlusApiResultNotificationDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/notification/\(notificationId)"))
        return response as? PlusApiResultNotificationDetailVO
    }

    /// 删除消息
    public func deleteNotification(notificationId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/notification/\(notificationId)"))
        return response as? PlusApiResultVoid
    }

    /// 未读消息统计
    public func getUnreadCount() async throws -> PlusApiResultMapStringInteger? {
        let response = try await client.get(ApiPaths.appPath("/notification/unread/count"))
        return response as? PlusApiResultMapStringInteger
    }

    /// 消息类型
    public func listNotificationTypes() async throws -> PlusApiResultListNotificationTypeVO? {
        let response = try await client.get(ApiPaths.appPath("/notification/types"))
        return response as? PlusApiResultListNotificationTypeVO
    }

    /// 取消订阅
    public func unsubscribeTopic(topic: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/notification/subscriptions/\(topic)"))
        return response as? PlusApiResultVoid
    }

    /// 注销推送设备
    public func unregisterDevice(deviceToken: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/notification/devices/\(deviceToken)"))
        return response as? PlusApiResultVoid
    }

    /// 清空消息
    public func clearAllNotifications(params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/notification/clear"), params: params)
        return response as? PlusApiResultVoid
    }

    /// 批量删除消息
    public func batchDeleteNotifications() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/notification/batch"))
        return response as? PlusApiResultVoid
    }
}
