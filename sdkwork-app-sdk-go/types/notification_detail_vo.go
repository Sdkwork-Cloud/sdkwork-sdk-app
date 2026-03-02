package types

// 通知详情VO
type NotificationDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	NotificationId string `json:"notificationId"`
	Title string `json:"title"`
	Content string `json:"content"`
	Type string `json:"type"`
	Status string `json:"status"`
	Source string `json:"source"`
	RedirectUrl string `json:"redirectUrl"`
	IsRead bool `json:"isRead"`
	ReadAt string `json:"readAt"`
	ExtraData map[string]interface{} `json:"extraData"`
}
