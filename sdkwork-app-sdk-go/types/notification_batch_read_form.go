package types

// 批量标记通知已读表单
type NotificationBatchReadForm struct {
	NotificationIds []string `json:"notificationIds"`
}
