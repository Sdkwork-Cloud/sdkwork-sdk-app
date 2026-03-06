package types

// 设备消息发送表单
type DeviceMessageSendForm struct {
	Type string `json:"type"`
	Payload map[string]interface{} `json:"payload"`
	Topic string `json:"topic"`
}
