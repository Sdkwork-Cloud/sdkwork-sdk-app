package types

// 通知设置
type NotificationSettingsVO struct {
	System bool `json:"system"`
	Message bool `json:"message"`
	Activity bool `json:"activity"`
	Promotion bool `json:"promotion"`
	Sound bool `json:"sound"`
	Vibration bool `json:"vibration"`
}
