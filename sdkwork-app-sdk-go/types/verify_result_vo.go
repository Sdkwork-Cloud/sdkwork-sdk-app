package types

// 验证结果
type VerifyResultVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Valid bool `json:"valid"`
}
