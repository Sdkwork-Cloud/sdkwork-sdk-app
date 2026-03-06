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

// Mark notification as unread
func (a *NotificationApi) MarkAsUnread(notificationId string) (sdktypes.PlusApiResultNotificationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notification/%s/unread", notificationId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNotificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNotificationVO](raw)
}

// Mark notification as read
func (a *NotificationApi) MarkAsRead(notificationId string) (sdktypes.PlusApiResultNotificationVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notification/%s/read", notificationId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNotificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNotificationVO](raw)
}

// Get notification settings
func (a *NotificationApi) GetNotificationSettings() (sdktypes.PlusApiResultNotificationSettingsVO, error) {
    raw, err := a.client.Get(AppApiPath("/notification/settings"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNotificationSettingsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNotificationSettingsVO](raw)
}

// Update notification settings
func (a *NotificationApi) UpdateNotificationSettings(body sdktypes.NotificationSettingsUpdateForm) (sdktypes.PlusApiResultNotificationSettingsVO, error) {
    raw, err := a.client.Put(AppApiPath("/notification/settings"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultNotificationSettingsVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNotificationSettingsVO](raw)
}

// Update type settings
func (a *NotificationApi) UpdateTypeSettings(type string, body sdktypes.NotificationTypeSettingsForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notification/settings/%s", type)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Mark all notifications as read
func (a *NotificationApi) MarkAllAsRead(query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/notification/read/all"), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Update device status
func (a *NotificationApi) UpdateDeviceStatus(deviceId string, body sdktypes.DeviceStatusUpdateForm) (sdktypes.PlusApiResultDeviceVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/notification/devices/%s/status", deviceId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDeviceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDeviceVO](raw)
}

// Batch mark notifications as read
func (a *NotificationApi) BatchMarkAsRead(body sdktypes.NotificationBatchReadForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/notification/batch/read"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Send test notification
func (a *NotificationApi) SendTest(body sdktypes.TestNotificationForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/notification/test"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// List subscriptions
func (a *NotificationApi) ListSubscriptions() (sdktypes.PlusApiResultListString, error) {
    raw, err := a.client.Get(AppApiPath("/notification/subscriptions"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListString
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListString](raw)
}

// Subscribe topic
func (a *NotificationApi) SubscribeTopic(body sdktypes.TopicSubscribeForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath("/notification/subscriptions"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// List devices
func (a *NotificationApi) ListDevices() (sdktypes.PlusApiResultListDeviceVO, error) {
    raw, err := a.client.Get(AppApiPath("/notification/devices"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListDeviceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListDeviceVO](raw)
}

// Register device
func (a *NotificationApi) RegisterDevice(body sdktypes.DeviceRegisterForm) (sdktypes.PlusApiResultDeviceVO, error) {
    raw, err := a.client.Post(AppApiPath("/notification/devices"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDeviceVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDeviceVO](raw)
}

// List device messages
func (a *NotificationApi) ListDeviceMessages(deviceId string, query map[string]interface{}) (sdktypes.PlusApiResultListDeviceMessageVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/notification/devices/%s/messages", deviceId)), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListDeviceMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListDeviceMessageVO](raw)
}

// Send device message
func (a *NotificationApi) SendDeviceMessage(deviceId string, body sdktypes.DeviceMessageSendForm) (sdktypes.PlusApiResultDeviceMessageVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/notification/devices/%s/messages", deviceId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultDeviceMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultDeviceMessageVO](raw)
}

// Control device
func (a *NotificationApi) ControlDevice(deviceId string, body sdktypes.DeviceControlForm) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/notification/devices/%s/control", deviceId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// List notifications
func (a *NotificationApi) ListNotifications(query map[string]interface{}) (sdktypes.PlusApiResultPageNotificationVO, error) {
    raw, err := a.client.Get(AppApiPath("/notification"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageNotificationVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageNotificationVO](raw)
}

// Get notification detail
func (a *NotificationApi) GetNotificationDetail(notificationId string) (sdktypes.PlusApiResultNotificationDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/notification/%s", notificationId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultNotificationDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultNotificationDetailVO](raw)
}

// Delete notification
func (a *NotificationApi) DeleteNotification(notificationId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/notification/%s", notificationId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Get unread notification count
func (a *NotificationApi) GetUnreadCount() (sdktypes.PlusApiResultMapStringInteger, error) {
    raw, err := a.client.Get(AppApiPath("/notification/unread/count"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultMapStringInteger
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultMapStringInteger](raw)
}

// List notification types
func (a *NotificationApi) ListNotificationTypes() (sdktypes.PlusApiResultListNotificationTypeVO, error) {
    raw, err := a.client.Get(AppApiPath("/notification/types"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListNotificationTypeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListNotificationTypeVO](raw)
}

// Unsubscribe topic
func (a *NotificationApi) UnsubscribeTopic(topic string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/notification/subscriptions/%s", topic)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Unregister device
func (a *NotificationApi) UnregisterDevice(deviceToken string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/notification/devices/%s", deviceToken)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Clear notifications
func (a *NotificationApi) ClearAllNotifications(query map[string]interface{}) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/notification/clear"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// Batch delete notifications
func (a *NotificationApi) BatchDeleteNotifications() (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath("/notification/batch"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
