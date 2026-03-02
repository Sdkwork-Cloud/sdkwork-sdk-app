package types

// 分享平台响应
type SharePlatformVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PlatformId string `json:"platformId"`
	PlatformName string `json:"platformName"`
	PlatformIcon string `json:"platformIcon"`
	Supported bool `json:"supported"`
}
