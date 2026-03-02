package types

// 测试通知表单
type TestNotificationForm struct {
	Title string `json:"title"`
	Content string `json:"content"`
	Type string `json:"type"`
	DeviceId string `json:"deviceId"`
}
