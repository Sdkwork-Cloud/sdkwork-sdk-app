package types

// 删除账户请求
type AccountDeleteForm struct {
	Password string `json:"password"`
	Reason string `json:"reason"`
	Confirm bool `json:"confirm"`
	Timestamp int `json:"timestamp"`
}
