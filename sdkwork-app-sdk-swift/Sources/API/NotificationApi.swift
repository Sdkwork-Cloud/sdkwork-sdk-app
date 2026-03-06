import Foundation

public class NotificationApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// Mark notification as unread
    public func markAsUnread(notificationId: String) async throws -> PlusApiResultNotificationVO? {
        let response = try await client.put(ApiPaths.appPath("/notification/\(notificationId)/unread"), body: nil)
        return response as? PlusApiResultNotificationVO
    }

    /// Mark notification as read
    public func markAsRead(notificationId: String) async throws -> PlusApiResultNotificationVO? {
        let response = try await client.put(ApiPaths.appPath("/notification/\(notificationId)/read"), body: nil)
        return response as? PlusApiResultNotificationVO
    }

    /// Get notification settings
    public func getNotificationSettings() async throws -> PlusApiResultNotificationSettingsVO? {
        let response = try await client.get(ApiPaths.appPath("/notification/settings"))
        return response as? PlusApiResultNotificationSettingsVO
    }

    /// Update notification settings
    public func updateNotificationSettings(body: NotificationSettingsUpdateForm) async throws -> PlusApiResultNotificationSettingsVO? {
        let response = try await client.put(ApiPaths.appPath("/notification/settings"), body: body)
        return response as? PlusApiResultNotificationSettingsVO
    }

    /// Update type settings
    public func updateTypeSettings(type: String, body: NotificationTypeSettingsForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/notification/settings/\(type)"), body: body)
        return response as? PlusApiResultVoid
    }

    /// Mark all notifications as read
    public func markAllAsRead(params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/notification/read/all"), body: nil, params: params)
        return response as? PlusApiResultVoid
    }

    /// Update device status
    public func updateDeviceStatus(deviceId: String, body: DeviceStatusUpdateForm) async throws -> PlusApiResultDeviceVO? {
        let response = try await client.put(ApiPaths.appPath("/notification/devices/\(deviceId)/status"), body: body)
        return response as? PlusApiResultDeviceVO
    }

    /// Batch mark notifications as read
    public func batchMarkAsRead(body: NotificationBatchReadForm) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/notification/batch/read"), body: body)
        return response as? PlusApiResultVoid
    }

    /// Send test notification
    public func sendTest(body: TestNotificationForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/notification/test"), body: body)
        return response as? PlusApiResultVoid
    }

    /// List subscriptions
    public func listSubscriptions() async throws -> PlusApiResultListString? {
        let response = try await client.get(ApiPaths.appPath("/notification/subscriptions"))
        return response as? PlusApiResultListString
    }

    /// Subscribe topic
    public func subscribeTopic(body: TopicSubscribeForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/notification/subscriptions"), body: body)
        return response as? PlusApiResultVoid
    }

    /// List devices
    public func listDevices() async throws -> PlusApiResultListDeviceVO? {
        let response = try await client.get(ApiPaths.appPath("/notification/devices"))
        return response as? PlusApiResultListDeviceVO
    }

    /// Register device
    public func registerDevice(body: DeviceRegisterForm) async throws -> PlusApiResultDeviceVO? {
        let response = try await client.post(ApiPaths.appPath("/notification/devices"), body: body)
        return response as? PlusApiResultDeviceVO
    }

    /// List device messages
    public func listDeviceMessages(deviceId: String, params: [String: Any]? = nil) async throws -> PlusApiResultListDeviceMessageVO? {
        let response = try await client.get(ApiPaths.appPath("/notification/devices/\(deviceId)/messages"), params: params)
        return response as? PlusApiResultListDeviceMessageVO
    }

    /// Send device message
    public func sendDeviceMessage(deviceId: String, body: DeviceMessageSendForm) async throws -> PlusApiResultDeviceMessageVO? {
        let response = try await client.post(ApiPaths.appPath("/notification/devices/\(deviceId)/messages"), body: body)
        return response as? PlusApiResultDeviceMessageVO
    }

    /// Control device
    public func controlDevice(deviceId: String, body: DeviceControlForm) async throws -> PlusApiResultBoolean? {
        let response = try await client.post(ApiPaths.appPath("/notification/devices/\(deviceId)/control"), body: body)
        return response as? PlusApiResultBoolean
    }

    /// List notifications
    public func listNotifications(params: [String: Any]? = nil) async throws -> PlusApiResultPageNotificationVO? {
        let response = try await client.get(ApiPaths.appPath("/notification"), params: params)
        return response as? PlusApiResultPageNotificationVO
    }

    /// Get notification detail
    public func getNotificationDetail(notificationId: String) async throws -> PlusApiResultNotificationDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/notification/\(notificationId)"))
        return response as? PlusApiResultNotificationDetailVO
    }

    /// Delete notification
    public func deleteNotification(notificationId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/notification/\(notificationId)"))
        return response as? PlusApiResultVoid
    }

    /// Get unread notification count
    public func getUnreadCount() async throws -> PlusApiResultMapStringInteger? {
        let response = try await client.get(ApiPaths.appPath("/notification/unread/count"))
        return response as? PlusApiResultMapStringInteger
    }

    /// List notification types
    public func listNotificationTypes() async throws -> PlusApiResultListNotificationTypeVO? {
        let response = try await client.get(ApiPaths.appPath("/notification/types"))
        return response as? PlusApiResultListNotificationTypeVO
    }

    /// Unsubscribe topic
    public func unsubscribeTopic(topic: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/notification/subscriptions/\(topic)"))
        return response as? PlusApiResultVoid
    }

    /// Unregister device
    public func unregisterDevice(deviceToken: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/notification/devices/\(deviceToken)"))
        return response as? PlusApiResultVoid
    }

    /// Clear notifications
    public func clearAllNotifications(params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/notification/clear"), params: params)
        return response as? PlusApiResultVoid
    }

    /// Batch delete notifications
    public func batchDeleteNotifications() async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/notification/batch"))
        return response as? PlusApiResultVoid
    }
}
