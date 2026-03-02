from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultAnnouncementDetailVO, PlusApiResultInteger, PlusApiResultListAnnouncementVO, PlusApiResultListChangelogVO, PlusApiResultListOnboardingPageVO, PlusApiResultListPopupNotificationVO, PlusApiResultMaintenanceNoticeVO, PlusApiResultPageAnnouncementVO, PlusApiResultSystemStatusVO, PlusApiResultUpdateCheckVO, PlusApiResultVoid

class AnnouncementApi:
    """announcement API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def mark_as_read(self, announcementId: str) -> PlusApiResultVoid:
        """标记已读"""
        return self._client.put(f"/app/v3/api/announcement/{announcementId}/read")

    def mark_all_as_read(self) -> PlusApiResultVoid:
        """全部已读"""
        return self._client.put(f"/app/v3/api/announcement/read/all")

    def acknowledge(self, announcementId: str) -> PlusApiResultVoid:
        """确认公告"""
        return self._client.post(f"/app/v3/api/announcement/{announcementId}/acknowledge")

    def dismiss_popup(self, popupId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """关闭弹窗"""
        return self._client.post(f"/app/v3/api/announcement/popups/{popupId}/dismiss", params=params)

    def complete_onboarding(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """完成引导"""
        return self._client.post(f"/app/v3/api/announcement/onboarding/complete", params=params)

    def list_announcements(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageAnnouncementVO:
        """公告列表"""
        return self._client.get(f"/app/v3/api/announcement", params=params)

    def get_announcement_detail(self, announcementId: str) -> PlusApiResultAnnouncementDetailVO:
        """公告详情"""
        return self._client.get(f"/app/v3/api/announcement/{announcementId}")

    def check_update(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultUpdateCheckVO:
        """检查更新"""
        return self._client.get(f"/app/v3/api/announcement/update/check", params=params)

    def get_changelogs(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListChangelogVO:
        """更新日志"""
        return self._client.get(f"/app/v3/api/announcement/update/changelog", params=params)

    def get_unread_announcements(self) -> PlusApiResultListAnnouncementVO:
        """未读公告"""
        return self._client.get(f"/app/v3/api/announcement/unread")

    def get_unread_announcement_count(self) -> PlusApiResultInteger:
        """未读公告数"""
        return self._client.get(f"/app/v3/api/announcement/unread/count")

    def get_system_status(self) -> PlusApiResultSystemStatusVO:
        """系统状态"""
        return self._client.get(f"/app/v3/api/announcement/system/status")

    def get_maintenance_notice(self) -> PlusApiResultMaintenanceNoticeVO:
        """维护公告"""
        return self._client.get(f"/app/v3/api/announcement/system/maintenance")

    def get_popup_notifications(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListPopupNotificationVO:
        """弹窗通知"""
        return self._client.get(f"/app/v3/api/announcement/popups", params=params)

    def get_pinned_announcements(self) -> PlusApiResultListAnnouncementVO:
        """置顶公告"""
        return self._client.get(f"/app/v3/api/announcement/pinned")

    def get_onboarding_pages(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListOnboardingPageVO:
        """新用户引导"""
        return self._client.get(f"/app/v3/api/announcement/onboarding", params=params)

    def get_latest_announcements(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListAnnouncementVO:
        """最新公告"""
        return self._client.get(f"/app/v3/api/announcement/latest", params=params)
