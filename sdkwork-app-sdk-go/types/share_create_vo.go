package types

// 创建分享响应
type ShareCreateVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	ShareId string `json:"shareId"`
	ShareUrl string `json:"shareUrl"`
	QrCode string `json:"qrCode"`
	ExpireTime string `json:"expireTime"`
	Password string `json:"password"`
}
