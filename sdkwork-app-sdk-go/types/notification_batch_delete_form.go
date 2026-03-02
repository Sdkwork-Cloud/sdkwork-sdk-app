package types

// 批量删除通知表单
type NotificationBatchDeleteForm struct {
	NotificationIds []string `json:"notificationIds"`
}
