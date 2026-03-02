package types

// 通知类型设置表单
type NotificationTypeSettingsForm struct {
	Type string `json:"type"`
	Enabled bool `json:"enabled"`
	PushMethod string `json:"pushMethod"`
	NeedReminder bool `json:"needReminder"`
}
