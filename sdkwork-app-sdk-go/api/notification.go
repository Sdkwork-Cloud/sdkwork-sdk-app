package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type NotificationApi struct {
    client *sdkhttp.Client
}

func NewNotificationApi(client *sdkhttp.Client) *NotificationApi {
    return &NotificationApi{client: client}
}

// 标记已读
func (a *NotificationApi) MarkAsRead(notificationId string) (sdktypes.PlusApiResultNotificationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notification/%s/read", notificationId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNotificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNotificationVO](raw)
}

// 获取推送设置
func (a *NotificationApi) GetNotificationSettings() (sdktypes.PlusApiResultNotificationSettingsVO, error) {
    raw, err := a.client.Get(AppApiPath("/notification/settings"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNotificationSettingsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNotificationSettingsVO](raw)
}

// 更新推送设置
func (a *NotificationApi) UpdateNotificationSettings(body sdktypes.NotificationSettingsUpdateForm) (sdktypes.PlusApiResultNotificationSettingsVO, error) {
    raw, err := a.client.Put(AppApiPath("/notification/settings"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNotificationSettingsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNotificationSettingsVO](raw)
}

// 更新类型推送设置
func (a *NotificationApi) UpdateTypeSettings(type string, body sdktypes.NotificationTypeSettingsForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notification/settings/%s", type)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 全部标记已读
func (a *NotificationApi) MarkAllAsRead(query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/notification/read/all"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 批量标记已读
func (a *NotificationApi) BatchMarkAsRead(body sdktypes.NotificationBatchReadForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/notification/batch/read"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 发送测试消息
func (a *NotificationApi) SendTest(body sdktypes.TestNotificationForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/notification/test"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 订阅列表
func (a *NotificationApi) ListSubscriptions() (sdktypes.PlusApiResultListString, error) {
    raw, err := a.client.Get(AppApiPath("/notification/subscriptions"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListString
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListString](raw)
}

// 订阅主题
func (a *NotificationApi) SubscribeTopic(body sdktypes.TopicSubscribeForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/notification/subscriptions"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取设备列表
func (a *NotificationApi) ListDevices() (sdktypes.PlusApiResultListDeviceVO, error) {
    raw, err := a.client.Get(AppApiPath("/notification/devices"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListDeviceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListDeviceVO](raw)
}

// 注册推送设备
func (a *NotificationApi) RegisterDevice(body sdktypes.DeviceRegisterForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/notification/devices"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取消息列表
func (a *NotificationApi) ListNotifications(query map[string]interface{}) (sdktypes.PlusApiResultPageNotificationVO, error) {
    raw, err := a.client.Get(AppApiPath("/notification"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageNotificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageNotificationVO](raw)
}

// 获取消息详情
func (a *NotificationApi) GetNotificationDetail(notificationId string) (sdktypes.PlusApiResultNotificationDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/notification/%s", notificationId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNotificationDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNotificationDetailVO](raw)
}

// 删除消息
func (a *NotificationApi) DeleteNotification(notificationId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/notification/%s", notificationId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 未读消息统计
func (a *NotificationApi) GetUnreadCount() (sdktypes.PlusApiResultMapStringInteger, error) {
    raw, err := a.client.Get(AppApiPath("/notification/unread/count"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringInteger
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringInteger](raw)
}

// 消息类型
func (a *NotificationApi) ListNotificationTypes() (sdktypes.PlusApiResultListNotificationTypeVO, error) {
    raw, err := a.client.Get(AppApiPath("/notification/types"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListNotificationTypeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListNotificationTypeVO](raw)
}

// 取消订阅
func (a *NotificationApi) UnsubscribeTopic(topic string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/notification/subscriptions/%s", topic)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 注销推送设备
func (a *NotificationApi) UnregisterDevice(deviceToken string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/notification/devices/%s", deviceToken)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 清空消息
func (a *NotificationApi) ClearAllNotifications(query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/notification/clear"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 批量删除消息
func (a *NotificationApi) BatchDeleteNotifications() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/notification/batch"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
