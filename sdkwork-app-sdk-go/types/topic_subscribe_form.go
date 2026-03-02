package types

// 主题订阅表单
type TopicSubscribeForm struct {
	Topic string `json:"topic"`
	Subscribe bool `json:"subscribe"`
	DeviceId string `json:"deviceId"`
}
