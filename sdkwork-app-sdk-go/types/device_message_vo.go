package types

// 设备消息响应
type DeviceMessageVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Id string `json:"id"`
	MessageId string `json:"messageId"`
	DeviceId string `json:"deviceId"`
	Type string `json:"type"`
	Direction string `json:"direction"`
	Payload map[string]interface{} `json:"payload"`
	Topic string `json:"topic"`
	Processed bool `json:"processed"`
	Error string `json:"error"`
}
