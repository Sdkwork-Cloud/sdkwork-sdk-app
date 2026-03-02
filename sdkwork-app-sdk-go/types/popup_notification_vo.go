package types

// 弹窗通知响应
type PopupNotificationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	Title string `json:"title"`
	Content string `json:"content"`
	Type string `json:"type"`
	Icon string `json:"icon"`
	Image string `json:"image"`
	Url string `json:"url"`
	Buttons []NotificationButtonVO `json:"buttons"`
	NeedConfirm bool `json:"needConfirm"`
	Closable bool `json:"closable"`
	Duration int `json:"duration"`
	Priority int `json:"priority"`
}
