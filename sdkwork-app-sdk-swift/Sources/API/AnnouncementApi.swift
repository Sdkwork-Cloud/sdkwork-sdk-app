import Foundation

public class AnnouncementApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 标记已读
    public func markAsRead(announcementId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/announcement/\(announcementId)/read"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 全部已读
    public func markAllAsRead() async throws -> PlusApiResultVoid? {
        let response = try await client.put(ApiPaths.appPath("/announcement/read/all"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 确认公告
    public func acknowledge(announcementId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/announcement/\(announcementId)/acknowledge"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 关闭弹窗
    public func dismissPopup(popupId: String, params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/announcement/popups/\(popupId)/dismiss"), body: nil, params: params)
        return response as? PlusApiResultVoid
    }

    /// 完成引导
    public func completeOnboarding(params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/announcement/onboarding/complete"), body: nil, params: params)
        return response as? PlusApiResultVoid
    }

    /// 公告列表
    public func listAnnouncements(params: [String: Any]? = nil) async throws -> PlusApiResultPageAnnouncementVO? {
        let response = try await client.get(ApiPaths.appPath("/announcement"), params: params)
        return response as? PlusApiResultPageAnnouncementVO
    }

    /// 公告详情
    public func getAnnouncementDetail(announcementId: String) async throws -> PlusApiResultAnnouncementDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/announcement/\(announcementId)"))
        return response as? PlusApiResultAnnouncementDetailVO
    }

    /// 检查更新
    public func checkUpdate(params: [String: Any]? = nil) async throws -> PlusApiResultUpdateCheckVO? {
        let response = try await client.get(ApiPaths.appPath("/announcement/update/check"), params: params)
        return response as? PlusApiResultUpdateCheckVO
    }

    /// 更新日志
    public func getChangelogs(params: [String: Any]? = nil) async throws -> PlusApiResultListChangelogVO? {
        let response = try await client.get(ApiPaths.appPath("/announcement/update/changelog"), params: params)
        return response as? PlusApiResultListChangelogVO
    }

    /// 未读公告
    public func getUnreadAnnouncements() async throws -> PlusApiResultListAnnouncementVO? {
        let response = try await client.get(ApiPaths.appPath("/announcement/unread"))
        return response as? PlusApiResultListAnnouncementVO
    }

    /// 未读公告数
    public func getUnreadAnnouncementCount() async throws -> PlusApiResultInteger? {
        let response = try await client.get(ApiPaths.appPath("/announcement/unread/count"))
        return response as? PlusApiResultInteger
    }

    /// 系统状态
    public func getSystemStatus() async throws -> PlusApiResultSystemStatusVO? {
        let response = try await client.get(ApiPaths.appPath("/announcement/system/status"))
        return response as? PlusApiResultSystemStatusVO
    }

    /// 维护公告
    public func getMaintenanceNotice() async throws -> PlusApiResultMaintenanceNoticeVO? {
        let response = try await client.get(ApiPaths.appPath("/announcement/system/maintenance"))
        return response as? PlusApiResultMaintenanceNoticeVO
    }

    /// 弹窗通知
    public func getPopupNotifications(params: [String: Any]? = nil) async throws -> PlusApiResultListPopupNotificationVO? {
        let response = try await client.get(ApiPaths.appPath("/announcement/popups"), params: params)
        return response as? PlusApiResultListPopupNotificationVO
    }

    /// 置顶公告
    public func getPinnedAnnouncements() async throws -> PlusApiResultListAnnouncementVO? {
        let response = try await client.get(ApiPaths.appPath("/announcement/pinned"))
        return response as? PlusApiResultListAnnouncementVO
    }

    /// 新用户引导
    public func getOnboardingPages(params: [String: Any]? = nil) async throws -> PlusApiResultListOnboardingPageVO? {
        let response = try await client.get(ApiPaths.appPath("/announcement/onboarding"), params: params)
        return response as? PlusApiResultListOnboardingPageVO
    }

    /// 最新公告
    public func getLatestAnnouncements(params: [String: Any]? = nil) async throws -> PlusApiResultListAnnouncementVO? {
        let response = try await client.get(ApiPaths.appPath("/announcement/latest"), params: params)
        return response as? PlusApiResultListAnnouncementVO
    }
}
