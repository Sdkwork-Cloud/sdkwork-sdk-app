package types

// 通知类型响应
type NotificationTypeVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Type string `json:"type"`
	Name string `json:"name"`
	Enabled bool `json:"enabled"`
	PushMethod string `json:"pushMethod"`
	NeedReminder bool `json:"needReminder"`
	Description string `json:"description"`
}
