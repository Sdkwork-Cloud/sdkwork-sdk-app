package types

// 二维码状态响应
type QrCodeStatusVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Status string `json:"status"`
	UserInfo UserInfoVO `json:"userInfo"`
	Token LoginVO `json:"token"`
}
