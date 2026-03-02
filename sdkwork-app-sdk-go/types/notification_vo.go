package types

// 通知VO
type NotificationVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	NotificationId string `json:"notificationId"`
	Title string `json:"title"`
	Content string `json:"content"`
	Type string `json:"type"`
	Status string `json:"status"`
	Source string `json:"source"`
	Link string `json:"link"`
	IsRead bool `json:"isRead"`
	ReadAt string `json:"readAt"`
}
