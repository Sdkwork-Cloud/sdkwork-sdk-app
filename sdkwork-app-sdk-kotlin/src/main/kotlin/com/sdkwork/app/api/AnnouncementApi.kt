package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AnnouncementApi(private val client: HttpClient) {

    /** 标记已读 */
    suspend fun markAsRead(announcementId: String): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/announcement/$announcementId/read"), null) as? PlusApiResultVoid
    }

    /** 全部已读 */
    suspend fun markAllAsRead(): PlusApiResultVoid? {
        return client.put(ApiPaths.appPath("/announcement/read/all"), null) as? PlusApiResultVoid
    }

    /** 确认公告 */
    suspend fun acknowledge(announcementId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/announcement/$announcementId/acknowledge"), null) as? PlusApiResultVoid
    }

    /** 关闭弹窗 */
    suspend fun dismissPopup(popupId: String, params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/announcement/popups/$popupId/dismiss"), null, params) as? PlusApiResultVoid
    }

    /** 完成引导 */
    suspend fun completeOnboarding(params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/announcement/onboarding/complete"), null, params) as? PlusApiResultVoid
    }

    /** 公告列表 */
    suspend fun listAnnouncements(params: Map<String, Any>? = null): PlusApiResultPageAnnouncementVO? {
        return client.get(ApiPaths.appPath("/announcement"), params) as? PlusApiResultPageAnnouncementVO
    }

    /** 公告详情 */
    suspend fun getAnnouncementDetail(announcementId: String): PlusApiResultAnnouncementDetailVO? {
        return client.get(ApiPaths.appPath("/announcement/$announcementId")) as? PlusApiResultAnnouncementDetailVO
    }

    /** 检查更新 */
    suspend fun checkUpdate(params: Map<String, Any>? = null): PlusApiResultUpdateCheckVO? {
        return client.get(ApiPaths.appPath("/announcement/update/check"), params) as? PlusApiResultUpdateCheckVO
    }

    /** 更新日志 */
    suspend fun getChangelogs(params: Map<String, Any>? = null): PlusApiResultListChangelogVO? {
        return client.get(ApiPaths.appPath("/announcement/update/changelog"), params) as? PlusApiResultListChangelogVO
    }

    /** 未读公告 */
    suspend fun getUnreadAnnouncements(): PlusApiResultListAnnouncementVO? {
        return client.get(ApiPaths.appPath("/announcement/unread")) as? PlusApiResultListAnnouncementVO
    }

    /** 未读公告数 */
    suspend fun getUnreadAnnouncementCount(): PlusApiResultInteger? {
        return client.get(ApiPaths.appPath("/announcement/unread/count")) as? PlusApiResultInteger
    }

    /** 系统状态 */
    suspend fun getSystemStatus(): PlusApiResultSystemStatusVO? {
        return client.get(ApiPaths.appPath("/announcement/system/status")) as? PlusApiResultSystemStatusVO
    }

    /** 维护公告 */
    suspend fun getMaintenanceNotice(): PlusApiResultMaintenanceNoticeVO? {
        return client.get(ApiPaths.appPath("/announcement/system/maintenance")) as? PlusApiResultMaintenanceNoticeVO
    }

    /** 弹窗通知 */
    suspend fun getPopupNotifications(params: Map<String, Any>? = null): PlusApiResultListPopupNotificationVO? {
        return client.get(ApiPaths.appPath("/announcement/popups"), params) as? PlusApiResultListPopupNotificationVO
    }

    /** 置顶公告 */
    suspend fun getPinnedAnnouncements(): PlusApiResultListAnnouncementVO? {
        return client.get(ApiPaths.appPath("/announcement/pinned")) as? PlusApiResultListAnnouncementVO
    }

    /** 新用户引导 */
    suspend fun getOnboardingPages(params: Map<String, Any>? = null): PlusApiResultListOnboardingPageVO? {
        return client.get(ApiPaths.appPath("/announcement/onboarding"), params) as? PlusApiResultListOnboardingPageVO
    }

    /** 最新公告 */
    suspend fun getLatestAnnouncements(params: Map<String, Any>? = null): PlusApiResultListAnnouncementVO? {
        return client.get(ApiPaths.appPath("/announcement/latest"), params) as? PlusApiResultListAnnouncementVO
    }
}
