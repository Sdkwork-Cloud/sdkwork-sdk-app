package types

// 通知设置更新表单
type NotificationSettingsUpdateForm struct {
	EnablePush bool `json:"enablePush"`
	EnableEmail bool `json:"enableEmail"`
	EnableSms bool `json:"enableSms"`
	EnableInApp bool `json:"enableInApp"`
	QuietHoursStart string `json:"quietHoursStart"`
	QuietHoursEnd string `json:"quietHoursEnd"`
	NotificationSound string `json:"notificationSound"`
	VibrationEnabled bool `json:"vibrationEnabled"`
}
