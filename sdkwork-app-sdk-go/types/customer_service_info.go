package types

// 专属客服信息
type CustomerServiceInfo struct {
	ServiceId string `json:"serviceId"`
	ServiceName string `json:"serviceName"`
	ServicePhone string `json:"servicePhone"`
	ServiceWechat string `json:"serviceWechat"`
	Online bool `json:"online"`
}
