package types

// 会话信息响应
type SessionInfoVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	SessionId string `json:"sessionId"`
	LoginTime string `json:"loginTime"`
	LastActivityTime string `json:"lastActivityTime"`
	IpAddress string `json:"ipAddress"`
	Location string `json:"location"`
	Device string `json:"device"`
	Browser string `json:"browser"`
	Os string `json:"os"`
	LoginMethod string `json:"loginMethod"`
	Status string `json:"status"`
	RemainingMinutes int `json:"remainingMinutes"`
}
