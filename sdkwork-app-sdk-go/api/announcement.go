package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type AnnouncementApi struct {
    client *sdkhttp.Client
}

func NewAnnouncementApi(client *sdkhttp.Client) *AnnouncementApi {
    return &AnnouncementApi{client: client}
}

// 标记已读
func (a *AnnouncementApi) MarkAsRead(announcementId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/announcement/%s/read", announcementId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 全部已读
func (a *AnnouncementApi) MarkAllAsRead() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/announcement/read/all"), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 确认公告
func (a *AnnouncementApi) Acknowledge(announcementId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/announcement/%s/acknowledge", announcementId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 关闭弹窗
func (a *AnnouncementApi) DismissPopup(popupId string, query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/announcement/popups/%s/dismiss", popupId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 完成引导
func (a *AnnouncementApi) CompleteOnboarding(query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/announcement/onboarding/complete"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 公告列表
func (a *AnnouncementApi) ListAnnouncements(query map[string]interface{}) (sdktypes.PlusApiResultPageAnnouncementVO, error) {
    raw, err := a.client.Get(AppApiPath("/announcement"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageAnnouncementVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageAnnouncementVO](raw)
}

// 公告详情
func (a *AnnouncementApi) GetAnnouncementDetail(announcementId string) (sdktypes.PlusApiResultAnnouncementDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/announcement/%s", announcementId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultAnnouncementDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultAnnouncementDetailVO](raw)
}

// 检查更新
func (a *AnnouncementApi) CheckUpdate(query map[string]interface{}) (sdktypes.PlusApiResultUpdateCheckVO, error) {
    raw, err := a.client.Get(AppApiPath("/announcement/update/check"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultUpdateCheckVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUpdateCheckVO](raw)
}

// 更新日志
func (a *AnnouncementApi) GetChangelogs(query map[string]interface{}) (sdktypes.PlusApiResultListChangelogVO, error) {
    raw, err := a.client.Get(AppApiPath("/announcement/update/changelog"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListChangelogVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListChangelogVO](raw)
}

// 未读公告
func (a *AnnouncementApi) GetUnreadAnnouncements() (sdktypes.PlusApiResultListAnnouncementVO, error) {
    raw, err := a.client.Get(AppApiPath("/announcement/unread"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListAnnouncementVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListAnnouncementVO](raw)
}

// 未读公告数
func (a *AnnouncementApi) GetUnreadAnnouncementCount() (sdktypes.PlusApiResultInteger, error) {
    raw, err := a.client.Get(AppApiPath("/announcement/unread/count"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultInteger
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultInteger](raw)
}

// 系统状态
func (a *AnnouncementApi) GetSystemStatus() (sdktypes.PlusApiResultSystemStatusVO, error) {
    raw, err := a.client.Get(AppApiPath("/announcement/system/status"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSystemStatusVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSystemStatusVO](raw)
}

// 维护公告
func (a *AnnouncementApi) GetMaintenanceNotice() (sdktypes.PlusApiResultMaintenanceNoticeVO, error) {
    raw, err := a.client.Get(AppApiPath("/announcement/system/maintenance"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMaintenanceNoticeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMaintenanceNoticeVO](raw)
}

// 弹窗通知
func (a *AnnouncementApi) GetPopupNotifications(query map[string]interface{}) (sdktypes.PlusApiResultListPopupNotificationVO, error) {
    raw, err := a.client.Get(AppApiPath("/announcement/popups"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListPopupNotificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListPopupNotificationVO](raw)
}

// 置顶公告
func (a *AnnouncementApi) GetPinnedAnnouncements() (sdktypes.PlusApiResultListAnnouncementVO, error) {
    raw, err := a.client.Get(AppApiPath("/announcement/pinned"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListAnnouncementVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListAnnouncementVO](raw)
}

// 新用户引导
func (a *AnnouncementApi) GetOnboardingPages(query map[string]interface{}) (sdktypes.PlusApiResultListOnboardingPageVO, error) {
    raw, err := a.client.Get(AppApiPath("/announcement/onboarding"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListOnboardingPageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListOnboardingPageVO](raw)
}

// 最新公告
func (a *AnnouncementApi) GetLatestAnnouncements(query map[string]interface{}) (sdktypes.PlusApiResultListAnnouncementVO, error) {
    raw, err := a.client.Get(AppApiPath("/announcement/latest"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListAnnouncementVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListAnnouncementVO](raw)
}
