package types

// 分享验证响应
type ShareVerifyVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Valid bool `json:"valid"`
	ErrorMessage string `json:"errorMessage"`
	ShareInfo ShareInfoVO `json:"shareInfo"`
}
