package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AnnouncementApi {
    private final HttpClient client;
    
    public AnnouncementApi(HttpClient client) {
        this.client = client;
    }

    /** 标记已读 */
    public PlusApiResultVoid markAsRead(String announcementId) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/announcement/" + announcementId + "/read"), null);
    }

    /** 全部已读 */
    public PlusApiResultVoid markAllAsRead() throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/announcement/read/all"), null);
    }

    /** 确认公告 */
    public PlusApiResultVoid acknowledge(String announcementId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/announcement/" + announcementId + "/acknowledge"), null);
    }

    /** 关闭弹窗 */
    public PlusApiResultVoid dismissPopup(String popupId, Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/announcement/popups/" + popupId + "/dismiss"), null, params);
    }

    /** 完成引导 */
    public PlusApiResultVoid completeOnboarding(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/announcement/onboarding/complete"), null, params);
    }

    /** 公告列表 */
    public PlusApiResultPageAnnouncementVO listAnnouncements(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageAnnouncementVO) client.get(ApiPaths.appPath("/announcement"), params);
    }

    /** 公告详情 */
    public PlusApiResultAnnouncementDetailVO getAnnouncementDetail(String announcementId) throws Exception {
        return (PlusApiResultAnnouncementDetailVO) client.get(ApiPaths.appPath("/announcement/" + announcementId + ""));
    }

    /** 检查更新 */
    public PlusApiResultUpdateCheckVO checkUpdate(Map<String, Object> params) throws Exception {
        return (PlusApiResultUpdateCheckVO) client.get(ApiPaths.appPath("/announcement/update/check"), params);
    }

    /** 更新日志 */
    public PlusApiResultListChangelogVO getChangelogs(Map<String, Object> params) throws Exception {
        return (PlusApiResultListChangelogVO) client.get(ApiPaths.appPath("/announcement/update/changelog"), params);
    }

    /** 未读公告 */
    public PlusApiResultListAnnouncementVO getUnreadAnnouncements() throws Exception {
        return (PlusApiResultListAnnouncementVO) client.get(ApiPaths.appPath("/announcement/unread"));
    }

    /** 未读公告数 */
    public PlusApiResultInteger getUnreadAnnouncementCount() throws Exception {
        return (PlusApiResultInteger) client.get(ApiPaths.appPath("/announcement/unread/count"));
    }

    /** 系统状态 */
    public PlusApiResultSystemStatusVO getSystemStatus() throws Exception {
        return (PlusApiResultSystemStatusVO) client.get(ApiPaths.appPath("/announcement/system/status"));
    }

    /** 维护公告 */
    public PlusApiResultMaintenanceNoticeVO getMaintenanceNotice() throws Exception {
        return (PlusApiResultMaintenanceNoticeVO) client.get(ApiPaths.appPath("/announcement/system/maintenance"));
    }

    /** 弹窗通知 */
    public PlusApiResultListPopupNotificationVO getPopupNotifications(Map<String, Object> params) throws Exception {
        return (PlusApiResultListPopupNotificationVO) client.get(ApiPaths.appPath("/announcement/popups"), params);
    }

    /** 置顶公告 */
    public PlusApiResultListAnnouncementVO getPinnedAnnouncements() throws Exception {
        return (PlusApiResultListAnnouncementVO) client.get(ApiPaths.appPath("/announcement/pinned"));
    }

    /** 新用户引导 */
    public PlusApiResultListOnboardingPageVO getOnboardingPages(Map<String, Object> params) throws Exception {
        return (PlusApiResultListOnboardingPageVO) client.get(ApiPaths.appPath("/announcement/onboarding"), params);
    }

    /** 最新公告 */
    public PlusApiResultListAnnouncementVO getLatestAnnouncements(Map<String, Object> params) throws Exception {
        return (PlusApiResultListAnnouncementVO) client.get(ApiPaths.appPath("/announcement/latest"), params);
    }
}
